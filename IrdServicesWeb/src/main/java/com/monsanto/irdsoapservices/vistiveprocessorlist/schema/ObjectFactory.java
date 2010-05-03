
package com.monsanto.irdsoapservices.vistiveprocessorlist.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.vistiveprocessorlist.schema package. 
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

    private final static QName _LastModifiedDateTime_QNAME = new QName("urn:ecms:schema:vistiveprocessorlist:1:0", "LastModifiedDateTime");
    private final static QName _VistiveProcessorList_QNAME = new QName("urn:ecms:schema:vistiveprocessorlist:1:0", "VistiveProcessorList");
    private final static QName _VistiveProcessorEntity_QNAME = new QName("urn:ecms:schema:vistiveprocessorlist:1:0", "VistiveProcessorEntity");
    private final static QName _VistiveProcessorListBody_QNAME = new QName("urn:ecms:schema:vistiveprocessorlist:1:0", "VistiveProcessorListBody");
    private final static QName _VistiveProcessorListRequest_QNAME = new QName("urn:ecms:schema:vistiveprocessorlist:1:0", "VistiveProcessorListRequest");
    private final static QName _VistiveProcessorListFault_QNAME = new QName("urn:ecms:schema:vistiveprocessorlist:1:0", "VistiveProcessorListFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.vistiveprocessorlist.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VistiveProcessorListType }
     * 
     */
    public VistiveProcessorListType createVistiveProcessorListType() {
        return new VistiveProcessorListType();
    }

    /**
     * Create an instance of {@link VistiveProcessorEntityType }
     * 
     */
    public VistiveProcessorEntityType createVistiveProcessorEntityType() {
        return new VistiveProcessorEntityType();
    }

    /**
     * Create an instance of {@link VistiveProcessorListBodyType }
     * 
     */
    public VistiveProcessorListBodyType createVistiveProcessorListBodyType() {
        return new VistiveProcessorListBodyType();
    }

    /**
     * Create an instance of {@link VistiveProcessorListFaultType }
     * 
     */
    public VistiveProcessorListFaultType createVistiveProcessorListFaultType() {
        return new VistiveProcessorListFaultType();
    }

    /**
     * Create an instance of {@link VistiveProcessorListRequestType }
     * 
     */
    public VistiveProcessorListRequestType createVistiveProcessorListRequestType() {
        return new VistiveProcessorListRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:vistiveprocessorlist:1:0", name = "LastModifiedDateTime")
    public JAXBElement<XMLGregorianCalendar> createLastModifiedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastModifiedDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VistiveProcessorListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:vistiveprocessorlist:1:0", name = "VistiveProcessorList")
    public JAXBElement<VistiveProcessorListType> createVistiveProcessorList(VistiveProcessorListType value) {
        return new JAXBElement<VistiveProcessorListType>(_VistiveProcessorList_QNAME, VistiveProcessorListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VistiveProcessorEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:vistiveprocessorlist:1:0", name = "VistiveProcessorEntity")
    public JAXBElement<VistiveProcessorEntityType> createVistiveProcessorEntity(VistiveProcessorEntityType value) {
        return new JAXBElement<VistiveProcessorEntityType>(_VistiveProcessorEntity_QNAME, VistiveProcessorEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VistiveProcessorListBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:vistiveprocessorlist:1:0", name = "VistiveProcessorListBody")
    public JAXBElement<VistiveProcessorListBodyType> createVistiveProcessorListBody(VistiveProcessorListBodyType value) {
        return new JAXBElement<VistiveProcessorListBodyType>(_VistiveProcessorListBody_QNAME, VistiveProcessorListBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VistiveProcessorListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:vistiveprocessorlist:1:0", name = "VistiveProcessorListRequest")
    public JAXBElement<VistiveProcessorListRequestType> createVistiveProcessorListRequest(VistiveProcessorListRequestType value) {
        return new JAXBElement<VistiveProcessorListRequestType>(_VistiveProcessorListRequest_QNAME, VistiveProcessorListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VistiveProcessorListFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:vistiveprocessorlist:1:0", name = "VistiveProcessorListFault")
    public JAXBElement<VistiveProcessorListFaultType> createVistiveProcessorListFault(VistiveProcessorListFaultType value) {
        return new JAXBElement<VistiveProcessorListFaultType>(_VistiveProcessorListFault_QNAME, VistiveProcessorListFaultType.class, null, value);
    }

}
