//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:37 PM EDT 
//


package org.sierraecg.schema.jaxb._1_03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www3.medical.philips.com}generalpatientdata"/>
 *         &lt;element ref="{http://www3.medical.philips.com}patientmedicaldata" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="criteriaversionforpatientdata" use="required" type="{http://www3.medical.philips.com}TYPEcriteriaversion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generalpatientdata",
    "patientmedicaldata"
})
@XmlRootElement(name = "patient")
public class Patient {

    @XmlElement(required = true)
    protected Generalpatientdata generalpatientdata;
    protected Patientmedicaldata patientmedicaldata;
    @XmlAttribute(name = "criteriaversionforpatientdata", required = true)
    protected String criteriaversionforpatientdata;

    /**
     * Gets the value of the generalpatientdata property.
     * 
     * @return
     *     possible object is
     *     {@link Generalpatientdata }
     *     
     */
    public Generalpatientdata getGeneralpatientdata() {
        return generalpatientdata;
    }

    /**
     * Sets the value of the generalpatientdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Generalpatientdata }
     *     
     */
    public void setGeneralpatientdata(Generalpatientdata value) {
        this.generalpatientdata = value;
    }

    /**
     * Gets the value of the patientmedicaldata property.
     * 
     * @return
     *     possible object is
     *     {@link Patientmedicaldata }
     *     
     */
    public Patientmedicaldata getPatientmedicaldata() {
        return patientmedicaldata;
    }

    /**
     * Sets the value of the patientmedicaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patientmedicaldata }
     *     
     */
    public void setPatientmedicaldata(Patientmedicaldata value) {
        this.patientmedicaldata = value;
    }

    /**
     * Gets the value of the criteriaversionforpatientdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaversionforpatientdata() {
        return criteriaversionforpatientdata;
    }

    /**
     * Sets the value of the criteriaversionforpatientdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaversionforpatientdata(String value) {
        this.criteriaversionforpatientdata = value;
    }

}
