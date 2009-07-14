package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.schema.AccountDetailsType;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class LfaGrowerDetails {
	private long accountId;
	private String spouse;
	private String family;
	private String organizations;
	private String hobbies;
	private String chemistryComments;
	private String otherChem;
	private String databaseAction;
	
	public String getDatabaseAction() {
		return databaseAction;
	}
	public void setDatabaseAction(String databaseAction) {
		this.databaseAction = databaseAction;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getChemistryComments() {
		return chemistryComments;
	}
	public void setChemistryComments(String chemistryComments) {
		this.chemistryComments = chemistryComments;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getOrganizations() {
		return organizations;
	}
	public void setOrganizations(String organizations) {
		this.organizations = organizations;
	}
	public String getOtherChem() {
		return otherChem;
	}
	public void setOtherChem(String otherChem) {
		this.otherChem = otherChem;
	}
	public String getSpouse() {
		return spouse;
	}
	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	@Override
	public String toString() {
		return getAccountId()+" "+getSpouse()+" "+getFamily()+" "+getHobbies()+" "+getOrganizations()+" "+getChemistryComments();
	}
	
	public AccountDetailsType extractTypeObject() throws Exception {
		AccountDetailsType detailsType = new AccountDetailsType();
		detailsType.setGrowerAcctId(getAccountId());
		detailsType.setSpouse(getSpouse());
		detailsType.setFamily(getFamily());
		detailsType.setInterestsHobbies(getHobbies());
		detailsType.setOrganizations(getOrganizations());
		detailsType.setChemistryComments(getChemistryComments());
		detailsType.setOtherChemistryDescr(getOtherChem());
		return detailsType;		
	}
	
	public static LfaGrowerDetails parse(AccountDetailsType detailsType) throws Exception {
		LfaGrowerDetails lfaDetails = new LfaGrowerDetails();
		lfaDetails.setAccountId(detailsType.getGrowerAcctId());
		lfaDetails.setSpouse(detailsType.getSpouse());
		lfaDetails.setFamily(detailsType.getFamily());
		lfaDetails.setOrganizations(detailsType.getOrganizations());
		lfaDetails.setHobbies(detailsType.getInterestsHobbies());
		lfaDetails.setChemistryComments(detailsType.getChemistryComments());
		lfaDetails.setOtherChem(detailsType.getOtherChemistryDescr());
		return lfaDetails;
	}

}
