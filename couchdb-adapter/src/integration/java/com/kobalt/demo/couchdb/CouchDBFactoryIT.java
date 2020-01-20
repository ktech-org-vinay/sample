package com.kobalt.demo.couchdb;

import org.assertj.core.api.Assertions;
import org.ektorp.CouchDbConnector;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CouchDBFactoryIT {

    private String dbURL = "http://localhost:5984";
    private final String dbName = "demodb";

    @Test
    void givenValidParameters_whenFactoryIsInvoked_shouldCreateConnector() throws MalformedURLException {
        CouchDbConnector connector =
                CouchDBFactory.createConnector(new URL(dbURL),
                        dbName,
                        true);

        Assertions.assertThat(connector).isNotNull();
    }
}
