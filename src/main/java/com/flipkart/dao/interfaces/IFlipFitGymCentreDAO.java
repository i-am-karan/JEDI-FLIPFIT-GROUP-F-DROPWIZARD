package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitSlots;

import java.util.ArrayList;

/**
 IFlipFitGymCentreDAO interface defines methods for managing gym centres within the FlipFit Gym application.
 It includes operations for creating, updating, deleting gym centres, and viewing available slots and centres.
 */
public interface IFlipFitGymCentreDAO {

        /**
         * createGymCentre - It is a method which creates a new gym centre in the system.
         It takes FFGG as parameter and FlipFitGymCentre object containing details of the gym centre to be created.
         FlipFitGymCentre - Returns the FlipFitGymCentre object after it has been created and added to the system.
         */
        public FlipFitGymCentre createGymCentre(FlipFitGymCentre FFGC);

        /**
         updateGymCentre - It is a method which updates the details of an existing gym centre in the system.
         It takes FFGG as parameter and FlipFitGymCentre object containing the updated details of the gym centre.
         FlipFitGymCentre - Returns the updated FlipFitGymCentre object after the changes have been saved.
         */
        public FlipFitGymCentre updateGymCentre(FlipFitGymCentre FFGC);

        /**
         * deleteGymCentre - It is a method which deletes an existing gym centre from the system.
         It takes FFGG as parameter and FlipFitGymCentre object representing the gym centre to be deleted.
         Typically, it would include the unique identifier for the gym centre to locate it in the system.
         */
        public void deleteGymCentre(FlipFitGymCentre FFGC);

        /**
         viewAvailableSlots - It is a method which retrieves a list of available slots for a specific gym centre.
         It takes FFGG as parameter and FlipFitGymCentre object representing the gym centre whose available slots are to be retrieved.
         And, it would include the unique identifier for the gym centre.
         ArrayList<FlipFitSlots> - Returns an ArrayList of FlipFitSlots objects representing the available slots for the specified gym centre.
         */
        public ArrayList<FlipFitSlots> viewAvailableSlots(FlipFitGymCentre FFGC);

        /**
         viewCentres - It is a method which retrieves a list of gym centres located in a specific city.
         It takes city as parameter and name of the city for which to retrieve the list of gym centres.
         ArrayList<FlipFitGymCentre> - Returns an ArrayList of FlipFitGymCentre objects representing the gym centres located in the specified city.
         */
        public ArrayList<FlipFitGymCentre> viewCentres(String city);
}
