package final_IDJW2018;

public class AppClass {

	public static void main(String[] args) {
		Truck_IDJW a = new Truck_IDJW("name","location","hours", "food type", 10.0, "Approved", 10);
		Sit_Down_IDJW b = new Sit_Down_IDJW("name","location","hours", "food type", 10.0, "Approved", true);
		Stand_IDJW c = new Stand_IDJW("name","location","hours", "food type", 10.0, "Approved", "June - July");
		Truck_IDJW d = new Truck_IDJW();
		
		Restaurant_IDJW[] array = {a,b,c,d}; 
		//System.out.println(array[0].equals(array[0]));
		
		ReadFile_IDJW token = new ReadFile_IDJW();
		String[] tok = token.returnTokenArray();
		for(int i=0; i<token.getCounter();i++) {
			System.out.println(tok[i]);
		}
//		for(int i = 0; i<array.length; i++) {
//			System.out.println(array[i].getSanitationStatus());
//		}
		
	}

}
