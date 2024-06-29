package com.flipkart.dao.interfaces;

import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.model.FlipFitUser;

import java.util.List;

public interface IFlipFitGymOwnerDAO {
    public boolean addCentre(FlipFitGymCentre centre);
    public List<FlipFitGymCentre> viewCentres(FlipFitGymOwner owner);
    List<FlipFitUser> viewFlipFitCustomers(FlipFitGymCentre centre);
    public boolean editDetails(FlipFitGymOwner owner);
    public FlipFitUser addUser(FlipFitUser user);
    public FlipFitGymOwner addGymOwner(FlipFitGymOwner owner, FlipFitUser user);
}