package com.celsia.processor;

import com.celsia.schema.efactura.v1.EfacturaResponseType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

public class invoiceTypeProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        var contents = exchange.getIn().getBody(MessageContentsList.class);
        //var contents = exchange.getIn().getBody(String.class);
        if (contents != null && !contents.isEmpty()){
            Object firstParam = contents.get(0);
            if(firstParam instanceof InvoiceType req){
                System.out.println("Se obtuvo solicitud: " + req.getProfileID().getValue());
            } else {
                throw new IllegalArgumentException("Inexperado parametro: " + firstParam.getClass());
            }
        }else {
            throw new IllegalArgumentException("Cuerpo del mensaje vacio");
        }
        EfacturaResponseType responseType = new EfacturaResponseType();
        responseType.setStatusCode("0");
        exchange.getMessage().setBody(responseType);
    }
}
