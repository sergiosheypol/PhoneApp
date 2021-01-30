package com.srg.phoneapp.orders.infrastructure.api.router;

import com.srg.phoneapp.orders.infrastructure.api.handler.OrderHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class OrderRouter {
    @Bean
    public RouterFunction<ServerResponse> routeOrder(final OrderHandler handler) {
        return RouterFunctions.route(RequestPredicates.POST("/order"), handler::processOrder);
    }
}
