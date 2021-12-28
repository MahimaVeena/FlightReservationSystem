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
		//Accessing attributes and methods of Address class

		Address address1=new Address("Street1","Bangalore","Karnataka");
		System.out.println("address1: street= "+address1.street+", city "+address1.city+", state= "+address1.state);

		Address address2=new Address("Street2","Mandya","Karnataka");
		System.out.println("address2: street= "+address1.street+", city "+address1.city+", state= "+address1.state);

		//Accessing attributes and methods of Contact class
		Contact contact= new Contact("Mahi",1234,"mahi@gmail.com");
		System.out.println("Contact: name= "+contact.name+", email ID= "+contact.emailId+", phone number= "+contact.phoneNumber);

		//accessing attributes and methods of Flight class
		LocalDate departureDate= LocalDate.of(2021,12,30);
		LocalTime departureTime= LocalTime.of(2,30);
		LocalDateTime departureDateTime= LocalDateTime.of(departureDate,departureTime);

		LocalDate arrivalDate=LocalDate.of(2021,12,30);
		LocalTime arrivalTime= LocalTime.of(5,30);
		LocalDateTime arrivalDateTime =LocalDateTime.of(arrivalDate,arrivalTime);
		Flight flight=new Flight("flight_1", "Vistara", "Mumbai", "Bangalore",
				departureDateTime, arrivalDateTime, 100, 5);

		System.out.println("current capacity of the flight is "+flight.getCurrentCapacity());

		//accessing attributes and methods of Passenger class
		Passenger passenger=new Passenger("asshu");
		System.out.println("passenger id: "+passenger.id+" password: "+passenger.password);

		//accessing attributes and methods of RegularTicket class
		List<String> services=new ArrayList<>();
		services.add("food");
		services.add("water");
		RegularTicket regularTicket=new RegularTicket(2356,50,10000,services);

		regularTicket.addService("service1");
		regularTicket.deleteService("food");
		regularTicket.setServices(0,"service2");
		System.out.println("services availed by passenger are: "+regularTicket.getServices());

		//accessing attributes and methods of TouristTicket class
		Address hotelAddress=new Address("street1","city1","state1");
		List<String> touristLocationsList = new ArrayList<>();
		touristLocationsList.add("place1");
		touristLocationsList.add("place2");

		TouristTicket touristTicket=new TouristTicket(1245,40,30000,hotelAddress,
				touristLocationsList);

		touristTicket.addTouristLocation("place3");
		touristTicket.removeTouristLocation("place1");
		List<String> locations=touristTicket.getAllTouristLocations();
		System.out.println("Tourist locations: "+locations);
	}

}