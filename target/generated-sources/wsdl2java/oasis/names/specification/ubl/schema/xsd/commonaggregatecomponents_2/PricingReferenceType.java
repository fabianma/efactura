
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PricingReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalItemLocationQuantity" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AlternativeConditionPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingReferenceType", propOrder = {
    "originalItemLocationQuantity",
    "alternativeConditionPrice"
})
public class PricingReferenceType {

    @XmlElement(name = "OriginalItemLocationQuantity")
    protected ItemLocationQuantityType originalItemLocationQuantity;
    @XmlElement(name = "AlternativeConditionPrice")
    protected List<PriceType> alternativeConditionPrice;

    /**
     * Gets the value of the originalItemLocationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public ItemLocationQuantityType getOriginalItemLocationQuantity() {
        return originalItemLocationQuantity;
    }

    /**
     * Sets the value of the originalItemLocationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public void setOriginalItemLocationQuantity(ItemLocationQuantityType value) {
        this.originalItemLocationQuantity = value;
    }

    /**
     * Gets the value of the alternativeConditionPrice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeConditionPrice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlternativeConditionPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the alternativeConditionPrice property.
     */
    public List<PriceType> getAlternativeConditionPrice() {
        if (alternativeConditionPrice == null) {
            alternativeConditionPrice = new ArrayList<>();
        }
        return this.alternativeConditionPrice;
    }

}
