package com.srg.phoneapp.orders.infrastructure.api.handler;

import com.srg.phoneapp.orders.infrastructure.api.dto.OrderRQDto;
import com.srg.phoneapp.orders.service.OrderService;
import com.srg.phoneapp.orders.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class OrderHandler {

    private final OrderService service;
    private final OrderMapper mapper;

    public Mono<ServerResponse> processOrder(final ServerRequest request) {
        return request.bodyToMono(OrderRQDto.class)
                .map(mapper::toIBean)
                .flatMap(service::checkout)
                .map(mapper::toRSDto)
                .flatMap(rs -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(rs));
    }
}
