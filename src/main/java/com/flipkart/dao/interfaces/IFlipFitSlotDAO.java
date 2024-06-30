package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitSlots;

import java.util.ArrayList;
import java.util.List;


/**
 IFlipFitSlotDAO interface defines the contract for managing gym slot operations in the FlipFit Gym application.
 It provides methods to add, delete, update, and retrieve information about gym slots.
 */
public interface IFlipFitSlotDAO {

    /**
     * addSlot - It is a method which Adds a new slot to the system.
     It takes slot as parameter and FlipFitSlots object containing the slot details to be added.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    public boolean addSlot(FlipFitSlots slot);

    /**
     * deleteSlot - It is a method which Deletes an existing slot based on the provided slot ID.
     It takes slotId as parameter and ID of the slot to be deleted.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    public boolean deleteSlot(int slotId);

    /**
     changeSlot - It is a method which Updates the details of an existing slot.
     It takes slot as parameter and FlipFitSlots object containing the updated slot details.
     boolean - It returns a boolean as true or false which indicates if the deletion was successful or not.
     if successful - true, if not successful - false
     */
    public boolean changeSlot(FlipFitSlots slot);

    /**
     getAllSlots - It is a method which Retrieves all slots associated with a specific slot type ID.
     It takes slotId as parameter and ID of the slot type to retrieve slots for.
     List<FlipFitSlots> - Returns a list of FlipFitSlots objects associated with the given slot type ID.
     */
    public List<FlipFitSlots> getAllSlots(int slotID);

    /**
     getSlotDetailsById - It is a method which Retrieves detailed information about a specific slot by its ID.
     It takes slotId as parameter and ID of the slot to get details for.
     FlipFitSlots - Returns the FlipFitSlots object containing the detailed information of the slot.
     */
    public FlipFitSlots getSlotDetailsById(int slotId);

    /**
     * getSlotDetails - It is a method which Retrieves detailed information about slots based on the start time and centre ID.
     It takes startTime as parameter and start time of the slot to get details for.
     It takes centreId as second parameter and The ID of the centre where the slot is located.
     FlipFitSlots - Returns the FlipFitSlots object containing the slot details matching the given start time and centre ID.
     */
    public FlipFitSlots getSlotDetails(int startTime, int centreID);
}
