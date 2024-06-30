package com.flipkart.restController;

import com.flipkart.business.FlipFitAdminBusiness;
import com.flipkart.business.interfaces.IFlipFitAdmin;
import com.flipkart.dao.FlipFitAdminDAOImpl;
import com.flipkart.model.FlipFitAdmin;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
}
