package com.backendRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backendRest.pojo.Medico;
import com.backendRest.repository.MedicoRepository;
import com.backendRest.repository.UsuarioRepository;

@RestController
public class MetodosController {

	@Autowired
	private MedicoRepository medicoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping("/login")
	public boolean login(@RequestParam("login") String login,
			@RequestParam("senha") String senha) {
		return usuarioRepository.findByLoginAndSenha(login, senha) != null;
	}

	@RequestMapping("/listar")
	public List<Medico> listar() {
		List<Medico> medicos = medicoRepository.findAll();
		if (!medicos.isEmpty()) {
			return medicos;
		}
		return null;
	}

	@RequestMapping("/visualizar")
	public Medico visualizar(@RequestParam("nome") String nome,
			@RequestParam("sobrenome") String sobrenome) {
		Medico medico = medicoRepository
				.findByNomeAndSobrenome(nome, sobrenome);
		if (medico != null) {
			return medico;
		}
		return null;
	}

	@RequestMapping("/cadastrar")
	public Medico cadastrar(@RequestParam("nome") String nome,
			@RequestParam("sobrenome") String sobrenome,
			@RequestParam("especializacao") String especializacao) {
		Medico medico = new Medico(nome, sobrenome, especializacao);
		medico = medicoRepository.save(medico);
		return medico;
	}

}
