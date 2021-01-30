package com.srg.phoneapp.phones.service;

import com.srg.phoneapp.phones.service.bean.PhoneBean;
import reactor.core.publisher.Flux;

public interface PhoneService {
    Flux<PhoneBean> getAll();
}
