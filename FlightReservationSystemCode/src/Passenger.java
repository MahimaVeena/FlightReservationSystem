public class Passenger {

	public static int idCounter;
	public int id;
	public String password;

	public Passenger(String password) {
		this.password = password;

		this.id = idCounter;
		idCounter++;
	}

	}




