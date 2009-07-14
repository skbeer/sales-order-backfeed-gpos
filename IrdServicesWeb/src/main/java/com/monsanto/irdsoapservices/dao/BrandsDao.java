package com.monsanto.irdsoapservices.dao;

import com.monsanto.irdsoapservices.to.BrandInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 1, 2009
 * Time: 3:54:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BrandsDao {
    List<BrandInfo> getBrandsBySpecies(List<String> species) throws Exception;
}
