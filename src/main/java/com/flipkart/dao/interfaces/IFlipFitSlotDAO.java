package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitSlots;

import java.util.List;

//This interface defines methods for managing slot operations within the FlipFit Gym application.
public interface IFlipFitSlotDAO {
    //Adds a new slot to the system.
    public FlipFitSlots addSlot(FlipFitSlots slot);
    //Deletes an existing slot based on the provided slot ID.
    public boolean deleteSlot(int slotId);
    //Updates the details of an existing slot.
    public boolean changeSlot(FlipFitSlots slot);
    //Retrieves all slots associated with a specific slot type ID.
    public List<FlipFitSlots> getAllSlots(int centreID);
    //Retrieves detailed information about a specific slot by its ID.
    public FlipFitSlots getSlotDetailsById(int slotId);
    //Retrieves detailed information about slots based on the start time and centre ID.
    public FlipFitSlots getSlotDetails(int startTime, int centreID);
}
