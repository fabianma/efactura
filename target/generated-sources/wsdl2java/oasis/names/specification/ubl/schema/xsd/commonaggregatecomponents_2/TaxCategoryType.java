
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxExemptionReasonType;


/**
 * <p>Java class for TaxCategoryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxCategoryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExemptionReason" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TaxCategoryType", propOrder = {
    "id",
    "percent",
    "taxExemptionReason",
    "taxScheme"
})
public class TaxCategoryType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PercentType percent;
    @XmlElement(name = "TaxExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TaxExemptionReasonType> taxExemptionReason;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxSchemeType taxScheme;

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
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setPercent(PercentType value) {
        this.percent = value;
    }

    /**
     * Gets the value of the taxExemptionReason property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptionReason property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxExemptionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionReasonType }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxExemptionReason property.
     */
    public List<TaxExemptionReasonType> getTaxExemptionReason() {
        if (taxExemptionReason == null) {
            taxExemptionReason = new ArrayList<>();
        }
        return this.taxExemptionReason;
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
