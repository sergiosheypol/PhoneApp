package com.srg.phoneapp.phones.service.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneBean {
    private String name;
    private String img;
    private String description;
    private PriceBean price;
}
