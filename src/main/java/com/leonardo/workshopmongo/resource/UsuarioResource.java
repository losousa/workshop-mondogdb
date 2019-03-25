package com.leonardo.workshopmongo.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.workshopmongo.domain.Usuario;
import com.leonardo.workshopmongo.dto.UsuarioDTO;
import com.leonardo.workshopmongo.services.UsuarioServico;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioServico servico;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UsuarioDTO>> listar(){
		List<Usuario> lista = servico.listar();
		List<UsuarioDTO> listar = lista.stream().map(x -> new UsuarioDTO(x))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listar);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<UsuarioDTO> procurarPorId(@PathVariable String id){
		Usuario usuario = servico.procurarPorId(id);
		return ResponseEntity.ok().body(new UsuarioDTO(usuario));
	}
}
