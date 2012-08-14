package com.monsanto.commercial.growercreditlist.requestbuilder;

import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditRequestType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditRequestBodyType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerListType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditResponseDetailsType;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.exception.RequestBuilderException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 9, 2012
 * Time: 2:23:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class GetGrowerCreditRequestBuilder extends BaseRequestBuilder {

    public GrowerCreditRequestType createRequest(List<String> growerAccountIds, ClientInfo clientInfo) throws RequestBuilderException {
        GrowerCreditRequestType requestType = new GrowerCreditRequestType();
        GrowerCreditRequestBodyType requestBodyType = new GrowerCreditRequestBodyType();
        GrowerListType growerListType = new GrowerListType();
        growerListType.getGrowerIdentification().addAll(growerAccountIds);
        requestBodyType.setGrowerList(growerListType);
        requestType.setHeader(getHeaderType(clientInfo));
        requestType.setGrowerCreditRequestBody(requestBodyType);
        return requestType;
    }
}
