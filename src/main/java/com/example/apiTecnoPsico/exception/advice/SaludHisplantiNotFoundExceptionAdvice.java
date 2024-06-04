package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.SaludHisplantiNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SaludHisplantiNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(SaludHisplantiNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSaludHisplantiNotFoundException(SaludHisplantiNotFoundException ex){ return ex.getMessage(); }
}
