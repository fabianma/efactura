package com.celsia.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class invoiceDataFieldProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        try{
            String invoicexml = exchange.getIn().getBody(String.class);
            // replace namespace
            invoicexml = invoicexml.replace("xmlns:urn2=\"urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2\"", "");
            invoicexml = invoicexml.replace("xmlns=\"urn:celsia:names:specification:ubl:schema:othercompany\"", "");
            // Replace tag prefixes from urn2: to cbc:
            invoicexml = invoicexml.replaceAll("<(/?)urn2:", "<$1cbc:");
            // Optional: clean up extra spaces between tags (if needed)
            invoicexml = invoicexml.replaceAll("\\s{2,}", " ").trim();
            //add Data for cadena
            String dataBlock = """
                    <DATA>
                        <UBL21>true</UBL21>
                    		<Development>
                    			<ShortName>GrupoCelsia</ShortName>
                    		</Development>
                    		<Filters/>
                    </DATA>
                    """;
            int insertPos = invoicexml.lastIndexOf("</");
            String invoicexmlmofied = invoicexml.substring(0,insertPos)+dataBlock+invoicexml.substring(insertPos);
            exchange.getMessage().setBody(invoicexmlmofied);
        }catch (Exception e){
            throw new IllegalArgumentException("Cuerpo de mensaje no se reconoce");
        }

    }
}
