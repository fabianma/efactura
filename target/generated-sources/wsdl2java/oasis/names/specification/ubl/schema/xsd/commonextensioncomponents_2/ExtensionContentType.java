
package oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ExtensionContentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtensionContentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other'/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionContentType", propOrder = {
    "any"
})
public class ExtensionContentType {

    /**
     * Any element in any namespace other than the UBL extension
     *             namespace is allowed to be the apex element of an extension.
     *             Only those elements found in the UBL schemas and in the
     *             trees of schemas imported in this module are validated.
     *             Any element for which there is no schema declaration in any
     *             of the trees of schemas passes validation and is not
     *             treated as a schema constraint violation.
     * 
     */
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Any element in any namespace other than the UBL extension
     *             namespace is allowed to be the apex element of an extension.
     *             Only those elements found in the UBL schemas and in the
     *             trees of schemas imported in this module are validated.
     *             Any element for which there is no schema declaration in any
     *             of the trees of schemas passes validation and is not
     *             treated as a schema constraint violation.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     * @see #getAny()
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
