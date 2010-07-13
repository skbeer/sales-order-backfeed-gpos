package com.monsanto.irdsoapservices.agreementstatus.dao;

import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 2:25:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusDaoImpl extends SqlMapClientDaoSupport implements AgreementStatusDao {

    public List<AgreementStatusInfo> getAgreementStatusInfo(List<String> glns) {
        return getSqlMapClientTemplate().queryForList("AgreementStatus.getAgreementStatus", glns);
    }

}
