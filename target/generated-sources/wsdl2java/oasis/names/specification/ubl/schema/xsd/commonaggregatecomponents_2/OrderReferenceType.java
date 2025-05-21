
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SalesOrderIDType;


/**
 * <p>Java class for OrderReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalesOrderID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferenceType", propOrder = {
    "id",
    "salesOrderID",
    "documentReference"
})
public class OrderReferenceType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "SalesOrderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SalesOrderIDType salesOrderID;
    @XmlElement(name = "DocumentReference")
    protected DocumentReferenceType documentReference;

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
     * Gets the value of the salesOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIDType }
     *     
     */
    public SalesOrderIDType getSalesOrderID() {
        return salesOrderID;
    }

    /**
     * Sets the value of the salesOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIDType }
     *     
     */
    public void setSalesOrderID(SalesOrderIDType value) {
        this.salesOrderID = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

}
