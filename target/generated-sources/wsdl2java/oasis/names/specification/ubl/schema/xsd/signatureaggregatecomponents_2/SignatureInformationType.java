
package oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.signaturebasiccomponents_2.ReferencedSignatureIDType;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:sbc="urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Signature Information. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;This class captures a single signature and optionally associates to a signature in the document with the corresponding identifier.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Signature Information&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * <p>Java class for SignatureInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SignatureInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2}ReferencedSignatureID" minOccurs="0"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureInformationType", propOrder = {
    "id",
    "referencedSignatureID",
    "signature"
})
public class SignatureInformationType {

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:sbc="urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Signature Information. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;This specifies the identifier of the signature distinguishing it from other signatures.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Signature Information&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:sbc="urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Signature Information. Referenced Signature Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;This associates this signature with the identifier of a signature business object in the document.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Signature Information&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Referenced Signature Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "ReferencedSignatureID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2")
    protected ReferencedSignatureIDType referencedSignatureID;
    /**
     * This is a single digital signature as defined by the W3C specification.
     * 
     */
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:sbc="urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Signature Information. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;This specifies the identifier of the signature distinguishing it from other signatures.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Signature Information&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     * @see #getID()
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:sac="urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2" xmlns:sbc="urn:oasis:names:specification:ubl:schema:xsd:SignatureBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Signature Information. Referenced Signature Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;This associates this signature with the identifier of a signature business object in the document.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Signature Information&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Referenced Signature Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link ReferencedSignatureIDType }
     *     
     */
    public ReferencedSignatureIDType getReferencedSignatureID() {
        return referencedSignatureID;
    }

    /**
     * Sets the value of the referencedSignatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedSignatureIDType }
     *     
     * @see #getReferencedSignatureID()
     */
    public void setReferencedSignatureID(ReferencedSignatureIDType value) {
        this.referencedSignatureID = value;
    }

    /**
     * This is a single digital signature as defined by the W3C specification.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     * @see #getSignature()
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
