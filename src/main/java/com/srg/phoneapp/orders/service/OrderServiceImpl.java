package com.srg.phoneapp.orders.service;

import com.srg.phoneapp.orders.infrastructure.client.CatalogClient;
import com.srg.phoneapp.orders.service.bean.OrderIBean;
import com.srg.phoneapp.orders.service.bean.OrderOBean;
import com.srg.phoneapp.orders.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final CatalogClient catalogClient;
    private final OrderMapper mapper;

    @Override
    public Mono<OrderOBean> checkout(OrderIBean order) {
        return catalogClient.getCatalog()
                .collectList()
                .map(__ -> OrderOBean.builder().build());
    }
}
