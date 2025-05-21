package com.celsia.route;

import com.celsia.contrato.contable.efactura_v1.EFacturaInterface;

import com.celsia.processor.InvoiceResponseFailProcessor;
import com.celsia.processor.invoiceDataFieldProcessor;
import com.celsia.processor.invoiceResponseFailProcessor_v1;
import com.celsia.processor.invoiceResponseProcessor;
import com.celsia.tool.BasicAuthInterceptor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;


import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.apache.camel.model.dataformat.Base64DataFormat;

import java.util.HashMap;
import java.util.Map;


@ApplicationScoped
public class mywsdlroutebuilder extends RouteBuilder {

    private static final String EFACTURA_ROUTE_ID    = "efactura-route";
    private static final String PROVIDER_ROUTE_ID   = "provider-route";

    @Override
    public void configure() throws Exception {

        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat();
        jaxbDataFormat.setContextPath(InvoiceType.class.getPackage().getName());
        jaxbDataFormat.setPrettyPrint(true);
        Map<String,String> namespacePrefixMap = new HashMap<>();
        namespacePrefixMap.put("urn:oasis:names:specification:ubl:schema:xsd:Invoice-2","");
        namespacePrefixMap.put("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2","cbc");
        namespacePrefixMap.put("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2","cac");
        namespacePrefixMap.put("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2","ext");
        namespacePrefixMap.put("urn:celsia:names:specification:ubl:schema:othercompany","celsia");
        namespacePrefixMap.put("urn:celsia:names:specification:ubl:schema:data","");
        jaxbDataFormat.setNamespacePrefix(namespacePrefixMap);


        Base64DataFormat base64 = new Base64DataFormat();

        onException(HttpOperationFailedException.class)
                .handled(true)
                .log("HTTP operation failed with status code: ${exception.statusCode}")
                .log("HTTP response body: ${exception.responseBody}")
                .process(new InvoiceResponseFailProcessor());

        onException(Exception.class)
                .log("Esta es la excepcin: ${exception}")
                .process(new InvoiceResponseFailProcessor());

        from("cxf:bean:efactura")
                .routeId(EFACTURA_ROUTE_ID)
                .process(exchange -> {
                    Map<String,Object> headers = exchange.getIn().getHeaders();
                })
                .convertBodyTo(InvoiceType.class)
                .setProperty("originalmessage",body())
                .marshal(jaxbDataFormat) // Esto convierte a XML
                .convertBodyTo(String.class)
                .process(new invoiceDataFieldProcessor())
                .marshal(base64)
                //.to("file:{{invoices.output}}?fileName=invoice-${date:now:yyyyMMddHHmmssSSS}.xml&autoCreate=true")
                .setHeader("{{myprovider.token.name}}", constant("{{myprovider.token.value}}"))
                .setHeader("{{myprovider.qrcode.name}}", constant("{{myprovider.qrcode.value}}"))
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("text/plain"))
                .to("{{myprovider.url}}?bridgeEndpoint=true&throwExceptionOnFailure=true")
                .log("${body}")
                .process(new invoiceResponseProcessor())
                .log("${body}");
                //.process(new invoiceTypeProcessor());
        }

    @Produces
    @ApplicationScoped
    @Named
    CxfEndpoint efactura(){
        CxfEndpoint result = new CxfEndpoint();
        result.setServiceClass(EFacturaInterface.class);
        //result.setDataFormat(DataFormat.PAYLOAD);
        result.setAddress("/efactura");
        result.setWsdlURL("wsdl/eFactura.wsdl");
        //result.setLoggingFeatureEnabled(true);
        result.getInInterceptors().add(new BasicAuthInterceptor("em-mws_ws","tCy8c:nRUZ|W?TPIxIq5"));
        return result;
    }
}
