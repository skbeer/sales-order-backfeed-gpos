package com.monsanto.irdsoapservices.dao.impl;

import com.monsanto.irdsoapservices.dao.VistiveProcessorDAO;
import com.monsanto.irdsoapservices.to.ProcessorTO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: SVADLAM
 * Date: Apr 19, 2010
 * Time: 1:03:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class VistiveProcessorDAOImpl extends SqlMapClientDaoSupport implements VistiveProcessorDAO {

    public List<ProcessorTO> getVistiveProcessorListFromDB() {
        return getSqlMapClientTemplate().queryForList("processors.getVistiveProcessors");
    }
}
