package com.flipkart.dao.interfaces;

import com.flipkart.dao.GetConnection;
import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitSlots;
import com.flipkart.model.FlipFitUser;

import java.sql.*;
import java.util.List;

public interface IFlipFitGymCustomerDAO {
    public List<FlipFitSlots> viewBookedSlots(int userID);
    public boolean checkBookingConflicts(int userID, int slotID);
    public List<FlipFitGymCentre> viewCentres();
    public boolean makePayment(int userID);
    public void viewPaymentDetails(int userID);
    public void editPaymentDetails(int userID);
    public boolean editDetails(FlipFitGymCustomer customer);
    public FlipFitUser addUser(FlipFitUser user);
    public FlipFitGymCustomer addCustomer(FlipFitGymCustomer customer, FlipFitUser user);
}