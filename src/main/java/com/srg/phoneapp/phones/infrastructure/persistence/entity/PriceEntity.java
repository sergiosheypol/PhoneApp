package com.srg.phoneapp.phones.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PriceEntity {
    private String currency;
    private Double value;
}
