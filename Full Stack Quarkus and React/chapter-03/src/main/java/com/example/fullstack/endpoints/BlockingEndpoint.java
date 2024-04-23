package com.example.fullstack.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("blocking-endpoint")
public class BlockingEndpoint {

    @GET
    public String hello() {
        return "Hello World";
    }

}
