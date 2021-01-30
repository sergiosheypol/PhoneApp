package com.srg.phoneapp.phones.infrastructure.persistence;

import com.srg.phoneapp.phones.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PriceEntity;

public final class PhoneData {

    public static final String EURO_CURRENCY = "euro";

    public static PhoneEntity getIphone() {
        return PhoneEntity.builder()
                .id(1L)
                .img("https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-xr-og-201809?wid=1200&hei=630&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1535560276044")
                .name("iPhone")
                .description("Apple iPhone 12")
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
                .name("S21")
                .description("Samsung Galaxy S21")
                .price(PriceEntity.builder()
                        .currency(EURO_CURRENCY)
                        .value(988.00)
                        .build())
                .build();
    }

    public static PhoneEntity getXiaomi() {
        return PhoneEntity.builder()
                .id(3L)
                .img("https://i01.appmifile.com/webfile/globalimg/products/m/mi8/blue-phone.png?1")
                .name("Mi 8")
                .description("Xiaomi Mi 8")
                .price(PriceEntity.builder()
                        .currency(EURO_CURRENCY)
                        .value(189.90)
                        .build())
                .build();
    }

    public static PhoneEntity getHuawei() {
        return PhoneEntity.builder()
                .id(4L)
                .img("https://consumer.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/p40-lite-5g/img/pc/huawei-p40-lite-5g.jpg")
                .name("P40")
                .description("HUAWEI P40 lite 5G")
                .price(PriceEntity.builder()
                        .currency(EURO_CURRENCY)
                        .value(279.90)
                        .build())
                .build();
    }
}
