package com.monsanto.irdsoapservices.dao;

import com.monsanto.irdsoapservices.to.ContactFunctionInfo;
import com.monsanto.irdsoapservices.to.ContactInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Nov 3, 2009
 * Time: 3:31:40 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContactDao {
    List<ContactInfo> getContacts(long acctId, long contactId, List<String> contactFunctions) throws Exception;
    List<String> getContactFunctions(long contactId) throws Exception;

    long insertContact(ContactInfo contactInfo) throws Exception;
    int insertContactFunction(ContactFunctionInfo contactFunction) throws Exception;

    boolean isContactExisting(long accountId, long contactId) throws Exception;

    int updateContact(ContactInfo contactInfo) throws Exception;

    int deleteContactFunction(ContactFunctionInfo contactFunction) throws Exception;
    int deleteContact(long contactId) throws Exception;
}
