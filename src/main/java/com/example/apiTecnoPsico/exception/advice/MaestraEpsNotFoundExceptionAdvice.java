package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.MaestraEpsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MaestraEpsNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(MaestraEpsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleMaestraEpsNotFoundException(MaestraEpsNotFoundException ex){ return ex.getMessage(); }
}
