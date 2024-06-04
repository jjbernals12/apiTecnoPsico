package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.MaestraEspecialNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MaestraEspecialNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(MaestraEspecialNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleMaestraEspecialNotFoundException(MaestraEspecialNotFoundException ex){ return ex.getMessage(); }
}
