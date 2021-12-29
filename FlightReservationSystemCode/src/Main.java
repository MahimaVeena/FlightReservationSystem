import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//test case

		LocalDate departureDate = LocalDate.of(2021, 12, 30);
		LocalTime departureTime = LocalTime.of(2, 30);
		LocalDateTime departureDateTime = LocalDateTime.of(departureDate, departureTime);

		LocalDate arrivalDate = LocalDate.of(2021, 12, 30);
		LocalTime arrivalTime = LocalTime.of(5, 30);
		LocalDateTime arrivalDateTime = LocalDateTime.of(arrivalDate, arrivalTime);
		Flight flight = new Flight("flight_1", "Vistara", "Mumbai", "Bangalore",
				departureDateTime, arrivalDateTime, 100, 5);

		//unable to access private attributes of Flight class directly outside the class
	/*	System.out.println("flight number: "+flight.flightNumber+" flight name: "+flight.airlineName+" departure location: " +
				flight.departureLocation+" flight destination location "+flight.destinationLocation+" flight departure date and time" +
				flight.departureDateTime +"flight arrival date time "+flight.arrivalDateTime);*/

		//accessing attributes of flight class via getters and setters
		System.out.println("flight number: "+flight.getFlightNumber()+ ", airline name:  "+flight.getAirlineName()+
				", departure location: "+flight.getDepartureLocation()+", destination location: "+flight.getDestinationLocation()+
				", departure date and time: "+flight.getDepartureDateTime()+", arrival date and time: "+flight.getArrivalDateTime()+
				", capcity: "+flight.getCapacity()+", seats booked: "+flight.getNoOfSeatsBooked());
	}

}