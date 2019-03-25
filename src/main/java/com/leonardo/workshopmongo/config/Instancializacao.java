package com.leonardo.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.leonardo.workshopmongo.domain.Usuario;
import com.leonardo.workshopmongo.repository.UsuarioRepository;

@Configuration
public class Instancializacao implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		Usuario leonardo = new Usuario(null, "Leonardo", "leonardo@gmail.com");
		Usuario joao = new Usuario(null,"Joao","joao@gmail.com");
		Usuario guilherme = new Usuario(null,"Guilherme","guilherme@gmail.com");
		Usuario amanda = new Usuario(null,"Amanda Oliveira","amanda@gmail.com");
		
		repository.saveAll(Arrays.asList(leonardo,joao,guilherme,amanda));
	}

}
