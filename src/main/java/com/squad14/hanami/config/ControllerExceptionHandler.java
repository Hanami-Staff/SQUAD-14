package com.squad14.hanami.config;

import com.squad14.hanami.dto.ExceptionDTO;
import com.squad14.hanami.exception.InvalidFieldException;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(InvalidFieldException.class)
    public ResponseEntity<ExceptionDTO> invalidFieldException(InvalidFieldException e) {
        ExceptionDTO exceptionDTO = new ExceptionDTO(e.getMessage());
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ExceptionDTO> postNotFoundException(EntityNotFoundException e) {
        ExceptionDTO exceptionDTO = new ExceptionDTO(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionDTO);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ExceptionDTO> invalidResponseEntity(MethodArgumentTypeMismatchException e) {
        ExceptionDTO exceptionDTO = new ExceptionDTO("ID informado é inválido.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionDTO);
    }
}
