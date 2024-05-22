package com.squad14.hanami.exception;

public class InvalidFieldException extends RuntimeException{
    private String field;

    public InvalidFieldException(String field){
        this.field = field;
    }

    public String getMessage(){
        return field + " invalido";
    }
}
