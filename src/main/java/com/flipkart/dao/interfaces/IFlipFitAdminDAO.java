package com.flipkart.dao.interfaces;

import com.flipkart.model.*;

import java.util.List;

//This interface defines methods for managing admin operations within the FlipFit Gym application.
public interface IFlipFitAdminDAO {
    //This method validates the login credentials of an admin user.
    public boolean adminLogin(FlipFitAdmin flipFitAdmin);
    //This method retrieves a list of gym owners who are pending approval.
    public List<FlipFitGymOwner> getPendingOwnerList();
    //This method retrieves a list of gym owners who have been approved.
    public List<FlipFitGymOwner> getApprovedOwnerList();
    //This method retrieves a list of all users in the system.
    public List<FlipFitGymCustomer> getUserList();
    //This method retrieves a list of gym centers owned by a specific gym owner.
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId);
    //This method validates and approves a gym owner based on the provided owner ID.
    public boolean validateOwner(int ownerId);
    //This method deletes a gym owner from the system based on the provided owner ID.
    public boolean deleteOwner(int ownerId);

}