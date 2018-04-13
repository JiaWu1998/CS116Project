package final_IDJW2018;

public class Restaurant_IDJW extends Sanitation_IDJW{
	private String name;
	private Location_IDJW locationA;
	private String hours;
	private String foodType;
	private double avgPrice;
	private String sanitation;

	public Restaurant_IDJW() {
		name = "";
		locationA = new Location_IDJW();
		hours = "";
		foodType = "";
		avgPrice = 0.0;
		sanitation = "";
	}

	public Restaurant_IDJW(String name1, String location1, String hours1, String foodType1, double avgPrice1,String sanitation1) {
		name = name1;
		locationA = new Location_IDJW(location1);
		hours = hours1;
		foodType = foodType1;
		avgPrice = avgPrice1;
		sanitation = sanitation1;
	}

	public String getName() {
		String x = name;
		return x;
	}

	public String getLocationA() {
		String x = locationA.getLocation();
		return x;
	}

	public String getHours() {
		String x = hours;
		return x;
	}

	public String getFoodType() {
		String x = foodType;
		return x;
	}

	public double getAvgPrice() {
		double x = avgPrice;
		return x;
	}
	
	public String getSanitationStatus() {
		String x = sanitation;
		return x;
	}

	public void setName(String name1) {
		name = name1;
	}

	public void setLocationA(String location1) {
		locationA = new Location_IDJW(location1);
	}

	public void setHours(String hours1) {
		hours = hours1;
	}

	public void setFoodType(String foodType1) {
		foodType = foodType1;
	}

	public void setAvgPrice(double avgPrice1) {
		avgPrice = avgPrice1;
	}
	
	public void setSanitationStatus(String sanitation1) {
		sanitation = sanitation1;
	}
	
	public boolean equals(Restaurant_IDJW r1) {
		if((r1.getName() == name) && (r1.locationA == locationA)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Restaurant r1) {
		if() {
			
		}
		else if() {
			
		}
		else {
			
		}
	}
	
	public String toString() {
		return "Name: " + name + ", " + locationA.toString() + ", Hours: " + hours + ", Food Type: " + foodType + ", Average Price: " + avgPrice + ", Sanitation Status: " + sanitation;
	}
	
}
