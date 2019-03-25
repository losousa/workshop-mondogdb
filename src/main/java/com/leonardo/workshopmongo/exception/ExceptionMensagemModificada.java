package com.leonardo.workshopmongo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionMensagemModificada {
	
	@ExceptionHandler(MinhaException.class)
	public ResponseEntity<StandandError> mensagemModificada(MinhaException me,
			HttpServletRequest req){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandandError error = new StandandError(System.currentTimeMillis(),
				status.value(),
				"Nao Encontrado",
				me.getMessage(),
				req.getRequestURI());
		
		return ResponseEntity.status(status).body(error);
	}

}
