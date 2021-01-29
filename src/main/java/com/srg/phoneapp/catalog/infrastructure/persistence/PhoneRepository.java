package com.srg.phoneapp.catalog.infrastructure.persistence;

import com.srg.phoneapp.catalog.service.bean.PhoneBean;
import reactor.core.publisher.Flux;

public interface PhoneRepository {
    Flux<PhoneBean> getAll();
}
