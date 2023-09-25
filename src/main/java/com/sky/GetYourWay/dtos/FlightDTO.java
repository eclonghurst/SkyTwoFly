package com.sky.GetYourWay.dtos;

import java.util.List;

public class FlightDTO {
    private List<String> flightNos;
    private String flyFrom;
    private String flyTo;
    private String cityFrom;
    private String cityTo;
    private Integer duration;
    private String localDeparture;
    private String localArrival;
    private int availableSeats;
    private String bookingToken;

    public FlightDTO() {
        super();
    }

    public FlightDTO(List<String> flightNos, String flyFrom, String flyTo, String cityFrom, String cityTo, Integer duration, String localDeparture, String localArrival, int availableSeats, String bookingToken) {
        this.flightNos = flightNos;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.duration = duration;
        this.localDeparture = localDeparture;
        this.localArrival = localArrival;
        this.availableSeats = availableSeats;
        this.bookingToken = bookingToken;
    }

    public String getBookingToken() {
        return bookingToken;
    }

    public void setBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
    }

    public List<String> getFlightNos() {
        return flightNos;
    }

    public void setFlightNos(List<String> flightNos) {
        this.flightNos = flightNos;
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

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
