//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for tCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tElementWithIDAndName">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aCategory"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCategory")
@XmlSeeAlso({
    ECategory.class
})
public class TCategory
    extends TElementWithIDAndName
{

    @XmlAttribute(name = "trainUsage")
    protected TUsageType trainUsage;
    @XmlAttribute(name = "deadrun")
    protected Boolean deadrun;
    @XmlAttribute(name = "categoryPriority")
    protected String categoryPriority;

    /**
     * Gets the value of the trainUsage property.
     * 
     * @return
     *     possible object is
     *     {@link TUsageType }
     *     
     */
    public TUsageType getTrainUsage() {
        return trainUsage;
    }

    /**
     * Sets the value of the trainUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUsageType }
     *     
     */
    public void setTrainUsage(TUsageType value) {
        this.trainUsage = value;
    }

    /**
     * Gets the value of the deadrun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeadrun() {
        return deadrun;
    }

    /**
     * Sets the value of the deadrun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeadrun(Boolean value) {
        this.deadrun = value;
    }

    /**
     * Gets the value of the categoryPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryPriority() {
        return categoryPriority;
    }

    /**
     * Sets the value of the categoryPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryPriority(String value) {
        this.categoryPriority = value;
    }

}
