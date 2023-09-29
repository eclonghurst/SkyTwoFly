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

    public FlightService(WebClient apiClient) {
        this.apiClient = apiClient;
    }

    private static List<FlightDTO> getFlightDTOList(FlightAPIResponse apiResponse) {
        List<FlightDTO> flights = new ArrayList<>();

        for (int i = 0; i < apiResponse.getData().size(); i++) {
            Datum current = apiResponse.getData().get(i);
            FlightDTO flight;

            if (current.getAvailability() != null && current.getAvailability().getSeats() != null)
                flight = new FlightDTO(current.getFlyFrom(), current.getFlyTo(), current.getCityFrom(), current.getCityTo(), current.getDuration().getTotal(), current.getLocalDeparture(), current.getLocalArrival(), current.getAvailability().getSeats(), current.getBookingToken(), current.getAirlines(), current.getRoute(), current.getFare());
            else
                flight = new FlightDTO(current.getFlyFrom(), current.getFlyTo(), current.getCityFrom(), current.getCityTo(), current.getDuration().getTotal(), current.getLocalDeparture(), current.getLocalArrival(), current.getBookingToken(), current.getAirlines(), current.getRoute(), current.getFare());
            flights.add(flight);
        }
        return flights;
    }

    public List<FlightDTO> getFlightsOneWay(String flyFrom, String flyTo, String dateFrom, String dateTo, int adults, int priceFrom, int priceTo, String selectedCabins, int limit) {
        FlightAPIResponse apiResponse;
        if (selectedCabins.equals("NONE_GIVEN")) {
            apiResponse = apiClient.get()
                    .uri("https://api.tequila.kiwi.com/v2/search?fly_from=" + flyFrom + "&fly_to="+ flyTo +"&date_from=" + dateFrom + "&date_to=" + dateTo + "&adults=" + adults + "&price_from=" +priceFrom + "&price_to=" + priceTo + "&limit=" + limit + "&curr=GBP")
                    .header("apikey", "BVXX0vJu26lyp1RFal0rdGumfTLiUmr2")
                    .retrieve()
                    .bodyToMono(FlightAPIResponse.class)
                    .block();
        } else {
            apiResponse = apiClient.get()
                    .uri("https://api.tequila.kiwi.com/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + dateFrom + "&date_to=" + dateTo + "&adults=" + adults + "&price_from=" + priceFrom + "&price_to=" + priceTo + "&selected_cabins=" + selectedCabins + "&limit=" + limit + "&curr=GBP")
                    .header("apikey", "BVXX0vJu26lyp1RFal0rdGumfTLiUmr2")
                    .retrieve()
                    .bodyToMono(FlightAPIResponse.class)
                    .block();
        }
        //System.out.println(apiResponse);

        return getFlightDTOList(apiResponse);
    }

    public List<FlightDTO> getFlightsReturn(String flyFrom, String flyTo, String dateFrom, String dateTo, String returnDateFrom, String returnDateTo, int adults, int priceFrom, int priceTo, String selectedCabins, int limit) {
        FlightAPIResponse apiResponse;
        if (selectedCabins.equals("NONE_GIVEN")) {
            apiResponse = apiClient.get()
                    .uri("https://api.tequila.kiwi.com/v2/search?fly_from=" + flyFrom + "&fly_to="+ flyTo +"&date_from=" + dateFrom + "&date_to=" + dateTo + "&return_from=" + returnDateFrom + "&return_to=" + returnDateTo  + "&adults=" + adults + "&price_from=" +priceFrom + "&price_to=" + priceTo + "&limit=" + limit + "&curr=GBP")
                    .header("apikey", "BVXX0vJu26lyp1RFal0rdGumfTLiUmr2")
                    .retrieve()
                    .bodyToMono(FlightAPIResponse.class)
                    .block();
        } else {
            apiResponse = apiClient.get()
                    .uri("https://api.tequila.kiwi.com/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + dateFrom + "&date_to=" + dateTo + "&return_from=" + returnDateFrom + "&return_to=" + returnDateTo + "&adults=" + adults + "&price_from=" + priceFrom + "&price_to=" + priceTo + "&selected_cabins=" + selectedCabins + "&limit=" + limit + "&curr=GBP")
                    .header("apikey", "BVXX0vJu26lyp1RFal0rdGumfTLiUmr2")
                    .retrieve()
                    .bodyToMono(FlightAPIResponse.class)
                    .block();
        }

        return getFlightDTOList(apiResponse);
    }
}
