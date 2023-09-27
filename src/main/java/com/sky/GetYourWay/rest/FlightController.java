package com.sky.GetYourWay.rest;

import com.sky.GetYourWay.dtos.FlightDTO;
import com.sky.GetYourWay.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private FlightService service;

    public FlightController(FlightService flightService) {
        this.service = flightService;
    }

    //class, number of adults, price from and to

    @GetMapping("/getOneWay")
    public List<FlightDTO> getOneWayFlights(
            @RequestParam(name = "fly_to", required = true) String flyTo,  // 'LON' - checks every airport in London, 'LHR' - checks flights from London Heathrow, 'UK' - flights from the United Kingdom. Some locations have the same code for airport and metropolis (city), e.g. DUS stands for metro code Duesseldorf, Moenchengladbach and Weeze as well as Duesseldorf airport. See the following examples: 'fly_from=city:DUS' will match all airports in "DUS", "MGL" and "NRN" (all in the city of Duesseldorf). 'fly_from=airport:DUS' will only match airport "DUS"
            @RequestParam(name = "fly_from", required = true) String flyFrom,
            @RequestParam(name = "date_from", required = true) String dateFrom,  // DD/MM/YYYY
            @RequestParam(name = "date_to", required = true) String dateTo,  // DD/MM/YYYY
            @RequestParam(name = "adults", defaultValue = "1") int adults,
            @RequestParam(name = "price_from", defaultValue = "0") int priceFrom,
            @RequestParam(name = "price_to", defaultValue = "2147483647") int priceTo, // default set to max int value
            @RequestParam(name = "selected_cabins", defaultValue = "NONE_GIVEN") String selectedCabins, // "M" (economy), "W" (economy premium), "C" (business), or "F" (first class)
            @RequestParam(name = "limit", defaultValue = "20") int limit
    ) {
        return this.service.getFlightsOneWay(flyFrom, flyTo, dateFrom, dateTo, adults, priceFrom, priceTo, selectedCabins, limit);
    }

    @GetMapping("/getReturn")
    public List<FlightDTO> getReturnFlights(
            @RequestParam(name = "fly_to", required = true) String flyTo, // 'LON' - checks every airport in London, 'LHR' - checks flights from London Heathrow, 'UK' - flights from the United Kingdom. Some locations have the same code for airport and metropolis (city), e.g. DUS stands for metro code Duesseldorf, Moenchengladbach and Weeze as well as Duesseldorf airport. See the following examples: 'fly_from=city:DUS' will match all airports in "DUS", "MGL" and "NRN" (all in the city of Duesseldorf). 'fly_from=airport:DUS' will only match airport "DUS"
            @RequestParam(name = "fly_from", required = true) String flyFrom,
            @RequestParam(name = "date_from", required = true) String dateFrom,  // DD/MM/YYYY
            @RequestParam(name = "date_to", required = true) String dateTo,  // DD/MM/YYYY
            @RequestParam(name = "return_from", required = true) String returnDateFrom,  // DD/MM/YYYY
            @RequestParam(name = "return_to", required = true) String returnDateTo,  // DD/MM/YYYY
            @RequestParam(name = "adults", defaultValue = "1") int adults,
            @RequestParam(name = "price_from", defaultValue = "0") int priceFrom,
            @RequestParam(name = "price_to", defaultValue = "2147483647") int priceTo, // default set to max int value
            @RequestParam(name = "selected_cabins", defaultValue = "NONE_GIVEN") String selectedCabins,     // "M" (economy), "W" (economy premium), "C" (business), or "F" (first class)
            @RequestParam(name = "limit", defaultValue = "20") int limit
    ){
        return this.service.getFlightsReturn(flyFrom, flyTo, dateFrom, dateTo, returnDateFrom, returnDateTo, adults, priceFrom, priceTo, selectedCabins, limit);
    }


}
