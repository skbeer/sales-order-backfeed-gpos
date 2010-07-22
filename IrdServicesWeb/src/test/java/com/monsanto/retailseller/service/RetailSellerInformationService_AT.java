package com.monsanto.retailseller.service;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.retailseller.schema.*;
import com.monsanto.irdsoapservices.retailseller.service.RetailSellerInformationServiceImpl;
import com.monsanto.retailseller.dao.TestDataDaoImpl;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;


/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 29, 2010
 * Time: 12:57:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class RetailSellerInformationService_AT extends AbstractTransactionalDataSourceSpringContextTests {
    TestDataDaoImpl testDao = null;

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        testDao = (TestDataDaoImpl) getApplicationContext().getBean("testDataDao");
        testDao.deleteSellerRecords("Dealer");
    }

    @Override
    protected void onTearDown() throws Exception {
        super.onTearDown();
        testDao.deleteSellerRecords("Dealer");
    }

    public void testRetailSellerService() throws Exception {
        RetailSellerInformationService service = new RetailSellerInformationServiceImpl();
        RetailSellerResponseType responseType = service.saveRetailSellerInformation(getRequest());
        assertNotNull(responseType);
        assertEquals("Success", responseType.getStatus());
        assertEquals(4, testDao.getSellerCount("Dealer"));        
    }

    private RetailSellerInformationType getRequest() {
        RetailSellerInformationType requestType = new RetailSellerInformationType();
        RetailSellerInformationBodyType bodyType = new RetailSellerInformationBodyType();
        RetailSellerInformationPartnersType partnersType = new RetailSellerInformationPartnersType();
        BuyerType buyerType = new BuyerType();
        buyerType.setPartnerInformation(getPartnerInformationType("Buyer", false));
        partnersType.setBuyer(buyerType);
        bodyType.setRetailSellerInformationPartners(partnersType);
        bodyType.getRetailSellerInformationDetails().add(getRetailSellerDetailsType("Dealer A"));
        bodyType.getRetailSellerInformationDetails().add(getRetailSellerDetailsType("Dealer B"));
        requestType.setRetailSellerInformationBody(bodyType);
        return requestType;
    }

    private RetailSellerInformationDetailsType getRetailSellerDetailsType(String dealerPref) {
        RetailSellerInformationDetailsType detailsType = new RetailSellerInformationDetailsType();
        DealerType dealerType = new DealerType();
        dealerType.setPartnerInformation(getPartnerInformationType(dealerPref, false));
        detailsType.setDealer(dealerType);
        detailsType.getSalesperson().add(getSalespersonType(dealerPref+"-Seller A"));
        detailsType.getSalesperson().add(getSalespersonType(dealerPref+"-Seller B"));
        return detailsType;
    }

    private PartnerInformationType getPartnerInformationType(String prefix, boolean populateAddress) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        if(populateAddress) {
            AddressInformationType addressInformationType = new AddressInformationType();
            addressInformationType.getAddressLine().add(prefix+" Addr_Line_1");
            addressInformationType.getAddressLine().add(prefix+" Addr_Line_2");
            addressInformationType.setCityName(prefix+" City");
            addressInformationType.setStateOrProvince("MO");
            addressInformationType.setCounty("Country");
            addressInformationType.setPostalCode("63146");
            partnerInformationType.setAddressInformation(addressInformationType);
        }
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.AGIIS_EBID);
        partnerIdentifierType.setValue(prefix+"101");
        partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        return partnerInformationType;
    }

    private SalespersonType getSalespersonType(String prefix) {
        SalespersonType salespersonType = new SalespersonType();
        salespersonType.setPartnerInformation(getPartnerInformationType(prefix, true));
        return salespersonType;
    }
}
