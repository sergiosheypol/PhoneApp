package com.srg.phoneapp.orders.service;

import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.bean.PhonePriceBean;

public final class CatalogTestData {

    public static final String EURO_CURRENCY = "euro";

    public static PhoneBean getIphone() {
        return PhoneBean.builder()
                .id(1L)
                .img("https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-xr-og-201809?wid=1200&hei=630&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1535560276044")
                .name("iPhone")
                .description("Apple iPhone 12")
                .price(PhonePriceBean.builder()
                        .currency(EURO_CURRENCY)
                        .value(999.99)
                        .build())
                .build();
    }

    public static PhoneBean getSamsung() {
        return PhoneBean.builder()
                .id(2L)
                .img("https://imagenes.milenio.com/YKeE7McwvNTvSD14u1Tb-QGZsFE=/958x596/https://www.milenio.com/uploads/media/2021/01/14/samsung-galaxy-s-1.png")
                .name("S21")
                .description("Samsung Galaxy S21")
                .price(PhonePriceBean.builder()
                        .currency(EURO_CURRENCY)
                        .value(988.00)
                        .build())
                .build();
    }

    public static PhoneBean getXiaomi() {
        return PhoneBean.builder()
                .id(3L)
                .img("https://i01.appmifile.com/webfile/globalimg/products/m/mi8/blue-phone.png?1")
                .name("Mi 8")
                .description("Xiaomi Mi 8")
                .price(PhonePriceBean.builder()
                        .currency(EURO_CURRENCY)
                        .value(189.90)
                        .build())
                .build();
    }

    public static PhoneBean getHuawei() {
        return PhoneBean.builder()
                .id(4L)
                .img("https://consumer.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/p40-lite-5g/img/pc/huawei-p40-lite-5g.jpg")
                .name("P40")
                .description("HUAWEI P40 lite 5G")
                .price(PhonePriceBean.builder()
                        .currency(EURO_CURRENCY)
                        .value(279.90)
                        .build())
                .build();
    }
}
