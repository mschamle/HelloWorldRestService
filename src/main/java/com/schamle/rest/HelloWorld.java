package com.schamle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloWorld {
    @GET
    public Response get() {
        return Response.status(200).entity("Hello World").build();
    }

    @GET
    @Path("{name}")
    public Response getName(@PathParam("name") String name) {
        return Response.status(200).entity("Hello " + name).build();
    }
}
