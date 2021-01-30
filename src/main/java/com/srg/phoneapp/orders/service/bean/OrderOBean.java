package com.srg.phoneapp.orders.service.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderOBean {
    private Long id;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private OrderPriceOBean price;
}
