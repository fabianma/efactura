
package org.etsi.uri._01903.v1_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponderIDType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponderIDType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ByKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponderIDType", propOrder = {
    "byName",
    "byKey"
})
public class ResponderIDType {

    @XmlElement(name = "ByName")
    protected String byName;
    @XmlElement(name = "ByKey")
    protected byte[] byKey;

    /**
     * Gets the value of the byName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByName() {
        return byName;
    }

    /**
     * Sets the value of the byName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByName(String value) {
        this.byName = value;
    }

    /**
     * Gets the value of the byKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getByKey() {
        return byKey;
    }

    /**
     * Sets the value of the byKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setByKey(byte[] value) {
        this.byKey = value;
    }

}
