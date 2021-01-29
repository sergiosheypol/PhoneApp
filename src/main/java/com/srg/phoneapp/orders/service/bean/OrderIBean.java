package com.srg.phoneapp.orders.service.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderIBean {
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private List<Long> phoneIds;
}
