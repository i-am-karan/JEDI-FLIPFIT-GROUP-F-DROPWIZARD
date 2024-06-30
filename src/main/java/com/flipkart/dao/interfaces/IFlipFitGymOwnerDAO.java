package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.model.FlipFitUser;

import java.util.List;

/**
 IFlipFitGymOwnerDAO interface defines methods for gym owner related operations in the FlipFit Gym application.
 It includes functionalities for managing gym centres and viewing customers associated with those centres.
 */
public interface IFlipFitGymOwnerDAO {

    /**
     * addCentre - It is a method which is used to add a new gym centre to the system.
     It takes centre as parameter and FlipFitGymCentre object containing the details of the gym centre to be added.
     FlipFitGymCentre - Returns the added FlipFitGymCentre object after successful addition.
     */
    public FlipFitGymCentre addCentre(FlipFitGymCentre centre);

    /**
     * viewCentres - It is a method which retrieves a list of all gym centres owned by a specific gym owner.
     It takes owner as parameter and FlipFitGymOwner object representing the gym owner whose centres are to be viewed.
     List<FlipFitGymCentre> - Returns a list of FlipFitGymCentre objects representing the centres owned by the specified gym owner.
     */
    public List<FlipFitGymCentre> viewCentres(FlipFitGymOwner owner);

    /**
     * viewFlipFitCustomers - It is a method which retrieves a list of all customers associated with a specific gym centre.
     It takes centre as parameter and FlipFitGymCentre object representing the gym centre whose customers are to be viewed.
     List<FlipFitUser> - Returns a list of FlipFitUser objects representing the customers associated with the specified gym centre.
     */
    List<FlipFitUser> viewFlipFitCustomers(FlipFitGymCentre centre);

    /**
     * editDetails - It is a method which updates the personal details of an existing gym owner.
     It takes owner as parameter and FlipFitGymOwner object containing the updated owner details.
     FlipFitGymOwner - Returns the updated FlipFitGymOwner object after changes have been saved.
     */
    public FlipFitGymOwner editDetails(FlipFitGymOwner owner);

    /**
     * addGymOwner - It is a method which adds a new gym owner to the system along with user details.
     It takes owner as parameter and The FlipFitGymOwner object containing the gym owner's details.
     It takes user as second parameter and The FlipFitUser object containing user account details.
     FlipFitGymOwner - Returns the newly added FlipFitGymOwner object after successful addition.
     */
    public FlipFitGymOwner addGymOwner(FlipFitGymOwner owner, FlipFitUser user);

    /**
     * addUser - It is a method which adds a new user to the system.
     It takes user as parameter and FlipFitUser object containing the user's details.
     *FlipFitUser - Returns the newly added FlipFitUser object after successful addition.
     */
    public FlipFitUser addUser(FlipFitUser user);
}