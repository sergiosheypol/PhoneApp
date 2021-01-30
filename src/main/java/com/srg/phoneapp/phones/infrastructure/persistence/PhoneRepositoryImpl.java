package com.srg.phoneapp.phones.infrastructure.persistence;

import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.mapper.PhoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PhoneRepositoryImpl implements PhoneRepository {

    private final PhoneMapper mapper;

    @Override
    public Flux<PhoneBean> getAll() {
        return Flux.fromIterable(List.of(PhoneData.getSamsung(), PhoneData.getIphone()))
                .map(mapper::toBean);
    }
}
