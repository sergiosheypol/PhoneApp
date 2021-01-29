package com.srg.phoneapp.catalog.service;

import com.srg.phoneapp.catalog.service.bean.PhoneBean;
import reactor.core.publisher.Flux;

public interface PhoneService {
    Flux<PhoneBean> getAll();
}
