package com.monsanto.irdsoapservices.salesorder.client;

import org.apache.log4j.Logger;

import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.Set;


/**
 * Created by IntelliJ IDEA.
 * User: snagell
 * Date: Nov 22, 2010
 * Time: 4:28:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class IRDLogHandler implements SOAPHandler<SOAPMessageContext> {
    Logger logger = Logger.getLogger(this.getClass());
    
    public Set getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        logMessage(soapMessageContext);
        return true;
    }

    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        logMessage(soapMessageContext);
        return true;
    }

    public void close(MessageContext messageContext) {
    }

    private void logMessage(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean)
                smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {
            logger.debug("\nOutbound message:");
        } else {
            logger.debug("\nInbound message:");
        }
        SOAPMessage message = smc.getMessage();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            message.writeTo(bout);
            logger.debug(bout.toString());
            bout.close();
        } catch (Exception e) {
            logger.error(e);
        }
        logger.debug("\n");
    }
}

