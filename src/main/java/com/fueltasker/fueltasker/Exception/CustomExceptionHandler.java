package com.fueltasker.fueltasker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(UsernameAlreadyTakenException.class)
    public ResponseEntity<CustomErrorResponse> handleUsernameAlreadyTakenException(UsernameAlreadyTakenException ex) {
        CustomErrorResponse errorResponse = new CustomErrorResponse(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ReminderTitleDoesNotExist.class)
    public ResponseEntity<CustomErrorResponse> handleReminderTitleDoesNotExist(ReminderTitleDoesNotExist ex){
        CustomErrorResponse errorResponse = new CustomErrorResponse(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(ReminderAlreadyTaken.class)
    public ResponseEntity<CustomErrorResponse> handleReminderAlreadyTaken(ReminderAlreadyTaken ex){
        CustomErrorResponse errorResponse = new CustomErrorResponse(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(EmailAlreadyTakenException.class)
    public ResponseEntity<CustomErrorResponse> handleEmailAlreadyTaken(EmailAlreadyTakenException ex){
        CustomErrorResponse errorResponse = new CustomErrorResponse(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
