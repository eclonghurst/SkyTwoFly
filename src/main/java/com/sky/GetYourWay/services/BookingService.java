package com.sky.GetYourWay.services;

import com.sky.GetYourWay.domain.Booking;
import com.sky.GetYourWay.repo.BookingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepo bookingRepo;

    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public Booking makeBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public List<Booking> getAllBookingsByUser(Integer userId) {
        return bookingRepo.findAllByUserId(userId);
    }

    public String deleteBookingByID(int bookingID){
        if (bookingRepo.existsById(bookingID)) {
            bookingRepo.deleteById(bookingID);
            return "Booking deleted";
        }
        else
            return "Booking not found";
    }
}
