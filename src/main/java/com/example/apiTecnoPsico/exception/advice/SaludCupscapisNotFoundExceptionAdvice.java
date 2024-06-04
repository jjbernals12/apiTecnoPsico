package com.example.apiTecnoPsico.exception.advice;

import com.example.apiTecnoPsico.exception.SaludCupscapisNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SaludCupscapisNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(SaludCupscapisNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSaludCupscapisNotFoundException(SaludCupscapisNotFoundException ex){ return ex.getMessage(); }
}
