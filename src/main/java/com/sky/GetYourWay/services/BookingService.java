package com.sky.GetYourWay.services;

import com.sky.GetYourWay.domain.Booking;
import com.sky.GetYourWay.repo.BookingRepo;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepo bookingRepo;

    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public Booking makeBooking(Booking booking) {
        return bookingRepo.save(booking);
    }


}
