package com.sky.GetYourWay.rest;


import com.sky.GetYourWay.domain.Booking;
import com.sky.GetYourWay.services.BookingService;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @RequestMapping("/getall/{id}")
    public List<Booking> getAllBookingsByUserID(@PathVariable("id") Integer userID) {
        List<Booking> bookings = new ArrayList<>();
        return bookings;
    }

    @RequestMapping("/getall/{email}")
    public List<Booking> getAllBookingsByEmail(@PathVariable("email") String email) {
        List<Booking> bookings = new ArrayList<>();
        return bookings;
    }
}
