/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import helper.SupplierHelper;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Supplier;

/**
 * REST Web Service
 *
 * @author basisd10
 */
@Path("Supplier")
public class SupplierResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SupplierResource
     */
    public SupplierResource() {
    }

    /**
     * Retrieves representation of an instance of services.SupplierResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        SupplierHelper test = new SupplierHelper();
        List<Supplier> list = test.getAllSupplier();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response
                .status(200)
                .entity(json)
                .build();
    }

    /**
     * PUT method for updating or creating an instance of SupplierResource
     * @param content representation for the resource
     */
    @POST
    @Path("addSupplier")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putJson(String data) {
        Gson gson = new Gson();
        Supplier supplier = gson.fromJson(data,Supplier.class);
        SupplierHelper helper = new SupplierHelper();
        helper.addNewSupplier(
                supplier.getIdSupplier(),
                supplier.getNama(),
                supplier.getNoTelp(),
                supplier.getAlamat(),
                supplier.getUsername(),
                supplier.getPassword());   
        return Response
                .status(200)
                .entity(supplier)
                .build();
    }
}
