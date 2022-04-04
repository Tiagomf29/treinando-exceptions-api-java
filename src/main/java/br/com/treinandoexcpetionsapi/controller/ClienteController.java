package br.com.treinandoexcpetionsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinandoexcpetionsapi.exception.ExceptionStatusExcluido;
import br.com.treinandoexcpetionsapi.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
//	@DeleteMapping("/clientes/{id}")
//	public ResponseEntity<?> deletar(@PathVariable Integer id) {
//		
//		try {
//			clienteService.deletar(id);
//		}catch (EmptyResultDataAccessException e) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		
//		return ResponseEntity.status(HttpStatus.OK).build();
//	}
	
//	@DeleteMapping("/clientes/{id}")
//	@ResponseStatus(code = HttpStatus.OK, reason="Excluido com sucesso")
//	public void deletar(@PathVariable Integer id) throws ExceptionStatusExcluido {
//		try {
//			clienteService.deletar(id);
//		}catch (EmptyResultDataAccessException e) {
//			throw new ExceptionStatusExcluido("ID não existe e por isso não pode ser excluído!");
//		}	
//	}
	
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(code = HttpStatus.OK, reason="Excluido com sucesso")
	public void deletar(@PathVariable Integer id) throws ExceptionStatusExcluido {
		try {
		clienteService.deletar(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ExceptionStatusExcluido();
		}
	}
	
}
