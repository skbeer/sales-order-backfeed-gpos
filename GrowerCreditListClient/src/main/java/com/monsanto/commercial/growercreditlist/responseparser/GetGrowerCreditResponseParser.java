package com.monsanto.commercial.growercreditlist.responseparser;

import com.monsanto.commercial.growercreditlist.domain.GrowerCreditInfo;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditResponseType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditResponseDetailsType;
import com.monsanto.commercial.growercreditlist.exception.ResponseParserException;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 9, 2012
 * Time: 2:31:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class GetGrowerCreditResponseParser {
    public List<GrowerCreditInfo> parse(GrowerCreditResponseType responseType) throws ResponseParserException {
        List<GrowerCreditInfo> growerList = new ArrayList<GrowerCreditInfo>();
        if(responseType != null && responseType.getGrowerCreditResponseBody()!= null && responseType.getGrowerCreditResponseBody().getGrowerCreditResponseDetails()!= null
                && responseType.getGrowerCreditResponseBody().getGrowerCreditResponseDetails().size() > 0) {
            for(GrowerCreditResponseDetailsType detailsType : responseType.getGrowerCreditResponseBody().getGrowerCreditResponseDetails()) {
                if(detailsType != null) {
                    growerList.add(parseGrowerInfo(detailsType));
                }
            }
        }
        return growerList;
    }

    private GrowerCreditInfo parseGrowerInfo(GrowerCreditResponseDetailsType detailsType) {
        GrowerCreditInfo growerCreditInfo = new GrowerCreditInfo();
        growerCreditInfo.setGrowerAccountId(detailsType.getGrowerIdentification());
        growerCreditInfo.setCreditApproved(detailsType.getCreditLimit().doubleValue());
        growerCreditInfo.setCreditAvailable(detailsType.getAmountOfCreditUsed().doubleValue());
        return growerCreditInfo;
    }
}
