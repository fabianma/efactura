
package oasis.names.specification.ubl.schema.xsd.commonsignaturecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2.SignatureInformationType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;UBL Document Signatures. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;This class collects all signature information for a document.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;UBL Document Signatures&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * <p>Java class for UBLDocumentSignaturesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UBLDocumentSignaturesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2}SignatureInformation" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLDocumentSignaturesType", propOrder = {
    "signatureInformation"
})
public class UBLDocumentSignaturesType {

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;UBL Document Signatures. Signature Information&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Each of these is scaffolding for a single digital signature.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;UBL Document Signatures&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Signature Information&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Signature Information&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Signature Information&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "SignatureInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2", required = true)
    protected List<SignatureInformationType> signatureInformation;

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;UBL Document Signatures. Signature Information&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Each of these is scaffolding for a single digital signature.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;UBL Document Signatures&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Signature Information&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Signature Information&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Signature Information&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * Gets the value of the signatureInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignatureInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureInformationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the signatureInformation property.
     */
    public List<SignatureInformationType> getSignatureInformation() {
        if (signatureInformation == null) {
            signatureInformation = new ArrayList<>();
        }
        return this.signatureInformation;
    }

}
