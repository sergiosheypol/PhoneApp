package com.srg.phoneapp.orders.service.mapper;

import com.srg.phoneapp.orders.infrastructure.api.dto.OrderRQDto;
import com.srg.phoneapp.orders.infrastructure.api.dto.OrderRSDto;
import com.srg.phoneapp.orders.service.bean.OrderIBean;
import com.srg.phoneapp.orders.service.bean.OrderOBean;
import com.srg.phoneapp.orders.service.model.OrderModel;
import com.srg.phoneapp.orders.service.model.OrderPriceModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    // MODEL
    @Mapping(source = "iBean.customerName", target = "customerName")
    @Mapping(source = "iBean.customerSurname", target = "customerSurname")
    @Mapping(source = "iBean.customerEmail", target = "customerEmail")
    OrderModel toModel(OrderIBean iBean, OrderPriceModel price);

    OrderPriceModel toModel(Double value, String currency);

    // BEAN
    OrderOBean toOBean(OrderModel model);

    OrderIBean toIBean(OrderRQDto dto);

    OrderRSDto toRSDto(OrderOBean oBean);


}
