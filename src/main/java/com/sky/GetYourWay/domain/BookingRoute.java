package com.sky.GetYourWay.domain;

import com.sky.GetYourWay.domain.APIObjects.Route;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class BookingRoute {

    @Id
    private String routeID;

    @ManyToOne
    private Booking booking;

    private String airportFrom;
    private String airportTo;
    private String cityFrom;
    private String cityTo;
    private String localDeparture;
    private String localArrival;
    private String airline;
    private String cabin;
    private boolean partOfReturnTrip;  //true if part of return trip, false if part of outbound/one way

    public BookingRoute() {
        super();
    }

    public BookingRoute(String routeID, Booking booking, String airportFrom, String airportTo, String cityFrom, String cityTo, String localDeparture, String localArrival, String airline, String cabin, boolean partOfReturnTrip) {
        this.routeID = routeID;
        this.booking = booking;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.localDeparture = localDeparture;
        this.localArrival = localArrival;
        this.airline = airline;
        this.cabin = cabin;
        this.partOfReturnTrip = partOfReturnTrip;
    }

    public BookingRoute(Booking booking, Route route){
        this.routeID = route.getId();
        this.booking = booking;
        this.airportFrom = route.getFlyFrom();
        this.airportTo = route.getFlyTo();
        this.cityFrom = route.getCityFrom();
        this.cityTo = route.getCityTo();
        this.localDeparture = route.getLocalDeparture();
        this.localArrival = route.getLocalArrival();
        this.airline = route.getAirline();
        this.cabin = route.getFareCategory();
        this.partOfReturnTrip = route.getReturn() != 0; //if return is 0, then it is not part of a return trip
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingRoute that = (BookingRoute) o;
        return partOfReturnTrip == that.partOfReturnTrip && Objects.equals(routeID, that.routeID) && Objects.equals(booking, that.booking) && Objects.equals(airportFrom, that.airportFrom) && Objects.equals(airportTo, that.airportTo) && Objects.equals(cityFrom, that.cityFrom) && Objects.equals(cityTo, that.cityTo) && Objects.equals(localDeparture, that.localDeparture) && Objects.equals(localArrival, that.localArrival) && Objects.equals(airline, that.airline) && Objects.equals(cabin, that.cabin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeID, booking, airportFrom, airportTo, cityFrom, cityTo, localDeparture, localArrival, airline, cabin, partOfReturnTrip);
    }

    @Override
    public String toString() {
        return "BookingRoute{" +
                "routeID='" + routeID + '\'' +
                ", booking=" + booking.getBookingId() +
                ", airportFrom='" + airportFrom + '\'' +
                ", airportTo='" + airportTo + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", localDeparture='" + localDeparture + '\'' +
                ", localArrival='" + localArrival + '\'' +
                ", airline='" + airline + '\'' +
                ", cabin='" + cabin + '\'' +
                ", partOfReturnTrip=" + partOfReturnTrip +
                '}';
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
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

    public boolean isPartOfReturnTrip() {
        return partOfReturnTrip;
    }

    public void setPartOfReturnTrip(boolean partOfReturnTrip) {
        this.partOfReturnTrip = partOfReturnTrip;
    }
}
