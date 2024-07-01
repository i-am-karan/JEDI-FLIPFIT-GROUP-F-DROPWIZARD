package com.flipkart.business.interfaces;

import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.model.FlipFitBooking;
import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitUser;

import java.util.List;

//This interface defines methods for managing customer operations within the FlipFit Gym application.
public interface IFlipFitGymCustomer {
    //Retrieves a list of booked slots for a specific user.
    public List<FlipFitBooking> viewBookedSlots(int userId);
    //Checks for booking conflicts for a specific user at a given slot time.
    public FlipFitBooking checkBookingConflicts(int userId, int slotTime);
    //Retrieves a list of all gym centers.
    public List<FlipFitGymCentre> viewCentres();
    //Processes a payment for a specific user.
    public boolean makePayment(int userId);
    //Edits the details of an existing customer.
    public FlipFitGymCustomer editDetails(FlipFitGymCustomer flipFitGymCustomer) throws InvalidChoiceException;
    //Authenticates a customer login using provided user details.
    public FlipFitGymCustomer login(FlipFitUser flipFitUser);
    //Registers a new customer in the system.
    public FlipFitGymCustomer registerCustomer(FlipFitGymCustomer flipFitGymCustomer);
}
