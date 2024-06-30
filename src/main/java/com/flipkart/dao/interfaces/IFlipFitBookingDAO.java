package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitBooking;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.model.FlipFitUser;

import java.util.ArrayList;
import java.util.List;

public interface IFlipFitBookingDAO {
    public FlipFitBooking makeBooking(FlipFitBooking booking);
    boolean deleteBooking(int bookingId);
    public List<FlipFitBooking> getAllBookings(int userId);
    public List<FlipFitBooking> getBookingDetails(int bookingId);
    public List<FlipFitBooking> bookings = new ArrayList<>();
}
