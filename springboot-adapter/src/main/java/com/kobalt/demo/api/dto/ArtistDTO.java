package com.kobalt.demo.api.dto;

import com.kobalt.demo.core.model.entities.Artist;
import com.kobalt.demo.core.model.values.ISIN;
import com.kobalt.demo.core.model.values.Name;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtistDTO {
    private String givenName, surname, isinCode;


    public Artist toEntity() {
        return new Artist(new Name(givenName, surname), new ISIN(isinCode));
    }
}
