package com.srg.phoneapp.phones.infrastructure.api.handler;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhoneDto;
import com.srg.phoneapp.phones.service.PhoneService;
import com.srg.phoneapp.phones.service.mapper.PhoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class PhoneHandler {

    private final PhoneService service;
    private final PhoneMapper mapper;

    public Mono<ServerResponse> getAll(final ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.getAll().map(mapper::toDto), PhoneDto.class);
    }
}
