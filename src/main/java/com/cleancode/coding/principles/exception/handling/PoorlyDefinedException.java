package com.cleancode.coding.principles.exception.handling;

import com.cleancode.coding.principles.exception.model.ATM1212UnlockedException;
import com.cleancode.coding.principles.exception.model.DeviceResponseException;
import com.cleancode.coding.principles.exception.model.GMXError;
import com.cleancode.coding.principles.exception.model.ThirdPartyPort;

import java.util.logging.Logger;

public class PoorlyDefinedException {
    private static Logger logger;
    public void method() {
        ThirdPartyPort port = new ThirdPartyPort(12);

        try {
            port.open();
        } catch (DeviceResponseException e) {
            reportPortError(e);
            logger.info("Device response exception"+ e.getLocalizedMessage());
        } catch (ATM1212UnlockedException e) {
            reportPortError(e);
            logger.info("Unlock exception"+ e.getLocalizedMessage());
        } catch (GMXError e) {
            reportPortError(e);
            logger.info("Device response exception");
        } finally {
        }
    }

    public void reportPortError(Exception exception){

    }
}
