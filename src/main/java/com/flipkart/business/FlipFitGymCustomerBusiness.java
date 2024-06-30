package com.flipkart.business;
import com.flipkart.dao.FlipFitGymCustomerDAOImpl;
import com.flipkart.model.*;
import com.flipkart.business.interfaces.IFlipFitGymCustomer;
import java.util.List;
import java.util.Scanner;

import com.flipkart.dao.FlipFitBookingDAOImpl;
import com.flipkart.dao.FlipFitSlotDAOImpl;
import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;

public class FlipFitGymCustomerBusiness implements  IFlipFitGymCustomer {

    @Override
    public void viewBookedSlots(int userId) {

        System.out.println("Viewing booked slots:> ");
        FlipFitBookingDAOImpl bookingDAO = new FlipFitBookingDAOImpl();
        FlipFitSlotDAOImpl slotDAO = new FlipFitSlotDAOImpl();
        List<FlipFitBooking> bookingsList= bookingDAO.getAllBookings(userId);
        for (FlipFitBooking booking : bookingsList) {
            FlipFitSlots slotdetails = slotDAO.getSlotDetailsById(booking.getSlotId());
            System.out.println("Booking ID: " + booking.getBookingId() + "Slot timing " + slotdetails.getSlotTime());
        }

    }

    @Override
    public boolean checkBookingConflicts(int userId, int slodId) {
        return false;
    }

    public boolean checkBookingConflicts(int userId, String slot) {
        System.out.println("Checking conflict for slot " + slot);
        return true;
    }
    public void viewCentres() {
        System.out.println("view centres called:> ");
    }
    public boolean makePayment(int userId) {
        System.out.println("Make payment called:> ");
        return true;
    }
    public boolean editDetails(int userId) throws InvalidChoiceException{
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

    @Override
    public void registerCustomer() {
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

        FlipFitGymCustomer customer=new FlipFitGymCustomer();
        System.out.println("Enter Payment Type : 1. UPI  2. Cards");
        int paymentType=sc.nextInt();

        FlipFitGymCustomerDAOImpl flipFitGymCustomerDAO = new FlipFitGymCustomerDAOImpl();
        flipFitGymCustomerDAO.addUser(user);
        flipFitGymCustomerDAO.addCustomer(customer,user);
    }
}
