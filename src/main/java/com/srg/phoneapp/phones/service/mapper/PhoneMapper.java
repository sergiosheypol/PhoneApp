package com.srg.phoneapp.phones.service.mapper;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhoneDto;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.model.PhoneModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    // MODEL
    PhoneBean toBean(PhoneModel model);
    PhoneModel toModel(PhoneBean bean);

    // ENTITY
    PhoneBean toBean(PhoneEntity entity);

    // DTO
    PhoneDto toDto(PhoneBean bean);
}
