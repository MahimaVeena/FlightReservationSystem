
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.*;

public class CentralFlightReservationSystem {
	
	private static List<Flight> listOfFlights = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);


	public static void addFlights(List<Flight> flightList) {
		listOfFlights.addAll(flightList);
	}

	public static void printAvailableFlights() {
		List<Flight> availableFlights = getAvailableFlights();

		System.out.println("These are available flights ");
		
		for (int i = 0; i < availableFlights.size(); i++) {
			System.out.println("serial number " + i + ", flight: " + availableFlights.get(i).getAirlineName()
					+ ", seats remaining:  " + availableFlights.get(i).getCurrentCapacity());
		}
	}

	/**
	 * 
	 * @return list of all flights with vacant seats
	 */
	public static List<Flight> getAvailableFlights() {
		
		List<Flight> availableFlights = new ArrayList<>();
	
		for (int i = 0; i < listOfFlights.size(); i++) {
			if (listOfFlights.get(i).getNoOfSeatsBooked() < listOfFlights.get(i).getCapacity()) {
				availableFlights.add(listOfFlights.get(i));
			}
		}

		return availableFlights;
	}

	public static void printPassengerDetails(Passenger p) {
		System.out.println(" Passenger id: " + p.getId());
		System.out.println("Passenger address: " + p.getAddress());
		System.out.println("Passenger contact details: " + p.getContact() + "\n");
	}
	
}
