package com.srg.phoneapp.phones.infrastructure.api.router;

import com.srg.phoneapp.phones.infrastructure.api.handler.PhoneHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class PhoneRouter {
    @Bean
    public RouterFunction<ServerResponse> routePhone(final PhoneHandler handler) {
        return RouterFunctions.route(RequestPredicates.GET("/phone"), handler::getAll);
    }
}
