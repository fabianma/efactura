package com.celsia.tool;

import com.celsia.schema.efactura.v1.EfacturaResponseType;
import com.celsia.schema.efactura.v1.ReasonType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EfacturaResponseBuilder {

    public static EfacturaResponseType fromJson(String json,String httpStatusCode) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);

        EfacturaResponseType response = new EfacturaResponseType();

        if (root.path("statusCode").isEmpty()) {
            response.setStatusCode(httpStatusCode);
        } else {
            response.setStatusCode(root.path("statusCode").asText());
        }

        response.setTrackId(root.path("trackId").asText(null));
        response.setUUID(root.path("uuid").asText(null));

        if (!root.path("message").isNull()) {
            response.setErrorMessage(root.path("message").asText(null));
        } else {
            ReasonType reason = new ReasonType();
            JsonNode errorReason = root.path("errorReason");
            if (errorReason.isArray()) {
                for (JsonNode node : errorReason) {
                    reason.getRule().add(node.asText());
                }
            } else if (!errorReason.isMissingNode()) {
                reason.getRule().add(errorReason.asText());
            }
            response.setErrorReason(reason);
        }
        return response;
    }

    public static EfacturaResponseType fromJsonSucces(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);

        EfacturaResponseType response = new EfacturaResponseType();
        response.setStatusCode(root.path("statusCode").asText());
        if (root.path("trackId").isEmpty()) {
            response.setTrackId(root.path("trackId").asText());
        }
        if (root.path("uuid").isEmpty()) {
            response.setUUID(root.path("uuid").asText());
        }
        if (root.path("statusMessage").isEmpty()) {
            response.setStatusMessage(root.path("statusMessage").asText());
        }
        if (root.path("statusDescription").isEmpty()) {
            response.setStatusDescription(root.path("statusDescription").asText());
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
            response.setStatusDescription(description);
        } else {
            errortype.getRule().add(root.path("errorReason").asText());
            response.setErrorReason(errortype);
        }
        if (root.path("qrCode").isEmpty()) {
            response.setQrCode(root.path("qrCode").asText());
        }
        if (root.path("validationDate").isEmpty()) {
            response.setValidationDate(root.path("validationDate").asText());
        }

        return response;
    }
}
