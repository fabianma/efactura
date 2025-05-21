
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountIDType;


/**
 * <p>Java class for CreditAccountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreditAccountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountID"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAccountType", propOrder = {
    "accountID"
})
public class CreditAccountType {

    @XmlElement(name = "AccountID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AccountIDType accountID;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIDType }
     *     
     */
    public AccountIDType getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIDType }
     *     
     */
    public void setAccountID(AccountIDType value) {
        this.accountID = value;
    }

}
