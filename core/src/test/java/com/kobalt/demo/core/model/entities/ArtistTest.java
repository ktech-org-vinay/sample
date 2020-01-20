package com.kobalt.demo.core.model.entities;

import com.kobalt.demo.core.model.values.ISIN;
import com.kobalt.demo.core.model.values.Name;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArtistTest {
    @Test
    void givenValidNameAndISIN_whenCreatingArtist_shouldCreate() {
        Artist artist = new Artist(new Name("Apple", "Inc"), new ISIN("US0378331005"));

        Assertions.assertThat(artist).isNotNull();
    }
}
