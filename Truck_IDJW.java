package final_IDJW2018;

public class Truck_IDJW extends Restaurant_IDJW {

	private double radius;

	public Truck_IDJW() {
		super();
		radius = 0.0;
	}

	public Truck_IDJW(String name1, String location1, String hours1, String foodType1, double avgPrice1,String sanitation1, double radius1) {
		super(name1, location1, hours1, foodType1, avgPrice1, sanitation1);
		radius = radius1;
	}

	public double getRadius() {
		double x = radius;
		return x;
	}

	public void setRadius(double radius1) {
		radius = radius1;
	}

	@Override
	public String getSanitationStatus() {
		String x = "Type: Truck, Sanitation Status: " + super.getSanitationStatus();
		return x;
	}
	@Override
	public boolean equals(Object t1) {
		Truck_IDJW t2 = new Truck_IDJW();
		if(t1 instanceof Truck_IDJW) {
			t2 = (Truck_IDJW) t1;
		}else {
			return false;
		}
		if ((t2.getName().equals(super.getName())) && (t2.getLocationA().equals(super.getLocationA()))) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Truck_IDJW t1) {
		if ((t1.getName().equals(super.getName())) && (t1.getLocationA().equals(super.getLocationA()))) {
			return 0;
		} else if (t1.getName().compareTo(super.getName()) > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	@Override
	public int type() {
		return 2;
	}
	
@Override
	public String toString() {
		return super.toString() + ", Truck Radius: " + radius;
	}

}
