package com.schamle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorld {
    @GET
    public String get() {
        return "Hello World";
    }
}
