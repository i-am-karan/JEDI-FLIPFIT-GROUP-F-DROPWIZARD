package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitPayments;


/**
 IFlipFitPaymentsDAO interface defines methods for managing payment information within the FlipFit Gym application.
 It includes functionalities to set and delete payment details associated with users.
 */
public interface IFlipFitPaymentsDAO {

    /**
     * setPaymentInfo - It is a method which is used to set or update the payment information for a user.
     It takes FFP as parameter and  FlipFitPayments object containing the payment details to be added or updated.
     This method sets or updates the payment information such as payment type and payment details.
     */
    public void setPaymentInfo(FlipFitPayments FFP);

    /**
     * deletePaymentInfo - It is a method which is used to delete the payment information for a user.
     IThis method removes the specified payment information from the system.
     */
    public void deletePaymentInfo(FlipFitPayments FFP);
}
