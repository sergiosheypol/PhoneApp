package com.srg.phoneapp.catalog.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneModel {
    private String name;
    private String img;
    private String description;
    private PriceModel price;
}
