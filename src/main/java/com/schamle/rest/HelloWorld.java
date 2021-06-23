package com.schamle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorld {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloMessage get() {
        return new HelloMessage();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public HelloMessage getName(@PathParam("name") String name) {
        HelloMessage message = new HelloMessage();
        message.setName(name);
        return message;
    }
}
