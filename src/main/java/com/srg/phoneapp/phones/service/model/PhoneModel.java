package com.srg.phoneapp.phones.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneModel {
    private Long id;
    private String name;
    private String img;
    private String description;
    private PhonePriceModel price;
}
