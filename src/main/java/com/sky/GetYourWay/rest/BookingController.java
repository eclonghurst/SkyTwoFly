package com.sky.GetYourWay.rest;


import com.sky.GetYourWay.domain.Booking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private List<Booking> bookings = new ArrayList<>();
}
