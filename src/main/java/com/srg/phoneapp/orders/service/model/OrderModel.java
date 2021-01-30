package com.srg.phoneapp.orders.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {
    private Long id;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private OrderPriceModel price;
}
