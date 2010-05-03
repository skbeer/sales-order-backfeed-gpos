
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TestIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TestResult"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTested" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSpecificationType", propOrder = {
    "testIdentification",
    "testResult",
    "dateTested",
    "comment"
})
public class TestSpecificationType {

    @XmlElement(name = "TestIdentification", required = true)
    protected TestIdentificationType testIdentification;
    @XmlElement(name = "TestResult", required = true)
    protected TestResultType testResult;
    @XmlElement(name = "DateTested")
    protected DateTestedType dateTested;
    @XmlElement(name = "Comment")
    protected CommentType comment;

    /**
     * Gets the value of the testIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link TestIdentificationType }
     *     
     */
    public TestIdentificationType getTestIdentification() {
        return testIdentification;
    }

    /**
     * Sets the value of the testIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIdentificationType }
     *     
     */
    public void setTestIdentification(TestIdentificationType value) {
        this.testIdentification = value;
    }

    /**
     * Gets the value of the testResult property.
     * 
     * @return
     *     possible object is
     *     {@link TestResultType }
     *     
     */
    public TestResultType getTestResult() {
        return testResult;
    }

    /**
     * Sets the value of the testResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestResultType }
     *     
     */
    public void setTestResult(TestResultType value) {
        this.testResult = value;
    }

    /**
     * Gets the value of the dateTested property.
     * 
     * @return
     *     possible object is
     *     {@link DateTestedType }
     *     
     */
    public DateTestedType getDateTested() {
        return dateTested;
    }

    /**
     * Sets the value of the dateTested property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTestedType }
     *     
     */
    public void setDateTested(DateTestedType value) {
        this.dateTested = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

}
