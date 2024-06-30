package com.flipkart.restController;

import com.flipkart.business.FlipFitAdminBusiness;
import com.flipkart.business.FlipFitGymCustomerBusiness;
import com.flipkart.business.interfaces.IFlipFitAdmin;
import com.flipkart.dao.FlipFitAdminDAOImpl;
import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.model.*;
import  com.flipkart.business.interfaces.IFlipFitGymCustomer;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import com.flipkart.business.interfaces.IFlipFitGymOwner;
import com.flipkart.business.FlipFitGymOwnerBusiness;
@Path("/owner")
@Produces(MediaType.APPLICATION_JSON)

public class OwnerController {
    private final IFlipFitGymOwner flipFitGymOwnerBusiness;
    private FlipFitGymOwner flipFitOwner;
    @Inject
    public OwnerController(FlipFitGymOwnerBusiness flipFitGymOwnerService) {
        this.flipFitGymOwnerBusiness = flipFitGymOwnerService;
    }
//    @POST
//    @Path("/login")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public FlipFitGymOwner login(FlipFitUser user){
//        flipFitGymOwnerBusiness.login(user);
//        this.flipFitOwner = owner;
//        return owner;
//    }
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public FlipFitGymOwner register(FlipFitGymOwner flipFitGymOwner){
        FlipFitGymOwner owner = flipFitGymOwnerBusiness.registerOwner(flipFitGymOwner);
        this.flipFitOwner = owner;
        return owner;
    }

    @POST
    @Path("/addCentre")
    @Consumes(MediaType.APPLICATION_JSON)
    public FlipFitGymCentre addGymCentre(FlipFitGymCentre flipFitGymCentre) throws InvalidChoiceException{
//        flipFitGymCentre.setOwnerID(flipFitOwner.getUserId());
        return flipFitGymOwnerBusiness.addCentre(flipFitGymCentre) ;
    }
    @GET
    @Path("/viewCentres")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitGymCentre> viewCentres(){
        return flipFitGymOwnerBusiness.viewCentres(flipFitOwner);
    }
    @GET
    @Path("/viewCustomers/{centreID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitUser> viewFlipFitCustomers(@PathParam("centreID") @NotBlank int centreID){
        FlipFitGymCentre flipFitGymCentre = new FlipFitGymCentre();
        flipFitGymCentre.setCentreID(centreID);
        return flipFitGymOwnerBusiness.viewFlipFitCustomers(flipFitGymCentre);
    }
    @PUT
    @Path("/editDetails")
    @Consumes(MediaType.APPLICATION_JSON)
    public FlipFitGymOwner editDetails(FlipFitGymOwner flipFitGymOwner) throws InvalidChoiceException{
        return flipFitGymOwnerBusiness.editDetails(flipFitGymOwner);
    }
}
