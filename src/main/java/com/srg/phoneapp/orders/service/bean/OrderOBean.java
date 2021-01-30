package com.srg.phoneapp.orders.service.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderOBean {
    private UUID id;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private OrderPriceOBean price;
}
