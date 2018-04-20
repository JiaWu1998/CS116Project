package final_IDJW2018;

public class Sit_Down_IDJW extends Restaurant_IDJW {

	private boolean reservation;
	private String sanitationSit;

	public Sit_Down_IDJW() {
		super();
		reservation = false;
	}
			
	public Sit_Down_IDJW(String name1, String location1, String hours1, String foodType1, double avgPrice1,String sanitation1, boolean reservation1) {
		super(name1, location1, hours1, foodType1, avgPrice1, sanitation1);
		reservation = reservation1;
	}

	public boolean getReservation() {
		boolean x = reservation;
		return x;
	}

	public void setReservation(boolean reservation1) {
		reservation = reservation1;
	}

	@Override
	public String getSanitationStatus() {
		String x = "Type: Sit-Down, " + sanitationSit;
		return x;
	}
	@Override
	public void setSanitationStatus(String sanitation1) {
		sanitationSit = sanitation1;
	}
	
	public boolean equals(Sit_Down_IDJW sd1) {
		if((sd1.getName() == super.getName()) && (sd1.getLocationA() == super.getLocationA())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Sit_Down_IDJW sd1) {
		if((sd1.getName().equals(super.getName())) && (sd1.getLocationA().equals(super.getLocationA()))) {
			return 0;
		}
		else if(sd1.getName().compareTo(super.getName()) > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		String x;
		if(reservation == true) {
			x = "Yes";
		}
		else {
			x = "No";
		}
		return super.toString() + ", Reservations: " + x;
	}

}
