
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeFinancingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TradeFinancingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancingParty"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeFinancingType", propOrder = {
    "financingParty"
})
public class TradeFinancingType {

    @XmlElement(name = "FinancingParty", required = true)
    protected PartyType financingParty;

    /**
     * Gets the value of the financingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFinancingParty() {
        return financingParty;
    }

    /**
     * Sets the value of the financingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFinancingParty(PartyType value) {
        this.financingParty = value;
    }

}
