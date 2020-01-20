package com.kobalt.demo.core.model.values;

import lombok.Value;

@Value
public class ISIN {
    String code;

    public ISIN(String code) {
        validate(code);
        this.code = code;
    }

    private void validate(String code) {
        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("Empty ISIN Code");
        }
    }

    @Override
    public String toString() {
        return code;
    }
}
