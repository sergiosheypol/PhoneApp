package com.srg.phoneapp.phones.infrastructure.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDto {
    private Long id;
    private String name;
    private String img;
    private String description;
    private PhonePriceDto price;
}
