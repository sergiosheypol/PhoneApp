package com.srg.phoneapp.orders.service;

import com.srg.phoneapp.orders.service.bean.OrderIBean;
import com.srg.phoneapp.orders.service.bean.OrderOBean;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<OrderOBean> checkout(OrderIBean order);
}
