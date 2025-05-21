
package co.pragma.ents.common.baseextensions.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCredential complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurityCredential">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userToken" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCredential", propOrder = {
    "userName",
    "userToken"
})
public class SecurityCredential {

    @XmlElement(required = true)
    protected String userName;
    protected Object userToken;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userToken property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserToken() {
        return userToken;
    }

    /**
     * Sets the value of the userToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserToken(Object value) {
        this.userToken = value;
    }

}
