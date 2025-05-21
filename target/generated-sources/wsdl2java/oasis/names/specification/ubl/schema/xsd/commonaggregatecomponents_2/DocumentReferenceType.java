
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;


/**
 * <p>Java class for DocumentReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentTypeCode" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentType" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReferenceType", propOrder = {
    "id",
    "issueDate",
    "documentTypeCode",
    "documentType",
    "documentDescription"
})
public class DocumentReferenceType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueDateType issueDate;
    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentTypeCodeType documentTypeCode;
    @XmlElement(name = "DocumentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentTypeType documentType;
    @XmlElement(name = "DocumentDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DocumentDescriptionType> documentDescription;

    /**
     * Gets the value of the id property.
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
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link IssueDateType }
     *     
     */
    public IssueDateType getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDateType }
     *     
     */
    public void setIssueDate(IssueDateType value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCodeType }
     *     
     */
    public DocumentTypeCodeType getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCodeType }
     *     
     */
    public void setDocumentTypeCode(DocumentTypeCodeType value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeType }
     *     
     */
    public DocumentTypeType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeType }
     *     
     */
    public void setDocumentType(DocumentTypeType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentDescription property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDescription property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDescriptionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the documentDescription property.
     */
    public List<DocumentDescriptionType> getDocumentDescription() {
        if (documentDescription == null) {
            documentDescription = new ArrayList<>();
        }
        return this.documentDescription;
    }

}
