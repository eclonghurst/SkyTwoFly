package com.sky.GetYourWay.rest;


import com.sky.GetYourWay.domain.Booking;
import com.sky.GetYourWay.domain.BookingRoute;
import com.sky.GetYourWay.dtos.BookingDTO;
import com.sky.GetYourWay.services.BookingRouteService;
import com.sky.GetYourWay.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private final BookingService bookingService;

    @Autowired
    private final BookingRouteService bookingRouteService;

    public BookingController(BookingService bookingService, BookingRouteService bookingRouteService) {
        this.bookingService = bookingService;
        this.bookingRouteService = bookingRouteService;
    }

//    @PostMapping("/create")
//    public ResponseEntity<BookingDTO> makeBooking(@RequestBody Booking booking) {
//        Booking made = this.bookingService.makeBooking(booking);
//        return new ResponseEntity<>(new BookingDTO(made), HttpStatus.CREATED);
//    }

    @PostMapping("/create")
    public ResponseEntity<BookingDTO> makeBooking(@RequestBody Booking booking) {
        List<BookingRoute> routes = booking.getRoutes();
        booking.setRoutes(null);
        Booking made = this.bookingService.makeBooking(booking);
        int id = made.getBookingID();
        for (BookingRoute route : routes) {
            route.setBooking(made);
            bookingRouteService.saveBookingRoute(route);
        }
        return new ResponseEntity<>(new BookingDTO(made), HttpStatus.CREATED);
    }

    @GetMapping("/getall/{id}")
    public ResponseEntity<List<BookingDTO>> getAllBookingsByUserID(@PathVariable("id") Integer userID) {
        List<Booking> bookings;

        bookings = bookingService.getAllBookingsByUserID(userID);
        if (bookings != null) {
            List<BookingDTO> bookingDTOs = new ArrayList<>();
            for (Booking booking : bookings) {
                bookingDTOs.add(new BookingDTO(booking));
            }
            return ResponseEntity.ok(bookingDTOs);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBookingByID(@PathVariable("id") int bookingID) {
        String response = bookingService.deleteBookingByID(bookingID);
        if (response.equals("Booking not found"))
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BookingDTO> getBookingByID(@PathVariable("id") int bookingID) {
        Booking booking = bookingService.getBookingByID(bookingID);
        if (booking != null)
            return ResponseEntity.ok(new BookingDTO(booking));
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
