package com.srg.phoneapp.phones.service.mapper;

import com.srg.phoneapp.phones.infrastructure.api.dto.PhoneDto;
import com.srg.phoneapp.phones.infrastructure.api.dto.PriceDto;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PhoneEntity;
import com.srg.phoneapp.phones.infrastructure.persistence.entity.PriceEntity;
import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.bean.PriceBean;
import com.srg.phoneapp.phones.service.model.PhoneModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-29T22:50:57+0100",
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

        phoneBean.setName( model.getName() );
        phoneBean.setImg( model.getImg() );
        phoneBean.setDescription( model.getDescription() );
        phoneBean.setPrice( toBean( model.getPrice() ) );

        return phoneBean;
    }

    @Override
    public PhoneModel toModel(PhoneBean bean) {
        if ( bean == null ) {
            return null;
        }

        PhoneModel phoneModel = new PhoneModel();

        phoneModel.setName( bean.getName() );
        phoneModel.setImg( bean.getImg() );
        phoneModel.setDescription( bean.getDescription() );
        phoneModel.setPrice( toModel( bean.getPrice() ) );

        return phoneModel;
    }

    @Override
    public PhoneBean toBean(PhoneEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PhoneBean phoneBean = new PhoneBean();

        phoneBean.setName( entity.getName() );
        phoneBean.setImg( entity.getImg() );
        phoneBean.setDescription( entity.getDescription() );
        phoneBean.setPrice( priceEntityToPriceBean( entity.getPrice() ) );

        return phoneBean;
    }

    @Override
    public PhoneDto toDto(PhoneBean bean) {
        if ( bean == null ) {
            return null;
        }

        PhoneDto phoneDto = new PhoneDto();

        phoneDto.setName( bean.getName() );
        phoneDto.setImg( bean.getImg() );
        phoneDto.setDescription( bean.getDescription() );
        phoneDto.setPrice( priceBeanToPriceDto( bean.getPrice() ) );

        return phoneDto;
    }

    protected PriceBean priceEntityToPriceBean(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        PriceBean priceBean = new PriceBean();

        priceBean.setCurrency( priceEntity.getCurrency() );
        priceBean.setValue( priceEntity.getValue() );

        return priceBean;
    }

    protected PriceDto priceBeanToPriceDto(PriceBean priceBean) {
        if ( priceBean == null ) {
            return null;
        }

        PriceDto priceDto = new PriceDto();

        priceDto.setCurrency( priceBean.getCurrency() );
        priceDto.setValue( priceBean.getValue() );

        return priceDto;
    }
}
