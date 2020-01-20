package com.kobalt.demo.api.services;

import com.kobalt.demo.api.dto.ArtistDTO;
import com.kobalt.demo.core.ports.repositories.ArtistWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ArtistService {
    @Autowired
    private ArtistWriter artistWriter;

    public void save(ArtistDTO artistDTO) throws IOException {
        artistWriter.saveArtist(artistDTO.toEntity());
    }
}
