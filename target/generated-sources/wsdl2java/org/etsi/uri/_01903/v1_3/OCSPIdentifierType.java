
package org.etsi.uri._01903.v1_3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCSPIdentifierType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OCSPIdentifierType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ResponderID" type="{http://uri.etsi.org/01903/v1.3.2#}ResponderIDType"/>
 *         <element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *       <attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPIdentifierType", propOrder = {
    "responderID",
    "producedAt"
})
public class OCSPIdentifierType {

    @XmlElement(name = "ResponderID", required = true)
    protected ResponderIDType responderID;
    @XmlElement(name = "ProducedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar producedAt;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the responderID property.
     * 
     * @return
     *     possible object is
     *     {@link ResponderIDType }
     *     
     */
    public ResponderIDType getResponderID() {
        return responderID;
    }

    /**
     * Sets the value of the responderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponderIDType }
     *     
     */
    public void setResponderID(ResponderIDType value) {
        this.responderID = value;
    }

    /**
     * Gets the value of the producedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProducedAt() {
        return producedAt;
    }

    /**
     * Sets the value of the producedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProducedAt(XMLGregorianCalendar value) {
        this.producedAt = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
