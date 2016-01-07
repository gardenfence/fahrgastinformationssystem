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
 * 
 * 				settings and characteristic of a particular brake
 * 				type or brake application position
 * 			
 * 
 * <p>Java class for tBasicBrakeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBasicBrakeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auxiliaryBrakes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.railml.org/schemas/2009}aAuxiliaryBrakes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aBasicBrakeAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBasicBrakeType", propOrder = {
    "auxiliaryBrakes"
})
@XmlSeeAlso({
    EBrakeUsage.class,
    EVehicleBrake.class
})
public class TBasicBrakeType {

    protected TBasicBrakeType.AuxiliaryBrakes auxiliaryBrakes;
    @XmlAttribute(name = "brakeType", required = true)
    protected String brakeType;
    @XmlAttribute(name = "airBrakeApplicationPosition", required = true)
    protected TAirBrakeApplicationPosition airBrakeApplicationPosition;
    @XmlAttribute(name = "regularBrakeMass")
    protected BigDecimal regularBrakeMass;
    @XmlAttribute(name = "emergencyBrakeMass")
    protected BigDecimal emergencyBrakeMass;
    @XmlAttribute(name = "maxDeceleration")
    protected BigDecimal maxDeceleration;
    @XmlAttribute(name = "meanDeceleration")
    protected BigDecimal meanDeceleration;

    /**
     * Gets the value of the auxiliaryBrakes property.
     * 
     * @return
     *     possible object is
     *     {@link TBasicBrakeType.AuxiliaryBrakes }
     *     
     */
    public TBasicBrakeType.AuxiliaryBrakes getAuxiliaryBrakes() {
        return auxiliaryBrakes;
    }

    /**
     * Sets the value of the auxiliaryBrakes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBasicBrakeType.AuxiliaryBrakes }
     *     
     */
    public void setAuxiliaryBrakes(TBasicBrakeType.AuxiliaryBrakes value) {
        this.auxiliaryBrakes = value;
    }

    /**
     * Gets the value of the brakeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeType() {
        return brakeType;
    }

    /**
     * Sets the value of the brakeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeType(String value) {
        this.brakeType = value;
    }

    /**
     * Gets the value of the airBrakeApplicationPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TAirBrakeApplicationPosition }
     *     
     */
    public TAirBrakeApplicationPosition getAirBrakeApplicationPosition() {
        return airBrakeApplicationPosition;
    }

    /**
     * Sets the value of the airBrakeApplicationPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAirBrakeApplicationPosition }
     *     
     */
    public void setAirBrakeApplicationPosition(TAirBrakeApplicationPosition value) {
        this.airBrakeApplicationPosition = value;
    }

    /**
     * Gets the value of the regularBrakeMass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegularBrakeMass() {
        return regularBrakeMass;
    }

    /**
     * Sets the value of the regularBrakeMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegularBrakeMass(BigDecimal value) {
        this.regularBrakeMass = value;
    }

    /**
     * Gets the value of the emergencyBrakeMass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmergencyBrakeMass() {
        return emergencyBrakeMass;
    }

    /**
     * Sets the value of the emergencyBrakeMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmergencyBrakeMass(BigDecimal value) {
        this.emergencyBrakeMass = value;
    }

    /**
     * Gets the value of the maxDeceleration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxDeceleration() {
        return maxDeceleration;
    }

    /**
     * Sets the value of the maxDeceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxDeceleration(BigDecimal value) {
        this.maxDeceleration = value;
    }

    /**
     * Gets the value of the meanDeceleration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeanDeceleration() {
        return meanDeceleration;
    }

    /**
     * Sets the value of the meanDeceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeanDeceleration(BigDecimal value) {
        this.meanDeceleration = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aAuxiliaryBrakes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AuxiliaryBrakes {

        @XmlAttribute(name = "H")
        protected Boolean h;
        @XmlAttribute(name = "E")
        protected Boolean e;
        @XmlAttribute(name = "Mg")
        protected Boolean mg;
        @XmlAttribute(name = "Wb")
        protected Boolean wb;
        @XmlAttribute(name = "ep")
        protected Boolean ep;

        /**
         * Gets the value of the h property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isH() {
            return h;
        }

        /**
         * Sets the value of the h property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setH(Boolean value) {
            this.h = value;
        }

        /**
         * Gets the value of the e property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isE() {
            return e;
        }

        /**
         * Sets the value of the e property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setE(Boolean value) {
            this.e = value;
        }

        /**
         * Gets the value of the mg property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMg() {
            return mg;
        }

        /**
         * Sets the value of the mg property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMg(Boolean value) {
            this.mg = value;
        }

        /**
         * Gets the value of the wb property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWb() {
            return wb;
        }

        /**
         * Sets the value of the wb property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWb(Boolean value) {
            this.wb = value;
        }

        /**
         * Gets the value of the ep property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEp() {
            return ep;
        }

        /**
         * Sets the value of the ep property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEp(Boolean value) {
            this.ep = value;
        }

    }

}
