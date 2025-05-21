
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;


/**
 * <p>Java class for PartyLegalEntityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartyLegalEntityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CorporateRegistrationScheme" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLegalEntityType", propOrder = {
    "registrationName",
    "companyID",
    "corporateRegistrationScheme"
})
public class PartyLegalEntityType {

    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationNameType registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyIDType companyID;
    @XmlElement(name = "CorporateRegistrationScheme")
    protected CorporateRegistrationSchemeType corporateRegistrationScheme;

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
     * Gets the value of the corporateRegistrationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationSchemeType }
     *     
     */
    public CorporateRegistrationSchemeType getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    /**
     * Sets the value of the corporateRegistrationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationSchemeType }
     *     
     */
    public void setCorporateRegistrationScheme(CorporateRegistrationSchemeType value) {
        this.corporateRegistrationScheme = value;
    }

}
