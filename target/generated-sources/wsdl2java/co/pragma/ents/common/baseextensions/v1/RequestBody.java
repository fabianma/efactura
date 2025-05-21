
package co.pragma.ents.common.baseextensions.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestBody complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestBody">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBody", propOrder = {
    "request"
})
public class RequestBody {

    @XmlElement(required = true)
    protected Object request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequest(Object value) {
        this.request = value;
    }

}
