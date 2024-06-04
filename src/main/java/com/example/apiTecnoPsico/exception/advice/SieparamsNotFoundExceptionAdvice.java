package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.SieparamsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SieparamsNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(SieparamsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSieparamsNotFoundException(SieparamsNotFoundException ex){ return ex.getMessage(); }
}
