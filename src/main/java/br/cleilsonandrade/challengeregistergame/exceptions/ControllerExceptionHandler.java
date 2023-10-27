package br.cleilsonandrade.challengeregistergame.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(NoSuchElementException.class)
  public ResponseEntity<NoSuchElementExceptionDTO> threatNoSuchElementException(NoSuchElementException exception) {
    NoSuchElementExceptionDTO noSuchElementExceptionDTO = new NoSuchElementExceptionDTO(
        "This list no longer has available users", "400");

    return ResponseEntity.badRequest().body(noSuchElementExceptionDTO);
  }
}
