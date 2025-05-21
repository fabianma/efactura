
package un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and distinguish uniquely, one instance of an object in an identification scheme from all other objects in the same scheme together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <p>Java class for IdentifierType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IdentifierType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>normalizedString">
 *       <attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="schemeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="schemeAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="schemeAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="schemeDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.IdentifierType.class
})
public class IdentifierType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC2&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC3&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeName")
    protected String schemeName;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC4&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of the agency that maintains the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Defaults to the UN/EDIFACT data element 3055 code list.&lt;/ccts:UsageRule&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeAgencyID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC5&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the agency that maintains the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Agency Name&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeAgencyName")
    protected String schemeAgencyName;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC6&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Version. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The version of the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Version&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeVersionID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC7&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Data. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the identification scheme data is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Data&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uniform Resource Identifier&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeDataURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeDataURI;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC8&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the identification scheme is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uniform Resource Identifier&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "schemeURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeURI;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC2&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Sets the value of the schemeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeID()
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC3&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Name&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * Sets the value of the schemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeName()
     */
    public void setSchemeName(String value) {
        this.schemeName = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC4&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of the agency that maintains the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Defaults to the UN/EDIFACT data element 3055 code list.&lt;/ccts:UsageRule&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Sets the value of the schemeAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeAgencyID()
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC5&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the agency that maintains the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Agency&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Agency Name&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyName() {
        return schemeAgencyName;
    }

    /**
     * Sets the value of the schemeAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeAgencyName()
     */
    public void setSchemeAgencyName(String value) {
        this.schemeAgencyName = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC6&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Version. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The version of the identification scheme.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Version&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * Sets the value of the schemeVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeVersionID()
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC7&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Data. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the identification scheme data is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme Data&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uniform Resource Identifier&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeDataURI() {
        return schemeDataURI;
    }

    /**
     * Sets the value of the schemeDataURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeDataURI()
     */
    public void setSchemeDataURI(String value) {
        this.schemeDataURI = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000011-SC8&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the identification scheme is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification Scheme&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uniform Resource Identifier&lt;/ccts:PropertyTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeURI() {
        return schemeURI;
    }

    /**
     * Sets the value of the schemeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchemeURI()
     */
    public void setSchemeURI(String value) {
        this.schemeURI = value;
    }

}
