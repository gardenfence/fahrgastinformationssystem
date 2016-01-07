//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.math.BigDecimal;


/**
 * <p>Java class for tOcpTT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOcpTT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aOcpTT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOcpTT")
@XmlSeeAlso({
    EOcpTT.class
})
public class TOcpTT {

    @XmlAttribute(name = "ocpRef", required = true)
    @XmlIDREF
    protected Object ocpRef;
    @XmlAttribute(name = "trackRef")
    @XmlIDREF
    protected Object trackRef;
    @XmlAttribute(name = "trackInfo")
    protected String trackInfo;
    @XmlAttribute(name = "ocpType")
    protected String ocpType;
    @XmlAttribute(name = "remarks")
    protected String remarks;
    @XmlAttribute(name = "trainReverse")
    protected Boolean trainReverse;
    @XmlAttribute(name = "alignment")
    protected TTrainAlignment alignment;
    @XmlAttribute(name = "offset")
    protected BigDecimal offset;
    @XmlAttribute(name = "shuntingTime")
    protected Duration shuntingTime;

    /**
     * Gets the value of the ocpRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOcpRef() {
        return ocpRef;
    }

    /**
     * Sets the value of the ocpRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOcpRef(Object value) {
        this.ocpRef = value;
    }

    /**
     * Gets the value of the trackRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTrackRef() {
        return trackRef;
    }

    /**
     * Sets the value of the trackRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTrackRef(Object value) {
        this.trackRef = value;
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
     * Gets the value of the ocpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcpType() {
        return ocpType;
    }

    /**
     * Sets the value of the ocpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcpType(String value) {
        this.ocpType = value;
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
     * Gets the value of the trainReverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainReverse() {
        return trainReverse;
    }

    /**
     * Sets the value of the trainReverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainReverse(Boolean value) {
        this.trainReverse = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link TTrainAlignment }
     *     
     */
    public TTrainAlignment getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTrainAlignment }
     *     
     */
    public void setAlignment(TTrainAlignment value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffset(BigDecimal value) {
        this.offset = value;
    }

    /**
     * Gets the value of the shuntingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShuntingTime() {
        return shuntingTime;
    }

    /**
     * Sets the value of the shuntingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setShuntingTime(Duration value) {
        this.shuntingTime = value;
    }

}
