
package co.pragma.ents.common.basemessageformat.v1;

import co.pragma.ents.common.baseextensions.v1.Destination;
import co.pragma.ents.common.baseextensions.v1.ResponseStatus;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHeaderOut complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponseHeaderOut">
 *   <complexContent>
 *     <extension base="{http://pragma.co/ents/common/BaseMessageFormat/V1}Header">
 *       <sequence>
 *         <element name="responseStatus" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}ResponseStatus"/>
 *         <element name="destination" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}Destination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeaderOut", propOrder = {
    "responseStatus",
    "destination"
})
public class ResponseHeaderOut
    extends Header
{

    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    @XmlElement(required = true)
    protected Destination destination;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setResponseStatus(ResponseStatus value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

}
