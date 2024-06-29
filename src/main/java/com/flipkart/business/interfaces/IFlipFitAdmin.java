package com.flipkart.business.interfaces;

import com.flipkart.model.FlipFitAdmin;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitGymOwner;

import java.util.List;

public interface IFlipFitAdmin {
    public boolean adminLogin(FlipFitAdmin admin);
    public List<FlipFitGymOwner> getPendingOwnerList();
    public List<FlipFitGymCustomer> getUserList();
    public boolean validateOwner(int ownerId);
    public boolean deleteOwner(int ownerId);
}
