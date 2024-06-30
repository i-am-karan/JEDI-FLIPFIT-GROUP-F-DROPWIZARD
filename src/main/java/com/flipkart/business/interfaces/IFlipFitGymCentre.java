package com.flipkart.business.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitSlots;

import java.util.List;

public interface IFlipFitGymCentre {
    public FlipFitGymCentre updateGymCentre(FlipFitGymCentre flipFitGymCentre);
    public boolean deleteGymCentre(int centreId);
    public List<FlipFitSlots> viewAvailableSlots(int centreId);
}
