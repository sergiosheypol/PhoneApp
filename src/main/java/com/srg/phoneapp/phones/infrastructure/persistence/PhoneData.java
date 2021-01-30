package com.srg.phoneapp.phones.infrastructure.persistence;

import com.srg.phoneapp.phones.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PriceEntity;

public final class PhoneData {

    public static final String EURO_CURRENCY = "euro";

    public static PhoneEntity getIphone() {

        return PhoneEntity.builder()
                .id(1L)
                .img("https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-xr-og-201809?wid=1200&hei=630&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1535560276044")
                .name("Apple iPhone")
                .description("Apple iPhone")
                .price(PriceEntity.builder()
                        .currency(EURO_CURRENCY)
                        .value(999.99)
                        .build())
                .build();
    }

    public static PhoneEntity getSamsung() {
        return PhoneEntity.builder()
                .id(2L)
                .img("https://imagenes.milenio.com/YKeE7McwvNTvSD14u1Tb-QGZsFE=/958x596/https://www.milenio.com/uploads/media/2021/01/14/samsung-galaxy-s-1.png")
                .name("Samsung S21")
                .description("Samsung S21")
                .price(PriceEntity.builder()
                        .currency(EURO_CURRENCY)
                        .value(988.00)
                        .build())
                .build();
    }
}
