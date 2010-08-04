package com.monsanto.irdsoapservices.dao;

import com.monsanto.irdsoapservices.to.AcctToAttr;
import com.monsanto.irdsoapservices.to.EmployeeInfo;
import com.monsanto.irdsoapservices.to.LfaGrowerDetails;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public interface IrdDao {

	public List<AcctToAttr> getAttributesByAcctId(long acctId) throws Exception;
	public int insertAccountAttribute(AcctToAttr acctToAttr) throws Exception;
	public int deleteAccountAttribute(AcctToAttr acctToAttr) throws Exception;
	
	public LfaGrowerDetails getAccountDetails(long growerAccountId) throws Exception;
	public int saveAccountDetails(LfaGrowerDetails lfaDetails) throws Exception;
	public int deleteAccountDetails(long growerAccountId) throws Exception;

    List<EmployeeInfo> getAssociatedEmployees(long accountId) throws Exception;

    long getAccountIdByAlias(String aliasType, String aliasId) throws Exception;

}
