package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.schema.PersistableAttributeInfoType;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class AcctToAttr {
	private long accountId;
	private String attrCode;
	private Long originalAccountId;
	private String databaseAction;
	private Date rowEntryDate;
    private Date rowModifyDate;
    private String rowTaskId;
    private String rowUserId;
		
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAttrCode() {
		return attrCode;
	}
	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
	}
	public Long getOriginalAccountId() {
		return originalAccountId;
	}
	public void setOriginalAccountId(Long originalAccountId) {
		this.originalAccountId = originalAccountId;
	}
	public String getDatabaseAction() {
		return databaseAction;
	}
	public void setDatabaseAction(String dbActionType) {
		this.databaseAction = dbActionType;
	}
	public Date getRowEntryDate() {
		return rowEntryDate;
	}
	public void setRowEntryDate(Date rowEntryDate) {
		this.rowEntryDate = rowEntryDate;
	}
	public Date getRowModifyDate() {
		return rowModifyDate;
	}
	public void setRowModifyDate(Date rowModifyDate) {
		this.rowModifyDate = rowModifyDate;
	}
	public String getRowTaskId() {
		return rowTaskId;
	}
	public void setRowTaskId(String rowTaskId) {
		this.rowTaskId = rowTaskId;
	}
	public String getRowUserId() {
		return rowUserId;
	}
	public void setRowUserId(String rowUserId) {
		this.rowUserId = rowUserId;
	}
	
	public static AcctToAttr parse(PersistableAttributeInfoType persistableAttributeInfo, long growerAccountId) throws Exception {
		AcctToAttr acctToAttr = new AcctToAttr();
		if(persistableAttributeInfo.getDatabaseAction()==null) {
			throw new Exception("Recieved in-valid Database Action: null");
		}
		acctToAttr.setDatabaseAction(persistableAttributeInfo.getDatabaseAction().toString());
		String attrCode = persistableAttributeInfo.getAttributeCode();
		if((attrCode==null) || (attrCode.trim().length()< 1)) {
			throw new Exception("Recieved in-valid AttributeCode: "+attrCode);
		}
		acctToAttr.setAttrCode(attrCode.trim().toUpperCase());
		acctToAttr.setAccountId(growerAccountId);
		acctToAttr.setOriginalAccountId(growerAccountId);
		return acctToAttr;
	}

	@Override
	public String toString() {
		return " ACCT_TO_ATTR ["+ getAccountId()+", "+getAttrCode()+"] DBAction: "+getDatabaseAction();
	}

		
}
