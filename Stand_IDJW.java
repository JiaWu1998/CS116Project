package final_IDJW2018;

public class Stand_IDJW extends Restaurant_IDJW {

	private String openMonths;

	public Stand_IDJW() {
		super();
		openMonths = "";
	}

	public Stand_IDJW(String name1, String location1, String hours1, String foodType1, double avgPrice1,
			String sanitation1, String openMonths1) {
		super(name1, location1, hours1, foodType1, avgPrice1, sanitation1);
		openMonths = openMonths1;
	}

	@Override
	public String getSanitationStatus() {
		String x = "Type: Stand, Sanitation Status: " + super.getSanitationStatus();
		return x;
	}
	
	public String getOpenMonths() {
		String x = openMonths;
		return x;
	}

	public void setOpenMonths(String openMonths1) {
		openMonths = openMonths1;
	}
	@Override
	public boolean equals(Object s1) {
		Stand_IDJW s2 = new Stand_IDJW();
		if(s1 instanceof Stand_IDJW) {
			s2 = (Stand_IDJW) s1;
		}else {
			return false;
		}
		if ((s2.getName().equals(super.getName())) && (s2.getLocationA().equals(super.getLocationA()))) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Stand_IDJW s1) {
		if ((s1.getName().equals(super.getName())) && (s1.getLocationA().equals(super.getLocationA()))) {
			return 0;
		} else if (s1.getName().compareTo(super.getName()) > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	@Override
	public int type() {
		return 3;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Open Months: " + openMonths;
	}

}
