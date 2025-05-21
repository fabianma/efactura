
package co.pragma.ents.common.basemessageformat.v1;

import co.pragma.ents.common.baseextensions.v1.Classifications;
import co.pragma.ents.common.baseextensions.v1.Destination;
import co.pragma.ents.common.baseextensions.v1.SecurityCredential;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeaderOut complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestHeaderOut">
 *   <complexContent>
 *     <extension base="{http://pragma.co/ents/common/BaseMessageFormat/V1}Header">
 *       <sequence>
 *         <element name="securityCredential" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}SecurityCredential" minOccurs="0"/>
 *         <element name="destination" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}Destination" minOccurs="0"/>
 *         <element name="classification" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}Classifications" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderOut", propOrder = {
    "securityCredential",
    "destination",
    "classification"
})
public class RequestHeaderOut
    extends Header
{

    protected SecurityCredential securityCredential;
    protected Destination destination;
    protected Classifications classification;

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

}
