package com.celsia.tool;

import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.message.Message;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class BasicAuthInterceptor extends AbstractPhaseInterceptor<Message> {

    private final String validUsername;
    private final String validPassword;

    public BasicAuthInterceptor(String username, String password) {
        super(Phase.PRE_INVOKE); // Intercept before service invocation
        this.validUsername = username;
        this.validPassword = password;
    }

    @Override
    public void handleMessage(Message message) {
        Map<String, List<String>> headers = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);

        List<String> authHeaders = headers.get("Authorization");

        if (authHeaders == null || authHeaders.isEmpty()) {
            throwUnauthorized();
        }

        String authHeader = authHeaders.get(0);
        if (!authHeader.startsWith("Basic ")) {
            throwUnauthorized();
        }

        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = credentials.split(":", 2);

        if (values.length != 2 || !validUsername.equals(values[0]) || !validPassword.equals(values[1])) {
            throwUnauthorized();
        }
    }

    private void throwUnauthorized() {
        throw new SecurityException("Unauthorized: Basic authentication required.");
    }
}
