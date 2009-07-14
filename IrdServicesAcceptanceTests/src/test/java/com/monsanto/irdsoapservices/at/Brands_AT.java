package com.monsanto.irdsoapservices.at;

import com.monsanto.irdsoapservices.brands.client.*;
import com.monsanto.irdsoapservices.clientutil.ClientFactory;
import com.monsanto.irdsoapservices.clientutil.EnvironmentEnum;
import com.monsanto.irdsoapservices.at.AbstractAcceptanceTestCase;

import javax.xml.ws.soap.SOAPFaultException;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 3, 2009
 * Time: 3:25:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Brands_AT extends AbstractAcceptanceTestCase {

    private BrandsService_Service brandsService = null;
    protected BrandsService brandsClinet = null;

    @Override
    protected void doSetUp() throws Exception {
        brandsService = ClientFactory.getBrandsClient(EnvironmentEnum.DEV_EXT, USER_NAME, PASSWORD);
        brandsClinet = brandsService.getBrandsServicePort();
    }

    public void testGetBrands_invalidRequest_throwFault() {
        try {
            brandsClinet.getBrands(createBrandsRequest(false, new String[]{}));
        } catch (Exception e) {
            assertTrue(e instanceof SOAPFaultException);
            assertTrue(e.getMessage().startsWith("Schema validation errors"));
        }
    }

    public void testGetBrands_noData() throws Exception {
        GetBrandsResponseType response = brandsClinet.getBrands(createBrandsRequest(true, new String[]{"CORN1"}));
        assertNotNull(response);
        assertNotNull(response.getGetBrandsResponseBody());
        assertHeader(response.getHeader());
        assertEquals(0, response.getGetBrandsResponseBody().getBrandsForSpecie().size());
    }

    public void testGetBrands_withData_oneSpecie() throws Exception {
        GetBrandsResponseType response = brandsClinet.getBrands(createBrandsRequest(true, new String[]{"CORN"}));
        assertNotNull(response);
        assertNotNull(response.getGetBrandsResponseBody());
        assertHeader(response.getHeader());
        assertEquals(1, response.getGetBrandsResponseBody().getBrandsForSpecie().size());
        assertEquals("CORN", response.getGetBrandsResponseBody().getBrandsForSpecie().get(0).getSeedSpecieName());
        assertEquals(237, response.getGetBrandsResponseBody().getBrandsForSpecie().get(0).getBrand().size());
    }

    public void testGetBrands_withData_multipleSpecie() throws Exception {
        GetBrandsResponseType response = brandsClinet.getBrands(createBrandsRequest(true, new String[]{"CORN", "SOYBEAN"}));
        assertNotNull(response);
        assertNotNull(response.getGetBrandsResponseBody());
        assertHeader(response.getHeader());
        assertEquals(2, response.getGetBrandsResponseBody().getBrandsForSpecie().size());
        assertEquals("CORN", response.getGetBrandsResponseBody().getBrandsForSpecie().get(0).getSeedSpecieName());
        assertEquals(237, response.getGetBrandsResponseBody().getBrandsForSpecie().get(0).getBrand().size());
        assertEquals("SOYBEAN", response.getGetBrandsResponseBody().getBrandsForSpecie().get(1).getSeedSpecieName());
        assertEquals(272, response.getGetBrandsResponseBody().getBrandsForSpecie().get(1).getBrand().size());
    }

    private GetBrandsRequestType createBrandsRequest(boolean isValid, String[] species) throws Exception {
        GetBrandsRequestType request = new GetBrandsRequestType();
        GetBrandsRequestBodyType requestBody = new GetBrandsRequestBodyType();
        request.setHeader(getHeaderType());
        if(isValid) {
            for (int index = 0; index < species.length; index++) {
                requestBody.getSeedSpecieName().add(species[index]);
            }
        }
        request.setGetBrandsRequestBody(requestBody);
        return request;
    }
}
