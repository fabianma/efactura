package com.celsia.processor;

import co.pragma.ents.common.basemessageformat.v1.ResponseHeaderOut;
import com.celsia.schema.efactura.v1.EfacturaResponseType;
import com.celsia.schema.efactura.v1.ReasonType;
import com.celsia.tool.EfacturaResponseBuilder;
import com.celsia.tool.ResponseHeaderBuilder;
import com.celsia.tool.SoapHeaderUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.headers.Header;
import org.w3c.dom.Element;

import java.util.List;

public class invoiceResponseProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        try {
            String providerResponse = exchange.getIn().getBody(String.class);
            InvoiceType originalreq = exchange.getProperty("originalmessage", InvoiceType.class);

            if (originalreq != null) {
                //System.out.println("Se obtuvo solicitud: " + originalreq.getProfileID().getValue());
            } else {
                throw new IllegalArgumentException("Cuerpo del mensaje vacio");
            }
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root;
            try {
                root = mapper.readTree(providerResponse);
            } catch (JsonProcessingException e) {
                throw new RuntimeException();
            }

            // 1. Extract SOAP header values
            List<Header> headers = exchange.getIn().getHeader(Header.HEADER_LIST, List.class);
            Element headerElement = (Element) headers.get(0).getObject();
            String messageId = headerElement.getElementsByTagName("messageId").item(0).getTextContent();
            String systemId = headerElement.getElementsByTagName("systemId").item(0).getTextContent();
            String statusCode = "SUCCESS";

            // 2. Build ResponseHeaderOut
            ResponseHeaderOut headerOut = ResponseHeaderBuilder.build(messageId, systemId,statusCode);

            // 3. Convert to SoapHeader and overwrite
            exchange.getMessage().setHeader(Header.HEADER_LIST, List.of(
                    SoapHeaderUtils.createSoapHeader(headerOut)
            ));

            /*EfacturaResponseType responseType = new EfacturaResponseType();
            responseType.setStatusCode(root.path("statusCode").asText());

            if (root.path("trackId").isEmpty()) {
                responseType.setTrackId(root.path("trackId").asText());
            }
            if (root.path("uuid").isEmpty()) {
                responseType.setUUID(root.path("uuid").asText());
            }
            if (root.path("statusMessage").isEmpty()) {
                responseType.setStatusMessage(root.path("statusMessage").asText());
            }
            if (root.path("statusDescription").isEmpty()) {
                responseType.setStatusDescription(root.path("statusDescription").asText());
            }

            ReasonType errortype = new ReasonType();
            String description = "";

            if (root.path("warnings").isArray()) {
                description = root.path("statusDescription").asText();
                for (JsonNode node : root.path("warnings")) {
                    description = description + " " + node.asText();
                    //errortype.getRule().add(node.asText());
                }
                //responseType.setErrorReason(errortype);
                responseType.setStatusDescription(description);
            } else {
                errortype.getRule().add(root.path("errorReason").asText());
                responseType.setErrorReason(errortype);
            }
            if (root.path("qrCode").isEmpty()) {
                responseType.setQrCode(root.path("qrCode").asText());
            }
            if (root.path("validationDate").isEmpty()) {
                responseType.setValidationDate(root.path("validationDate").asText());
            }*/
            EfacturaResponseType responseType = parseEfacturaResponse(providerResponse);
            exchange.getMessage().setBody(responseType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private EfacturaResponseType parseEfacturaResponse(String json) {
        try {
            return EfacturaResponseBuilder.fromJsonSucces(json);
        } catch (Exception e) {
            throw new RuntimeException("Invalid JSON response", e);
        }
    }
}
