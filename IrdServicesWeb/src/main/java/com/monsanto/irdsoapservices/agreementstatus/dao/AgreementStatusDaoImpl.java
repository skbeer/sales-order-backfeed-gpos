package com.monsanto.irdsoapservices.agreementstatus.dao;

import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import org.apache.log4j.Logger;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 2:25:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusDaoImpl extends SqlMapClientDaoSupport implements AgreementStatusDao {
    Logger logger = Logger.getLogger(AgreementStatusDaoImpl.class);
    public List<AgreementStatusInfo> getAgreementStatusInfo(List<String> glns) {
        logger.info("Executing AgreementStatus SQL for "+glns.size()+" GLNs");
        Map<String, List<String>> paramMap = getParameterMap(glns);
        for(int index = 1; index <= paramMap.keySet().size(); index++) {
            logger.debug("Set"+(index)+" = " + paramMap.get("Set"+index).size());
        }
        return getSqlMapClientTemplate().queryForList("AgreementStatus.getAgreementStatus", paramMap);
    }

    private Map<String, List<String>> getParameterMap(List<String> glns) {
        int setCount = glns.size()/1000;
        Map<String, List<String>> map = getStaticListMap(10);
        int startIndex = 0;
        int endIndex = 0;
        for (int index = 1; index <= (setCount+1); index++) {
            endIndex = (glns.size() < startIndex+1000)? glns.size() : startIndex+1000;
            List<String> subList = glns.subList(startIndex, endIndex);
            map.remove("Set"+index);
            map.put("Set"+index, subList);
            startIndex = endIndex;
        }
        return map;
    }

    private Map<String, List<String>> getStaticListMap(int count) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> aList = new ArrayList<String>();
        aList.add("0");
        for(int index = 1; index <= count; index++) {
            map.put("Set"+index, aList);
        }
        return map;
    }


}
