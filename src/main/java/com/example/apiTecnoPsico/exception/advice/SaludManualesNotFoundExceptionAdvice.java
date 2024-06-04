package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.SaludManualesNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SaludManualesNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(SaludManualesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSaludManualesNotFoundException(SaludManualesNotFoundException ex){ return ex.getMessage(); }
}
