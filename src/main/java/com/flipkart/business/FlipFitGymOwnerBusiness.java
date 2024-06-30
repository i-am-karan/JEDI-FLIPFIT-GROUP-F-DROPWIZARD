package com.flipkart.business;

import com.flipkart.dao.FlipFitGymOwnerDAOImpl;
import com.flipkart.dao.FlipFitGymCustomerDAOImpl;
import com.flipkart.dao.FlipFitGymOwnerDAOImpl;
import com.flipkart.dao.FlipFitUserDAOImpl;
import com.flipkart.dao.interfaces.IFlipFitGymOwnerDAO;
import com.flipkart.model.*;
import com.flipkart.business.interfaces.IFlipFitGymOwner;
import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.business.FlipFitAdminBusiness;
import java.util.List;
import java.util.Scanner;

public class FlipFitGymOwnerBusiness implements IFlipFitGymOwner {
    private final IFlipFitGymOwnerDAO flipFitGymOwnerDAO ;
    public FlipFitGymOwnerBusiness(FlipFitGymOwnerDAOImpl FFOwner){
        this.flipFitGymOwnerDAO= FFOwner;
    }

    public FlipFitGymCentre addCentre(FlipFitGymCentre flipFitGymCentre){
        return flipFitGymOwnerDAO.addCentre(flipFitGymCentre);
    }

    public List<FlipFitGymCentre> viewCentres() {
        System.out.println("Centres listed:> ");
        return null;
    }
    public List<FlipFitGymCustomer> viewFlipFitCustomers() {
        System.out.println("Flip fit customers:> ");
    }
    public List<FlipFitPayments> viewPayments() {
        System.out.println("Payments listed:> ");
    }
    public boolean editDetails() throws InvalidChoiceException {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Select Fields you want to edit ");
            System.out.println("Choose an option:" +
                    "\n 1. Name" +
                    "\n 2. Phone number" +
                    "\n 3. Email" +
                    "\n 4. City" +
                    "\n 5. pincode");
            int choice=sc.nextInt();
            FlipFitGymOwner FOwner = new FlipFitGymOwner();
            switch (choice) {
                case 1: {
                    System.out.println("Enter New Name");
                    String newName = sc.next();
                    FOwner.setUserName(newName);
                    break;
                }
                case 2: {
                    System.out.println("Enter New Phone Number");
                    String newPhoneNumber = sc.next();
                    FOwner.setUserName(newPhoneNumber);
                    break;
                }
                case 3: {
                    System.out.println("Enter New Email");
                    String newEmail = sc.next();
                    FOwner.setUserName(newEmail);
                    break;
                }
                case 4: {
                    System.out.println("Enter New City");
                    String newCity = sc.next();
                    FOwner.setUserName(newCity);
                    break;
                }
                case 5: {
                    System.out.println("Enter New pincode");
                    String newPincode = sc.next();
                    FOwner.setUserName(newPincode);
                    break;
                }
                default: {
                    throw new InvalidChoiceException("Invalid choice entered: " + choice);
                }
            }
            return true;
        }
        catch (InvalidChoiceException e)
        {
            ExceptionHandler.InvalidChoiceEditDetailsMenu(e);
            return false;
        }
    }
    public FlipFitGymOwner registerOwner(FlipFitGymOwner GymOwner) {

        FlipFitUser user = new FlipFitUser();
        user.setPassword(GymOwner.getPassword());
        user.setEmailID(GymOwner.getEmailID());
        user.setPhoneNumber(GymOwner.getPhoneNumber());
        user.setUserName(GymOwner.getUserName());
        user.setRoleID(1);
        flipFitGymOwnerDAO.addUser(user);
        return flipFitGymOwnerDAO.addGymOwner(GymOwner, user);
    }
    @Override
    public FlipFitUser login(FlipFitUser flipFitUser) {
        FlipFitUserDAOImpl userDAO = new FlipFitUserDAOImpl();
        flipFitUser.setRoleID(2);
        userDAO.login(flipFitUser.getEmailID(), flipFitUser.getPassword());
        return flipFitUser;
    }
}
