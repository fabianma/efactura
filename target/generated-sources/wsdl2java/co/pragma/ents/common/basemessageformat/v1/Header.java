
package co.pragma.ents.common.basemessageformat.v1;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Header">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="invokerDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "systemId",
    "messageId",
    "invokerDateTime"
})
@XmlSeeAlso({
    RequestHeaderIn.class,
    RequestHeaderOut.class,
    ResponseHeaderOut.class,
    ResponseHeaderIn.class
})
public abstract class Header {

    @XmlElement(required = true)
    protected String systemId;
    @XmlElement(required = true)
    protected String messageId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invokerDateTime;

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the invokerDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvokerDateTime() {
        return invokerDateTime;
    }

    /**
     * Sets the value of the invokerDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvokerDateTime(XMLGregorianCalendar value) {
        this.invokerDateTime = value;
    }

}
