
package co.pragma.ents.common.baseextensions.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExceptionList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="exception" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}BaseException"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionList", propOrder = {
    "exception"
})
public class ExceptionList {

    @XmlElement(required = true)
    protected BaseException exception;

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link BaseException }
     *     
     */
    public BaseException getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseException }
     *     
     */
    public void setException(BaseException value) {
        this.exception = value;
    }

}
