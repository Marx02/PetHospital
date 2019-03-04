/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.google.gson.Gson;
import dto.PetsDTO;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author caspe
 */
@Path("rest")
public class Pets {

    DataFacade df = new DataFacade();
    Gson gs = new Gson();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Pets
     */
    public Pets() {
    }

    /**
     * Retrieves representation of an instance of data.Pets
     *
     * @return an instance of java.lang.Integer
     */
    @GET
    @Path("/petall")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPetAll() {
        List<PetsDTO> petList = df.getAllPetsDTO();

        return Response.ok().entity(gs.toJson(petList)).build();
    }

    @GET
    @Path("/petcount")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPetCount() {
        List<PetsDTO> petList = df.getAllPetsDTO();

        return Response.ok().entity(gs.toJson("petCount" + " " + petList.size())).build();
    }

    /**
     * PUT method for updating or creating an instance of Pets
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
