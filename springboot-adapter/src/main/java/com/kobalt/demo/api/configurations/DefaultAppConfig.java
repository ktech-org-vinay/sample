package com.kobalt.demo.api.configurations;

import com.kobalt.demo.core.ports.repositories.ArtistWriter;
import com.kobalt.demo.couchdb.CouchDBArtistWriter;
import com.kobalt.demo.couchdb.CouchDBFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@ConfigurationProperties
public class DefaultAppConfig {

    @Value("${db.url}")
    private String url;

    @Value("${db.name}")
    private String dbName;

    @Bean
    public ArtistWriter fetchArtistWriter() throws MalformedURLException {
        return new CouchDBArtistWriter(
                CouchDBFactory.createConnector(new URL(url), dbName, true));
    }
}
