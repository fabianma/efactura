package com.celsia.processor;

import co.pragma.ents.common.baseextensions.v1.ResponseStatus;
import co.pragma.ents.common.basemessageformat.v1.ResponseHeaderOut;
import com.celsia.schema.efactura.v1.EfacturaResponseType;
import com.celsia.schema.efactura.v1.ReasonType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import org.apache.camel.Exchange;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header;
import org.apache.camel.Processor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class invoiceResponseFailProcessor_v1 implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        try {
            Exception exception = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);

            if (exception instanceof HttpOperationFailedException httpEx) {
                int statusCode = httpEx.getStatusCode();
                String providerResponse = httpEx.getResponseBody();
                // handle the failed response

                //String providerResponse = exchange.getIn().getBody(String.class);

                List<Header> headers = exchange.getIn().getHeader(Header.HEADER_LIST, List.class);
                Element header = ((Element) headers.get(0).getObject());
                String messageId = header.getElementsByTagName("messageId").item(0).getTextContent();
                String systemId = header.getElementsByTagName("systemId").item(0).getTextContent();
                //String systemId = (String)header.getElementsByTagName("systemId").item(0).getTextContent();
                //exchange.getIn().setHeader("TYPE_EVENT",eventType);

                InvoiceType originalreq = exchange.getProperty("originalmessage", InvoiceType.class);

                if (originalreq != null) {
                    System.out.println("Se obtuvo solicitud: " + originalreq.getProfileID().getValue());
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
                ResponseHeaderOut responseHeaderOut = new ResponseHeaderOut();
                ResponseStatus responseStatus = new ResponseStatus();
                responseHeaderOut.setSystemId(systemId);
                responseHeaderOut.setMessageId(messageId);

                LocalDateTime ldt = LocalDateTime.now();
                XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(GregorianCalendar.from(ldt.atZone(ZoneId.systemDefault())));

                responseHeaderOut.setInvokerDateTime(xmlCal);
                responseStatus.setStatusCode("PROVIDEREXCEPTION");
                responseHeaderOut.setResponseStatus(responseStatus);

                // Step 2: Convert it to XML Element (with JAXB)
                QName qname = new QName("http://pragma.co/ents/common/BaseMessageFormat/V1", "responseHeaderOut");
                JAXBElement<ResponseHeaderOut> jaxbElement = new JAXBElement<>(qname, ResponseHeaderOut.class, responseHeaderOut);

                JAXBContext jaxbContext = JAXBContext.newInstance(ResponseHeaderOut.class);
                Marshaller marshaller = jaxbContext.createMarshaller();
                Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                marshaller.marshal(jaxbElement, doc);

                Element xmlElement = doc.getDocumentElement();

                // Step 3: Create new SoapHeader
                SoapHeader soapHeader = new SoapHeader(qname, xmlElement);
                soapHeader.setDirection(SoapHeader.Direction.DIRECTION_OUT);

                // Step 4: Overwrite existing headers
                List<SoapHeader> newHeaders = new ArrayList<>();
                newHeaders.add(soapHeader);
                exchange.getMessage().setHeader(Header.HEADER_LIST, newHeaders);


                EfacturaResponseType responseType = new EfacturaResponseType();
                responseType.setStatusCode(root.path("statusCode").asText());

                if (!root.path("trackId").isEmpty()) {
                    responseType.setTrackId(root.path("trackId").asText());
                }
                if (!root.path("uuid").isEmpty()) {
                    responseType.setUUID(root.path("uuid").asText());
                }
                if (!root.path("qrCode").isEmpty()) {
                    responseType.setUUID(root.path("qrCode").asText());
                }
                if (!root.path("validationDate").isEmpty()) {
                    responseType.setUUID(root.path("validationDate").asText());
                }

                responseType.setErrorMessage(root.path("errorMessage").asText());
                ReasonType errortype = new ReasonType();

                if (root.path("errorReason").isArray()) {
                    for (JsonNode node : root.path("errorReason")) {
                        errortype.getRule().add(node.asText());
                    }
                    responseType.setErrorReason(errortype);
                } else {
                    errortype.getRule().add(root.path("errorReason").asText());
                    responseType.setErrorReason(errortype);
                }
                //exchange.getMessage().removeHeaders(Header.HEADER_LIST);
                exchange.getMessage().setBody(responseType);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
