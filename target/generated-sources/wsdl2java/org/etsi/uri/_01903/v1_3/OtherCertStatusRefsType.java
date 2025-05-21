
package org.etsi.uri._01903.v1_3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherCertStatusRefsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OtherCertStatusRefsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OtherRef" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCertStatusRefsType", propOrder = {
    "otherRef"
})
public class OtherCertStatusRefsType {

    @XmlElement(name = "OtherRef", required = true)
    protected List<AnyType> otherRef;

    /**
     * Gets the value of the otherRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherRef property.
     */
    public List<AnyType> getOtherRef() {
        if (otherRef == null) {
            otherRef = new ArrayList<>();
        }
        return this.otherRef;
    }

}
