package com.monsanto.irdsoapservices.dao;

import com.monsanto.irdsoapservices.to.ProcessorTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: SVADLAM
 * Date: Apr 19, 2010
 * Time: 1:01:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VistiveProcessorDAO {
    public List<ProcessorTO> getVistiveProcessorListFromDB();
}
