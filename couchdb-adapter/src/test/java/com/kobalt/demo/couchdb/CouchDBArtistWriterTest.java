package com.kobalt.demo.couchdb;

import com.kobalt.demo.core.model.entities.Artist;
import com.kobalt.demo.core.model.values.ISIN;
import com.kobalt.demo.core.model.values.Name;
import org.ektorp.CouchDbConnector;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CouchDBArtistWriterTest {
    @Test
    void givenConnector_whenSavingArtist_shouldInvokeUpdate() {
        CouchDbConnector mockedDbConnector = mock(CouchDbConnector.class);
        CouchDBArtistWriter writer = new CouchDBArtistWriter(mockedDbConnector);
        Artist artist = new Artist(new Name("Apple", "Inc."), new ISIN("US0378331005"));

        writer.saveArtist(artist);

        verify(mockedDbConnector).update(Mockito.any());
    }
}
