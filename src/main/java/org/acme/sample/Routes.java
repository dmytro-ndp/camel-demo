package org.acme.sample;

import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("netty-http:http://localhost:8080/hello")
            .setBody(constant("Hello from Camel!"));
    }

}
