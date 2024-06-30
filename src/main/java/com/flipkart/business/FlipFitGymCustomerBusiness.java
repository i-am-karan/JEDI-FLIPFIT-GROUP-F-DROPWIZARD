package com.flipkart.business;
import com.flipkart.dao.*;
import com.flipkart.dao.interfaces.IFlipFitAdminDAO;
import com.flipkart.model.*;
import com.flipkart.business.interfaces.IFlipFitGymCustomer;
import java.util.List;
import java.util.Scanner;
import com.flipkart.dao.interfaces.IFlipFitGymCustomerDAO;
import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;

public class FlipFitGymCustomerBusiness implements IFlipFitGymCustomer {
    private final IFlipFitGymCustomerDAO flipFitGymCustomerDAOImpl ;
    public FlipFitGymCustomerBusiness(FlipFitGymCustomerDAOImpl FFAdmin){
        this.flipFitGymCustomerDAOImpl=FFAdmin;
    }

    @Override
    public List<FlipFitBooking> viewBookedSlots(int userId) {

        System.out.println("Viewing booked slots:> ");
        FlipFitBookingDAOImpl bookingDAO = new FlipFitBookingDAOImpl();
        FlipFitSlotDAOImpl slotDAO = new FlipFitSlotDAOImpl();
        List<FlipFitBooking> bookingsList= bookingDAO.getAllBookings(userId);
        for (FlipFitBooking booking : bookingsList) {
            FlipFitSlots slotdetails = slotDAO.getSlotDetailsById(booking.getSlotId());
            System.out.println("Booking ID: " + booking.getBookingId() + "Slot timing " + slotdetails.getSlotTime());
        }
        return bookingsList;
    }

    @Override
    public boolean checkBookingConflicts(int startTime) {
        System.out.println("Checking conflict for slot " + startTime);
        return true;
    }
    @Override
    public List<FlipFitGymCentre> viewCentres() {
        System.out.println("view centres called:> ");
        return null;
    }

    public boolean makePayment(int userId) {
        System.out.println("Make payment called:> ");
        return true;
    }
    public FlipFitGymCustomer editDetails(FlipFitGymCustomer flipFitGymCustomer) throws InvalidChoiceException{
//        try
//        {
//
//
//
//                default: {
//                    throw new InvalidChoiceException("Invalid choice entered: " + choice);
//                }
//            }
//            return null;
//        }
//        catch (InvalidChoiceException e)
//        {
//            ExceptionHandler.InvalidChoiceEditDetailsMenu(e);
//            return null;
//        }
        return  null;
    }
    @Override
    public FlipFitGymCustomer registerCustomer(FlipFitGymCustomer flipFitGymCustomer) {

        FlipFitGymCustomerDAOImpl flipFitGymCustomerDAO = new FlipFitGymCustomerDAOImpl();
        FlipFitUser flipFitUser = new FlipFitUser();
        flipFitUser.setPassword(flipFitGymCustomer.getPassword());
        flipFitUser.setEmailID(flipFitGymCustomer.getEmailID());
        flipFitUser.setPhoneNumber(flipFitGymCustomer.getPhoneNumber());
        flipFitUser.setUserName(flipFitGymCustomer.getUserName());
        flipFitUser.setRoleID(1);
        return flipFitGymCustomerDAOImpl.addCustomer(flipFitGymCustomer, flipFitUser);
    }
    @Override
    public FlipFitGymCustomer login(FlipFitUser flipFitUser) {
        FlipFitUserDAOImpl userDAO = new FlipFitUserDAOImpl();
        flipFitUser.setRoleID(1);
        return userDAO.login(flipFitUser.getEmailID(), flipFitUser.getPassword());
    }
}
