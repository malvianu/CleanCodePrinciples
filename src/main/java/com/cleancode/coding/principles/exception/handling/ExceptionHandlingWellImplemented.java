package com.cleancode.coding.principles.exception.handling;

import java.util.logging.Logger;

public class ExceptionHandlingWellImplemented {
    private static Logger logger;
    public void sendShutDown() {
        try {
            tryToShutDown();
        } catch (DeviceShutDownError e) {
            logger.info(e.getMessage());
        }
    }

    private void tryToShutDown() throws DeviceShutDownError {
        DeviceHandle handle = getHandle("DEV1");
        DeviceRecord record = retrieveDeviceRecord(handle);
        pauseDevice(handle);
        clearDeviceWorkQueue(handle);
        closeDevice(handle);
    }

    private DeviceHandle getHandle(String id) {
        //Some implementation code
        throw new DeviceShutDownError("Invalid handle for: " + id.toString());
    }

    public DeviceRecord retrieveDeviceRecord(DeviceHandle handle){
        return null;
    }

    public void pauseDevice(DeviceHandle handle) {

    }

    public void clearDeviceWorkQueue(DeviceHandle handle) {

    }

    public void closeDevice(DeviceHandle handle){}
}
