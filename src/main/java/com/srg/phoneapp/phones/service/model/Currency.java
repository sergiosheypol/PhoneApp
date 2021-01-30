package com.srg.phoneapp.phones.service.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Currency {

    EURO("euro");

    private final String text;

    // TODO: should throw if no match
    public static Currency match(final String text) {
        return Arrays.stream(Currency.values())
                .takeWhile(c -> c.getText().equals(text))
                .findFirst()
                .orElse(Currency.EURO);
    }

}
