package com.sky.GetYourWay.rest;

import com.sky.GetYourWay.dtos.FlightDTO;
import com.sky.GetYourWay.services.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class FlightController {

private FlightService service;

public FlightController(FlightService flightService){
    this.service = flightService;
}

@GetMapping("/getOneWay")
public List<FlightDTO> getOneWayFlights(
        @RequestParam(name = "fly_to", required = true) String flyTo,
        @RequestParam(name = "fly_from", required = true) String flyFrom,
        @RequestParam(name = "outbound_date_from", required = true) String dateFrom,
        @RequestParam(name = "outbound_date_to", required = true) String dateTo
        ){
    return this.service.getFlightsOneWay(flyFrom, flyTo, dateFrom, dateTo);

}

}
