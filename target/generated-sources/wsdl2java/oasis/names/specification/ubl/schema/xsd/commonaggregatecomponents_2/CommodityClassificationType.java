
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;


/**
 * <p>Java class for CommodityClassificationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CommodityClassificationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ItemClassificationCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityClassificationType", propOrder = {
    "itemClassificationCode"
})
public class CommodityClassificationType {

    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ItemClassificationCodeType itemClassificationCode;

    /**
     * Gets the value of the itemClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public ItemClassificationCodeType getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Sets the value of the itemClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public void setItemClassificationCode(ItemClassificationCodeType value) {
        this.itemClassificationCode = value;
    }

}
