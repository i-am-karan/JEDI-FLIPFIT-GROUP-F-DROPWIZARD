package com.flipkart.restController;

import com.flipkart.business.BookingsBusiness;
import com.flipkart.business.FlipFitAdminBusiness;
import com.flipkart.business.FlipFitGymCustomerBusiness;
import com.flipkart.business.interfaces.IFlipFitAdmin;
import com.flipkart.business.interfaces.IFlipFitBookings;
import com.flipkart.dao.FlipFitAdminDAOImpl;
import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.model.FlipFitBooking;
import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import  com.flipkart.business.interfaces.IFlipFitGymCustomer;
import com.flipkart.model.FlipFitUser;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import com.flipkart.dao.interfaces.IFlipFitBookingDAO;
import com.flipkart.business.interfaces.IFlipFitBookings;

@Path("/booking")
@Produces(MediaType.APPLICATION_JSON)

public class BookingController {
    private final IFlipFitBookings bookingService;

    @Inject
    public BookingController(BookingsBusiness bookingsService) {
        this.bookingService = (IFlipFitBookings) bookingsService;
    }
    @POST
    @Path("/add/{centreID}/{startTime}/{userID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public FlipFitBooking addBooking(@PathParam("centreID") @NotBlank int centreID, @PathParam("startTime") @NotBlank int startTime, @PathParam("userID") @NotBlank int userID){
        return bookingService.makeBooking(userID, centreID, startTime);
    }
    @DELETE
    @Path("/delete/{bookingID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteBooking(@PathParam("bookingID") @NotBlank int bookingID){
        return bookingService.deleteBooking(bookingID);
    }

}
