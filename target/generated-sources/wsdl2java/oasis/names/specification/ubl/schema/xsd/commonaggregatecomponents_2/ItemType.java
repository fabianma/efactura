
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;


/**
 * <p>Java class for ItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellersItemIdentification" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StandardItemIdentification" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginCountry" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InformationContentProviderParty" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "description",
    "name",
    "sellersItemIdentification",
    "standardItemIdentification",
    "originCountry",
    "commodityClassification",
    "additionalItemProperty",
    "informationContentProviderParty"
})
public class ItemType {

    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "SellersItemIdentification")
    protected ItemIdentificationType sellersItemIdentification;
    @XmlElement(name = "StandardItemIdentification")
    protected ItemIdentificationType standardItemIdentification;
    @XmlElement(name = "OriginCountry")
    protected CountryType originCountry;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassification;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperty;
    @XmlElement(name = "InformationContentProviderParty")
    protected PartyType informationContentProviderParty;

    /**
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the description property.
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    /**
     * Gets the value of the name property.
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
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the sellersItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    /**
     * Sets the value of the sellersItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setSellersItemIdentification(ItemIdentificationType value) {
        this.sellersItemIdentification = value;
    }

    /**
     * Gets the value of the standardItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getStandardItemIdentification() {
        return standardItemIdentification;
    }

    /**
     * Sets the value of the standardItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setStandardItemIdentification(ItemIdentificationType value) {
        this.standardItemIdentification = value;
    }

    /**
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOriginCountry(CountryType value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the commodityClassification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the commodityClassification property.
     */
    public List<CommodityClassificationType> getCommodityClassification() {
        if (commodityClassification == null) {
            commodityClassification = new ArrayList<>();
        }
        return this.commodityClassification;
    }

    /**
     * Gets the value of the additionalItemProperty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalItemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the additionalItemProperty property.
     */
    public List<ItemPropertyType> getAdditionalItemProperty() {
        if (additionalItemProperty == null) {
            additionalItemProperty = new ArrayList<>();
        }
        return this.additionalItemProperty;
    }

    /**
     * Gets the value of the informationContentProviderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInformationContentProviderParty() {
        return informationContentProviderParty;
    }

    /**
     * Sets the value of the informationContentProviderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInformationContentProviderParty(PartyType value) {
        this.informationContentProviderParty = value;
    }

}
