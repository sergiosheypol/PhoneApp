package com.srg.phoneapp.catalog.service.mapper;

import com.srg.phoneapp.catalog.infrastructure.api.dto.PhoneDto;
import com.srg.phoneapp.catalog.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.catalog.service.bean.PhoneBean;
import com.srg.phoneapp.catalog.service.bean.PriceBean;
import com.srg.phoneapp.catalog.service.model.Currency;
import com.srg.phoneapp.catalog.service.model.PhoneModel;
import com.srg.phoneapp.catalog.service.model.PriceModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    // MODEL
    PhoneBean toBean(PhoneModel model);

    default PriceBean toBean(PriceModel model) {
        return PriceBean.builder()
                .currency(model.getCurrency().getText())
                .value(model.getValue())
                .build();
    }


    PhoneModel toModel(PhoneBean bean);

    default PriceModel toModel(PriceBean bean) {
        return PriceModel.builder()
                .currency(Currency.match(bean.getCurrency()))
                .value(bean.getValue())
                .build();
    }

    // ENTITY
    PhoneBean toBean(PhoneEntity entity);

    // DTO
    PhoneDto toDto(PhoneBean bean);
}
