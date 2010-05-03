
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BatchNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchNumberType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="BatchNumberCreator" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListBatchNumberCreator" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchNumberType", propOrder = {
    "value"
})
public class BatchNumberType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "BatchNumberCreator", required = true)
    protected CidxListBatchNumberCreator batchNumberCreator;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the batchNumberCreator property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListBatchNumberCreator }
     *     
     */
    public CidxListBatchNumberCreator getBatchNumberCreator() {
        return batchNumberCreator;
    }

    /**
     * Sets the value of the batchNumberCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListBatchNumberCreator }
     *     
     */
    public void setBatchNumberCreator(CidxListBatchNumberCreator value) {
        this.batchNumberCreator = value;
    }

}
