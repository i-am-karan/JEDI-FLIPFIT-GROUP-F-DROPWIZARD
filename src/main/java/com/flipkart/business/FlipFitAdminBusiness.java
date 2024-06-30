package com.flipkart.business;

import com.flipkart.dao.interfaces.IFlipFitAdminDAO;
import com.flipkart.model.FlipFitAdmin;
import com.flipkart.model.FlipFitGymCentre;
import com.flipkart.model.FlipFitGymCustomer;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.business.interfaces.IFlipFitAdmin;
import com.flipkart.dao.FlipFitAdminDAOImpl;

import java.util.List;

public class FlipFitAdminBusiness implements IFlipFitAdmin {
    private final IFlipFitAdminDAO flipFitAdminDAOImpl ;
    public FlipFitAdminBusiness(FlipFitAdminDAOImpl FFAdmin){
        this.flipFitAdminDAOImpl=FFAdmin;
    }

    public boolean adminLogin(FlipFitAdmin flipFitAdmin){
        System.out.println("AdminUserBusiness.adminLogin");
        return flipFitAdminDAOImpl.adminLogin(flipFitAdmin);
    }
    public List<FlipFitGymOwner> getPendingOwnerList(){
        System.out.println("AdminUserBusiness.getPendingOwnerList");
        FlipFitAdminDAOImpl flipFitAdminDAOImpl=new FlipFitAdminDAOImpl();
        return flipFitAdminDAOImpl.getPendingOwnerList();
    }
    public List<FlipFitGymOwner> getApprovedOwnerList(){
        System.out.println("AdminUserBusiness.getApprovedOwnerList");
        FlipFitAdminDAOImpl flipFitAdminDAOImpl=new FlipFitAdminDAOImpl();
        return flipFitAdminDAOImpl.getApprovedOwnerList();
    }
    public List<FlipFitGymCustomer> getUserList(){
        System.out.println("AdminUserBusiness.getUserList");
        FlipFitAdminDAOImpl flipFitAdminDAOImpl=new FlipFitAdminDAOImpl();
        return flipFitAdminDAOImpl.getUserList();
    }
    public boolean validateOwner(int ownerId){
        System.out.println("AdminUserBusiness.validateOwner "+ownerId);
        FlipFitAdminDAOImpl flipFitAdminDAOImpl=new FlipFitAdminDAOImpl();
        flipFitAdminDAOImpl.validateOwner(ownerId);
        return true;
    }
    public boolean deleteOwner(int ownerId){
        System.out.println("AdminUserBusiness.deleteOwner" + ownerId);
        FlipFitAdminDAOImpl flipFitAdminDAOImpl=new FlipFitAdminDAOImpl();
        flipFitAdminDAOImpl.deleteOwner(ownerId);
        return true;
    }
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId){
        System.out.println("AdminUserBusiness.getGymCentreUsingOwnerId "+ownerId);
        FlipFitAdminDAOImpl flipFitAdminDAOImpl=new FlipFitAdminDAOImpl();
        return flipFitAdminDAOImpl.getGymCentreUsingOwnerId(ownerId);
    }

}
