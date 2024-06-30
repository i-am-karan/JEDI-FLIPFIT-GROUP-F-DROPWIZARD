package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitSlots;
import com.flipkart.model.FlipFitUser;

import java.util.List;

public interface IFlipFitGymCustomerDAO {
    public List<FlipFitSlots> viewBookedSlots(int userID);
    public boolean checkBookingConflicts(int userId, int slotTime);
    public List<FlipFitGymCentre> viewCentres();
    public boolean makePayment(int userID);
    public void viewPaymentDetails(int userID);
    public void editPaymentDetails(int userID);
    public FlipFitGymCustomer editDetails(FlipFitGymCustomer customer);
    public FlipFitGymCustomer addCustomer(FlipFitGymCustomer customer, FlipFitUser user);
}