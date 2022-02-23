package br.com.service.exceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.service.excpetions.CepNotFoundException;
import br.com.service.excpetions.ExceptionResponse;

@ControllerAdvice
@RestController
public class ExceptionHandlerCustomized extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(CepNotFoundException.class)
	public ResponseEntity<ExceptionResponse> responseBodyExceptionCep(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);

	}

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> responseBodyExceptionGlobal(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
