
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.contacts.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddContactFunctionRequest_QNAME = new QName("urn:monsanto:ird:services:contacts", "AddContactFunctionRequest");
    private final static QName _GetContactsResponse_QNAME = new QName("urn:monsanto:ird:services:contacts", "GetContactsResponse");
    private final static QName _GetContactsRequest_QNAME = new QName("urn:monsanto:ird:services:contacts", "GetContactsRequest");
    private final static QName _UpdateContactsResponse_QNAME = new QName("urn:monsanto:ird:services:contacts", "UpdateContactsResponse");
    private final static QName _InsertContactResponse_QNAME = new QName("urn:monsanto:ird:services:contacts", "InsertContactResponse");
    private final static QName _UpdateContactsRequest_QNAME = new QName("urn:monsanto:ird:services:contacts", "UpdateContactsRequest");
    private final static QName _InsertContactRequest_QNAME = new QName("urn:monsanto:ird:services:contacts", "InsertContactRequest");
    private final static QName _RemoveContactFunctionRequest_QNAME = new QName("urn:monsanto:ird:services:contacts", "RemoveContactFunctionRequest");
    private final static QName _ContactsFault_QNAME = new QName("urn:monsanto:ird:services:contacts", "ContactsFault");
    private final static QName _AddContactFunctionResponse_QNAME = new QName("urn:monsanto:ird:services:contacts", "AddContactFunctionResponse");
    private final static QName _DeleteContactRequest_QNAME = new QName("urn:monsanto:ird:services:contacts", "DeleteContactRequest");
    private final static QName _RemoveContactFunctionResponse_QNAME = new QName("urn:monsanto:ird:services:contacts", "RemoveContactFunctionResponse");
    private final static QName _DeleteContactResponse_QNAME = new QName("urn:monsanto:ird:services:contacts", "DeleteContactResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.contacts.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactListType }
     * 
     */
    public ContactListType createContactListType() {
        return new ContactListType();
    }

    /**
     * Create an instance of {@link AddContactFunctionResponseType }
     * 
     */
    public AddContactFunctionResponseType createAddContactFunctionResponseType() {
        return new AddContactFunctionResponseType();
    }

    /**
     * Create an instance of {@link DeleteContactRequestType }
     * 
     */
    public DeleteContactRequestType createDeleteContactRequestType() {
        return new DeleteContactRequestType();
    }

    /**
     * Create an instance of {@link SuccessResponseType }
     * 
     */
    public SuccessResponseType createSuccessResponseType() {
        return new SuccessResponseType();
    }

    /**
     * Create an instance of {@link ContactPhoneNumberType }
     * 
     */
    public ContactPhoneNumberType createContactPhoneNumberType() {
        return new ContactPhoneNumberType();
    }

    /**
     * Create an instance of {@link InsertContactInfoType }
     * 
     */
    public InsertContactInfoType createInsertContactInfoType() {
        return new InsertContactInfoType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link PersistableContactPhoneNumberListType }
     * 
     */
    public PersistableContactPhoneNumberListType createPersistableContactPhoneNumberListType() {
        return new PersistableContactPhoneNumberListType();
    }

    /**
     * Create an instance of {@link ContactFunctionListType }
     * 
     */
    public ContactFunctionListType createContactFunctionListType() {
        return new ContactFunctionListType();
    }

    /**
     * Create an instance of {@link RemoveContactFunctionRequestType }
     * 
     */
    public RemoveContactFunctionRequestType createRemoveContactFunctionRequestType() {
        return new RemoveContactFunctionRequestType();
    }

    /**
     * Create an instance of {@link UpdateContactsRequestBodyType }
     * 
     */
    public UpdateContactsRequestBodyType createUpdateContactsRequestBodyType() {
        return new UpdateContactsRequestBodyType();
    }

    /**
     * Create an instance of {@link RemoveContactFunctionResponseType }
     * 
     */
    public RemoveContactFunctionResponseType createRemoveContactFunctionResponseType() {
        return new RemoveContactFunctionResponseType();
    }

    /**
     * Create an instance of {@link AddContactFunctionRequestBodyType }
     * 
     */
    public AddContactFunctionRequestBodyType createAddContactFunctionRequestBodyType() {
        return new AddContactFunctionRequestBodyType();
    }

    /**
     * Create an instance of {@link InsertContactRequestBodyType }
     * 
     */
    public InsertContactRequestBodyType createInsertContactRequestBodyType() {
        return new InsertContactRequestBodyType();
    }

    /**
     * Create an instance of {@link PersistableEmailAddressListType }
     * 
     */
    public PersistableEmailAddressListType createPersistableEmailAddressListType() {
        return new PersistableEmailAddressListType();
    }

    /**
     * Create an instance of {@link DeleteContactRequestBodyType }
     * 
     */
    public DeleteContactRequestBodyType createDeleteContactRequestBodyType() {
        return new DeleteContactRequestBodyType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link UpdateContactsRequestType }
     * 
     */
    public UpdateContactsRequestType createUpdateContactsRequestType() {
        return new UpdateContactsRequestType();
    }

    /**
     * Create an instance of {@link GetContactsResponseType }
     * 
     */
    public GetContactsResponseType createGetContactsResponseType() {
        return new GetContactsResponseType();
    }

    /**
     * Create an instance of {@link DeleteContactResponseType }
     * 
     */
    public DeleteContactResponseType createDeleteContactResponseType() {
        return new DeleteContactResponseType();
    }

    /**
     * Create an instance of {@link AddContactFunctionRequestType }
     * 
     */
    public AddContactFunctionRequestType createAddContactFunctionRequestType() {
        return new AddContactFunctionRequestType();
    }

    /**
     * Create an instance of {@link RemoveContactFunctionRequestBodyType }
     * 
     */
    public RemoveContactFunctionRequestBodyType createRemoveContactFunctionRequestBodyType() {
        return new RemoveContactFunctionRequestBodyType();
    }

    /**
     * Create an instance of {@link GetContactsResponseBodyType }
     * 
     */
    public GetContactsResponseBodyType createGetContactsResponseBodyType() {
        return new GetContactsResponseBodyType();
    }

    /**
     * Create an instance of {@link PersistableContactPhoneNumberType }
     * 
     */
    public PersistableContactPhoneNumberType createPersistableContactPhoneNumberType() {
        return new PersistableContactPhoneNumberType();
    }

    /**
     * Create an instance of {@link ContactEmailType }
     * 
     */
    public ContactEmailType createContactEmailType() {
        return new ContactEmailType();
    }

    /**
     * Create an instance of {@link InsertContactResponseBodyType }
     * 
     */
    public InsertContactResponseBodyType createInsertContactResponseBodyType() {
        return new InsertContactResponseBodyType();
    }

    /**
     * Create an instance of {@link GetContactsRequestBodyType }
     * 
     */
    public GetContactsRequestBodyType createGetContactsRequestBodyType() {
        return new GetContactsRequestBodyType();
    }

    /**
     * Create an instance of {@link InsertContactResponseType }
     * 
     */
    public InsertContactResponseType createInsertContactResponseType() {
        return new InsertContactResponseType();
    }

    /**
     * Create an instance of {@link ContactPhoneNumberListType }
     * 
     */
    public ContactPhoneNumberListType createContactPhoneNumberListType() {
        return new ContactPhoneNumberListType();
    }

    /**
     * Create an instance of {@link InsertContactListType }
     * 
     */
    public InsertContactListType createInsertContactListType() {
        return new InsertContactListType();
    }

    /**
     * Create an instance of {@link PersistableContactInfoType }
     * 
     */
    public PersistableContactInfoType createPersistableContactInfoType() {
        return new PersistableContactInfoType();
    }

    /**
     * Create an instance of {@link PersistableContactListType }
     * 
     */
    public PersistableContactListType createPersistableContactListType() {
        return new PersistableContactListType();
    }

    /**
     * Create an instance of {@link EmailAddressListType }
     * 
     */
    public EmailAddressListType createEmailAddressListType() {
        return new EmailAddressListType();
    }

    /**
     * Create an instance of {@link GetContactsRequestType }
     * 
     */
    public GetContactsRequestType createGetContactsRequestType() {
        return new GetContactsRequestType();
    }

    /**
     * Create an instance of {@link UpdateContactsResponseType }
     * 
     */
    public UpdateContactsResponseType createUpdateContactsResponseType() {
        return new UpdateContactsResponseType();
    }

    /**
     * Create an instance of {@link InsertContactRequestType }
     * 
     */
    public InsertContactRequestType createInsertContactRequestType() {
        return new InsertContactRequestType();
    }

    /**
     * Create an instance of {@link PersistableContactEmailType }
     * 
     */
    public PersistableContactEmailType createPersistableContactEmailType() {
        return new PersistableContactEmailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContactFunctionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "AddContactFunctionRequest")
    public JAXBElement<AddContactFunctionRequestType> createAddContactFunctionRequest(AddContactFunctionRequestType value) {
        return new JAXBElement<AddContactFunctionRequestType>(_AddContactFunctionRequest_QNAME, AddContactFunctionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "GetContactsResponse")
    public JAXBElement<GetContactsResponseType> createGetContactsResponse(GetContactsResponseType value) {
        return new JAXBElement<GetContactsResponseType>(_GetContactsResponse_QNAME, GetContactsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "GetContactsRequest")
    public JAXBElement<GetContactsRequestType> createGetContactsRequest(GetContactsRequestType value) {
        return new JAXBElement<GetContactsRequestType>(_GetContactsRequest_QNAME, GetContactsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "UpdateContactsResponse")
    public JAXBElement<UpdateContactsResponseType> createUpdateContactsResponse(UpdateContactsResponseType value) {
        return new JAXBElement<UpdateContactsResponseType>(_UpdateContactsResponse_QNAME, UpdateContactsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertContactResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "InsertContactResponse")
    public JAXBElement<InsertContactResponseType> createInsertContactResponse(InsertContactResponseType value) {
        return new JAXBElement<InsertContactResponseType>(_InsertContactResponse_QNAME, InsertContactResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "UpdateContactsRequest")
    public JAXBElement<UpdateContactsRequestType> createUpdateContactsRequest(UpdateContactsRequestType value) {
        return new JAXBElement<UpdateContactsRequestType>(_UpdateContactsRequest_QNAME, UpdateContactsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertContactRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "InsertContactRequest")
    public JAXBElement<InsertContactRequestType> createInsertContactRequest(InsertContactRequestType value) {
        return new JAXBElement<InsertContactRequestType>(_InsertContactRequest_QNAME, InsertContactRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveContactFunctionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "RemoveContactFunctionRequest")
    public JAXBElement<RemoveContactFunctionRequestType> createRemoveContactFunctionRequest(RemoveContactFunctionRequestType value) {
        return new JAXBElement<RemoveContactFunctionRequestType>(_RemoveContactFunctionRequest_QNAME, RemoveContactFunctionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "ContactsFault")
    public JAXBElement<ExceptionType> createContactsFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_ContactsFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContactFunctionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "AddContactFunctionResponse")
    public JAXBElement<AddContactFunctionResponseType> createAddContactFunctionResponse(AddContactFunctionResponseType value) {
        return new JAXBElement<AddContactFunctionResponseType>(_AddContactFunctionResponse_QNAME, AddContactFunctionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "DeleteContactRequest")
    public JAXBElement<DeleteContactRequestType> createDeleteContactRequest(DeleteContactRequestType value) {
        return new JAXBElement<DeleteContactRequestType>(_DeleteContactRequest_QNAME, DeleteContactRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveContactFunctionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "RemoveContactFunctionResponse")
    public JAXBElement<RemoveContactFunctionResponseType> createRemoveContactFunctionResponse(RemoveContactFunctionResponseType value) {
        return new JAXBElement<RemoveContactFunctionResponseType>(_RemoveContactFunctionResponse_QNAME, RemoveContactFunctionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:contacts", name = "DeleteContactResponse")
    public JAXBElement<DeleteContactResponseType> createDeleteContactResponse(DeleteContactResponseType value) {
        return new JAXBElement<DeleteContactResponseType>(_DeleteContactResponse_QNAME, DeleteContactResponseType.class, null, value);
    }

}
