
package org.etsi.uri._01903.v1_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XAdESTimeStampType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="XAdESTimeStampType">
 *   <complexContent>
 *     <restriction base="{http://uri.etsi.org/01903/v1.3.2#}GenericTimeStampType">
 *       <sequence>
 *         <element ref="{http://uri.etsi.org/01903/v1.3.2#}Include" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="EncapsulatedTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/>
 *           <element name="XMLTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAdESTimeStampType")
public class XAdESTimeStampType
    extends GenericTimeStampType
{


}
