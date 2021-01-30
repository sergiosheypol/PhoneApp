package com.srg.phoneapp.orders.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.srg.phoneapp.orders.infrastructure.client.CatalogClient;
import com.srg.phoneapp.orders.service.bean.OrderIBean;
import com.srg.phoneapp.orders.service.bean.OrderOBean;
import com.srg.phoneapp.orders.service.bean.OrderPriceOBean;
import com.srg.phoneapp.orders.service.mapper.OrderMapper;
import com.srg.phoneapp.orders.service.model.OrderModel;
import com.srg.phoneapp.orders.service.model.OrderPriceModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceImplTest {

    private static final String EURO_CURRENCY = "euro";

    @InjectMocks
    private OrderServiceImpl service;

    @Mock
    private CatalogClient catalogClient;

    @Mock
    private OrderMapper mapper;

    @Mock
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        // When
        when(catalogClient.getCatalog()).thenReturn(
                Flux.just(CatalogTestData.getHuawei(),
                        CatalogTestData.getIphone(),
                        CatalogTestData.getXiaomi(),
                        CatalogTestData.getSamsung()));
    }

    @Test
    public void shouldCheckoutOk() throws Exception {
        // Given
        final UUID uuid = UUID.randomUUID();
        final Double pValue = 1189.89;

        final OrderIBean iBean = OrderIBean.builder()
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .phoneIds(List.of(1L, 3L))
                .build();

        final OrderPriceModel price = OrderPriceModel.builder()
                .currency(EURO_CURRENCY)
                .value(pValue)
                .build();

        final OrderModel model = OrderModel.builder()
                .id(uuid)
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .price(price)
                .build();

        final OrderOBean oBean = OrderOBean.builder()
                .id(uuid)
                .customerName("srg")
                .customerSurname("srnm")
                .customerEmail("srg@srg")
                .price(OrderPriceOBean.builder()
                        .value(pValue)
                        .currency(EURO_CURRENCY)
                        .build())
                .build();

        // When
        when(mapper.toModel(eq(iBean), eq(price), any(UUID.class))).thenReturn(model);
        when(mapper.toModel(eq(pValue), eq(EURO_CURRENCY))).thenReturn(price);
        when(mapper.toOBean(eq(model))).thenReturn(oBean);
        when(objectMapper.writeValueAsString(eq(oBean))).thenReturn("JSON Object");

        // Then
        StepVerifier.create(service.checkout(iBean))
                .assertNext(o -> assertThat(o).isEqualTo(oBean))
                .verifyComplete();

    }
}
