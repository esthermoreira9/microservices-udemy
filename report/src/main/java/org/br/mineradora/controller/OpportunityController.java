package org.br.mineradora.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.br.mineradora.service.OpportunityService;

import java.awt.*;
import java.util.Date;

@Path("/api/opportunity")
public class OpportunityController {

    @Inject
    OpportunityService opportunityService;

    @GET
    @Path("/report")

    @Produces({MediaType.APPLICATION_OCTET_STREAM})
    public Response generateReport(){
        try {
            return Response.ok(opportunityService.generateCSVOpportunityReport(),
                            MediaType.APPLICATION_OCTET_STREAM)
                    .header("content_disposition",
                            "attachment; filename = "+ new Date() + "--oportunidades-venda.csv")
                    .build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

}
