package com.monsanto.irdsoapservices.dao;

import com.monsanto.irdsoapservices.to.AgreementHierarchyInfo;
import com.monsanto.irdsoapservices.to.AgreementInfo;
import com.monsanto.irdsoapservices.to.SignerInformation;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 30, 2009
 * Time: 4:29:11 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AgreementsDao {
    List<AgreementInfo> getAgreementsByAccountId(long acctId, String agreementCode, String accountType) throws Exception;
    List<AgreementInfo> getAgreementsBySignerAccountId(long signerAcctId, String agreementCode, String accountType) throws Exception;

    int updateAgreement(AgreementInfo agreementInfo) throws Exception;
    List<AgreementHierarchyInfo> getAgreementHierarchy(long accountId, String licensedBy) throws Exception;

    List<SignerInformation> getSignersByAgreementCode(String agreementCode, boolean unexpiredAgreementsOnly) throws Exception;

    List<SignerInformation> getSignersByAgreementCodeForExpiredAgreements(String agreementCode, Date fromDate, Date toDate) throws Exception;

}
