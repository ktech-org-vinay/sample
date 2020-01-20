package com.kobalt.demo.couchdb;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.URL;

public class CouchDBFactory {
    public static CouchDbConnector createConnector(URL url, String databaseName, boolean createDatabaseIfNotExists) {
        HttpClient httpClient = new StdHttpClient.Builder()
                .url(url)
                .build();

        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        CouchDbConnector db = new StdCouchDbConnector(databaseName, dbInstance);

        if ( createDatabaseIfNotExists )
            db.createDatabaseIfNotExists();

        return db;
    }
}
