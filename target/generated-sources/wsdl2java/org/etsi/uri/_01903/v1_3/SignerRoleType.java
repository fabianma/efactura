
package org.etsi.uri._01903.v1_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerRoleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SignerRoleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClaimedRoles" type="{http://uri.etsi.org/01903/v1.3.2#}ClaimedRolesListType" minOccurs="0"/>
 *         <element name="CertifiedRoles" type="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRolesListType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRoleType", propOrder = {
    "claimedRoles",
    "certifiedRoles"
})
public class SignerRoleType {

    @XmlElement(name = "ClaimedRoles")
    protected ClaimedRolesListType claimedRoles;
    @XmlElement(name = "CertifiedRoles")
    protected CertifiedRolesListType certifiedRoles;

    /**
     * Gets the value of the claimedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedRolesListType }
     *     
     */
    public ClaimedRolesListType getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Sets the value of the claimedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedRolesListType }
     *     
     */
    public void setClaimedRoles(ClaimedRolesListType value) {
        this.claimedRoles = value;
    }

    /**
     * Gets the value of the certifiedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedRolesListType }
     *     
     */
    public CertifiedRolesListType getCertifiedRoles() {
        return certifiedRoles;
    }

    /**
     * Sets the value of the certifiedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedRolesListType }
     *     
     */
    public void setCertifiedRoles(CertifiedRolesListType value) {
        this.certifiedRoles = value;
    }

}
