package com.flipkart.business.interfaces;

import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.model.FlipFitBooking;
import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitUser;

import java.util.List;

public interface IFlipFitGymCustomer {
    public List<FlipFitBooking> viewBookedSlots(int userId);
    public boolean checkBookingConflicts(int userId, int slotTime);
    public List<FlipFitGymCentre> viewCentres();
    public boolean makePayment(int userId);
    public FlipFitGymCustomer editDetails(FlipFitGymCustomer flipFitGymCustomer) throws InvalidChoiceException;
    public FlipFitGymCustomer login(FlipFitUser flipFitUser);
    public FlipFitGymCustomer registerCustomer(FlipFitGymCustomer flipFitGymCustomer);
}
