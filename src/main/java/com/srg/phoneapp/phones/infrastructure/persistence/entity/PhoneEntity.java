package com.srg.phoneapp.phones.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PhoneEntity {
    private String name;
    private String img;
    private String description;
    private PriceEntity price;
}
