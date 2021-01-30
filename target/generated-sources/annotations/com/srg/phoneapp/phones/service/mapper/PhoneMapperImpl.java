package com.srg.phoneapp.phones.service.mapper;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhoneDto;
import com.srg.phoneapp.phones.infrastructure.api.dto.PhonePriceDto;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PriceEntity;
import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.bean.PhonePriceBean;
import com.srg.phoneapp.phones.service.model.PhoneModel;
import com.srg.phoneapp.phones.service.model.PhonePriceModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-30T14:14:36+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class PhoneMapperImpl implements PhoneMapper {

    @Override
    public PhoneBean toBean(PhoneModel model) {
        if ( model == null ) {
            return null;
        }

        PhoneBean phoneBean = new PhoneBean();

        phoneBean.setId( model.getId() );
        phoneBean.setName( model.getName() );
        phoneBean.setImg( model.getImg() );
        phoneBean.setDescription( model.getDescription() );
        phoneBean.setPrice( phonePriceModelToPhonePriceBean( model.getPrice() ) );

        return phoneBean;
    }

    @Override
    public PhoneModel toModel(PhoneBean bean) {
        if ( bean == null ) {
            return null;
        }

        PhoneModel phoneModel = new PhoneModel();

        phoneModel.setId( bean.getId() );
        phoneModel.setName( bean.getName() );
        phoneModel.setImg( bean.getImg() );
        phoneModel.setDescription( bean.getDescription() );
        phoneModel.setPrice( phonePriceBeanToPhonePriceModel( bean.getPrice() ) );

        return phoneModel;
    }

    @Override
    public PhoneBean toBean(PhoneEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PhoneBean phoneBean = new PhoneBean();

        phoneBean.setId( entity.getId() );
        phoneBean.setName( entity.getName() );
        phoneBean.setImg( entity.getImg() );
        phoneBean.setDescription( entity.getDescription() );
        phoneBean.setPrice( priceEntityToPhonePriceBean( entity.getPrice() ) );

        return phoneBean;
    }

    @Override
    public PhoneDto toDto(PhoneBean bean) {
        if ( bean == null ) {
            return null;
        }

        PhoneDto phoneDto = new PhoneDto();

        phoneDto.setId( bean.getId() );
        phoneDto.setName( bean.getName() );
        phoneDto.setImg( bean.getImg() );
        phoneDto.setDescription( bean.getDescription() );
        phoneDto.setPrice( phonePriceBeanToPhonePriceDto( bean.getPrice() ) );

        return phoneDto;
    }

    protected PhonePriceBean phonePriceModelToPhonePriceBean(PhonePriceModel phonePriceModel) {
        if ( phonePriceModel == null ) {
            return null;
        }

        PhonePriceBean phonePriceBean = new PhonePriceBean();

        phonePriceBean.setCurrency( phonePriceModel.getCurrency() );
        phonePriceBean.setValue( phonePriceModel.getValue() );

        return phonePriceBean;
    }

    protected PhonePriceModel phonePriceBeanToPhonePriceModel(PhonePriceBean phonePriceBean) {
        if ( phonePriceBean == null ) {
            return null;
        }

        PhonePriceModel phonePriceModel = new PhonePriceModel();

        phonePriceModel.setCurrency( phonePriceBean.getCurrency() );
        phonePriceModel.setValue( phonePriceBean.getValue() );

        return phonePriceModel;
    }

    protected PhonePriceBean priceEntityToPhonePriceBean(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        PhonePriceBean phonePriceBean = new PhonePriceBean();

        phonePriceBean.setCurrency( priceEntity.getCurrency() );
        phonePriceBean.setValue( priceEntity.getValue() );

        return phonePriceBean;
    }

    protected PhonePriceDto phonePriceBeanToPhonePriceDto(PhonePriceBean phonePriceBean) {
        if ( phonePriceBean == null ) {
            return null;
        }

        PhonePriceDto phonePriceDto = new PhonePriceDto();

        phonePriceDto.setCurrency( phonePriceBean.getCurrency() );
        phonePriceDto.setValue( phonePriceBean.getValue() );

        return phonePriceDto;
    }
}
