package com.monsanto.irdsoapservices.salesorder.client;

import com.monsanto.isdclient.soaphandler.WsSecuritySoapHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: snagell
 * Date: Nov 22, 2010
 * Time: 4:27:34 PM
 * To change this template use File | Settings | File Templates.
 */


public class IRDServiceHandlerResolver implements HandlerResolver {
    private IRDLogHandler logHandler;
    private List<Handler> handlerList;
    private static final String PDF_POC_PORT = "MI_ASAIPPDF_OSB_S_ReqPort";
    private static final String REPORTING_PORT = "SI_OSB_ASAIPReporting_S_OBPort";


    public IRDServiceHandlerResolver() {
        logHandler=new IRDLogHandler();
        this.handlerList = new ArrayList<Handler>();
        this.handlerList.add(getIRDLogHandler());
    }
    
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        return this.handlerList;
    }

    public IRDLogHandler getIRDLogHandler() {
        return logHandler;
    }
}
