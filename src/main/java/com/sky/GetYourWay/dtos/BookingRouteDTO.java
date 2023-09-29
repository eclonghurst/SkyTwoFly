package com.sky.GetYourWay.dtos;

import com.sky.GetYourWay.domain.Booking;
import com.sky.GetYourWay.domain.BookingRoute;

import javax.persistence.ManyToOne;

public class BookingRouteDTO {
    private String routeID;

    private Integer bookingID;

    private String airportFrom;
    private String airportTo;
    private String cityFrom;
    private String cityTo;
    private String localDeparture;
    private String localArrival;
    private String airline;
    private String cabin;
    private Boolean partOfReturnTrip;

    public BookingRouteDTO(BookingRoute route) {
        super();
        this.routeID = route.getRouteID();
        this.bookingID = route.getBooking().getBookingID();
        this.airportFrom = route.getAirportFrom();
        this.airportTo = route.getAirportTo();
        this.cityFrom = route.getCityFrom();
        this.cityTo = route.getCityTo();
        this.localDeparture = route.getLocalDeparture();
        this.localArrival = route.getLocalArrival();
        this.airline = route.getAirline();
        this.cabin = route.getCabin();
        this.partOfReturnTrip = route.isPartOfReturnTrip();
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
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

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public Boolean isPartOfReturnTrip() {
        return partOfReturnTrip;
    }

    public void setPartOfReturnTrip(Boolean partOfReturnTrip) {
        this.partOfReturnTrip = partOfReturnTrip;
    }
}
