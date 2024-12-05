package com.developia.librariann_nezrin_nesirova.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.developia.librariann_nezrin_nesirova.exception.MyException;
import com.developia.librariann_nezrin_nesirova.response.ErrorResponse;

@RestControllerAdvice
public class ExceptionHandlers {
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorResponse handleMyException(MyException exc) {
		ErrorResponse resp = new ErrorResponse();
		resp.setMessage(exc.getMessage());
		BindingResult br = exc.getBr();
		if (br != null) {
			resp.setValidations(exc.getBr().getFieldErrors());
		}

		return resp;
	}

}
