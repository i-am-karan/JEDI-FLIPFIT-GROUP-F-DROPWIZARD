package com.flipkart.business;

import com.flipkart.dao.FlipFitGymOwnerDAOImpl;
import com.flipkart.model.FlipFitGymOwner;
import com.flipkart.business.interfaces.IFlipFitGymOwner;
import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;
import com.flipkart.model.FlipFitUser;

import java.util.Scanner;

public class FlipFitGymOwnerBusiness implements IFlipFitGymOwner {
    Scanner scanner = new Scanner(System.in);
    public boolean addCentre() {
        System.out.println("Give the following details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.println("Centre added:> with name " + name + " and city " + city + " and address " + address);

        return true;
    }

    public void viewCentres() {
        System.out.println("Centres listed:> ");
    }
    public void viewFlipFitCustomers() {
        System.out.println("Flip fit customers:> ");
    }
    public void viewPayments() {
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

    public void registerOwner(){
        Scanner sc=new Scanner(System.in);
        FlipFitUser user = new FlipFitUser();
        System.out.println("Enter Name : ");
        String Name = sc.next();
        user.setUserName(Name);
        System.out.println("Enter Phone Number : ");
        String PhoneNumber = sc.next();
        user.setPhoneNumber(PhoneNumber);
        System.out.println("Enter Email : ");
        String Email = sc.next();
        user.setEmailID(Email);
        System.out.println("Enter Password : ");
        String Password = sc.next();
        user.setPassword(Password);

        FlipFitGymOwner owner = new FlipFitGymOwner();
        System.out.println("Enter panID : ");
        String panID = sc.next();
        owner.setPanId(panID);

        System.out.println("Enter Aadhar Number : ");
        String aadharNumber = sc.next();
        owner.setAadharNumber(aadharNumber);

        System.out.println("Enter GST Number : ");
        String gstNumber = sc.next();
        owner.setGSTIN(gstNumber);

        FlipFitGymOwnerDAOImpl flipFitGymOwnerDAO = new FlipFitGymOwnerDAOImpl();
        flipFitGymOwnerDAO.addUser(user);
        flipFitGymOwnerDAO.addGymOwner(owner,user);

    }
}
