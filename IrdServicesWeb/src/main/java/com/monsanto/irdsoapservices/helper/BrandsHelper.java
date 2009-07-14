package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.brands.schema.*;
import com.monsanto.irdsoapservices.dao.BrandsDao;
import com.monsanto.irdsoapservices.service.BrandsFault;
import com.monsanto.irdsoapservices.to.BrandInfo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 1, 2009
 * Time: 4:38:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class BrandsHelper extends AbstractHelper {
    private BrandsDao brandsDao;
    Logger logger = Logger.getLogger(this.getClass());
                                
    public GetBrandsResponseType getBrands(GetBrandsRequestType request) throws BrandsFault {
        GetBrandsResponseType response = new GetBrandsResponseType();
        try {
            logger.debug("Validating getBrands Request");
            validateRequest(request);
            logger.info("Retrieving Brands by Species");
            List<BrandInfo> brandsList = brandsDao.getBrandsBySpecies(request.getGetBrandsRequestBody().getSeedSpecieName());
            GetBrandsResponseBodyType responseBody = createResponseBody(brandsList);
            response.setHeader(getResponseHeader(request.getHeader()));
            response.setGetBrandsResponseBody(responseBody);
            logger.info("Returning Brands back to the client");
        } catch (Throwable e) {
            handleException(e, "getBrands");
        }
        logger.debug("End: getBrands()");
        return response;
    }

    private GetBrandsResponseBodyType createResponseBody(List<BrandInfo> brandList) throws Exception {
        HashMap brandMap = categorizeBrandsBySpecie(brandList);
        GetBrandsResponseBodyType responseBody = new GetBrandsResponseBodyType();
        BrandsForSpecieType brandsForSpecie = null;
        Iterator iter = brandMap.keySet().iterator();
        while (iter.hasNext()) {
            brandsForSpecie = new BrandsForSpecieType();
            String specie = (String)iter.next();
            brandsForSpecie.setSeedSpecieName(specie);
            brandsForSpecie.getBrand().addAll((List<BrandType>)brandMap.get(specie));
            responseBody.getBrandsForSpecie().add(brandsForSpecie);
        }
        return responseBody;
    }

    private HashMap categorizeBrandsBySpecie(List<BrandInfo> brands) throws Exception {
        HashMap<String, List<BrandType>> brandMap = new HashMap<String, List<BrandType>>();
        for(BrandInfo brandInfo : brands) {
            if(brandMap.get(brandInfo.getSpecieName())==null) {
                brandMap.put(brandInfo.getSpecieName(), new ArrayList<BrandType>());
            }
            brandMap.get(brandInfo.getSpecieName()).add(brandInfo.extractBrandType());
        }
        return brandMap;
    }

    private void validateRequest(GetBrandsRequestType request) throws Exception {
        if((request == null) ||
                (request.getGetBrandsRequestBody() ==null)||
                (request.getGetBrandsRequestBody().getSeedSpecieName() == null)||
                (request.getGetBrandsRequestBody().getSeedSpecieName().size() < 1)) {
            throw new Exception("Received in-valid GetBrandsRequest object");
        }
    }

    public void setBrandsDao(BrandsDao brandsDao) {
        this.brandsDao = brandsDao;
    }

    private void handleException(Throwable error, String operationName) throws BrandsFault {
        logException(error, logger, "getBrands");
        ExceptionType exception = new ExceptionType();
        exception.setFaultCode(error.getMessage());
        exception.setFaultMessage(getStackTrace(error));
        throw new BrandsFault("Error occurred during operation: "+operationName, exception, error);
    }
}
