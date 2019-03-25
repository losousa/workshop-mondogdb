package com.leonardo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.workshopmongo.domain.Usuario;
import com.leonardo.workshopmongo.exception.MinhaException;
import com.leonardo.workshopmongo.repository.UsuarioRepository;

@Service
public class UsuarioServico {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listar(){
		return repository.findAll();
	}
	
	public Usuario procurarPorId(String id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new MinhaException("Objeto não encontrado"));
	}
	
	public Usuario adicionar(Usuario usuario) {
		return repository.insert(usuario);
}
}