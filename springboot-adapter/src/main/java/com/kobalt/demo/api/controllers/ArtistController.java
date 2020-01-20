package com.kobalt.demo.api.controllers;

import com.kobalt.demo.api.dto.ArtistDTO;
import com.kobalt.demo.core.model.entities.Artist;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArtistController {

    @GetMapping(value = "/artists", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public List<Artist> listAllArtists() {
        return new ArrayList<>();
    }

    @PostMapping(value="/artists", consumes = MimeTypeUtils.APPLICATION_JSON_VALUE, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public void saveArtist(@RequestBody ArtistDTO artistDTO) {
    }
}
