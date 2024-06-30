package com.flipkart.restController;
import com.flipkart.business.BookingsBusiness;
import com.flipkart.business.interfaces.IFlipFitBookings;
import com.flipkart.model.FlipFitBooking;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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
