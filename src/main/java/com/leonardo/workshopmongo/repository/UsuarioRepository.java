package com.leonardo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.workshopmongo.domain.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
}
