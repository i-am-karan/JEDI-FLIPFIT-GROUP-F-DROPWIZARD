package com.flipkart.business.interfaces;

import com.flipkart.model.FlipFitBooking;

//This interface defines methods for handling booking operations within the FlipFit Gym application.
public interface IFlipFitBookings{
    //Creates a new booking for a user at a specific gym center and time slot.
    public FlipFitBooking makeBooking(int userID, int centreID, int startTime);
    //Deletes an existing booking based on the booking ID.
    public boolean deleteBooking(int bookingId);
}