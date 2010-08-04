package com.monsanto.retailseller.helper;

import com.monsanto.irdsoapservices.retailseller.dao.RetailSellerDao;
import com.monsanto.irdsoapservices.retailseller.helper.RetailSellerHelper;
import com.monsanto.irdsoapservices.retailseller.schema.*;
import junit.framework.TestCase;
import org.mockito.ArgumentMatcher;
import static org.mockito.Mockito.*;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 29, 2010
 * Time: 3:16:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class RetailSellerHelper_UT extends TestCase {
    RetailSellerDao dao;
    RetailSellerHelper helper;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dao = mock(RetailSellerDao.class);
        helper = new RetailSellerHelper();
        helper.setSellerDao(dao);
    }

    public void testSaveSellerRecords_happyPath() throws Exception {
        when(dao.insertSellers(argThat(new IsListOfFourElements()))).thenReturn(1);
        RetailSellerResponseType responseType = helper.insertRetailSellerInformation(getRequest());
        assertNotNull(responseType);
        assertEquals("Success", responseType.getStatus());
        verify(dao).insertSellers(argThat(new IsListOfFourElements()));
    }

    public void testSaveSellerRecords_errorPath() throws Exception {
        when(dao.insertSellers(anyList())).thenThrow(new Exception("Something is wrong"));
        try {
            RetailSellerResponseType responseType = helper.insertRetailSellerInformation(getRequest());
            fail("Exception should occur");
        } catch (RetailSellerFault retailSellerFault) {
            retailSellerFault.printStackTrace();
            assertEquals("Something is wrong", retailSellerFault.getFaultInfo().getFaultMessage());
        }
        verify(dao).insertSellers(argThat(new IsListOfFourElements()));
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

    class IsListOfFourElements extends ArgumentMatcher<List> {
      public boolean matches(Object list) {
          return ((List) list).size() == 4;
      }
   }

}
