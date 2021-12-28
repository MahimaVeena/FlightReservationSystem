import java.util.List;

public class RegularTicket  {
	public long PNRNumber;
	public int seatNumber;
	public double price;
	public String status;
	public List<String> services;

	public RegularTicket(long PNRNumber, int seatNumber, double price,
			List<String> services) {
		this.PNRNumber=PNRNumber;
		this.seatNumber=seatNumber;
		this.price=price;
		this.services=services;
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

}
