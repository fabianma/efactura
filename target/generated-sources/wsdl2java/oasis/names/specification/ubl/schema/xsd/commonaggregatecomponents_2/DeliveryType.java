
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDeliveryDateType;


/**
 * <p>Java class for DeliveryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeliveryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDeliveryDate" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryAddress" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryLocation" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryParty" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "actualDeliveryDate",
    "deliveryAddress",
    "deliveryLocation",
    "deliveryParty"
})
public class DeliveryType {

    @XmlElement(name = "ActualDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDeliveryDateType actualDeliveryDate;
    @XmlElement(name = "DeliveryAddress")
    protected AddressType deliveryAddress;
    @XmlElement(name = "DeliveryLocation")
    protected LocationType deliveryLocation;
    @XmlElement(name = "DeliveryParty")
    protected PartyType deliveryParty;

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDeliveryDateType }
     *     
     */
    public ActualDeliveryDateType getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Sets the value of the actualDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDeliveryDateType }
     *     
     */
    public void setActualDeliveryDate(ActualDeliveryDateType value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDeliveryAddress(AddressType value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Sets the value of the deliveryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDeliveryLocation(LocationType value) {
        this.deliveryLocation = value;
    }

    /**
     * Gets the value of the deliveryParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDeliveryParty() {
        return deliveryParty;
    }

    /**
     * Sets the value of the deliveryParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDeliveryParty(PartyType value) {
        this.deliveryParty = value;
    }

}
