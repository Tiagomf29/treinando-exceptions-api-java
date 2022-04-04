package br.com.treinandoexcpetionsapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Id não pode ser excluído pois o mesmo não existe!")
public class ExceptionStatusExcluido extends RuntimeException{

	private static final long serialVersionUID = 1L;
																															
}
