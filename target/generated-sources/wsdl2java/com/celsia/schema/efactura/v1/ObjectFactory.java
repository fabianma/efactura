
package com.celsia.schema.efactura.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.celsia.schema.efactura.v1 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _EDocumentResponse_QNAME = new QName("http://www.celsia.com/schema/efactura/v1", "eDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.celsia.schema.efactura.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EfacturaResponseType }
     * 
     * @return
     *     the new instance of {@link EfacturaResponseType }
     */
    public EfacturaResponseType createEfacturaResponseType() {
        return new EfacturaResponseType();
    }

    /**
     * Create an instance of {@link ReasonType }
     * 
     * @return
     *     the new instance of {@link ReasonType }
     */
    public ReasonType createReasonType() {
        return new ReasonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfacturaResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EfacturaResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.celsia.com/schema/efactura/v1", name = "eDocumentResponse")
    public JAXBElement<EfacturaResponseType> createEDocumentResponse(EfacturaResponseType value) {
        return new JAXBElement<>(_EDocumentResponse_QNAME, EfacturaResponseType.class, null, value);
    }

}
