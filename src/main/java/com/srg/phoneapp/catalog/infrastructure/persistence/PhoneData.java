package com.srg.phoneapp.catalog.infrastructure.persistence;

import com.srg.phoneapp.catalog.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.catalog.infrastructure.persistence.entity.PriceEntity;

public final class PhoneData {
    public static PhoneEntity getIphone() {
        return PhoneEntity.builder()
                .name("Apple iPhone")
                .description("Apple iPhone")
                .price(PriceEntity.builder()
                        .currency("euro")
                        .value(999.99)
                        .build())
                .build();
    }

    public static PhoneEntity getSamsung() {
        return PhoneEntity.builder()
                .name("Samsung S21")
                .description("Samsung S21")
                .price(PriceEntity.builder()
                        .currency("euro")
                        .value(988.00)
                        .build())
                .build();
    }
}
