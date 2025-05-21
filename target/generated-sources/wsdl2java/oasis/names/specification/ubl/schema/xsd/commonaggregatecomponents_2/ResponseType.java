
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;


/**
 * <p>Java class for ResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseCode" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "referenceID",
    "responseCode",
    "description"
})
public class ResponseType {

    @XmlElement(name = "ReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceIDType referenceID;
    @XmlElement(name = "ResponseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseCodeType responseCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceIDType }
     *     
     */
    public ReferenceIDType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceIDType }
     *     
     */
    public void setReferenceID(ReferenceIDType value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeType }
     *     
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeType }
     *     
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the description property.
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

}
