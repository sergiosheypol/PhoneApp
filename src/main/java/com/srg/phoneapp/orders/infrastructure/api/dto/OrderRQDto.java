package com.srg.phoneapp.orders.infrastructure.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRQDto {
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private List<Long> phoneIds;
}
