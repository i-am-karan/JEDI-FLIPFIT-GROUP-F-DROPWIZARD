package com.flipkart.business.interfaces;

import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.model.FlipFitPayments;
import com.flipkart.model.FlipFitUser;
import java.util.List;

public interface IFlipFitGymOwner {
    public FlipFitGymCentre addCentre(FlipFitGymCentre flipFitGymCentre) throws InvalidChoiceException;
    public List<FlipFitGymCentre> viewCentres(FlipFitGymOwner flipFitGymOwner);
    public  List<FlipFitUser> viewFlipFitCustomers(FlipFitGymCentre flipFitGymCentre);
    public List<FlipFitPayments> viewPayments();
    public FlipFitGymOwner editDetails(FlipFitGymOwner flipFitGymOwner) throws InvalidChoiceException;
    public FlipFitGymOwner registerOwner(FlipFitGymOwner owner);
    public FlipFitUser login(FlipFitUser user);
}
