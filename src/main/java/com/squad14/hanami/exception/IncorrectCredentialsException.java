package com.squad14.hanami.exception;

public class IncorrectCredentialsException extends RuntimeException {
  private final String message = "Email ou senha invalidos.";

  public IncorrectCredentialsException() {
  }

  public String getMessage() {
    return message;
  }
}
