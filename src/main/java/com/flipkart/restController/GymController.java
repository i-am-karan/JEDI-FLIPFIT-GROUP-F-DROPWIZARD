package com.flipkart.restController;
import com.flipkart.model.*;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import com.flipkart.business.interfaces.IFlipFitGymCentre;
import com.flipkart.business.FlipFitGymCentreBusiness;
@Path("/centre")
@Produces(MediaType.APPLICATION_JSON)

public class GymController {
    private final IFlipFitGymCentre flipFitGymCentreBusiness;

    @Inject
    public GymController(FlipFitGymCentreBusiness flipFitGymCentreService) {
        this.flipFitGymCentreBusiness = flipFitGymCentreService;
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public FlipFitGymCentre updateGymCentre(FlipFitGymCentre flipFitGymCentre){
       return flipFitGymCentreBusiness.updateGymCentre(flipFitGymCentre);
    }
    @DELETE
    @Path("/delete/centreID={centreID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteGymCentre(@PathParam("centreID") int centreID){
        return flipFitGymCentreBusiness.deleteGymCentre(centreID);
    }
    @GET
    @Path("/viewSlots/centreID={centreID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<FlipFitSlots> viewAvailableSlots(@PathParam("centreID") int centreID){
        return flipFitGymCentreBusiness.viewAvailableSlots(centreID);
    }



}
