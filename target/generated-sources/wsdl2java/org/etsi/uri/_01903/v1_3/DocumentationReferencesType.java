
package org.etsi.uri._01903.v1_3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentationReferencesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentationReferencesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="DocumentationReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentationReferencesType", propOrder = {
    "documentationReference"
})
public class DocumentationReferencesType {

    @XmlElement(name = "DocumentationReference", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> documentationReference;

    /**
     * Gets the value of the documentationReference property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentationReference property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentationReference property.
     */
    public List<String> getDocumentationReference() {
        if (documentationReference == null) {
            documentationReference = new ArrayList<>();
        }
        return this.documentationReference;
    }

}
