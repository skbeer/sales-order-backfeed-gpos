package com.monsanto.irdsoapservices.agreementstatus.helper;

import com.monsanto.irdsoapservices.agreementstatus.dao.AgreementStatusDao;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.ZoneInfo;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequest;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequestBodyType;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequestDetailsType;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.PartnerIdentifierType;
import junit.framework.TestCase;
import org.junit.Assert;
import org.mockito.ArgumentMatcher;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 12, 2010
 * Time: 1:47:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusHelper_UT extends TestCase {

    AgreementStatusHelper helper;
    AgreementStatusDao dao;
    AgreementStatusResponseBuilder responseBuilder;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dao = mock(AgreementStatusDao.class);
        responseBuilder = mock(AgreementStatusResponseBuilder.class);
        helper = new AgreementStatusHelper();
        helper.setAgreementStatusDao(dao);
        helper.setResponseBuilder(responseBuilder);
    }

//    public void testGetAgreementStatus() throws Exception {
//        AgreementStatusRequest request = getRequest();
//        when(dao.getAgreementStatusInfo(anyList(), new ArrayList<String>())).thenReturn(new ArrayList<AgreementStatusInfo>());
//        when(responseBuilder.getAgreementStatusResponse(eq(request), anyList())).thenReturn(new AgreementStatusResponseType());
//        assertNotNull(helper.getAgreementStatus(request));
//        verify(dao).getAgreementStatusInfo(anyList(), null);
//        verify(responseBuilder).getAgreementStatusResponse(eq(request), anyList());
//    }

    public void testGetGLNsFromRequest() throws Exception {
        List<String> glns = helper.extractGLNsFromRequest(getRequest());
        assertEquals(3, glns.size());
        assertTrue(glns.contains("1001"));
        assertTrue(glns.contains("1002"));
        assertFalse(glns.contains("1003"));
        assertFalse(glns.contains("1004"));
        assertTrue(glns.contains("1005"));
    }
    public void testGetAssignedBySellersFromRequest() throws Exception {
        List<String> assignedBySellers = helper.extractAssignedBySellersFromRequest(getRequest());
        assertEquals(3, assignedBySellers.size());
        assertTrue(assignedBySellers.contains("1006"));
        assertTrue(assignedBySellers.contains("1007"));
    }
    public void testFilterByGLPORSAP1() throws Exception {
        List<AgreementStatusInfo> agreementStatusList = new ArrayList<AgreementStatusInfo>();
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "GLN","7005", "A"));
        agreementStatusList.add(getMockAgreementStatusInfo("1005", "SAP","7005", "A"));
        agreementStatusList.add(getMockAgreementStatusInfo("2005", "GLN","8005", "A"));
        agreementStatusList.add(getMockAgreementStatusInfo("2006", "SAP","8005", "A"));
        agreementStatusList.add(getMockAgreementStatusInfo("2007", "SAP","8005", "C"));
        List<AgreementStatusInfo> filteredAgreementStatusList = helper.filterByGLNORSAP(agreementStatusList);
        Assert.assertEquals(3,filteredAgreementStatusList.size());
    }
    public void testNormalizeAgreements_Scenario_1() throws Exception {
        List<AgreementStatusInfo> agreementStatusList = new ArrayList<AgreementStatusInfo>();
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA1", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA2", "Z2"));
        agreementStatusList.add(getMockAgreementStatusInfo("1002", "MTA1", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1002", "MTA1", "Z2"));
        agreementStatusList.add(getMockAgreementStatusInfo("1003", "MTA1", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1004", "MTA2", "Z1"));
        HashMap<String, AgreementStatusInfo> map = helper.normalizeAgreementStatusList(agreementStatusList);
        assertNormalizedMap(map, "1001", 2, 1, 1);
        assertNormalizedMap(map, "1002", 1, 2, -1);
        assertNormalizedMap(map, "1003", 1, 1, -1);
        assertNormalizedMap(map, "1004", 1, 1, -1);
    }

    public void testNormalizeAgreements_Scenario_2() throws Exception {
        List<AgreementStatusInfo> agreementStatusList = new ArrayList<AgreementStatusInfo>();
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA1", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA2", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA1", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA1", "Z2"));
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA2", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1001", "MTA6", "Z2"));
        agreementStatusList.add(getMockAgreementStatusInfo("1002", "MTA3", "Z1"));
        agreementStatusList.add(getMockAgreementStatusInfo("1002", "MTA2", "Z1"));
        HashMap<String, AgreementStatusInfo> map = helper.normalizeAgreementStatusList(agreementStatusList);
        assertNormalizedMap(map, "1001", 3, 3, 2);
        assertNormalizedMap(map, "1002", 2, 1, 1);
    }

    private void assertNormalizedMap(HashMap<String, AgreementStatusInfo> map, String gln, int expectedAgrCount, int expectedZoneCntForFirstAgreement, int expectedSecondAgreementZoneCount) {
        assertTrue(map.get(gln)!=null);
        assertEquals(expectedAgrCount, map.get(gln).getAgreements().size());
        assertEquals(expectedZoneCntForFirstAgreement, map.get(gln).getAgreements().get(0).getZones().size());
        if(expectedSecondAgreementZoneCount != -1) {
            assertEquals(expectedSecondAgreementZoneCount, map.get(gln).getAgreements().get(1).getZones().size());            
        }
    }

    private AgreementStatusInfo getMockAgreementStatusInfo(String gln, String agreementName, String zoneName) {
        AgreementStatusInfo agrStatusInfo = new AgreementStatusInfo();
        agrStatusInfo.setAliasId(gln);
        agrStatusInfo.setTempAgreement(getTempAgreementInfo(agreementName, zoneName));
        return agrStatusInfo;
    }
    private AgreementStatusInfo getMockAgreementStatusInfo(String gln,String systemTypeCode, String acctId,  String speciesCode) {
        AgreementStatusInfo agrStatusInfo = new AgreementStatusInfo();
        agrStatusInfo.setAliasId(gln);
        agrStatusInfo.setSystemTypeCode(systemTypeCode);
        agrStatusInfo.setAcctId(acctId);
        agrStatusInfo.setSpeciesCode(speciesCode);
        return agrStatusInfo;
    }
    private AgreementStatusInfo getAgreementStatusInfo(String gln, String[] agreements, int[] zoneCount) {
        AgreementStatusInfo agrStatusInfo = new AgreementStatusInfo();
        agrStatusInfo.setAliasId(gln);
        for (int i = 0; i < agreements.length; i++) {
            agrStatusInfo.getAgreements().add(getAgreementInfo(agreements[i], zoneCount[i]));
        }
        return agrStatusInfo;
    }

    private AgreementInfo getTempAgreementInfo(String agreementName, String zoneName) {
        AgreementInfo agreementInfo = new AgreementInfo();
        agreementInfo.setAgreementName(agreementName);
        agreementInfo.setTempZone(getTempZoneInfo(zoneName));
        return agreementInfo;
    }

    private ZoneInfo getTempZoneInfo(String zoneName) {
        ZoneInfo zoneInfo = new ZoneInfo();
        zoneInfo.setZoneName(zoneName);
        return zoneInfo;
    }

    private AgreementInfo getAgreementInfo(String agreementName, int zoneCount) {
        AgreementInfo agreementInfo = new AgreementInfo();
        agreementInfo.setAgreementName(agreementName);
        for (int i = 0; i < zoneCount; i++) {
            agreementInfo.getZones().add(new ZoneInfo());
        }
        return agreementInfo;
    }

    private AgreementStatusRequest getRequest() {
        AgreementStatusRequest request = new AgreementStatusRequest();
        AgreementStatusRequestBodyType bodyType = new AgreementStatusRequestBodyType();
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1001", "GLN"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1002", "GLN"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1003", "NAPD"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1004", "ACCTID"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1005", "GLN"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1006", "AssignedBySeller"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1007", "AssignedBySeller"));
        bodyType.getAgreementStatusRequestDetails().add(getDetailsType("1010", "GLN","10112", "AssignedBySeller"));
        request.setAgreementStatusRequestBody(bodyType);
        return request;
    }

    private AgreementStatusRequestDetailsType getDetailsType(String gln, String agency) {
        AgreementStatusRequestDetailsType detalsType = new AgreementStatusRequestDetailsType();
        detalsType.getPartnerIdentifier().add(getPartnerIdentifierType(gln, agency));
        return detalsType;
    }
    private AgreementStatusRequestDetailsType getDetailsType(String gln, String agency,String gln2,String agency2) {
        AgreementStatusRequestDetailsType detalsType = new AgreementStatusRequestDetailsType();
        detalsType.getPartnerIdentifier().add(getPartnerIdentifierType(gln, agency));
        detalsType.getPartnerIdentifier().add(getPartnerIdentifierType(gln2, agency2));
        return detalsType;
    }
    private PartnerIdentifierType getPartnerIdentifierType(String partnerEbid, String value) {
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(value);
        partnerIdentifierType.setValue(partnerEbid);
        return partnerIdentifierType;
    }

    class IsListOfThreeElements extends ArgumentMatcher<List> {
      public boolean matches(Object list) {
          return ((List) list).size() == 3;
      }
   }

}
