package com.sky.GetYourWay.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

//@Entity
public class Booking {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int bookingId;

    //@ManyToOne
    private User user;

    //@NotNull
    private String flightOutboundId;

    private String flightInboundId;

    private LocalDate bookingDate;

    private int seatsBooked;

    public Booking() {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFlightOutboundId() {
        return flightOutboundId;
    }

    public void setFlightOutboundId(String flightOutboundId) {
        this.flightOutboundId = flightOutboundId;
    }

    public String getFlightInboundId() {
        return flightInboundId;
    }

    public void setFlightInboundId(String flightInboundId) {
        this.flightInboundId = flightInboundId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
}
