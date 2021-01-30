package com.srg.phoneapp.orders.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {
    private UUID id;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private OrderPriceModel price;
}
