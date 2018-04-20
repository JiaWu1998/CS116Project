package final_IDJW2018;

public class Stand_IDJW extends Restaurant_IDJW {

	private String openMonths;
	private String sanitationStand;

	public Stand_IDJW() {
		super();
		openMonths = "";
	}

	public Stand_IDJW(String name1, String location1, String hours1, String foodType1, String sanitation1,
			double avgPrice1, String openMonths1) {
		super(name1, location1, hours1, foodType1, avgPrice1, sanitation1);
		openMonths = openMonths1;
	}
	
	public String getOpenMonths() {
		String x = openMonths;
		return x;
	}

	@Override
	public String getSanitationStatus() {
		String x = "Type: Stand, " + sanitationStand;
		return x;
	}
	
	public void setOpenMonths(String openMonths1) {
		openMonths = openMonths1;
	}

	@Override
	public void setSanitationStatus(String sanitation1) {
		sanitationStand = sanitation1;
	}
	
	public boolean equals(Stand_IDJW s1) {
		if((s1.getName() == super.getName()) && (s1.getLocationA() == super.getLocationA())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Stand_IDJW s1) {
		if((s1.getName().equals(super.getName())) && (s1.getLocationA().equals(super.getLocationA()))) {
			return 0;
		}
		else if(s1.getName().compareTo(super.getName()) > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		return super.toString() + ", Open Months: " + openMonths;
	}

}
