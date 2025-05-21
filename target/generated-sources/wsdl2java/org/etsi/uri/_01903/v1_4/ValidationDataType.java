
package org.etsi.uri._01903.v1_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.etsi.uri._01903.v1_3.CertificateValuesType;
import org.etsi.uri._01903.v1_3.RevocationValuesType;


/**
 * <p>Java class for ValidationDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ValidationDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://uri.etsi.org/01903/v1.3.2#}CertificateValues" minOccurs="0"/>
 *         <element ref="{http://uri.etsi.org/01903/v1.3.2#}RevocationValues" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="UR" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationDataType", propOrder = {
    "certificateValues",
    "revocationValues"
})
public class ValidationDataType {

    @XmlElement(name = "CertificateValues", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected CertificateValuesType certificateValues;
    @XmlElement(name = "RevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected RevocationValuesType revocationValues;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "UR")
    @XmlSchemaType(name = "anyURI")
    protected String ur;

    /**
     * Gets the value of the certificateValues property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateValuesType }
     *     
     */
    public CertificateValuesType getCertificateValues() {
        return certificateValues;
    }

    /**
     * Sets the value of the certificateValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateValuesType }
     *     
     */
    public void setCertificateValues(CertificateValuesType value) {
        this.certificateValues = value;
    }

    /**
     * Gets the value of the revocationValues property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationValuesType }
     *     
     */
    public RevocationValuesType getRevocationValues() {
        return revocationValues;
    }

    /**
     * Sets the value of the revocationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationValuesType }
     *     
     */
    public void setRevocationValues(RevocationValuesType value) {
        this.revocationValues = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUR() {
        return ur;
    }

    /**
     * Sets the value of the ur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUR(String value) {
        this.ur = value;
    }

}
