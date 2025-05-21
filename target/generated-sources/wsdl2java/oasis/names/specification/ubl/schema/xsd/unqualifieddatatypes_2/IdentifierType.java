
package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalAccountIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndpointIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssuerIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetworkIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrimaryAccountNumberIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileExecutionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SalesOrderIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.ExtensionAgencyIDType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.ExtensionAgencyURIType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.ExtensionURIType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.ExtensionVersionIDType;
import oasis.names.specification.ubl.schema.xsd.signaturebasiccomponents_2.ReferencedSignatureIDType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000011&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and uniquely distinguish one instance of an object in an identification scheme from all other objects in the same scheme, together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the identifier list and thus, are not declared as attributes. &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * <p>Java class for IdentifierType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IdentifierType">
 *   <simpleContent>
 *     <extension base="<urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>IdentifierType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType")
@XmlSeeAlso({
    AccountIDType.class,
    AdditionalAccountIDType.class,
    CompanyIDType.class,
    CustomizationIDType.class,
    EndpointIDType.class,
    IDType.class,
    InstructionIDType.class,
    IssuerIDType.class,
    LineIDType.class,
    NetworkIDType.class,
    PaymentIDType.class,
    PrimaryAccountNumberIDType.class,
    ProfileExecutionIDType.class,
    ProfileIDType.class,
    ReferenceIDType.class,
    SalesOrderIDType.class,
    UBLVersionIDType.class,
    UUIDType.class,
    ExtensionAgencyIDType.class,
    ExtensionAgencyURIType.class,
    ExtensionURIType.class,
    ExtensionVersionIDType.class,
    ReferencedSignatureIDType.class
})
public class IdentifierType
    extends un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.IdentifierType
{


}
