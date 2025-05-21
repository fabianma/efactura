package com.celsia.tool;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

@ApplicationScoped
@Named("customNamespaceMapper")
public class CustomNamespacePrefixMapper extends NamespacePrefixMapper {

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        switch (namespaceUri) {
            case "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2":
                return "inv";
            case "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2":
                return "cbc";
            case "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2":
                return "cac";
            default:
                return suggestion;
        }
    }
}
