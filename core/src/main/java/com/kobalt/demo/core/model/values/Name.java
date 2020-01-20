package com.kobalt.demo.core.model.values;

import lombok.Value;

@Value
public class Name {
    String givenName, surname;

    public Name(String givenName, String surname) {
        validate(givenName, surname);
        this.givenName = givenName;
        this.surname = surname;
    }

    private void validate(String givenName, String surname) {
        if ( givenName == null ) {
            throw new IllegalArgumentException("Empty given name");
        }
    }

    @Override
    public String toString() {
        return givenName + " " + surname;
    }

}
