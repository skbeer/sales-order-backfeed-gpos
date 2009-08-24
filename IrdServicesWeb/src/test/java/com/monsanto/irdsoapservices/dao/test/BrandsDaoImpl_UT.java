package com.monsanto.irdsoapservices.dao.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.dao.BrandsDao;
import com.monsanto.irdsoapservices.dao.impl.BrandsDaoImpl;
import com.monsanto.irdsoapservices.to.BrandInfo;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 1, 2009
 * Time: 3:55:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class BrandsDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {
    BrandsDao brandsDao = null;

    public void testGetBrandsBySpecies() throws Exception {
        List<String> species = new ArrayList<String>();
        species.add("corn");
        List<BrandInfo> brands = brandsDao.getBrandsBySpecies(species);
        assertTrue(brands.size()>0);
        //assertEquals(249, brands.size());
        for (int index = 0; index < brands.size(); index++) {
            BrandInfo brandInfo = brands.get(index);
            System.out.println(brandInfo.toString());
        }
    }

    public void testGetBrands_noData() throws Exception {
        List<String> species = new ArrayList<String>();
        species.add("CORN1");
        List<BrandInfo> brands = brandsDao.getBrandsBySpecies(species);
        assertEquals(0, brands.size());
    }

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        brandsDao = (BrandsDaoImpl)getApplicationContext().getBean("brandsDao");
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }

}
