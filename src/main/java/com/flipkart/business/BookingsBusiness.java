package com.flipkart.business;
import com.flipkart.dao.FlipFitGymCustomerDAOImpl;
import com.flipkart.dao.interfaces.IFlipFitBookingDAO;
import com.flipkart.dao.interfaces.IFlipFitGymCustomerDAO;
import com.flipkart.model.FlipFitBooking;
import com.flipkart.model.FlipFitSlots;
import com.flipkart.dao.FlipFitBookingDAOImpl;
import com.flipkart.dao.FlipFitSlotDAOImpl;
import com.flipkart.business.FlipFitGymCustomerBusiness;
import java.util.Random;

public class BookingsBusiness {
    private final IFlipFitBookingDAO bookingDAO ;
    public BookingsBusiness(FlipFitBookingDAOImpl FFBooking){
        this.bookingDAO=FFBooking;
    }

    public FlipFitBooking makeBooking(int userID, int centreID, int startTime) {

//        System.out.println("Making a booking for " + userID);
        FlipFitSlotDAOImpl slotDAO=new FlipFitSlotDAOImpl();
        FlipFitSlots slotdetails = slotDAO.getSlotDetails(startTime, centreID);
        FlipFitGymCustomerBusiness flipFitGymCustomerBusiness = new FlipFitGymCustomerBusiness();
        if(slotdetails.getSeatsAvailable() > 0) {
            FlipFitBooking booking = flipFitGymCustomerBusiness.checkBookingConflicts(userID, startTime);
            if(booking != null) {
                deleteBooking(booking.getBookingId());
            }
            booking = new FlipFitBooking();
            booking.setSlotId(slotdetails.getSlotId());
            booking.setSlotTime(slotdetails.getSlotTime());
            booking.setUserId(userID);
            booking.setIsdeleted(false);

            bookingDAO.makeBooking(booking);
//            System.out.println("Booking completed");

            FlipFitSlots currflipFitSlots = slotdetails;
            currflipFitSlots.setSeatsAvailable(currflipFitSlots.getSeatsAvailable() - 1);
            FlipFitSlotsBusiness flipFitSlotsBusiness = new FlipFitSlotsBusiness();

            flipFitSlotsBusiness.updateAvailability(currflipFitSlots);
            return booking;
        }
        return null;
    }

    public boolean deleteBooking(int bookingId) {
//        System.out.println("Deleting a booking for " + bookingId);
        FlipFitBookingDAOImpl bookingDAO = new FlipFitBookingDAOImpl();
        FlipFitBooking bookingDetails = bookingDAO.getBookingDetailsByBookingId(bookingId);

        int slotId = bookingDetails.getSlotId();
        FlipFitSlotsBusiness flipFitSlotsBusiness = new FlipFitSlotsBusiness();
        FlipFitSlotDAOImpl flipFitSlotDAO = new FlipFitSlotDAOImpl();
        FlipFitSlots flipFitSlots = flipFitSlotDAO.getSlotDetailsById(slotId);
        FlipFitSlots currflipFitSlots = flipFitSlots;
        currflipFitSlots.setSeatsAvailable(flipFitSlots.getSeatsAvailable()+1);
        flipFitSlotsBusiness.updateAvailability(currflipFitSlots);

        bookingDAO.deleteBooking(bookingId);
        return true;
    }
}
