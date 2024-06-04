package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.MaestraOcupacsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MaestraOcupacsNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(MaestraOcupacsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleMaestraOcupacsNotFoundException(MaestraOcupacsNotFoundException ex){ return ex.getMessage(); }
}
