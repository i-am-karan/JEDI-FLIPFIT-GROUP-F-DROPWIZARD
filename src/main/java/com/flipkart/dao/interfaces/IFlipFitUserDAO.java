package com.flipkart.dao.interfaces;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitUser;

/**
 IFlipFitUserDAO interface defines methods for managing user operations within the FlipFit Gym application.
 */
public interface IFlipFitUserDAO {

    /**
     login - It is a method which Authenticates a user based on their email ID and password.
     It takes emailId as parameter and email ID of the user attempting to log in.
     It takes password as second parameter and The password associated with the email ID.
     FlipFitGymCustomer - Returns the FlipFitGymCustomer object if the login is successful, otherwise returns null.
     This method validates the user's credentials and returns the user's details if the login is successful.
     If the credentials are incorrect, it returns null.
     */
    public FlipFitGymCustomer login(String emailID, String password);

    /**
     addUser - It is a method which Adds a new user to the system.
     It takes ffu as parameter and FlipFitUser object containing the user's details.
     This method takes a FlipFitUser object and adds it to the system, creating a new user entry.
     */
    public void addUser(FlipFitUser ffu);

    /**
     deleteUser - It is a method which Deletes an existing user from the system.
     It takes ffu as parameter and FlipFitUser object containing the user's details to be deleted.
     This method removes the user identified by the details in the FlipFitUser object from the system,
     effectively removing their access and data.
     */
    public void deleteUser(FlipFitUser ffu);

    /**
     changeUser - It is a method which Updates the details of an existing user.
     This method takes a FlipFitUser object with updated information and modifies the existing user
     details in the system.
     */
    public void changeUser(FlipFitUser ffu);

    /**
     getUser - It is a method which Retrieves detailed information about a specific user by their ID.
     It takes userId as parameter and ID of the user to retrieve details for.
     FlipFitUser - Returns the FlipFitUser object containing the detailed information of the user.
     This method fetches and returns the details of the user identified by the given userID, which can be
     used for viewing or managing the user's information.
     */
    public FlipFitUser getUser(int userID);
}
