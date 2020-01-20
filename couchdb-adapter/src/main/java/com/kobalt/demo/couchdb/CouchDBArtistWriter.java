package com.kobalt.demo.couchdb;

import com.kobalt.demo.core.model.entities.Artist;
import com.kobalt.demo.core.ports.repositories.ArtistWriter;
import lombok.AllArgsConstructor;
import org.ektorp.CouchDbConnector;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class CouchDBArtistWriter implements ArtistWriter {
    private CouchDbConnector connector;

    @Override
    public void saveArtist(Artist artist) throws IllegalArgumentException {
        Map<String, Object> artistMap = new HashMap<>();
        String id = artist.getIsin().toString();
        artistMap.put("_id", id);
        artistMap.put("artist", artist);

        if ( connector.contains(id) )
            artistMap.put("_rev", connector.getCurrentRevision(id));

        connector.update(artistMap);
    }
}
