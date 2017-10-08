package com.cleancode.coding.principles.exception.handling;


import com.cleancode.coding.principles.exception.model.DeviceHandle;
import com.cleancode.coding.principles.exception.model.DeviceRecord;

import java.util.logging.Logger;

public class ExceptionHandlingBadPractice {
    private static Logger logger;

    private final String DEVICE_SUSPENDED = "DEVICE_SUSPENDED";

    public void sendShutDown() {
        DeviceHandle handle = getHandle("DEV1");

        // Check the state of the device
        if (handle != DeviceHandle.INVALID) {
            // Save the device status to the record field
            DeviceRecord deviceRecord = retrieveDeviceRecord(handle);
            // If not suspended, shut down
            if (deviceRecord.getStatus() != DEVICE_SUSPENDED) {
                pauseDevice(handle);
                clearDeviceWorkQueue(handle);
                closeDevice(handle);
            } else {
                logger.info("Device suspended. Unable to shut down");
            }
        } else {
            logger.info("Invalid handle for: " + "DEV1");
        }
    }

    public DeviceHandle getHandle(String env) {
        return null;
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
