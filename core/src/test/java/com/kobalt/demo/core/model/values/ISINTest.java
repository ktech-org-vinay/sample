package com.kobalt.demo.core.model.values;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ISINTest {
    public static final String VALID_ISIN = "US0378331005";

    @Test
    void givenValidCode_whenCreatingISNI_shouldCreate() {
        ISIN isin = new ISIN(VALID_ISIN);

        assertThat(isin).isNotNull();
    }

    @Test
    void givenEmptyCode_whenCreatingISIN_shouldFail() {
        Throwable throwable = Assertions.catchThrowable(() -> new ISIN(""));

        assertThat(throwable).isNotNull().isInstanceOf(IllegalArgumentException.class);
    }
}
