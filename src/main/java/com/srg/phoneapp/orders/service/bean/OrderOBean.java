package com.srg.phoneapp.orders.service.bean;

import com.srg.phoneapp.catalog.service.bean.PhoneBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderOBean {
    private Long id;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private List<PhoneBean> phones;
}
