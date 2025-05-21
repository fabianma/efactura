
package co.pragma.ents.common.baseextensions.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBody complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponseBody">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="response" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         <element name="exceptionList" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}ExceptionList" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBody", propOrder = {
    "response",
    "exceptionList"
})
public class ResponseBody {

    @XmlElement(required = true)
    protected Object response;
    protected List<ExceptionList> exceptionList;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResponse(Object value) {
        this.response = value;
    }

    /**
     * Gets the value of the exceptionList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExceptionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExceptionList }
     * </p>
     * 
     * 
     * @return
     *     The value of the exceptionList property.
     */
    public List<ExceptionList> getExceptionList() {
        if (exceptionList == null) {
            exceptionList = new ArrayList<>();
        }
        return this.exceptionList;
    }

}
