package com.sky.GetYourWay.services;


import com.sky.GetYourWay.domain.APIObjects.Datum;
import com.sky.GetYourWay.domain.APIObjects.FlightAPIResponse;
import com.sky.GetYourWay.dtos.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    private final WebClient apiClient;

    @Autowired
    public FlightService(WebClient apiClient) {
        this.apiClient = apiClient;
    }

    public List<FlightDTO> getFlightsOneWay(String flyFrom, String flyTo, String outboundDateFrom, String outboundDateTo) {

        FlightAPIResponse apiResponse = apiClient.get()
                .uri("https://api.tequila.kiwi.com/v2/search?fly_from=" + flyFrom + "&fly_to="+ flyTo +"&date_from=" + outboundDateFrom + "&date_to=" + outboundDateTo)
                .header("apikey", "BVXX0vJu26lyp1RFal0rdGumfTLiUmr2")
                .retrieve()
                .bodyToMono(FlightAPIResponse.class)
                .block();

        List<FlightDTO> flights = new ArrayList<>();

        for (int i = 0; i < apiResponse.getData().size(); i++) {
            Datum current = apiResponse.getData().get(i);
            List<String> flightNos = new ArrayList<>();

            for (int j = 0; j < current.getRoute().size(); j++)
                flightNos.add(current.getRoute().get(j).getFlightNo().toString());


            FlightDTO flight = new FlightDTO(flightNos, current.getFlyFrom(), current.getFlyTo(), current.getCityFrom(), current.getCityTo(), current.getDuration().getTotal(), current.getLocalDeparture(), current.getLocalArrival(), current.getAvailability().getSeats(), current.getBookingToken());
            flights.add(flight);
        }
        return flights;
    }

    public List<FlightDTO> getFlightsOneWayFilters(){
        return null;
    }

    public List<FlightDTO> getFlightsReturn(){
        return null;
    }

    public List<FlightDTO> getFlightsReturnFilters(){
        return null;
    }



}
