package com.srg.phoneapp.orders.infrastructure.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.srg.phoneapp.phones.infrastructure.api.dto.PhonePriceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRSDto {
    private UUID id;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private PhonePriceDto price;
}
