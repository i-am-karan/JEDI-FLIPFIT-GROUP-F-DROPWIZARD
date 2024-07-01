package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitSlots;

import java.util.ArrayList;
//This interface defines methods for managing gym centres within the FlipFit Gym application.
public interface IFlipFitGymCentreDAO {
        //This method creates a new gym centre in the system.
        public FlipFitGymCentre createGymCentre(FlipFitGymCentre FFGC);
        //This method updates the details of an existing gym centre in the system.
        public FlipFitGymCentre updateGymCentre(FlipFitGymCentre FFGC);
        //This method deletes an existing gym centre from the system.
        public void deleteGymCentre(FlipFitGymCentre FFGC);
        //This method retrieves a list of available slots for a specific gym centre.
        public ArrayList<FlipFitSlots> viewAvailableSlots(FlipFitGymCentre FFGC);
        //This method retrieves a list of gym centres located in a specific city.
        public ArrayList<FlipFitGymCentre> viewCentres(String city);
}
