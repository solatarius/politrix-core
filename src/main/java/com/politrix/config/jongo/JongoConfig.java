package com.politrix.config.jongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

import java.net.UnknownHostException;

/**
 * Created by stdavis on 2/11/17.
 */
@Configuration
public class JongoConfig {
    private final static String HOST = "localhost";
    private final static int PORT = 27017;

    enum MongoCollections {
        USERS("users"),
        INDIVIDUALS("individuals"),
        SPHERES("spheres"),
        ISSUES("issues");

        private final String collectionName;

        MongoCollections(String collectionName) { this.collectionName = collectionName; }
        String getCollectionName() {
            return collectionName;
        }
    }

    private final static String DB_NAME = "politrix";

    @Bean
    public Jongo jongo() {
        DB db;

        try {
            db = new MongoClient(HOST, PORT).getDB(DB_NAME);
        } catch (UnknownHostException e) {
            throw new MongoException("Connection error : ", e);
        }

        return new Jongo(db);
    }

    @Bean
    public MongoCollection users() {
        return jongo().getCollection(MongoCollections.USERS.getCollectionName());
    }

}
