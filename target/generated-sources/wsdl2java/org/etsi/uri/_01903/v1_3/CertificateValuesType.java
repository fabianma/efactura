
package org.etsi.uri._01903.v1_3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CertificateValuesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CertificateValuesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="EncapsulatedX509Certificate" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/>
 *         <element name="OtherCertificate" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/>
 *       </choice>
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateValuesType", propOrder = {
    "encapsulatedX509CertificateOrOtherCertificate"
})
public class CertificateValuesType {

    @XmlElements({
        @XmlElement(name = "EncapsulatedX509Certificate", type = EncapsulatedPKIDataType.class),
        @XmlElement(name = "OtherCertificate", type = AnyType.class)
    })
    protected List<Object> encapsulatedX509CertificateOrOtherCertificate;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the encapsulatedX509CertificateOrOtherCertificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encapsulatedX509CertificateOrOtherCertificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEncapsulatedX509CertificateOrOtherCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * {@link EncapsulatedPKIDataType }
     * </p>
     * 
     * 
     * @return
     *     The value of the encapsulatedX509CertificateOrOtherCertificate property.
     */
    public List<Object> getEncapsulatedX509CertificateOrOtherCertificate() {
        if (encapsulatedX509CertificateOrOtherCertificate == null) {
            encapsulatedX509CertificateOrOtherCertificate = new ArrayList<>();
        }
        return this.encapsulatedX509CertificateOrOtherCertificate;
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

}
