package final_IDJW2018;

public class AppClass {

	public static void main(String[] args) {
		Truck_IDJW a = new Truck_IDJW("1","location","hours", "a", 12.0, "Approved", 10);
		Sit_Down_IDJW b = new Sit_Down_IDJW("b","location","hours", "b", 10.0, "Approved", true);
		Stand_IDJW c = new Stand_IDJW("3","location","hours", "c", 10.0, "Approved", "June - July");
		Stand_IDJW d = new Stand_IDJW();
		
		MenuListAdvanced_IDJW abc = new MenuListAdvanced_IDJW();
		abc.add(c);
		abc.add(b);
		abc.add(a);
		
		abc.mainMenu();
	}
	public static void p(Object x) {
		System.out.println(x);
	}

}
