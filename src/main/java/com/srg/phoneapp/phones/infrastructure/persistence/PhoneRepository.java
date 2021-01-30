package com.srg.phoneapp.phones.infrastructure.persistence;

import com.srg.phoneapp.phones.service.bean.PhoneBean;
import reactor.core.publisher.Flux;

public interface PhoneRepository {
    Flux<PhoneBean> getAll();
}
