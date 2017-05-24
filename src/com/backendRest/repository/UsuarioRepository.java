package com.backendRest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backendRest.pojo.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	public Usuario findByLoginAndSenha(String login, String senha);
}
