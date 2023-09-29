package com.sky.GetYourWay.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sky.GetYourWay.domain.APIObjects.Fare;
import com.sky.GetYourWay.domain.APIObjects.Route;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;       //auto-generated

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

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<BookingRoute> routes;

    private String bookingDate;

    @ManyToOne
    private User user;


    public Booking() {
        super();
    }

    public Booking(int bookingId, String flightNumber, String flightFrom, String flightTo, String cityFrom, String cityTo, String outboundDate, String localDeparture, String localArrival, boolean returnTrip, String returnDate, String localDepartureReturn, String localArrivalReturn, int adults, int fare, List<BookingRoute> routes, String bookingDate, User user) {
        this.bookingId = bookingId;
        this.flightNumber = flightNumber;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.outboundDate = outboundDate;
        this.localDeparture = localDeparture;
        this.localArrival = localArrival;
        this.returnTrip = returnTrip;
        this.returnDate = returnDate;
        this.localDepartureReturn = localDepartureReturn;
        this.localArrivalReturn = localArrivalReturn;
        this.adults = adults;
        this.fare = fare;
        this.routes = routes;
        this.bookingDate = bookingDate;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId && returnTrip == booking.returnTrip && adults == booking.adults && fare == booking.fare && Objects.equals(flightNumber, booking.flightNumber) && Objects.equals(flightFrom, booking.flightFrom) && Objects.equals(flightTo, booking.flightTo) && Objects.equals(cityFrom, booking.cityFrom) && Objects.equals(cityTo, booking.cityTo) && Objects.equals(outboundDate, booking.outboundDate) && Objects.equals(localDeparture, booking.localDeparture) && Objects.equals(localArrival, booking.localArrival) && Objects.equals(returnDate, booking.returnDate) && Objects.equals(localDepartureReturn, booking.localDepartureReturn) && Objects.equals(localArrivalReturn, booking.localArrivalReturn) && Objects.equals(routes, booking.routes) && Objects.equals(bookingDate, booking.bookingDate) && Objects.equals(user, booking.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, flightNumber, flightFrom, flightTo, cityFrom, cityTo, outboundDate, localDeparture, localArrival, returnTrip, returnDate, localDepartureReturn, localArrivalReturn, adults, fare, routes, bookingDate, user);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", outboundDate='" + outboundDate + '\'' +
                ", localDeparture='" + localDeparture + '\'' +
                ", localArrival='" + localArrival + '\'' +
                ", returnTrip=" + returnTrip +
                ", returnDate='" + returnDate + '\'' +
                ", localDepartureReturn='" + localDepartureReturn + '\'' +
                ", localArrivalReturn='" + localArrivalReturn + '\'' +
                ", adults=" + adults +
                ", fare=" + fare +
                ", routes=" + routes +
                ", bookingDate='" + bookingDate + '\'' +
                ", user=" + user.getUserId() +
                '}';
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
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

    public List<BookingRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<BookingRoute> routes) {
        this.routes = routes;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
