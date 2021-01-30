package com.srg.phoneapp.orders.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.srg.phoneapp.orders.infrastructure.client.CatalogClient;
import com.srg.phoneapp.orders.service.bean.OrderIBean;
import com.srg.phoneapp.orders.service.bean.OrderOBean;
import com.srg.phoneapp.orders.service.mapper.OrderMapper;
import com.srg.phoneapp.orders.service.model.OrderPriceModel;
import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.bean.PhonePriceBean;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final CatalogClient catalogClient;
    private final OrderMapper mapper;
    private final ObjectMapper objectMapper;

    @Override
    public Mono<OrderOBean> checkout(OrderIBean order) {
        return catalogClient.getCatalog()
                .filter(phone -> order.getPhoneIds().contains(phone.getId()))
                .collectList()
                .map(this::calculatePrice)
                .map(p -> mapper.toModel(order, p, UUID.randomUUID()))
                .map(mapper::toOBean)
                .doOnSuccess(o -> log.info(String.format("Order processed successfully -- %s", this.toJson(o))));
    }

    private OrderPriceModel calculatePrice(final List<PhoneBean> phones) {
        return mapper.toModel(this.sumPrice(phones), this.extractCurrency(phones));
    }

    private Double sumPrice(final List<PhoneBean> phones) {
        return phones.stream()
                .map(PhoneBean::getPrice)
                .map(PhonePriceBean::getValue)
                .mapToDouble(e -> e)
                .sum();
    }

    private String extractCurrency(final List<PhoneBean> phones) {
        return phones.get(0).getPrice().getCurrency();
    }

    private String toJson(OrderOBean bean) {
        return Try.of(() -> objectMapper.writeValueAsString(bean)).getOrElse("Couldn't decode Order");
    }
}
