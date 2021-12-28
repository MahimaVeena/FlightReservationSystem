import java.time.LocalDateTime;

public class Flight {
	public String flightNumber;
	public String airlineName;
	public int capacity;
	public int noOfSeatsBooked;
	public String departureLocation;
	public String destinationLocation;
	public LocalDateTime departureDateTime;
	public LocalDateTime arrivalDateTime;

	public Flight(String flightNumber, String airlineName, String departureLocation, String destinationLocation,
			LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, int capacity, int noOfSeatsBooked) {
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.departureLocation = departureLocation;
		this.destinationLocation = destinationLocation;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.capacity = capacity;

	}

	public int getCurrentCapacity() {
		return capacity - noOfSeatsBooked;
	}


}
