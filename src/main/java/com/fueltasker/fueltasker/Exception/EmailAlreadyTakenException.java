package com.fueltasker.fueltasker.Exception;

public class EmailAlreadyTakenException extends RuntimeException{
    public EmailAlreadyTakenException(String message){
        super(message);
    }
}
