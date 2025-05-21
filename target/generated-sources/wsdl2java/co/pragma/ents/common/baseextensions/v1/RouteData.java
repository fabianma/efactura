
package co.pragma.ents.common.baseextensions.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CallBackTo" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}EndPoint"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteData", propOrder = {
    "callBackTo"
})
public class RouteData {

    @XmlElement(name = "CallBackTo", required = true)
    protected EndPoint callBackTo;

    /**
     * Gets the value of the callBackTo property.
     * 
     * @return
     *     possible object is
     *     {@link EndPoint }
     *     
     */
    public EndPoint getCallBackTo() {
        return callBackTo;
    }

    /**
     * Sets the value of the callBackTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndPoint }
     *     
     */
    public void setCallBackTo(EndPoint value) {
        this.callBackTo = value;
    }

}
