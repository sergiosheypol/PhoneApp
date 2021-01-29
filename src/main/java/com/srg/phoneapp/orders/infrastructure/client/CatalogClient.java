package com.srg.phoneapp.orders.infrastructure.client;

import com.srg.phoneapp.catalog.service.bean.PhoneBean;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Slf4j
@Component
@RequiredArgsConstructor
public class CatalogClient {

    private static final String CATALOG_PATH = "/phone";

    private final WebClient webClient;

    public Flux<PhoneBean> getCatalog() {
        return webClient.get()
                .uri(u -> u.path(CATALOG_PATH).build())
                .retrieve()
                .bodyToFlux(PhoneBean.class)
                .doOnComplete(() -> log.info("Catalog retrieved properly"))
                .doOnError(e -> log.error(String.format("Failed when retrieving catalog. Error: %s", e.getMessage())));
    }
}
