package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitPayments;

//This interface defines methods for managing payment information within the FlipFit Gym application.
public interface IFlipFitPaymentsDAO {
    //This method is used to set or update the payment information for a user.
    public void setPaymentInfo(FlipFitPayments FFP);
    //This method is used to delete the payment information for a user.
    public void deletePaymentInfo(FlipFitPayments FFP);
}
