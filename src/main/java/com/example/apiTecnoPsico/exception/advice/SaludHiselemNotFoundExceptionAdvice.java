package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.SaludHiselemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SaludHiselemNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(SaludHiselemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSaludHiselemNotFoundException(SaludHiselemNotFoundException ex){ return ex.getMessage(); }
}
