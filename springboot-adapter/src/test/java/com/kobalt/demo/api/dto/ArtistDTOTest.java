package com.kobalt.demo.api.dto;

import com.kobalt.demo.core.model.entities.Artist;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ArtistDTOTest {
    @Test
    public void givenValidArtistDTOFields_whenConverterIsInvoked_shouldReturnValidEntity() {
        ArtistDTO artistDTO = new ArtistDTO("Apple", "Inc.", "US0378331005");

        Assertions.assertThat(artistDTO.toEntity()).isNotNull().isInstanceOf(Artist.class);
    }
}