
package com.monsanto.irdsoapservices.retailseller.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailSellerInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailSellerInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dealer" type="{urn:ecms:schema:retailsellerinformation:request:1:0}DealerType"/>
 *         &lt;element name="Salesperson" type="{urn:ecms:schema:retailsellerinformation:request:1:0}SalespersonType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailSellerInformationDetailsType", propOrder = {
    "dealer",
    "salesperson"
})
public class RetailSellerInformationDetailsType {

    @XmlElement(name = "Dealer", required = true)
    protected DealerType dealer;
    @XmlElement(name = "Salesperson", required = true)
    protected List<SalespersonType> salesperson;

    /**
     * Gets the value of the dealer property.
     * 
     * @return
     *     possible object is
     *     {@link DealerType }
     *     
     */
    public DealerType getDealer() {
        return dealer;
    }

    /**
     * Sets the value of the dealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealerType }
     *     
     */
    public void setDealer(DealerType value) {
        this.dealer = value;
    }

    /**
     * Gets the value of the salesperson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesperson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesperson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalespersonType }
     * 
     * 
     */
    public List<SalespersonType> getSalesperson() {
        if (salesperson == null) {
            salesperson = new ArrayList<SalespersonType>();
        }
        return this.salesperson;
    }

}
