package com.monsanto.irdsoapservices.retailseller.helper;

import com.monsanto.irdsoapservices.retailseller.dao.RetailSellerDao;
import com.monsanto.irdsoapservices.retailseller.domain.SellerInfo;
import com.monsanto.irdsoapservices.retailseller.schema.*;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 28, 2010
 * Time: 1:14:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class RetailSellerHelper {
    RetailSellerDao sellerDao;
    Logger logger = Logger.getLogger(this.getClass());

    public RetailSellerResponseType insertRetailSellerInformation(RetailSellerInformationType retailSellerInformationType) throws RetailSellerFault {
        RetailSellerResponseType retailSellerResponseType = new RetailSellerResponseType();
        logger.info("Processing RetailSellerInformation Request");
        try {
            logger.info("Begin Batch Insert of SalesPerson records.");
            sellerDao.insertSellers(extractSellerInfo(retailSellerInformationType.getRetailSellerInformationBody()));
            logger.info("Inserted Seller Records in IRD.STG_SEEDCO_SALESREP.");
            retailSellerResponseType.setStatus("Success");
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionType exceptionType = new ExceptionType();
            exceptionType.setFaultMessage(e.getMessage());
            throw new RetailSellerFault("Exception Occurred while performing operation saveRetailSellerInformation", exceptionType);
        }
        return retailSellerResponseType;
    }

    private List<SellerInfo> extractSellerInfo(RetailSellerInformationBodyType retailSellerInformationType) {
        List<SellerInfo> sellerList = new ArrayList<SellerInfo>();
        String hqEbid;
        String ebid;
        SellerInfo sellerInfo;
        BuyerType buyerType = retailSellerInformationType.getRetailSellerInformationPartners().getBuyer();
        hqEbid = buyerType.getPartnerInformation().getPartnerIdentifier().get(0).getValue();
        logger.info("HQ Ebid: "+hqEbid);
        String rowTaskId = hqEbid + "-" + new SimpleDateFormat("yyyy_MM_dd_sss").format(new Date());
        logger.info("Task Id: "+rowTaskId);
        List<RetailSellerInformationDetailsType> retailSellerDetailsList = retailSellerInformationType.getRetailSellerInformationDetails();
        for (RetailSellerInformationDetailsType retailSellerInformationDetailsType : retailSellerDetailsList) {
            ebid = retailSellerInformationDetailsType.getDealer().getPartnerInformation().getPartnerIdentifier().get(0).getValue();
            for(SalespersonType salesPersonType : retailSellerInformationDetailsType.getSalesperson()) {
                sellerInfo = extractSellerInfo(salesPersonType);
                sellerInfo.setEbid(ebid);
                sellerInfo.setHqEbid(hqEbid);
                sellerInfo.setRowTaskId(rowTaskId);
                sellerList.add(sellerInfo);
            }
        }
        logger.info("Extracted "+sellerList.size()+" SalesPerson Records.");
        return sellerList;
    }

    private SellerInfo extractSellerInfo(SalespersonType salesPersonType) {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setAliasCode(salesPersonType.getPartnerInformation().getPartnerIdentifier().get(0).getValue());
        if(salesPersonType.getPartnerInformation().getPartnerName().size() > 0) {
            sellerInfo.setLastName(salesPersonType.getPartnerInformation().getPartnerName().get(0));
        }
        if(salesPersonType.getPartnerInformation().getPartnerName().size() > 1) {
            sellerInfo.setFirstName(salesPersonType.getPartnerInformation().getPartnerName().get(1));
        }
        if(salesPersonType.getPartnerInformation().getAddressInformation().getAddressLine().size() > 0) {
            sellerInfo.setAddressLine1(salesPersonType.getPartnerInformation().getAddressInformation().getAddressLine().get(0));
        }
        if(salesPersonType.getPartnerInformation().getAddressInformation().getAddressLine().size() > 1) {
            sellerInfo.setAddressLine2(salesPersonType.getPartnerInformation().getAddressInformation().getAddressLine().get(1));
        }
        sellerInfo.setCity(salesPersonType.getPartnerInformation().getAddressInformation().getCityName());
        sellerInfo.setState(salesPersonType.getPartnerInformation().getAddressInformation().getStateOrProvince());
        sellerInfo.setZip(salesPersonType.getPartnerInformation().getAddressInformation().getPostalCode());
        sellerInfo.setCountry(salesPersonType.getPartnerInformation().getAddressInformation().getPostalCountry());
        if(salesPersonType.getPartnerInformation().getContactInformation().size() > 0 &&
                salesPersonType.getPartnerInformation().getContactInformation().get(0).getContactNumber().size() > 0) {
            sellerInfo.setPhoneNumber(salesPersonType.getPartnerInformation().getContactInformation().get(0).getContactNumber().get(0));
        }
        return sellerInfo;
    }

    public void setSellerDao(RetailSellerDao sellerDao) {
        this.sellerDao = sellerDao;
    }
}
