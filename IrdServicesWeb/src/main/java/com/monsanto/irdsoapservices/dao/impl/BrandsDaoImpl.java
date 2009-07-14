package com.monsanto.irdsoapservices.dao.impl;

import com.monsanto.irdsoapservices.dao.BrandsDao;
import com.monsanto.irdsoapservices.to.BrandInfo;
import com.monsanto.irdsoapservices.utils.StringUtils;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 1, 2009
 * Time: 3:52:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class BrandsDaoImpl extends SqlMapClientDaoSupport implements BrandsDao {

    public List<BrandInfo> getBrandsBySpecies(List<String> species) throws Exception {
        return (List<BrandInfo>)getSqlMapClientTemplate().queryForList("Brands.getBrandsBySpecies", toUpper(species));
    }

    private List<String> toUpper(List<String> species) throws Exception {
        List<String> upperCasedSpecieList = new ArrayList<String>();
        for(String specie: species) {
            if(!StringUtils.isNullOrEmpty(specie)) {
                upperCasedSpecieList.add(specie.trim().toUpperCase());
            }
        }
        return upperCasedSpecieList;
    }
}
