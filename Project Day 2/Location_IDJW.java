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

	public int compareTo(Location_IDJW l1) {
		if(l1.getLocation().equals(location)) {
			return 0;
		}
		else if(l1.getLocation().compareTo(location) > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public String toString() {
		return "Location: " + location;
	}
}
