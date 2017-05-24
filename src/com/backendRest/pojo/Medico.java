package com.backendRest.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medico")
public class Medico {

	@Id
	private String _id;
	
	private String nome;
	private String sobrenome;
	private String especializacao;
	
	public Medico(String nome) {
		setNome(nome);
	}
	
	public Medico(String nome, String sobrenome, String especializacao) {
		setNome(nome);
		setSobrenome(sobrenome);
		setEspecializacao(especializacao);
	}
	
	public Medico(String nome, String especializacao) {
		setNome(nome);
		setEspecializacao(especializacao);
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
