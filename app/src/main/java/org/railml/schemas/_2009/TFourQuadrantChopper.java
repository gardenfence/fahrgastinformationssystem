//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * 
 * 				technical data of inverter between OHL/transformer and
 * 				link circuit
 * 			
 * 
 * <p>Java class for tFourQuadrantChopper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFourQuadrantChopper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aFourQuadrantChopper"/>
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aAssemblyNameNumber"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFourQuadrantChopper")
@XmlSeeAlso({
    EFourQuadrantChopper.class
})
public class TFourQuadrantChopper {

    @XmlAttribute(name = "meanPhi")
    protected BigDecimal meanPhi;
    @XmlAttribute(name = "meanEfficiency")
    protected BigDecimal meanEfficiency;
    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;
    @XmlAttribute(name = "assemblyName", required = true)
    protected String assemblyName;

    /**
     * Gets the value of the meanPhi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeanPhi() {
        return meanPhi;
    }

    /**
     * Sets the value of the meanPhi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeanPhi(BigDecimal value) {
        this.meanPhi = value;
    }

    /**
     * Gets the value of the meanEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeanEfficiency() {
        return meanEfficiency;
    }

    /**
     * Sets the value of the meanEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeanEfficiency(BigDecimal value) {
        this.meanEfficiency = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the assemblyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyName() {
        return assemblyName;
    }

    /**
     * Sets the value of the assemblyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyName(String value) {
        this.assemblyName = value;
    }

}
