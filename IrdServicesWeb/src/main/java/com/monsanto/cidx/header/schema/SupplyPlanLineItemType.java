
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyPlanLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyPlanLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PlanProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PlanHorizon" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Plan" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyPlanLineItemType", propOrder = {
    "lineNumber",
    "planProduct",
    "planHorizon",
    "plan"
})
public class SupplyPlanLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "PlanProduct", required = true)
    protected PlanProductType planProduct;
    @XmlElement(name = "PlanHorizon")
    protected PlanHorizonType planHorizon;
    @XmlElement(name = "Plan", required = true)
    protected List<PlanType> plan;

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
     * Gets the value of the planProduct property.
     * 
     * @return
     *     possible object is
     *     {@link PlanProductType }
     *     
     */
    public PlanProductType getPlanProduct() {
        return planProduct;
    }

    /**
     * Sets the value of the planProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanProductType }
     *     
     */
    public void setPlanProduct(PlanProductType value) {
        this.planProduct = value;
    }

    /**
     * Gets the value of the planHorizon property.
     * 
     * @return
     *     possible object is
     *     {@link PlanHorizonType }
     *     
     */
    public PlanHorizonType getPlanHorizon() {
        return planHorizon;
    }

    /**
     * Sets the value of the planHorizon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanHorizonType }
     *     
     */
    public void setPlanHorizon(PlanHorizonType value) {
        this.planHorizon = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanType }
     * 
     * 
     */
    public List<PlanType> getPlan() {
        if (plan == null) {
            plan = new ArrayList<PlanType>();
        }
        return this.plan;
    }

}
