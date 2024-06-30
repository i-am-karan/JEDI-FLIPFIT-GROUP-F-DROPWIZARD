package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.model.FlipFitUser;

import java.util.List;

public interface IFlipFitGymOwnerDAO {
    public FlipFitGymCentre addCentre(FlipFitGymCentre centre);
    public List<FlipFitGymCentre> viewCentresByOwnerID(FlipFitGymOwner owner);
    // List<FlipFitUser> viewFlipFitCustomers(FlipFitGymCentre centre);
    public FlipFitGymOwner editDetails(FlipFitGymOwner owner);
    public FlipFitGymOwner addGymOwner(FlipFitGymOwner owner, FlipFitUser user);
    public FlipFitUser addUser(FlipFitUser user);
}