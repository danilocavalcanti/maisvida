package com.backendRest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backendRest.pojo.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String>{

	public Medico findByNomeAndSobrenome(String nome, String sobrenome);
	public List<Medico> findAll();
	public Medico save(Medico medico);
}
