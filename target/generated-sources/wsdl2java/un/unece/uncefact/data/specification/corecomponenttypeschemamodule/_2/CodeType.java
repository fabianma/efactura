
package un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (letters, figures, or symbols) that for brevity and/or languange independence may be used to represent or replace a definitive value or text of an attribute together with relevant supplementary information.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Should not be used if the character string identifies an instance of an object class or an object in the real world, in which case the Identifier. Type should be used.&lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * <p>Java class for CodeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CodeType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>normalizedString">
 *       <attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       <attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.CodeType.class
})
public class CodeType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC2&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of a list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC3&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Agency. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An agency that maintains one or more lists of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Agency&lt;/ccts:PropertyTermName&gt;
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
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listAgencyID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC4&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Agency Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the agency that maintains the list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "listAgencyName")
    protected String listAgencyName;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC5&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of a list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "listName")
    protected String listName;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC6&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Version. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The version of the list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listVersionID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC7&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The textual equivalent of the code content component.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC8&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Language. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identifier of the language used in the code name.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Language&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC9&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the code list is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC10&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Scheme. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the code list scheme is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Scheme&lt;/ccts:ObjectClass&gt;
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
    @XmlAttribute(name = "listSchemeURI")
    @XmlSchemaType(name = "anyURI")
    protected String listSchemeURI;

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC2&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of a list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListID()
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC3&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Agency. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An agency that maintains one or more lists of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Agency&lt;/ccts:PropertyTermName&gt;
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
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * Sets the value of the listAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListAgencyID()
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC4&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Agency Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the agency that maintains the list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    public String getListAgencyName() {
        return listAgencyName;
    }

    /**
     * Sets the value of the listAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListAgencyName()
     */
    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC5&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of a list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListName()
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC6&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Version. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The version of the list of codes.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Sets the value of the listVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListVersionID()
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC7&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code. Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The textual equivalent of the code content component.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:ObjectClass&gt;
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
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC8&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Language. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identifier of the language used in the code name.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Language&lt;/ccts:ObjectClass&gt;
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
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLanguageID()
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC9&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the code list is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:ObjectClass&gt;
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
    public String getListURI() {
        return listURI;
    }

    /**
     * Sets the value of the listURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListURI()
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000007-SC10&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Scheme. Uniform Resource. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Uniform Resource Identifier that identifies where the code list scheme is located.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Scheme&lt;/ccts:ObjectClass&gt;
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
    public String getListSchemeURI() {
        return listSchemeURI;
    }

    /**
     * Sets the value of the listSchemeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListSchemeURI()
     */
    public void setListSchemeURI(String value) {
        this.listSchemeURI = value;
    }

}
