package com.kobalt.demo.couchdb;

import com.kobalt.demo.core.model.entities.Artist;
import com.kobalt.demo.core.model.values.ISIN;
import com.kobalt.demo.core.model.values.Name;
import org.assertj.core.api.Assertions;
import org.ektorp.CouchDbConnector;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CouchDBArtistWriterIT {
    private String dbURL = "http://localhost:5984";
    private final String dbName = "demodb";

    @Test
    void givenValidConnectorAndArtist_whenSaving_shouldSave() throws MalformedURLException {
        Artist artist = new Artist(new Name("Apple", "Inc."), new ISIN("US0378331005"));
        CouchDbConnector connector = CouchDBFactory.createConnector(new URL(dbURL), dbName, true);

        Assertions.assertThatCode(() -> new CouchDBArtistWriter(connector).saveArtist(artist)).doesNotThrowAnyException();
    }
}
