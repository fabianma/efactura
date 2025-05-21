
package oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;


/**
 * A single extension for private use.
 * 
 * <p>Java class for UBLExtensionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UBLExtensionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyName" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionVersionID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyURI" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionURI" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReasonCode" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReason" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionContent"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionType", propOrder = {
    "id",
    "name",
    "extensionAgencyID",
    "extensionAgencyName",
    "extensionVersionID",
    "extensionAgencyURI",
    "extensionURI",
    "extensionReasonCode",
    "extensionReason",
    "extensionContent"
})
public class UBLExtensionType {

    /**
     * An identifier for the Extension assigned by the creator of the extension.
     * 
     */
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    /**
     * A name for the Extension assigned by the creator of the extension.
     * 
     */
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    /**
     * An agency that maintains one or more Extensions.
     * 
     */
    @XmlElement(name = "ExtensionAgencyID")
    protected ExtensionAgencyIDType extensionAgencyID;
    /**
     * The name of the agency that maintains the Extension.
     * 
     */
    @XmlElement(name = "ExtensionAgencyName")
    protected ExtensionAgencyNameType extensionAgencyName;
    /**
     * The version of the Extension.
     * 
     */
    @XmlElement(name = "ExtensionVersionID")
    protected ExtensionVersionIDType extensionVersionID;
    /**
     * A URI for the Agency that maintains the Extension.
     * 
     */
    @XmlElement(name = "ExtensionAgencyURI")
    protected ExtensionAgencyURIType extensionAgencyURI;
    /**
     * A URI for the Extension.
     * 
     */
    @XmlElement(name = "ExtensionURI")
    protected ExtensionURIType extensionURI;
    /**
     * A code for reason the Extension is being included.
     * 
     */
    @XmlElement(name = "ExtensionReasonCode")
    protected ExtensionReasonCodeType extensionReasonCode;
    /**
     * A description of the reason for the Extension.
     * 
     */
    @XmlElement(name = "ExtensionReason")
    protected ExtensionReasonType extensionReason;
    /**
     * The definition of the extension content.
     * 
     */
    @XmlElement(name = "ExtensionContent", required = true)
    protected ExtensionContentType extensionContent;

    /**
     * An identifier for the Extension assigned by the creator of the extension.
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
     * A name for the Extension assigned by the creator of the extension.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     * @see #getName()
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * An agency that maintains one or more Extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyIDType }
     *     
     */
    public ExtensionAgencyIDType getExtensionAgencyID() {
        return extensionAgencyID;
    }

    /**
     * Sets the value of the extensionAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyIDType }
     *     
     * @see #getExtensionAgencyID()
     */
    public void setExtensionAgencyID(ExtensionAgencyIDType value) {
        this.extensionAgencyID = value;
    }

    /**
     * The name of the agency that maintains the Extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyNameType }
     *     
     */
    public ExtensionAgencyNameType getExtensionAgencyName() {
        return extensionAgencyName;
    }

    /**
     * Sets the value of the extensionAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyNameType }
     *     
     * @see #getExtensionAgencyName()
     */
    public void setExtensionAgencyName(ExtensionAgencyNameType value) {
        this.extensionAgencyName = value;
    }

    /**
     * The version of the Extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionVersionIDType }
     *     
     */
    public ExtensionVersionIDType getExtensionVersionID() {
        return extensionVersionID;
    }

    /**
     * Sets the value of the extensionVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionVersionIDType }
     *     
     * @see #getExtensionVersionID()
     */
    public void setExtensionVersionID(ExtensionVersionIDType value) {
        this.extensionVersionID = value;
    }

    /**
     * A URI for the Agency that maintains the Extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyURIType }
     *     
     */
    public ExtensionAgencyURIType getExtensionAgencyURI() {
        return extensionAgencyURI;
    }

    /**
     * Sets the value of the extensionAgencyURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyURIType }
     *     
     * @see #getExtensionAgencyURI()
     */
    public void setExtensionAgencyURI(ExtensionAgencyURIType value) {
        this.extensionAgencyURI = value;
    }

    /**
     * A URI for the Extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionURIType }
     *     
     */
    public ExtensionURIType getExtensionURI() {
        return extensionURI;
    }

    /**
     * Sets the value of the extensionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionURIType }
     *     
     * @see #getExtensionURI()
     */
    public void setExtensionURI(ExtensionURIType value) {
        this.extensionURI = value;
    }

    /**
     * A code for reason the Extension is being included.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReasonCodeType }
     *     
     */
    public ExtensionReasonCodeType getExtensionReasonCode() {
        return extensionReasonCode;
    }

    /**
     * Sets the value of the extensionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReasonCodeType }
     *     
     * @see #getExtensionReasonCode()
     */
    public void setExtensionReasonCode(ExtensionReasonCodeType value) {
        this.extensionReasonCode = value;
    }

    /**
     * A description of the reason for the Extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReasonType }
     *     
     */
    public ExtensionReasonType getExtensionReason() {
        return extensionReason;
    }

    /**
     * Sets the value of the extensionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReasonType }
     *     
     * @see #getExtensionReason()
     */
    public void setExtensionReason(ExtensionReasonType value) {
        this.extensionReason = value;
    }

    /**
     * The definition of the extension content.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionContentType }
     *     
     */
    public ExtensionContentType getExtensionContent() {
        return extensionContent;
    }

    /**
     * Sets the value of the extensionContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionContentType }
     *     
     * @see #getExtensionContent()
     */
    public void setExtensionContent(ExtensionContentType value) {
        this.extensionContent = value;
    }

}
