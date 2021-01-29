package com.srg.phoneapp.orders.service;

import com.srg.phoneapp.orders.infrastructure.client.CatalogClient;
import com.srg.phoneapp.orders.service.bean.OrderIBean;
import com.srg.phoneapp.orders.service.bean.OrderOBean;
import com.srg.phoneapp.orders.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final CatalogClient catalogClient;
    private final OrderMapper mapper;

    @Override
    public Mono<OrderOBean> checkout(OrderIBean order) {
        return null;
    }
}
