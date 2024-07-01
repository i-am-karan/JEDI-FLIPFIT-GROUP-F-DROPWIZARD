package com.flipkart.business.interfaces;

import com.flipkart.model.*;

import java.util.List;
//This interface defines methods for managing admin operations within the FlipFit Gym application.
public interface IFlipFitAdmin {
    //Validates the login credentials of an admin user.
    public boolean adminLogin(FlipFitAdmin flipFitAdmin);
    //Retrieves a list of gym owners who are pending approval.
    public List<FlipFitGymOwner> getPendingOwnerList();
    //Retrieves a list of gym owners who have been approved.
    public List<FlipFitGymOwner> getApprovedOwnerList();
    //Retrieves a list of all customers in the system.
    public List<FlipFitGymCustomer> getUserList();
    //Retrieves a list of gym centers owned by a specific owner.
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId);
    //Approves a gym owner based on their owner ID.
    public boolean validateOwner(int ownerId);
    //Deletes a gym owner from the system based on their owner ID.
    public boolean deleteOwner(int ownerId);
}
