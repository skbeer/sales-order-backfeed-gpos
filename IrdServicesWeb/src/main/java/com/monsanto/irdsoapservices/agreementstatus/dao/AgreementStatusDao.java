package com.monsanto.irdsoapservices.agreementstatus.dao;

import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 2:45:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AgreementStatusDao {
    List<AgreementStatusInfo> getAgreementStatusInfo(List<String> glns, List<String> assignedBySellers,List<String> systemCodes );
}
