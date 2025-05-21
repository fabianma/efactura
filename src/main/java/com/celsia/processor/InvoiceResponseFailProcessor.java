package com.celsia.processor;

import co.pragma.ents.common.basemessageformat.v1.ResponseHeaderOut;
import com.celsia.schema.efactura.v1.EfacturaResponseType;
import com.celsia.tool.EfacturaResponseBuilder;
import com.celsia.tool.ResponseHeaderBuilder;
import com.celsia.tool.SoapHeaderUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBException;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.apache.cxf.headers.Header;
import org.w3c.dom.Element;

import java.util.List;

public class InvoiceResponseFailProcessor implements Processor {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void process(Exchange exchange) throws Exception {
        Exception ex = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);

        if (ex instanceof HttpOperationFailedException httpEx) {
            String responseBody = httpEx.getResponseBody();            
            String responseCode = String.valueOf(httpEx.getHttpResponseCode());
            // 1. Extract SOAP header values
            List<Header> headers = exchange.getIn().getHeader(Header.HEADER_LIST, List.class);
            Element headerElement = (Element) headers.get(0).getObject();
            String messageId = headerElement.getElementsByTagName("messageId").item(0).getTextContent();
            String systemId = headerElement.getElementsByTagName("systemId").item(0).getTextContent();
            String statusCode = "PROVIDEREXCEPTION";

            // 2. Build ResponseHeaderOut
            ResponseHeaderOut headerOut = ResponseHeaderBuilder.build(messageId, systemId,statusCode);

            // 3. Convert to SoapHeader and overwrite
            exchange.getMessage().setHeader(Header.HEADER_LIST, List.of(
                    SoapHeaderUtils.createSoapHeader(headerOut)
            ));

            // 4. Parse JSON to EfacturaResponseType
            EfacturaResponseType responseType = parseEfacturaResponse(responseBody,responseCode);

            // 5. Set final body
            exchange.getMessage().setBody(responseType);
        }
    }

    private EfacturaResponseType parseEfacturaResponse(String json,String httpStatusCode) {
        try {
            return EfacturaResponseBuilder.fromJson(json,httpStatusCode);
        } catch (Exception e) {
            throw new RuntimeException("Invalid JSON response", e);
        }
    }
}
