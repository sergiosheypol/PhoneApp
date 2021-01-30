package com.srg.phoneapp.phones.infrastructure.api.router;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhoneDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PhoneRouterIT {

    private final static String PHONE_PATH = "phone";

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void shouldGetCatalog() {
        webTestClient.get()
                .uri(b -> b.path("/{s}").build(PHONE_PATH))
                .exchange()
                .expectBodyList(PhoneDto.class)
                .contains(PhoneTestData.getHuawei(),
                        PhoneTestData.getIphone(),
                        PhoneTestData.getSamsung(),
                        PhoneTestData.getSamsung());
    }
}
