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
    private Long id;
    private String name;
    private String img;
    private String description;
    private PhonePriceBean price;
}
