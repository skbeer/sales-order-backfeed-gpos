package com.monsanto.irdsoapservices.creditlist;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;
import java.util.HashMap;

import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 6, 2012
 * Time: 3:28:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListDAO extends SqlMapClientDaoSupport {

    public List<GrowerInfo> getGrowerList(String dealerGroupCode) throws Exception {
        HashMap<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("dealerGroupCode", dealerGroupCode);
        paramMap.put("growerGroupCode", "VF");
        return getSqlMapClientTemplate().queryForList("credit.getGrowerCreditInfo", paramMap);
    }
}
