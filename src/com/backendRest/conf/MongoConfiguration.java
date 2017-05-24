package com.backendRest.conf;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class MongoConfiguration extends AbstractMongoConfiguration {
	
	 @Override
	    protected String getDatabaseName() {
	        return "maisvida";
	    }

	    @Override
	    public Mongo mongo() throws Exception {
	        return new MongoClient("127.0.0.1", 27017);
	    }

	    @Override
	    protected String getMappingBasePackage() {
	        return "com.backendRest";
	    }

}
