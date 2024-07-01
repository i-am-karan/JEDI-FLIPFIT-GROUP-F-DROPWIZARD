package com.flipkart.dao.interfaces;

import com.flipkart.model.*;

import java.util.List;
/**
 IFlipFitGymCustomerDAO interface defines methods for customer-related operations in the FlipFit Gym application.
 This includes viewing and managing booked slots, handling payments, and editing customer details.
 */
public interface IFlipFitGymCustomerDAO {

    /**
     viewBookedSlots - It is a method which retrieves a list of all slots that have been booked by a specific user.
     It takes userId as parameter and unique identifier of the user whose booked slots are to be retrieved.
     List<FlipFitSlots> - Returns a list of FlipFitSlots objects representing the slots booked by the specified user.
     */
    public List<FlipFitSlots> viewBookedSlots(int userID);

    /**
     checkBookingConflicts - It is a method which checks for booking conflicts for a user at a specified slot time.
     It takes userId as parameter and unique identifier of the user.
     It takes slotTime as parameter and time of the slot to check for conflicts.
     FlipFitBooking - Returns a FlipFitBooking object if there is a conflict, otherwise null if no conflict exists.
     */
    public FlipFitBooking checkBookingConflicts(int userId, int slotTime);

    /**
     viewCentres - It is a method which retrieves a list of all gym centres available in the system.
     List<FlipFitGymCentre> - Returns a list of FlipFitGymCentre objects representing all available gym centres.
     */
    public List<FlipFitGymCentre> viewCentres();

    /**
     makePayment -It is a method which processes a payment for a specific user.
     It takes userId as parameter and unique identifier of the user making the payment.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    public boolean makePayment(int userID);

    /**
     viewPaymentDetails - It is a method which retrieves the payment details for a specific user.
     It takes userId as parameter and unique identifier of the user whose payment details are to be viewed.
     And it would fetch payment history or recent transactions.
     */
    public void viewPaymentDetails(int userID);

    /**
     * editPaymentDetails - It is a method which allows editing of payment details for a specific user.
     It takes userId as parameter and unique identifier of the user whose payment details are to be edited.
     */
    public void editPaymentDetails(int userID);

    /**
     * editDetails - It is a method which updates the personal details of an existing gym customer.
     It takes customer as parameter andFlipFitGymCustomer object containing updated customer details.
     FlipFitGymCustomer - Returns the updated FlipFitGymCustomer object after changes have been saved.
     */

    public FlipFitGymCustomer editDetails(FlipFitGymCustomer customer);
    public FlipFitUser addUser(FlipFitUser user);
    /**
     * addCustomer - It is a method which adds a new customer to the system along with user details.
     It takes customer as parameter and FlipFitGymCustomer object containing the customer's details.
     It takes user as second parameter and FlipFitUser object containing user account details.
     FlipFitGymCustomer - Returns the newly added FlipFitGymCustomer object after successful addition.
     */
    public FlipFitGymCustomer addCustomer(FlipFitGymCustomer customer, FlipFitUser user);
}