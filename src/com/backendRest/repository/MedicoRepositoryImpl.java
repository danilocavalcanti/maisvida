package com.backendRest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.backendRest.pojo.Medico;

@Repository
public class MedicoRepositoryImpl {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public long countAllMedicos() {
		return mongoTemplate.count(null, Medico.class);
	}
}
