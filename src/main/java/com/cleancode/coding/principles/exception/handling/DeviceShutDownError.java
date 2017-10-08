package com.cleancode.coding.principles.exception.handling;

public class DeviceShutDownError extends RuntimeException{

    public DeviceShutDownError(){
        super();
    }

    public DeviceShutDownError(String mesg){
        super(mesg);
    }

}
