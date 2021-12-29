import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class RegularTicket {

	private long PNRNumber;
	private Flight flight;
	private Passenger passenger;
	private int seatNumber;
	protected double price;
	protected String status;
	private List<String> services;

	public RegularTicket(long PNRNumber, Flight flight, Passenger passenger, int seatNumber, double price,
			List<String> services) {
		this.PNRNumber=PNRNumber;
		this.flight=flight;
		this.passenger=passenger;
		this.seatNumber=seatNumber;
		this.price=price;
		this.services = services;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<String> getServices() {
		return services;
	}

	public void setServices(int index, String service) {
		services.set(index, service);
	}

	public void addService(String service) {
		services.add(service);
	}

	public void deleteService(String service) {
		services.remove(service);
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


}
