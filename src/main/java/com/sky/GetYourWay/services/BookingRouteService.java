package com.sky.GetYourWay.services;

import com.sky.GetYourWay.domain.BookingRoute;
import com.sky.GetYourWay.repo.BookingRouteRepo;
import org.springframework.stereotype.Service;

@Service
public class BookingRouteService {

    private final BookingRouteRepo bookingRouteRepo;

    public BookingRouteService(BookingRouteRepo bookingRouteRepo) {
        this.bookingRouteRepo = bookingRouteRepo;
    }

    public void saveBookingRoute(BookingRoute bookingRoute) {
        bookingRouteRepo.save(bookingRoute);
    }
}
