//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for tSectionTT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSectionTT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aSectionTT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSectionTT")
@XmlSeeAlso({
    ESectionTT.class
})
public class TSectionTT {

    @XmlAttribute(name = "section")
    protected String section;
    @XmlAttribute(name = "lineRef")
    @XmlIDREF
    protected Object lineRef;
    @XmlAttribute(name = "trackInfo")
    protected String trackInfo;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "remarks")
    protected String remarks;
    @XmlAttribute(name = "percentageSupplement")
    protected BigDecimal percentageSupplement;
    @XmlAttribute(name = "distance")
    protected BigDecimal distance;

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineRef(Object value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the trackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackInfo() {
        return trackInfo;
    }

    /**
     * Sets the value of the trackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackInfo(String value) {
        this.trackInfo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the percentageSupplement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageSupplement() {
        return percentageSupplement;
    }

    /**
     * Sets the value of the percentageSupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageSupplement(BigDecimal value) {
        this.percentageSupplement = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

}
