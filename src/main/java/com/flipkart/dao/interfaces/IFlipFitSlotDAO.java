package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitSlots;

import java.util.ArrayList;
import java.util.List;

public interface IFlipFitSlotDAO {
    public boolean addSlot(FlipFitSlots slot);
    public boolean deleteSlot(int slotId);
    public boolean changeSlot(FlipFitSlots slot);
    public List<FlipFitSlots> getAllSlots(int centreID);
    public FlipFitSlots getSlotDetailsById(int slotId);
    public FlipFitSlots getSlotDetails(int startTime, int centreID);
}
