package com.monsanto.irdsoapservices.helper.test;

import com.monsanto.irdsoapservices.brands.schema.BrandsForSpecieType;
import com.monsanto.irdsoapservices.brands.schema.GetBrandsRequestBodyType;
import com.monsanto.irdsoapservices.brands.schema.GetBrandsRequestType;
import com.monsanto.irdsoapservices.brands.schema.GetBrandsResponseType;
import com.monsanto.irdsoapservices.dao.BrandsDao;
import com.monsanto.irdsoapservices.helper.BrandsHelper;
import com.monsanto.irdsoapservices.service.BrandsFault;
import com.monsanto.irdsoapservices.test.BaseTestCase;
import com.monsanto.irdsoapservices.to.BrandInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 3, 2009
 * Time: 1:13:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class BrandsHelper_UT extends BaseTestCase {
    BrandsHelper helper = null;
    MockBrandsDao brandsDao = null;
    GetBrandsRequestType request = null;

    @Override
    protected void doSetUp() throws Exception {
        helper = new BrandsHelper();
        brandsDao = new MockBrandsDao();
        helper.setBrandsDao(brandsDao);
        request = new GetBrandsRequestType();
        GetBrandsRequestBodyType requestBody = new GetBrandsRequestBodyType();
        requestBody.getSeedSpecieName().add("corn");
        request.setHeader(getValidHeader("ABC123", "Brands_Partner"));
        request.setGetBrandsRequestBody(requestBody);
    }

    public void testGetBrands_invalidRequest_throwError() {
        try {
            request.getGetBrandsRequestBody().getSeedSpecieName().remove(0);
            helper.getBrands(request);
            fail("Exception should have occrred");
        } catch (BrandsFault brandsFault) {
            assertEquals("Received in-valid GetBrandsRequest object", brandsFault.getFaultInfo().getFaultCode());
        }
    }

    public void testGetBrands_noData() throws Exception {
        brandsDao.returnData = false;
        helper.setBrandsDao(brandsDao);
        GetBrandsResponseType response = helper.getBrands(request);
        assertNotNull(response);
        assertNotNull(response.getGetBrandsResponseBody());
        assertHeader(response.getHeader(), "ABC123", "Brands_Partner");
        assertEquals(0, response.getGetBrandsResponseBody().getBrandsForSpecie().size());
    }

    public void testGetBrands_withData_oneSpecie() throws Exception {
        GetBrandsResponseType response = helper.getBrands(request);
        assertNotNull(response);
        assertNotNull(response.getGetBrandsResponseBody());
        assertHeader(response.getHeader(), "ABC123", "Brands_Partner");
        assertEquals(1, response.getGetBrandsResponseBody().getBrandsForSpecie().size());
        assertBrandsResponse(response.getGetBrandsResponseBody().getBrandsForSpecie().get(0), "corn", 2);
    }

    public void testGetBrands_withData_multipleSpecies() throws Exception {
        request.getGetBrandsRequestBody().getSeedSpecieName().add("soy");
        GetBrandsResponseType response = helper.getBrands(request);
        assertNotNull(response);
        assertNotNull(response.getGetBrandsResponseBody());
        assertHeader(response.getHeader(), "ABC123", "Brands_Partner");
        assertEquals(2, response.getGetBrandsResponseBody().getBrandsForSpecie().size());
        assertBrandsResponse(response.getGetBrandsResponseBody().getBrandsForSpecie().get(1), "corn", 2);
        assertBrandsResponse(response.getGetBrandsResponseBody().getBrandsForSpecie().get(0), "soy", 2);
    }

    private void assertBrandsResponse(BrandsForSpecieType brandForSpecie, String specieName, int brandCount) {
        assertEquals(specieName, brandForSpecie.getSeedSpecieName());
        assertEquals(brandCount, brandForSpecie.getBrand().size());
        if(brandCount>0) {
            assertEquals(1, brandForSpecie.getBrand().get(0).getBrandId());
            assertEquals("Brand 1", brandForSpecie.getBrand().get(0).getBrandDescription());
        }
        if(brandCount>1) {
            assertEquals(2, brandForSpecie.getBrand().get(1).getBrandId());
            assertEquals("Brand 2", brandForSpecie.getBrand().get(1).getBrandDescription());
        }

    }

    class MockBrandsDao implements BrandsDao {
        public boolean returnData = true;

        public List<BrandInfo> getBrandsBySpecies(List<String> species) throws Exception {
            List<BrandInfo> brands = new ArrayList<BrandInfo>();
            if(returnData) {
                for (int index = 0; index < species.size(); index++) {
                    brands.add(getBrandInfo(1, species.get(index)));
                    brands.add(getBrandInfo(2, species.get(index)));
                }
            }
            return brands;
        }

        private BrandInfo getBrandInfo(int brandId, String specieName) {
            BrandInfo brand = new BrandInfo();
            brand.setBrandId(brandId);
            brand.setBrandDescr("Brand "+ brandId);
            brand.setSpecieName(specieName);
            return brand;
        }
    }
}
