package com.monsanto.isdcommon.soaphandler;

import org.apache.log4j.Logger;

import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.soap.*;
import javax.xml.namespace.QName;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 24, 2009
 * Time: 4:55:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class WsSecuritySoapHandler implements SOAPHandler<SOAPMessageContext> {
    Logger logger = Logger.getLogger(this.getClass());
    private static final String XMLNS_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String XMLNS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    private static final String PASSWORD_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";

    private String userName;
    private String password;

    public WsSecuritySoapHandler(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Set getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        boolean direction = ((Boolean) soapMessageContext.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue();
        if (direction) {  // concerned with outbound direction only
            try {
                SOAPMessage message = soapMessageContext.getMessage();
                SOAPHeader header = message.getSOAPHeader();

                if (header == null) {
                    header = message.getSOAPPart().getEnvelope().addHeader();
                }

                QName securityQName = new QName(XMLNS_WSSE, "Security", "wsse");

                SOAPHeaderElement tlHeader = header.addHeaderElement(securityQName);
                tlHeader.setAttribute("xmlns:wsu", XMLNS_WSU);

                SOAPElement userNameToken = tlHeader.addChildElement("UsernameToken", "wsse");

                SOAPElement userNameElement = userNameToken.addChildElement("Username", "wsse");
                userNameElement.addTextNode(this.userName);

                SOAPElement passwordElement = userNameToken.addChildElement("Password", "wsse");
                passwordElement.setAttribute("Type", PASSWORD_TYPE);
                passwordElement.addTextNode(this.password);

            } catch (SOAPException ex) {
                logger.error(ex);
                return false;
            }
        }

//        logToSystemOut(soapMessageContext);
        return true;
    }

    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        logToSystemOut(soapMessageContext);
        return true;
    }

    public void close(MessageContext messageContext) {
    }

    private void logToSystemOut(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean)
                smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {
            System.out.println("\nOutbound message:");
        } else {
            System.out.println("\nInbound message:");
        }

        SOAPMessage message = smc.getMessage();
        try {
            message.writeTo(System.out);
            System.out.println("");
        } catch (Exception e) {
            logger.error(e);
        }
    }
}

