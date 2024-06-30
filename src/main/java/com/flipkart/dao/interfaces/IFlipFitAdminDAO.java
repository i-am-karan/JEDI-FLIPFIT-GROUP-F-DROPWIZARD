package com.flipkart.dao.interfaces;

import com.flipkart.model.*;

import java.util.List;

/**
 IFlipFitAdminDAO interface defines methods for managing admin operations within the FlipFit Gym application.
 */
public interface IFlipFitAdminDAO {

    /**
     adminLogin - It is a method to validate the login credentials of an admin user.
     It takes FlipFitAdmin as a parameter and object containing login credentials.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    public boolean adminLogin(FlipFitAdmin flipFitAdmin);

    /**
     getPendingOwnerList - It is a method which Retrieves a list of gym owners who are pending approval.
     It returns a List of FlipFitGymOwner objects representing pending gym owners.*/
    public List<FlipFitGymOwner> getPendingOwnerList();

    /**
     getApprovedOwnerList - It is a method which retrieves a list of gym owners who have been approved.
     List<FlipFitGymOwner> - It returns a list of FlipFitGymOwner objects representing approved gym owners.
     */
    public List<FlipFitGymOwner> getApprovedOwnerList();

    /**
     getUserList - It is a method which retrieves a list of all users in the system.
     List<FlipFitGymCustomer> - It returns a list of FlipFitGymCustomer objects representing all users.
     */
    public List<FlipFitGymCustomer> getUserList();

    /**
     getGymCentreUsingOwnerId - It is a method which retrieves a list of gym centers owned by a specific gym owner.
     It takes ownerId as parameter and ID of the gym owner.
     List<FlipFitGymCentre> - It returns a list of FlipFitGymCentre objects representing the gym centers owned by the specified owner.
     */
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId);

    /**
     validateOwner - It is a method which validates and approves a gym owner based on the provided owner ID.
     It takes ownerId as parameter and ID of the gym owner to be validated.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false.
     */
    public boolean validateOwner(int ownerId);

    /**
     deleteOwner - It is a method which deletes a gym owner from the system based on the provided owner ID.
     It takes ownerId as parameter and ID of the gym owner to be deleted.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    public boolean deleteOwner(int ownerId);

    /**
     addUser - It is a method which adds a new user to the system.
     It takes user as parameter and FlipFitUser object containing the user's details.
     FlipFitUser - Returns the FlipFitUser object after it has been added to the system.
     */
    public FlipFitUser addUser(FlipFitUser user);

    /**
     addGymOwner - It is a method which  adds a new gym owner to the system.
     It takes owner as parameter and FlipFitGymOwner object containing the gym owner's details.
     It takes user as second parameter and FlipFitUser object associated with the gym owner, containing user details.
     FlipFitGymOwner - Returns the FlipFitGymOwner object after it has been added to the system.
     */
    public FlipFitGymOwner addGymOwner(FlipFitGymOwner owner, FlipFitUser user);
}