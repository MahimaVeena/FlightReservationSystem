import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

public class TouristTicket  {

	public static final int MAX_NO_LOCATIONS = 5;

	private long PNRNumber;
	private Flight flight;
	private Passenger passenger;
	private int seatNumber;
	private double price;
	private String status;
	private Address hotelAddress;
	private List<String> touristLocationsList;

	public TouristTicket(long PNRNumber, Flight flight, Passenger passenger, int seatNumber, int price,
			Address hotelAddress, List<String> touristLocationsList) {

		this.PNRNumber=PNRNumber;
		this.seatNumber=seatNumber;
		this.flight=flight;
		this.passenger=passenger;
		this.seatNumber=seatNumber;
		this.price=price;
		this.hotelAddress = hotelAddress;
		this.touristLocationsList = touristLocationsList;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Address getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(Address hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public List<String> getAllTouristLocations() {
		return touristLocationsList;
	}

	public double getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	public LocalDateTime getDepartureDateTime() {
		return flight.getDepartureDateTime();
	}

	/**
	 *
	 * @param time1
	 * @param time2
	 * <p> Calculation of time duration between date and time of departure   and   date and time of arrival
	 */
	public Duration getDurationOfJourney(LocalDateTime time1, LocalDateTime time2) {
		return Duration.between(time1, time2);
	}

	public void printDuration() {
		Duration duration = getDurationOfJourney(flight.getDepartureDateTime(), flight.getArrivalDateTime());
		System.out.println(duration.toMinutes());
	}

	public long getPNRNumber() {
		return PNRNumber;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Flight getFlight() {
		return flight;
	}


	/**
	 * 
	 * @param touristLocation
	 * <p> add a tourist location if the number of current locations < 5
	 */
	public void addTouristLocation(String touristLocation) {
		if (touristLocationsList.size() < MAX_NO_LOCATIONS) {
			touristLocationsList.add(touristLocation);
		}

		else {
			System.out.println("max no of tourist spots already added");
		}
	}

	/**
	 * 
	 * @param touristLocation
	 *                        <p>
	 *                        it takes a tourist location as input, searches for
	 *                        that location in the list and removes it.
	 */
	public void removeTouristLocation(String touristLocation) {
		Iterator iterator = touristLocationsList.iterator();
		String temp;

		while (iterator.hasNext()) {
			temp = (String) iterator.next();
			if (temp.equals(touristLocation)) {
				iterator.remove();
			}
		}
	}
}
