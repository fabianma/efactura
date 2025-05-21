package com.celsia.tool;


import co.pragma.ents.common.baseextensions.v1.ResponseStatus;
import co.pragma.ents.common.basemessageformat.v1.ResponseHeaderOut;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class ResponseHeaderBuilder {

    public static ResponseHeaderOut build(String messageId, String systemId,String statusCode) {
        ResponseHeaderOut out = new ResponseHeaderOut();
        out.setMessageId(messageId);
        out.setSystemId(systemId);
        out.setInvokerDateTime(getNow());

        ResponseStatus status = new ResponseStatus();
        status.setStatusCode(statusCode);
        out.setResponseStatus(status);
        return out;
    }

    private static XMLGregorianCalendar getNow() {
        LocalDateTime now = LocalDateTime.now();
        GregorianCalendar cal = GregorianCalendar.from(now.atZone(ZoneId.systemDefault()));
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            throw new RuntimeException("Error creating XMLGregorianCalendar", e);
        }
    }
}
