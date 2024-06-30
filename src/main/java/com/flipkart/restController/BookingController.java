package com.flipkart.restController;
import com.flipkart.business.BookingsBusiness;
import com.flipkart.model.FlipFitBooking;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/booking")
@Produces(MediaType.APPLICATION_JSON)

public class BookingController {
    private final BookingsBusiness bookingService;

    @Inject
    public BookingController(BookingsBusiness bookingsService) {
        this.bookingService =  bookingsService;
    }
    @POST
    @Path("/add/centreID={centreID}/startTime={startTime}/userID={userID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public FlipFitBooking addBooking(@PathParam("centreID") int centreID, @PathParam("startTime") int startTime, @PathParam("userID") int userID){
        return bookingService.makeBooking(userID, centreID, startTime);
    }
    @DELETE
    @Path("/delete/{bookingID}")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteBooking(@PathParam("bookingID") int bookingID){
        return bookingService.deleteBooking(bookingID);
    }

}
