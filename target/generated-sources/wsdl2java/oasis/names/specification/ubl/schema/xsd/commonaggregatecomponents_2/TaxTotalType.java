
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoundingAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEvidenceIndicatorType;


/**
 * <p>Java class for TaxTotalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxTotalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoundingAmount" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEvidenceIndicator" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxSubtotal" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTotalType", propOrder = {
    "taxAmount",
    "roundingAmount",
    "taxEvidenceIndicator",
    "taxSubtotal"
})
public class TaxTotalType {

    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TaxAmountType taxAmount;
    @XmlElement(name = "RoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoundingAmountType roundingAmount;
    @XmlElement(name = "TaxEvidenceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEvidenceIndicatorType taxEvidenceIndicator;
    @XmlElement(name = "TaxSubtotal")
    protected List<TaxSubtotalType> taxSubtotal;

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setTaxAmount(TaxAmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the roundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingAmountType }
     *     
     */
    public RoundingAmountType getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Sets the value of the roundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingAmountType }
     *     
     */
    public void setRoundingAmount(RoundingAmountType value) {
        this.roundingAmount = value;
    }

    /**
     * Gets the value of the taxEvidenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEvidenceIndicatorType }
     *     
     */
    public TaxEvidenceIndicatorType getTaxEvidenceIndicator() {
        return taxEvidenceIndicator;
    }

    /**
     * Sets the value of the taxEvidenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEvidenceIndicatorType }
     *     
     */
    public void setTaxEvidenceIndicator(TaxEvidenceIndicatorType value) {
        this.taxEvidenceIndicator = value;
    }

    /**
     * Gets the value of the taxSubtotal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSubtotal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxSubtotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSubtotalType }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxSubtotal property.
     */
    public List<TaxSubtotalType> getTaxSubtotal() {
        if (taxSubtotal == null) {
            taxSubtotal = new ArrayList<>();
        }
        return this.taxSubtotal;
    }

}
