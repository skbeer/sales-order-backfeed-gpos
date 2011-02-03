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
    private static final int BATCH_UNIT = 1000;
    private static final int MAP_MAX_COUNT = 10;
    private static final String MAP_KEY_PREFIX_GLN = "Set";
    private static final String MAP_KEY_PREFIX_ABS = "SetABS";

    public List<AgreementStatusInfo> getAgreementStatusInfo(List<String> glns, List<String> assignedBySellers) {
        logger.info("Executing AgreementStatus SQL for "+glns.size()+" GLNs and " +assignedBySellers.size()+" AssignedBySellers");
        Map<String, List<String>> glnParameterMap = getGLNParameterMap(glns);
        logMapData(glnParameterMap,MAP_KEY_PREFIX_GLN);
        Map<String, List<String>> assignedBySellerParameterMap = getAssignedBySellerParameterMap(assignedBySellers);
        logMapData(assignedBySellerParameterMap,MAP_KEY_PREFIX_ABS);
        Map<String, List<String>> parameterMap =new HashMap<String, List<String>>();
        parameterMap.putAll(glnParameterMap);
        parameterMap.putAll(assignedBySellerParameterMap);
        return getSqlMapClientTemplate().queryForList("AgreementStatus.getAgreementStatus", parameterMap);
    }

    private void logMapData(Map<String, List<String>> paramMap,String mapKeyPrefix) {
        for(int index = 1; index <= paramMap.keySet().size(); index++) {
            logger.debug(mapKeyPrefix +(index)+" = " + paramMap.get(mapKeyPrefix +index).size());
        }
    }
    private Map<String, List<String>> getAssignedBySellerParameterMap(List<String> assignedBySellers) {
        int setCount = assignedBySellers.size()/ BATCH_UNIT;
        Map<String, List<String>> map = getStaticListMap(MAP_MAX_COUNT, MAP_KEY_PREFIX_ABS);
        int startIndex = 0;
        int endIndex = 0;
        for (int index = 1; index <= (setCount+1); index++) {
            endIndex = (assignedBySellers.size() < startIndex+ BATCH_UNIT)? assignedBySellers.size() : startIndex+ BATCH_UNIT;
            List<String> subList = assignedBySellers.subList(startIndex, endIndex);
            if(subList.size()>0){
                map.remove(MAP_KEY_PREFIX_ABS +index);
                map.put(MAP_KEY_PREFIX_ABS +index, subList);
            }
            startIndex = endIndex;
        }
        return map;
    }
    private Map<String, List<String>> getGLNParameterMap(List<String> glns) {
        int setCount = glns.size()/ BATCH_UNIT;
        Map<String, List<String>> map = getStaticListMap(MAP_MAX_COUNT, MAP_KEY_PREFIX_GLN);
        int startIndex = 0;
        int endIndex = 0;
        for (int index = 1; index <= (setCount+1); index++) {
            endIndex = (glns.size() < startIndex+ BATCH_UNIT)? glns.size() : startIndex+ BATCH_UNIT;
            List<String> subList = glns.subList(startIndex, endIndex);
            if(subList.size()>0){
                map.remove(MAP_KEY_PREFIX_GLN +index);
                map.put(MAP_KEY_PREFIX_GLN +index, subList);
            }
            startIndex = endIndex;
        }
        return map;
    }

    private Map<String, List<String>> getStaticListMap(int count, String mapKeyPrefix) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> aList = new ArrayList<String>();
        aList.add("0");
        for(int index = 1; index <= count; index++) {
            map.put(mapKeyPrefix +index, aList);
        }
        return map;
    }


}
