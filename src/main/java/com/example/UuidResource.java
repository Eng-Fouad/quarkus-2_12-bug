package com.example;

import org.eclipse.microprofile.config.ConfigProvider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/uuid")
public class UuidResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public UUID uuid() {
        return ConfigProvider.getConfig().getValue("quarkus.uuid", UUID.class);
    }
}