package com.cleancode.coding.principles.exception.model;

public class LocalPort {
    private ThirdPartyPort thirdPartyPort;

    public LocalPort(int portNum){
        thirdPartyPort = new ThirdPartyPort(portNum);
    }

    public void open() throws PortDeviceFailureException {
        try {
            thirdPartyPort.open();
        } catch (DeviceResponseException e) {
            e.printStackTrace();
            throw new PortDeviceFailureException("Device response exception occurred while opening port"+e.getMessage());
        } catch (ATM1212UnlockedException e) {
            e.printStackTrace();
            throw new PortDeviceFailureException("TM1212UnlockedException occurred while opening port"+e.getMessage());
        } catch (GMXError gmxError) {
            gmxError.printStackTrace();
            throw new PortDeviceFailureException("GMXError occurred while opening port "+gmxError.getMessage());
        }
    }
}
