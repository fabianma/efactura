package com.celsia.tool;

import co.pragma.ents.common.basemessageformat.v1.ResponseHeaderOut;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import org.apache.cxf.binding.soap.SoapHeader;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;

public class SoapHeaderUtils {

    private static final QName HEADER_QNAME = new QName(
            "http://pragma.co/ents/common/BaseMessageFormat/V1", "responseHeaderOut"
    );

    public static SoapHeader createSoapHeader(ResponseHeaderOut header) throws Exception {
        JAXBContext context = JAXBContext.newInstance(ResponseHeaderOut.class);
        Marshaller marshaller = context.createMarshaller();

        JAXBElement<ResponseHeaderOut> element = new JAXBElement<>(HEADER_QNAME, ResponseHeaderOut.class, header);

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        marshaller.marshal(element, doc);

        SoapHeader soapHeader = new SoapHeader(HEADER_QNAME, doc.getDocumentElement());
        soapHeader.setDirection(SoapHeader.Direction.DIRECTION_OUT);
        return soapHeader;
    }
}
