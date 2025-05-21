
package co.pragma.ents.common.baseextensions.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoggingData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LoggingData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="destinationSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoggingData", propOrder = {
    "sourceSystemId",
    "destinationSystemId"
})
public class LoggingData {

    @XmlElement(required = true)
    protected String sourceSystemId;
    @XmlElement(required = true, defaultValue = "ESB")
    protected String destinationSystemId;

    /**
     * Gets the value of the sourceSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemId(String value) {
        this.sourceSystemId = value;
    }

    /**
     * Gets the value of the destinationSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationSystemId() {
        return destinationSystemId;
    }

    /**
     * Sets the value of the destinationSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationSystemId(String value) {
        this.destinationSystemId = value;
    }

}
