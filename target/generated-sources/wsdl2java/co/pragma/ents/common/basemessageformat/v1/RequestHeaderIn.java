
package co.pragma.ents.common.basemessageformat.v1;

import co.pragma.ents.common.baseextensions.v1.Classifications;
import co.pragma.ents.common.baseextensions.v1.Destination;
import co.pragma.ents.common.baseextensions.v1.MessageContext;
import co.pragma.ents.common.baseextensions.v1.RoutingStack;
import co.pragma.ents.common.baseextensions.v1.SecurityCredential;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeaderIn complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestHeaderIn">
 *   <complexContent>
 *     <extension base="{http://pragma.co/ents/common/BaseMessageFormat/V1}Header">
 *       <sequence>
 *         <element name="securityCredential" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}SecurityCredential" minOccurs="0"/>
 *         <element name="destination" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}Destination" minOccurs="0"/>
 *         <element name="classification" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}Classifications" minOccurs="0"/>
 *         <element name="messageContext" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}MessageContext" minOccurs="0"/>
 *         <element name="routingStack" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}RoutingStack"/>
 *         <element name="componentNameLogging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderIn", propOrder = {
    "securityCredential",
    "destination",
    "classification",
    "messageContext",
    "routingStack",
    "componentNameLogging"
})
public class RequestHeaderIn
    extends Header
{

    protected SecurityCredential securityCredential;
    protected Destination destination;
    protected Classifications classification;
    protected MessageContext messageContext;
    @XmlElement(required = true)
    protected RoutingStack routingStack;
    protected String componentNameLogging;

    /**
     * Gets the value of the securityCredential property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCredential }
     *     
     */
    public SecurityCredential getSecurityCredential() {
        return securityCredential;
    }

    /**
     * Sets the value of the securityCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCredential }
     *     
     */
    public void setSecurityCredential(SecurityCredential value) {
        this.securityCredential = value;
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
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link Classifications }
     *     
     */
    public Classifications getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classifications }
     *     
     */
    public void setClassification(Classifications value) {
        this.classification = value;
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

    /**
     * Gets the value of the componentNameLogging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentNameLogging() {
        return componentNameLogging;
    }

    /**
     * Sets the value of the componentNameLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentNameLogging(String value) {
        this.componentNameLogging = value;
    }

}
