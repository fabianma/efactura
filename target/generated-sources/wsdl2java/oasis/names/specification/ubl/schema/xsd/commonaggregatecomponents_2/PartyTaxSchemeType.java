
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxLevelCodeType;


/**
 * <p>Java class for PartyTaxSchemeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartyTaxSchemeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxLevelCode" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTaxSchemeType", propOrder = {
    "registrationName",
    "companyID",
    "taxLevelCode",
    "registrationAddress",
    "taxScheme"
})
public class PartyTaxSchemeType {

    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationNameType registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyIDType companyID;
    @XmlElement(name = "TaxLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxLevelCodeType taxLevelCode;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxSchemeType taxScheme;

    /**
     * Gets the value of the registrationName property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNameType }
     *     
     */
    public RegistrationNameType getRegistrationName() {
        return registrationName;
    }

    /**
     * Sets the value of the registrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNameType }
     *     
     */
    public void setRegistrationName(RegistrationNameType value) {
        this.registrationName = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIDType }
     *     
     */
    public CompanyIDType getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIDType }
     *     
     */
    public void setCompanyID(CompanyIDType value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the taxLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxLevelCodeType }
     *     
     */
    public TaxLevelCodeType getTaxLevelCode() {
        return taxLevelCode;
    }

    /**
     * Sets the value of the taxLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLevelCodeType }
     *     
     */
    public void setTaxLevelCode(TaxLevelCodeType value) {
        this.taxLevelCode = value;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSchemeType }
     *     
     */
    public TaxSchemeType getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSchemeType }
     *     
     */
    public void setTaxScheme(TaxSchemeType value) {
        this.taxScheme = value;
    }

}
