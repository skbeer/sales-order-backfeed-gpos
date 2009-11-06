package com.monsanto.irdsoapservices.dao;

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

    long insertContactInfo(ContactInfo contactInfo) throws Exception;

    int updateContactInfo(ContactInfo contactInfo) throws Exception;
}
