package com.monsanto.irdsoapservices.clientutil;

import com.monsanto.isdcommon.soaphandler.WsSecuritySoapHandler;

import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.Handler;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Apr 29, 2009
 * Time: 4:53:38 PM
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
