package com.flipkart.business.interfaces;

import com.flipkart.model.FlipFitBooking;

public interface IFlipFitBookings{
    public void makeBooking(FlipFitBooking flipFitBooking);
    public boolean deleteBooking(int bookingId);
}