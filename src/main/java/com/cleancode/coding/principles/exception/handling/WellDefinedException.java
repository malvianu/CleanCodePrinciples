package com.cleancode.coding.principles.exception.handling;

import com.cleancode.coding.principles.exception.model.LocalPort;
import com.cleancode.coding.principles.exception.model.PortDeviceFailureException;

import java.util.logging.Logger;

public class WellDefinedException {
    private static Logger logger;
    public void method() {
        LocalPort port = new LocalPort(12);
        try {
            port.open();
        } catch (PortDeviceFailureException e) {
            reportError(e);
            logger.info(e.getMessage());
        } finally {

        }
    }

    private void reportError(PortDeviceFailureException portDeviceFailureException){
        //dummy implementation
    }
}
