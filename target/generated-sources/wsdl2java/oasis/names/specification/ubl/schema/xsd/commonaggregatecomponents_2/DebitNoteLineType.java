
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DebitedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;


/**
 * <p>Java class for DebitNoteLineType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DebitNoteLineType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitedQuantity" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingReference" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitNoteLineType", propOrder = {
    "id",
    "note",
    "debitedQuantity",
    "lineExtensionAmount",
    "pricingReference",
    "taxTotal",
    "item",
    "price"
})
public class DebitNoteLineType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "DebitedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DebitedQuantityType debitedQuantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "PricingReference")
    protected PricingReferenceType pricingReference;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "Price")
    protected PriceType price;

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
     * Gets the value of the note property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * </p>
     * 
     * 
     * @return
     *     The value of the note property.
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<>();
        }
        return this.note;
    }

    /**
     * Gets the value of the debitedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DebitedQuantityType }
     *     
     */
    public DebitedQuantityType getDebitedQuantity() {
        return debitedQuantity;
    }

    /**
     * Sets the value of the debitedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitedQuantityType }
     *     
     */
    public void setDebitedQuantity(DebitedQuantityType value) {
        this.debitedQuantity = value;
    }

    /**
     * Gets the value of the lineExtensionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public LineExtensionAmountType getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Sets the value of the lineExtensionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmountType value) {
        this.lineExtensionAmount = value;
    }

    /**
     * Gets the value of the pricingReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingReferenceType }
     *     
     */
    public PricingReferenceType getPricingReference() {
        return pricingReference;
    }

    /**
     * Sets the value of the pricingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingReferenceType }
     *     
     */
    public void setPricingReference(PricingReferenceType value) {
        this.pricingReference = value;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxTotal property.
     */
    public List<TaxTotalType> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<>();
        }
        return this.taxTotal;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

}
