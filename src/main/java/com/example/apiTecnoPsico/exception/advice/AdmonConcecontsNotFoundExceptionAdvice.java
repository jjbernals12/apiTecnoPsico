package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.AdmonConcecontsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AdmonConcecontsNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(AdmonConcecontsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleAdmonConcecontsNotFoundException(AdmonConcecontsNotFoundException ex){ return ex.getMessage(); }
}
