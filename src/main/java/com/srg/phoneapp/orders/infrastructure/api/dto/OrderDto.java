package com.srg.phoneapp.orders.infrastructure.api.dto;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhonePriceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private List<Long> phoneIds;
    private PhonePriceDto price;
}
