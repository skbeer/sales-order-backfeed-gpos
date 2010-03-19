package com.monsanto.irdsoapservices.dao.impl;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.dao.AgreementsDao;
import com.monsanto.irdsoapservices.schema.AccountTypeAttribute;
import com.monsanto.irdsoapservices.to.AgreementHierarchyInfo;
import com.monsanto.irdsoapservices.to.AgreementInfo;
import com.monsanto.irdsoapservices.to.SignerInformation;
import com.monsanto.irdsoapservices.utils.StringUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 30, 2009
 * Time: 4:09:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementsDaoImpl extends SqlMapClientDaoSupport implements AgreementsDao {
    private static final String ACCT_ID = "acctId";
    private static final String AGREEMENT_CODE = "agrCode";
    private static final String SIGNER_ACCT_ID = "signerAcctId";
    public static final String SYSTEM_TYPE_CODE = "systemTypeCode";
    public static final String UNEXPIRED_ACCOUNTS_ONLY = "unexpiredAgreementsOnly";

    public List<AgreementInfo> getAgreementsByAccountId(long acctId, String agreementCode, String resultAccountType) throws Exception {
        if (AccountTypeAttribute.ACCTID.toString().equalsIgnoreCase(resultAccountType)) {
            return (List<AgreementInfo>) getSqlMapClientTemplate().queryForList("AcctToAgreements.getAgreements", createParamMap(acctId, 0, agreementCode, null));
        } else {
            return (List<AgreementInfo>) getSqlMapClientTemplate().queryForList("AcctToAgreements.getAgreementsByAlias", createParamMap(acctId, 0, agreementCode, resultAccountType));
        }
    }

    public List<AgreementInfo> getAgreementsBySignerAccountId(long signerAcctId, String agreementCode, String resultAccountType) throws Exception {
        if (AccountTypeAttribute.ACCTID.toString().equalsIgnoreCase(resultAccountType)) {
            return (List<AgreementInfo>) getSqlMapClientTemplate().queryForList("AcctToAgreements.getAgreements", createParamMap(0, signerAcctId, agreementCode, null));
        } else {
            return (List<AgreementInfo>) getSqlMapClientTemplate().queryForList("AcctToAgreements.getAgreementsByAlias", createParamMap(0, signerAcctId, agreementCode, resultAccountType));
        }
    }

    public int updateAgreement(AgreementInfo agreementInfo) throws Exception {
        setAuditFields(agreementInfo, agreementInfo.getRowUserId());
        return getSqlMapClientTemplate().update("AcctToAgreements.updateAgreement", agreementInfo);
    }

    public List<AgreementHierarchyInfo> getAgreementHierarchy(long accountId, String licensedBy) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("accountId", accountId + "");
        map.put("licensedBy", licensedBy);
        return (List<AgreementHierarchyInfo>) getSqlMapClientTemplate().queryForList("AcctToAgreements.getAgreementHierarchy", map);
    }

    public List<SignerInformation> getSignersByAgreementCode(String agreementCode, boolean unexpiredAgreementsOnly) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put(AGREEMENT_CODE, agreementCode.trim().toUpperCase());
        params.put(UNEXPIRED_ACCOUNTS_ONLY, unexpiredAgreementsOnly);
        return (List<SignerInformation>) getSqlMapClientTemplate().queryForList("AcctToAgreements.getSignersByAgreementCode", params);
    }


    private Map<String, String> createParamMap(long accountId, long signerAcctId, String agreementCode, String systemTypeCode) {
        Map<String, String> params = new HashMap<String, String>();
        params.put(ACCT_ID, accountId > 0 ? accountId + "" : null);
        params.put(SIGNER_ACCT_ID, signerAcctId > 0 ? signerAcctId + "" : null);
        params.put(AGREEMENT_CODE, agreementCode.trim().toUpperCase());
        params.put(SYSTEM_TYPE_CODE, StringUtils.isNullOrEmpty(systemTypeCode) ? null : systemTypeCode.trim().toUpperCase());
        return params;
    }

    private void setAuditFields(Object auditableObject, String rowUserId) throws RuntimeException {
        if (auditableObject == null) {
            return;
        }
        Date timestamp = Calendar.getInstance().getTime();
        try {
            BeanUtils.setProperty(auditableObject, "rowModifyDate", timestamp);
            BeanUtils.setProperty(auditableObject, "rowTaskId", DBConstants.ROW_TASK_ID);
            BeanUtils.setProperty(auditableObject, "rowUserId", StringUtils.isNullOrEmpty(rowUserId) ? DBConstants.ROW_USER_ID : rowUserId.trim().toUpperCase());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
