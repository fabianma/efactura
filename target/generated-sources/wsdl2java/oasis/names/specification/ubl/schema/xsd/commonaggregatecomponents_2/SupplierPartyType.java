
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalAccountIDType;


/**
 * <p>Java class for SupplierPartyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SupplierPartyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalAccountID" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerContact" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierPartyType", propOrder = {
    "additionalAccountID",
    "party",
    "sellerContact"
})
public class SupplierPartyType {

    @XmlElement(name = "AdditionalAccountID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalAccountIDType> additionalAccountID;
    @XmlElement(name = "Party")
    protected PartyType party;
    @XmlElement(name = "SellerContact")
    protected ContactType sellerContact;

    /**
     * Gets the value of the additionalAccountID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAccountID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalAccountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAccountIDType }
     * </p>
     * 
     * 
     * @return
     *     The value of the additionalAccountID property.
     */
    public List<AdditionalAccountIDType> getAdditionalAccountID() {
        if (additionalAccountID == null) {
            additionalAccountID = new ArrayList<>();
        }
        return this.additionalAccountID;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the sellerContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSellerContact() {
        return sellerContact;
    }

    /**
     * Sets the value of the sellerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSellerContact(ContactType value) {
        this.sellerContact = value;
    }

}
