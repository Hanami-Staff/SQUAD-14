package com.squad14.hanami.config;

import com.squad14.hanami.dto.ExceptionDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(InvalidFieldException.class)
    public ResponseEntity<ExceptionDTO> invalidFieldException(InvalidFieldException e){
        ExceptionDTO exceptionDTO = new ExceptionDTO(e.getMessage());
        return ResponseEntity.badRequest().body(exceptionDTO);
    }
}
