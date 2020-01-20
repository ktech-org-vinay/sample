package com.kobalt.demo.api.services;

import com.kobalt.demo.api.dto.ArtistDTO;
import com.kobalt.demo.core.model.entities.Artist;
import com.kobalt.demo.core.ports.repositories.ArtistWriter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ArtistServiceTest {
    @Mock
    ArtistWriter artistWriter;

    @InjectMocks
    ArtistService artistService;

    @Test
    public void givenArtistWriter_whenSavingArtist_shouldSave() throws IOException {
        ArtistDTO artistDTO = new ArtistDTO("Apple", "Inc.", "US0378331005");

        artistService.save(artistDTO);

        verify(artistWriter).saveArtist(any(Artist.class));
    }
}