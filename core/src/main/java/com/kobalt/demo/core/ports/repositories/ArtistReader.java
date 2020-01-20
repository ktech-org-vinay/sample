package com.kobalt.demo.core.ports.repositories;

import com.kobalt.demo.core.model.entities.Artist;
import com.kobalt.demo.core.model.values.ISIN;

import java.io.IOException;

public interface ArtistReader {
    Artist findArtistByISIN(ISIN isin) throws IllegalArgumentException, IOException;
}
