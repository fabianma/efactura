
package com.celsia.schema.efactura.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for efacturaResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="efacturaResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TrackId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="qrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="validationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="qrBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ErrorReason" type="{http://www.celsia.com/schema/efactura/v1}ReasonType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "efacturaResponseType", propOrder = {
    "statusCode",
    "trackId",
    "uuid",
    "statusMessage",
    "statusDescription",
    "qrCode",
    "validationDate",
    "qrBase",
    "errorMessage",
    "errorReason"
})
public class EfacturaResponseType {

    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "TrackId")
    protected String trackId;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    protected String qrCode;
    protected String validationDate;
    protected String qrBase;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "ErrorReason")
    protected ReasonType errorReason;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the trackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackId(String value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the qrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * Sets the value of the qrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrCode(String value) {
        this.qrCode = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationDate(String value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the qrBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrBase() {
        return qrBase;
    }

    /**
     * Sets the value of the qrBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrBase(String value) {
        this.qrBase = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonType }
     *     
     */
    public ReasonType getErrorReason() {
        return errorReason;
    }

    /**
     * Sets the value of the errorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonType }
     *     
     */
    public void setErrorReason(ReasonType value) {
        this.errorReason = value;
    }

}
