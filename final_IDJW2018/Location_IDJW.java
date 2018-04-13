package final_IDJW2018;

public class Location_IDJW {

	String location;

	public Location_IDJW() {
		location = "";
	}

	public Location_IDJW(String location1) {
		location = location1;
	}

	public String getLocation() {
		String x = location;
		return x;
	}

	public void setLocation(String location1) {
		location = location1;
	}

	public boolean equals(Location_IDJW l1) {
		if (l1.getLocation() == location) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo() {
		if() {
			
		}
		else if() {
			
		}
		else {
			
		}
	}

	public String toString() {
		return "Location: " + location;
	}
}
