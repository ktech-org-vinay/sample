package com.kobalt.demo.core.model.values;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameTest {
    @Test
    void givenProperNames_whenCreatingName_shouldCreate() {
        Name name = new Name("Siddhartha", "Ghosh");

        assertThat(name).isNotNull().isInstanceOf(Name.class);
    }

    @Test
    void givenOnlySurname_whenCreatingName_shouldFail() {
        Throwable throwable = Assertions.catchThrowable( () -> new Name(null, "Ghosh") );

        assertThat(throwable).isNotNull().isInstanceOf(IllegalArgumentException.class);
    }
}
