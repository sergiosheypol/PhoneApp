package com.srg.phoneapp.orders.infrastructure.api.router;

import com.srg.phoneapp.orders.infrastructure.api.dto.OrderRQDto;
import com.srg.phoneapp.orders.infrastructure.api.dto.OrderRSDto;
import com.srg.phoneapp.phones.infrastructure.api.dto.PhonePriceDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureWebTestClient
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderRouterIT {

    private final static String ORDER_PATH = "order";

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void shouldPostAnOrderWithOneItem() {
        final OrderRSDto res = OrderRSDto.builder()
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .price(PhonePriceDto.builder()
                        .value(999.99)
                        .currency("euro")
                        .build())
                .build();

        final OrderRQDto req = OrderRQDto.builder()
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .phoneIds(List.of(1L))
                .build();

        webTestClient.post()
                .uri(b -> b.path("/{s}").build(ORDER_PATH))
                .body(Mono.just(req), OrderRQDto.class)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectBody(OrderRSDto.class)
                .value(rs -> res.setId(rs.getId()))
                .isEqualTo(res)
                .value(rs -> assertThat(rs.getId()).isNotNull());
    }

    @Test
    public void shouldPostAnOrderWithTwoItems() {
        final OrderRSDto res = OrderRSDto.builder()
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .price(PhonePriceDto.builder()
                        .value(1189.89)
                        .currency("euro")
                        .build())
                .build();

        final OrderRQDto req = OrderRQDto.builder()
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .phoneIds(List.of(1L, 3L))
                .build();

        webTestClient.post()
                .uri(b -> b.path("/{s}").build(ORDER_PATH))
                .body(Mono.just(req), OrderRQDto.class)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectBody(OrderRSDto.class)
                .value(rs -> res.setId(rs.getId()))
                .isEqualTo(res)
                .value(rs -> assertThat(rs.getId()).isNotNull());
    }
}
