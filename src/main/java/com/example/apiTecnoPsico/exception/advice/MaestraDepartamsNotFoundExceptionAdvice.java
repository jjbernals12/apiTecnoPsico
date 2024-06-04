package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.MaestraDepartamsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MaestraDepartamsNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(MaestraDepartamsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleMaestraDepartamsNotFoundException(MaestraDepartamsNotFoundException ex){ return ex.getMessage(); }
}
