
package co.pragma.ents.common.basemessageformat.v1;

import co.pragma.ents.common.baseextensions.v1.Destination;
import co.pragma.ents.common.baseextensions.v1.MessageContext;
import co.pragma.ents.common.baseextensions.v1.ResponseStatus;
import co.pragma.ents.common.baseextensions.v1.RoutingStack;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHeaderIn complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponseHeaderIn">
 *   <complexContent>
 *     <extension base="{http://pragma.co/ents/common/BaseMessageFormat/V1}Header">
 *       <sequence>
 *         <element name="responseStatus" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}ResponseStatus"/>
 *         <element name="destination" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}Destination"/>
 *         <element name="messageContext" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}MessageContext" minOccurs="0"/>
 *         <element name="routingStack" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}RoutingStack"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeaderIn", propOrder = {
    "responseStatus",
    "destination",
    "messageContext",
    "routingStack"
})
public class ResponseHeaderIn
    extends Header
{

    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    @XmlElement(required = true)
    protected Destination destination;
    protected MessageContext messageContext;
    @XmlElement(required = true)
    protected RoutingStack routingStack;

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

    /**
     * Gets the value of the messageContext property.
     * 
     * @return
     *     possible object is
     *     {@link MessageContext }
     *     
     */
    public MessageContext getMessageContext() {
        return messageContext;
    }

    /**
     * Sets the value of the messageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageContext }
     *     
     */
    public void setMessageContext(MessageContext value) {
        this.messageContext = value;
    }

    /**
     * Gets the value of the routingStack property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingStack }
     *     
     */
    public RoutingStack getRoutingStack() {
        return routingStack;
    }

    /**
     * Sets the value of the routingStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingStack }
     *     
     */
    public void setRoutingStack(RoutingStack value) {
        this.routingStack = value;
    }

}
