package final_IDJW2018;

public class Truck_IDJW extends Restaurant_IDJW {

	private int radius;
	private String sanitationTruck;

	public Truck_IDJW() {
		super();
		radius = 0;
	}

	public Truck_IDJW(String name1, String location1, String hours1, String foodType1, double avgPrice1,String sanitation1, int radius1) {
		super(name1, location1, hours1, foodType1, avgPrice1, sanitation1);
		radius = radius1;
	}

	public int getRadius() {
		int x = radius;
		return x;
	}

	public void getRadius(int radius1) {
		radius = radius1;
	}

	@Override
	public String getSanitationStatus() {
		String x = "Type: Truck, " +sanitationTruck;
		return x;
	}

	@Override
	public void setSanitationStatus(String sanitation1) {
		sanitationTruck = sanitation1;
	}
	
	public boolean equals(Truck_IDJW t1) {
		if((t1.getName() == super.getName()) && (t1.getLocationA() == super.getLocationA())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo() {
		
	}
	
	public String toString() {
		return super.toString() + ", Truck Radius: " + radius;
	}

}
