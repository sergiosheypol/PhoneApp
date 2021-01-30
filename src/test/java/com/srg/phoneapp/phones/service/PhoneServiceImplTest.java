package com.srg.phoneapp.phones.service;

import com.srg.phoneapp.phones.infrastructure.persistence.PhoneRepository;
import com.srg.phoneapp.phones.service.bean.PhoneBean;
import com.srg.phoneapp.phones.service.mapper.PhoneMapper;
import com.srg.phoneapp.phones.service.model.PhoneModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PhoneServiceImplTest {

    @InjectMocks
    private PhoneServiceImpl service;

    @Mock
    private PhoneRepository repository;

    @Mock
    private PhoneMapper mapper;

    @Test
    public void shouldReturnPhones() {
        // Given
        final PhoneBean bean = mock(PhoneBean.class);
        final PhoneModel model = mock(PhoneModel.class);

        // When
        when(repository.getAll()).thenReturn(Flux.just(bean));
        when(mapper.toModel(eq(bean))).thenReturn(model);
        when(mapper.toBean(eq(model))).thenReturn(bean);

        // Then
        StepVerifier.create(service.getAll())
                .assertNext(b -> assertThat(b).isEqualTo(bean))
                .verifyComplete();

        verify(mapper).toModel(bean);
        verify(mapper).toBean(model);
    }

    @Test
    public void shouldNotThrowWhenEmptyList() {
        // When
        when(repository.getAll()).thenReturn(Flux.empty());

        // Then
        StepVerifier.create(service.getAll()).verifyComplete();
    }
}
