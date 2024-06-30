package com.flipkart.restController;

import com.flipkart.business.FlipFitAdminBusiness;
import com.flipkart.business.interfaces.IFlipFitAdmin;
import com.flipkart.dao.FlipFitAdminDAOImpl;
import com.flipkart.model.*;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/admin")
@Produces(MediaType.APPLICATION_JSON)



public class AdminController {
    private final IFlipFitAdmin flipFitAdminBusiness;
    @Inject
    public AdminController(FlipFitAdminBusiness flipFitAdmin) {
        this.flipFitAdminBusiness = flipFitAdmin;
    }
    @GET
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean adminLogin(FlipFitAdmin flipFitAdmin) {
        return flipFitAdminBusiness.adminLogin(flipFitAdmin);
    }

    @GET
    @Path("/getPendingOwnerList")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitGymOwner> getPendingOwnerList() {
        return flipFitAdminBusiness.getPendingOwnerList();
    }

    @GET
    @Path("/getApprovedOwnerList")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitGymOwner> getApprovedOwnerList() {
        return flipFitAdminBusiness.getApprovedOwnerList();
    }

    @GET
    @Path("/getCustomersList")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitGymCustomer> getCustomersList() {
        return flipFitAdminBusiness.getUserList();
    }

    @GET
    @Path("/getGymCentreUsingOwnerId/{ownerID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(@PathParam("ownerID") @NotBlank int ownerID) {
        return flipFitAdminBusiness.getGymCentreUsingOwnerId(ownerID);
    }

    @DELETE
    @Path("/deleteOwner/{ownerID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteOwner(@PathParam("ownerID") @NotBlank int ownerID) {
        return flipFitAdminBusiness.deleteOwner(ownerID);
    }

}
