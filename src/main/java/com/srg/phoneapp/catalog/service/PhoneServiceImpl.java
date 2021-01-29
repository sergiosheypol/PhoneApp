package com.srg.phoneapp.catalog.service;

import com.srg.phoneapp.catalog.infrastructure.persistence.PhoneRepository;
import com.srg.phoneapp.catalog.service.bean.PhoneBean;
import com.srg.phoneapp.catalog.service.mapper.PhoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository repository;
    private final PhoneMapper mapper;

    @Override
    public Flux<PhoneBean> getAll() {
        return repository.getAll()
                .map(mapper::toModel)
                // business logic should be here
                .map(mapper::toBean);
    }
}
