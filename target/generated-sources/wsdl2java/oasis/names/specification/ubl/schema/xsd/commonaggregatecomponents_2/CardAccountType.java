
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssuerIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetworkIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrimaryAccountNumberIDType;


/**
 * <p>Java class for CardAccountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CardAccountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrimaryAccountNumberID"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetworkID"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssuerID" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccountType", propOrder = {
    "primaryAccountNumberID",
    "networkID",
    "issuerID"
})
public class CardAccountType {

    @XmlElement(name = "PrimaryAccountNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrimaryAccountNumberIDType primaryAccountNumberID;
    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NetworkIDType networkID;
    @XmlElement(name = "IssuerID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssuerIDType issuerID;

    /**
     * Gets the value of the primaryAccountNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAccountNumberIDType }
     *     
     */
    public PrimaryAccountNumberIDType getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * Sets the value of the primaryAccountNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAccountNumberIDType }
     *     
     */
    public void setPrimaryAccountNumberID(PrimaryAccountNumberIDType value) {
        this.primaryAccountNumberID = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkIDType }
     *     
     */
    public NetworkIDType getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkIDType }
     *     
     */
    public void setNetworkID(NetworkIDType value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the issuerID property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerIDType }
     *     
     */
    public IssuerIDType getIssuerID() {
        return issuerID;
    }

    /**
     * Sets the value of the issuerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerIDType }
     *     
     */
    public void setIssuerID(IssuerIDType value) {
        this.issuerID = value;
    }

}
