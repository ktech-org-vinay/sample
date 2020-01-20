package com.kobalt.demo.core.ports.repositories;

import com.kobalt.demo.core.model.entities.Artist;

import java.io.IOException;

public interface ArtistWriter {
    void saveArtist(Artist artist) throws IllegalArgumentException, IOException;
}
