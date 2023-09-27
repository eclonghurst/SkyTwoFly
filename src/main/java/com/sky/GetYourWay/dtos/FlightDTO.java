package com.sky.GetYourWay.dtos;

import com.sky.GetYourWay.domain.APIObjects.Fare;
import com.sky.GetYourWay.domain.APIObjects.Route;

import java.util.List;

public class FlightDTO {
    private String flyFrom;
    private String flyTo;
    private String cityFrom;
    private String cityTo;
    private Integer duration;
    private String localDeparture;
    private String localArrival;
    private boolean availabilityGivenByAPI;
    private Integer availableSeats;
    private String bookingToken;
    private List<String> airlines;
    private Fare fare;
    private List<Route> routes;



    public FlightDTO(String flyFrom, String flyTo, String cityFrom, String cityTo, Integer duration, String localDeparture, String localArrival, Integer availableSeats, String bookingToken, List<String> airlines, List<Route> route, Fare fare) {
        super();
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.duration = duration;
        this.localDeparture = localDeparture;
        this.localArrival = localArrival;
        this.availabilityGivenByAPI = true;
        this.availableSeats = availableSeats;
        this.bookingToken = bookingToken;
        this.airlines = airlines;
        this.routes = route;
        this.fare = fare;
    }

    public FlightDTO(String flyFrom, String flyTo, String cityFrom, String cityTo, Integer duration, String localDeparture, String localArrival, String bookingToken, List<String> airlines, List<Route> route, Fare fare) {
        super();
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.duration = duration;
        this.localDeparture = localDeparture;
        this.localArrival = localArrival;
        this.availabilityGivenByAPI = false;
        this.availableSeats = null;
        this.bookingToken = bookingToken;
        this.airlines = airlines;
        this.routes = route;
        this.fare = fare;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public List<String> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<String> airlines) {
        this.airlines = airlines;
    }

    public void setAvailabilityGivenByAPI(boolean availabilityGivenByAPI) {
        this.availabilityGivenByAPI = availabilityGivenByAPI;
    }

    public String getBookingToken() {
        return bookingToken;
    }

    public void setBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "FlightDTO{" +
                "flyFrom='" + flyFrom + '\'' +
                ", flyTo='" + flyTo + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", duration=" + duration +
                ", localDeparture='" + localDeparture + '\'' +
                ", localArrival='" + localArrival + '\'' +
                ", availableSeats=" + availableSeats +
                ", bookingToken='" + bookingToken + '\'' +
                ", airlines=" + airlines +
                ", fare=" + fare +
                ", routes=" + routes +
                '}';
    }
}
