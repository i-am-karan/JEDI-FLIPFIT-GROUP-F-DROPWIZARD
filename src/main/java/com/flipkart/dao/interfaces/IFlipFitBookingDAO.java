package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitBooking;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.model.FlipFitUser;

import java.util.ArrayList;
import java.util.List;


/**
 IFlipFitBookingDAO interface defines methods for managing booking operations within the FlipFit Gym application.
 */
public interface IFlipFitBookingDAO {

    /**
     makeBooking - It is a method which creates a new booking in the system.
     It takes booking as parameter and FlipFitBooking object containing the details of the booking to be made.
     FlipFitBooking - Returns the FlipFitBooking object after it has been created and added to the system.
     */
    public FlipFitBooking makeBooking(FlipFitBooking booking);

    /**
     deleteBooking - It is a method which deletes an existing booking from the system.
     It takes bookingId as parameter and ID of the booking to be deleted.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    boolean deleteBooking(int bookingId);

    /**
     getAllBookings - It is a method which retrieves all bookings made by a specific user.
     It takes userId as parameter and ID of the user whose bookings are to be retrieved.
     List<FlipFitBooking> - Returns a list of FlipFitBooking objects representing all bookings made by the specified user.
     */
    public List<FlipFitBooking> getAllBookings(int userId);

    /**
     getBookingDetails - It is a method which retrieves detailed information about a specific booking.
     It takes bookingId as parameter and ID of the booking whose details are to be retrieved.
     List<FlipFitBooking> - Returns a list of FlipFitBooking objects with detailed information about the specified booking.
     The list contains one FlipFitBooking object with the booking details.
     */
    public List<FlipFitBooking> getBookingDetails(int bookingId);

    /**
     bookings - This is a list which is used to store or reference all booking records.
     It is declared here as an empty ArrayList, potentially to be utilized by implementing classes.
     */
    public List<FlipFitBooking> bookings = new ArrayList<>();
}
