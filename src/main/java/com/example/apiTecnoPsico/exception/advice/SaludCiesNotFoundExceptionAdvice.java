package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.SaludCiesNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SaludCiesNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(SaludCiesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSaludCiesNotFoundException(SaludCiesNotFoundException ex){ return ex.getMessage(); }
}
