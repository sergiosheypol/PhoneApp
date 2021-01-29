package com.srg.phoneapp.orders.infrastructure.api.handler;

import com.srg.phoneapp.orders.service.OrderService;
import com.srg.phoneapp.orders.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderHandler {
    private final OrderService service;
    private final OrderMapper mapper;
}
