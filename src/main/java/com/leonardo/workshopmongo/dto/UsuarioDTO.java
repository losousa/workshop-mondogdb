package com.leonardo.workshopmongo.dto;

import java.io.Serializable;
import java.util.Optional;

import com.leonardo.workshopmongo.domain.Usuario;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	
	public UsuarioDTO(Optional<Usuario> usuario) {
	}
	
	public UsuarioDTO(Usuario u) {
		id = u.getId();
		nome = u.getNome();
		email = u.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
