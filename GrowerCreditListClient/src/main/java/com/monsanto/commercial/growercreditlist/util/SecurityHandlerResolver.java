package com.monsanto.commercial.growercreditlist.util;

import com.monsanto.isdclient.soaphandler.WsSecuritySoapHandler;

import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.PortInfo;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Oct 5, 2011
 * Time: 9:45:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class SecurityHandlerResolver implements HandlerResolver {
    private WsSecuritySoapHandler soapHandler = null;
    private List<Handler> handlerList = new ArrayList<Handler>();

    public SecurityHandlerResolver(String userName, String password) {
        this.soapHandler = new WsSecuritySoapHandler(userName, password);
        handlerList.add(soapHandler);
    }

    public List<Handler> getHandlerChain(PortInfo portInfo) {
        return handlerList;
    }
}