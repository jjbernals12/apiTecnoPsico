package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.MaestraEstratosNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MaestraEstratosNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(MaestraEstratosNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleMaestraEstratosNotFoundException(MaestraEstratosNotFoundException ex){ return ex.getMessage(); }
}
