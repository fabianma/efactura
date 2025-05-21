
package org.etsi.uri._01903.v1_3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRLRefsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CRLRefsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CRLRef" type="{http://uri.etsi.org/01903/v1.3.2#}CRLRefType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRLRefsType", propOrder = {
    "crlRef"
})
public class CRLRefsType {

    @XmlElement(name = "CRLRef", required = true)
    protected List<CRLRefType> crlRef;

    /**
     * Gets the value of the crlRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crlRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCRLRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRLRefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the crlRef property.
     */
    public List<CRLRefType> getCRLRef() {
        if (crlRef == null) {
            crlRef = new ArrayList<>();
        }
        return this.crlRef;
    }

}
