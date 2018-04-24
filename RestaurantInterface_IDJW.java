package final_IDJW2018;

public interface RestaurantInterface_IDJW {
	public String getName();
	public String getLocationA();
	public String getHours();
	public String getFoodType();
	public double getAvgPrice();
	public String getSanitationStatus();
	public void setName(String name1);
	public void setLocationA(String location1);
	public void setHours(String hours1);
	public void setFoodType(String foodType1);
	public void setAvgPrice(double avgPrice1);
	public void setSanitationStatus(String sanitation1);
	public boolean equals(Object r1);
	public int compareTo(Restaurant_IDJW r1);
	public String toString();
}
