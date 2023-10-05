package com.sky.GetYourWay.dtos;

import com.sky.GetYourWay.domain.Booking;
import com.sky.GetYourWay.domain.BookingRoute;

import java.util.ArrayList;
import java.util.List;

public class BookingDTO {
    private int bookingID;       //auto-generated

    private String flightNumber;
    private String flightFrom;    //airport codes
    private String flightTo;
    private String cityFrom;    //city names
    private String cityTo;

    private String outboundDate;
    private String localDeparture;   //time
    private String localArrival;

    private boolean returnTrip;            //true if return trip, false if one way
    private String returnDate;          //can be null
    private String localDepartureReturn;   //can be null
    private String localArrivalReturn;     //can be null


    private int adults;              //no. of seats booked
    private int fare;

    private List<BookingRouteDTO> routes;

    private String bookingDate;

    private Integer userID;

    public BookingDTO(Booking booking) {
        super();
        this.bookingID = booking.getBookingID();
        this.flightNumber = booking.getFlightNumber();
        this.flightFrom = booking.getFlightFrom();
        this.flightTo = booking.getFlightTo();
        this.cityFrom = booking.getCityFrom();
        this.cityTo = booking.getCityTo();
        this.outboundDate = booking.getOutboundDate();
        this.localDeparture = booking.getLocalDeparture();
        this.localArrival = booking.getLocalArrival();
        this.returnTrip = booking.isReturnTrip();
        this.returnDate = booking.getReturnDate();
        this.localDepartureReturn = booking.getLocalDepartureReturn();
        this.localArrivalReturn = booking.getLocalArrivalReturn();
        this.adults = booking.getAdults();
        this.fare = booking.getFare();
        routes = new ArrayList<>();

        if (booking.getRoutes() != null) {
            for (BookingRoute route : booking.getRoutes()) {
                this.routes.add(new BookingRouteDTO(route));
            }
        }

        this.bookingDate = booking.getBookingDate();
        this.userID = booking.getUser().getUserId();
    }

    public BookingDTO() {
        super();
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getOutboundDate() {
        return outboundDate;
    }

    public void setOutboundDate(String outboundDate) {
        this.outboundDate = outboundDate;
    }

    public String getLocalDeparture() {
        return localDeparture;
    }

    public void setLocalDeparture(String localDeparture) {
        this.localDeparture = localDeparture;
    }

    public String getLocalArrival() {
        return localArrival;
    }

    public void setLocalArrival(String localArrival) {
        this.localArrival = localArrival;
    }

    public boolean isReturnTrip() {
        return returnTrip;
    }

    public void setReturnTrip(boolean returnTrip) {
        this.returnTrip = returnTrip;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getLocalDepartureReturn() {
        return localDepartureReturn;
    }

    public void setLocalDepartureReturn(String localDepartureReturn) {
        this.localDepartureReturn = localDepartureReturn;
    }

    public String getLocalArrivalReturn() {
        return localArrivalReturn;
    }

    public void setLocalArrivalReturn(String localArrivalReturn) {
        this.localArrivalReturn = localArrivalReturn;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public List<BookingRouteDTO> getRoutes() {
        return routes;
    }

    public void setRoutes(List<BookingRouteDTO> routes) {
        this.routes = routes;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
