package com.cleancode.coding.principles.exception.model;

public class PortDeviceFailureException extends Exception{
    public PortDeviceFailureException(){
        super();
    }

    public PortDeviceFailureException(String message){
        super(message);
    }
}
