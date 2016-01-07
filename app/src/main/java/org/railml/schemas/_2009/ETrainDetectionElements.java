//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for eTrainDetectionElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eTrainDetectionElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="trainDetector" type="{http://www.railml.org/schemas/2009}tTrainDetector"/>
 *         &lt;element name="trackCircuitBorder" type="{http://www.railml.org/schemas/2009}tTrackCircuitBorder"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eTrainDetectionElements", propOrder = {
    "trainDetectorOrTrackCircuitBorder"
})
public class ETrainDetectionElements {

    @XmlElements({
        @XmlElement(name = "trainDetector", type = TTrainDetector.class),
        @XmlElement(name = "trackCircuitBorder", type = TTrackCircuitBorder.class)
    })
    protected List<TOrientedElement> trainDetectorOrTrackCircuitBorder;

    /**
     * Gets the value of the trainDetectorOrTrackCircuitBorder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainDetectorOrTrackCircuitBorder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainDetectorOrTrackCircuitBorder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTrainDetector }
     * {@link TTrackCircuitBorder }
     * 
     * 
     */
    public List<TOrientedElement> getTrainDetectorOrTrackCircuitBorder() {
        if (trainDetectorOrTrackCircuitBorder == null) {
            trainDetectorOrTrackCircuitBorder = new ArrayList<TOrientedElement>();
        }
        return this.trainDetectorOrTrackCircuitBorder;
    }

}
