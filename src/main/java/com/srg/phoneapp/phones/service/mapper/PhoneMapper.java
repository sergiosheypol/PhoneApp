package com.srg.phoneapp.phones.service.mapper;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhoneDto;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.bean.PriceBean;
import com.srg.phoneapp.phones.service.model.Currency;
import com.srg.phoneapp.phones.service.model.PhoneModel;
import com.srg.phoneapp.phones.service.model.PriceModel;
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
