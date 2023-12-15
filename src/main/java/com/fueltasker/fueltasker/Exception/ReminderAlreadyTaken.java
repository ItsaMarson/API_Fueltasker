package com.fueltasker.fueltasker.Exception;

public class ReminderAlreadyTaken extends RuntimeException{
    public ReminderAlreadyTaken(String message){
        super(message);
    }
    
}
