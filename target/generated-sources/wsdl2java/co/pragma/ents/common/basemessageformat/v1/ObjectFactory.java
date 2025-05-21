
package co.pragma.ents.common.basemessageformat.v1;

import javax.xml.namespace.QName;
import co.pragma.ents.common.baseextensions.v1.ExceptionList;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.pragma.ents.common.basemessageformat.v1 package. 
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

    private static final QName _RequestHeaderIn_QNAME = new QName("http://pragma.co/ents/common/BaseMessageFormat/V1", "requestHeaderIn");
    private static final QName _RequestHeaderOut_QNAME = new QName("http://pragma.co/ents/common/BaseMessageFormat/V1", "requestHeaderOut");
    private static final QName _ResponseHeaderOut_QNAME = new QName("http://pragma.co/ents/common/BaseMessageFormat/V1", "responseHeaderOut");
    private static final QName _ResponseHeaderIn_QNAME = new QName("http://pragma.co/ents/common/BaseMessageFormat/V1", "responseHeaderIn");
    private static final QName _ExceptionList_QNAME = new QName("http://pragma.co/ents/common/BaseMessageFormat/V1", "exceptionList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.pragma.ents.common.basemessageformat.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestHeaderIn }
     * 
     * @return
     *     the new instance of {@link RequestHeaderIn }
     */
    public RequestHeaderIn createRequestHeaderIn() {
        return new RequestHeaderIn();
    }

    /**
     * Create an instance of {@link RequestHeaderOut }
     * 
     * @return
     *     the new instance of {@link RequestHeaderOut }
     */
    public RequestHeaderOut createRequestHeaderOut() {
        return new RequestHeaderOut();
    }

    /**
     * Create an instance of {@link ResponseHeaderOut }
     * 
     * @return
     *     the new instance of {@link ResponseHeaderOut }
     */
    public ResponseHeaderOut createResponseHeaderOut() {
        return new ResponseHeaderOut();
    }

    /**
     * Create an instance of {@link ResponseHeaderIn }
     * 
     * @return
     *     the new instance of {@link ResponseHeaderIn }
     */
    public ResponseHeaderIn createResponseHeaderIn() {
        return new ResponseHeaderIn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderIn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestHeaderIn }{@code >}
     */
    @XmlElementDecl(namespace = "http://pragma.co/ents/common/BaseMessageFormat/V1", name = "requestHeaderIn")
    public JAXBElement<RequestHeaderIn> createRequestHeaderIn(RequestHeaderIn value) {
        return new JAXBElement<>(_RequestHeaderIn_QNAME, RequestHeaderIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestHeaderOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://pragma.co/ents/common/BaseMessageFormat/V1", name = "requestHeaderOut")
    public JAXBElement<RequestHeaderOut> createRequestHeaderOut(RequestHeaderOut value) {
        return new JAXBElement<>(_RequestHeaderOut_QNAME, RequestHeaderOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeaderOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseHeaderOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://pragma.co/ents/common/BaseMessageFormat/V1", name = "responseHeaderOut")
    public JAXBElement<ResponseHeaderOut> createResponseHeaderOut(ResponseHeaderOut value) {
        return new JAXBElement<>(_ResponseHeaderOut_QNAME, ResponseHeaderOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeaderIn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseHeaderIn }{@code >}
     */
    @XmlElementDecl(namespace = "http://pragma.co/ents/common/BaseMessageFormat/V1", name = "responseHeaderIn")
    public JAXBElement<ResponseHeaderIn> createResponseHeaderIn(ResponseHeaderIn value) {
        return new JAXBElement<>(_ResponseHeaderIn_QNAME, ResponseHeaderIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExceptionList }{@code >}
     */
    @XmlElementDecl(namespace = "http://pragma.co/ents/common/BaseMessageFormat/V1", name = "exceptionList")
    public JAXBElement<ExceptionList> createExceptionList(ExceptionList value) {
        return new JAXBElement<>(_ExceptionList_QNAME, ExceptionList.class, null, value);
    }

}
