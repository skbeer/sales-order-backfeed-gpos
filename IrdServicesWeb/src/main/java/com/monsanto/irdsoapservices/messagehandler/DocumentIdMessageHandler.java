package com.monsanto.irdsoapservices.messagehandler;

import org.apache.log4j.Logger;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 20, 2009
 * Time: 5:15:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class DocumentIdMessageHandler implements SOAPHandler {
    Logger logger = Logger.getLogger(this.getClass());
    @Override
    public boolean handleMessage(MessageContext context) {
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outbound) {
            logger.debug("In Handle Request");
        } else {
            System.out.println("In Handle Response");
        }
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean handleFault(MessageContext context) {
        logger.debug("Handle Fault");
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void close(MessageContext context) {
        logger.debug("Close");
    }

    @Override
    public Set getHeaders() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
