
package un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2;

import java.math.BigDecimal;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units possibly including fractions.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <p>Java class for QuantityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QuantityType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attribute name="unitCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="unitCodeListID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="unitCodeListAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       <attribute name="unitCodeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.QuantityType.class
})
public class QuantityType {

    @XmlValue
    protected BigDecimal value;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC2&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Unit. Code&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The unit of the quantity&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unit Code&lt;/ccts:PropertyTermName&gt;
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
     */
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCode;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC3&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit. Code List. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The quantity unit code list.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:PropertyTermName&gt;
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
    @XmlAttribute(name = "unitCodeListID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC4&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit. Code List Agency. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of the agency that maintains the quantity unit code list&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Agency&lt;/ccts:PropertyTermName&gt;
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
    @XmlAttribute(name = "unitCodeListAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListAgencyID;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC5&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit. Code List Agency Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the agency which maintains the quantity unit code list.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Agency Name&lt;/ccts:PropertyTermName&gt;
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
    @XmlAttribute(name = "unitCodeListAgencyName")
    protected String unitCodeListAgencyName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC2&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Unit. Code&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The unit of the quantity&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unit Code&lt;/ccts:PropertyTermName&gt;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitCode()
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC3&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit. Code List. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The quantity unit code list.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List&lt;/ccts:PropertyTermName&gt;
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
    public String getUnitCodeListID() {
        return unitCodeListID;
    }

    /**
     * Sets the value of the unitCodeListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitCodeListID()
     */
    public void setUnitCodeListID(String value) {
        this.unitCodeListID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC4&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit. Code List Agency. Identifier&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The identification of the agency that maintains the quantity unit code list&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Agency&lt;/ccts:PropertyTermName&gt;
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
    public String getUnitCodeListAgencyID() {
        return unitCodeListAgencyID;
    }

    /**
     * Sets the value of the unitCodeListAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitCodeListAgencyID()
     */
    public void setUnitCodeListAgencyID(String value) {
        this.unitCodeListAgencyID = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018-SC5&lt;/ccts:UniqueID&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SC&lt;/ccts:CategoryCode&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit. Code List Agency Name. Text&lt;/ccts:DictionaryEntryName&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The name of the agency which maintains the quantity unit code list.&lt;/ccts:Definition&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClass xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity Unit&lt;/ccts:ObjectClass&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code List Agency Name&lt;/ccts:PropertyTermName&gt;
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
    public String getUnitCodeListAgencyName() {
        return unitCodeListAgencyName;
    }

    /**
     * Sets the value of the unitCodeListAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitCodeListAgencyName()
     */
    public void setUnitCodeListAgencyName(String value) {
        this.unitCodeListAgencyName = value;
    }

}
