
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PlanWindow"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PlanQuantity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanType", propOrder = {
    "lineNumber",
    "planWindow",
    "planQuantity"
})
public class PlanType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "PlanWindow", required = true)
    protected PlanWindowType planWindow;
    @XmlElement(name = "PlanQuantity", required = true)
    protected PlanQuantityType planQuantity;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the planWindow property.
     * 
     * @return
     *     possible object is
     *     {@link PlanWindowType }
     *     
     */
    public PlanWindowType getPlanWindow() {
        return planWindow;
    }

    /**
     * Sets the value of the planWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanWindowType }
     *     
     */
    public void setPlanWindow(PlanWindowType value) {
        this.planWindow = value;
    }

    /**
     * Gets the value of the planQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PlanQuantityType }
     *     
     */
    public PlanQuantityType getPlanQuantity() {
        return planQuantity;
    }

    /**
     * Sets the value of the planQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanQuantityType }
     *     
     */
    public void setPlanQuantity(PlanQuantityType value) {
        this.planQuantity = value;
    }

}
