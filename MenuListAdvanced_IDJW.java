package final_IDJW2018;

import java.util.Scanner;
import java.io.*;

public class MenuListAdvanced_IDJW extends MenuList_IDJW {

	public MenuListAdvanced_IDJW() {
		super();
	}

	public MenuListAdvanced_IDJW(int num) {
		super(num);
	}

	public MenuListAdvanced_IDJW(Restaurant_IDJW[] arr4, int indexNext) {
		super(arr4, indexNext);
	}

	public void sortByName() {
		Restaurant_IDJW[] rest = super.getArray();
		// selectionSort

		for (int i = 0; i < super.getArray().length; i++) {
			for (int j = 0; j < super.getArray().length; j++) {
				if ((rest[i].getName()).compareTo(rest[j].getName()) < 0) {
					Restaurant_IDJW holder = rest[i];
					rest[i] = rest[j];
					rest[j] = holder;
				}
			}

		}
		super.setArray(rest);

	}

	public void sortByPrice() {
		Restaurant_IDJW[] rest = super.getArray();
		// selectionSort

		for (int i = 0; i < super.getArray().length; i++) {
			for (int j = 0; j < super.getArray().length; j++) {
				if (rest[i].getAvgPrice() < rest[j].getAvgPrice()) {
					Restaurant_IDJW holder = rest[i];
					rest[i] = rest[j];
					rest[j] = holder;
				}
			}

		}
		super.setArray(rest);

	}

	public void sortByFoodType() {
		Restaurant_IDJW[] rest = super.getArray();
		// selectionSort

		for (int i = 0; i < super.getArray().length; i++) {
			for (int j = 0; j < super.getArray().length; j++) {
				if ((rest[i].getFoodType()).compareTo(rest[j].getFoodType()) < 0) {
					Restaurant_IDJW holder = rest[i];
					rest[i] = rest[j];
					rest[j] = holder;
				}
			}

		}
		super.setArray(rest);
	}

	public int searchByName(String restName) {
		// Use Binary Search
		int index = -1;
		sortByName();
		for (int i = 0; i < super.getArray().length; i++) {
			if (super.getRestaurantAtIndex(i).getName().toLowerCase().equals(restName)) {
				return i;
			}
		}

		return index;
	}

	public void mainMenu() {
		Scanner scnr = new Scanner(System.in);
		int answer = -1;
//		try {
//			FileOutputStream file = new FileOutputStream("RestaurantListOut.txt");
//			PrintWriter write = new PrintWriter(file);

			System.out.println(
					"This is a restaurant finder for the city of Chicago. \nPlease choose one of the options below by typing in the corresponding number:");
			System.out.println(
					" 1. Order by Name \n 2. Order by Food Type \n 3. Order by Price (Low to High) \n 4. Advanced Search \n 5. Add Restaurant \n 6. Delete Restaurant \n 7. Update Information \n 8. Exit");
			try {
				answer = scnr.nextInt();
				System.out.println();
			} catch (Exception e) {
				System.out.print(scnr.next()
						+ " is not a valid choice. Please try again. \n Type anything to return to the main menu.");
				if (scnr.hasNext()) {
					System.out.println();
					mainMenu();
				}
			}
			switch (answer) {
			case 1:
				// Order the list of restaurants by name
				sortByName();
				for (int i = 0; i < super.getArray().length; i++) {
					System.out.println(super.getRestaurantAtIndex(i));
				}

				break;
			case 2:
				// Order the list of restaurants by food type
				sortByFoodType();
				for (int i = 0; i < super.getArray().length; i++) {
					System.out.println(super.getRestaurantAtIndex(i));
				}

				break;
			case 3:
				// Order the list of restaurants by price (low to high)
				sortByPrice();
				for (int i = 0; i < super.getArray().length; i++) {
					System.out.println(super.getRestaurantAtIndex(i));
				}
				break;
			case 4:
				// advance search a restaurant by name

				break;
			case 5:
				// add a restaurant to the list
				int scan = -1;
				String name = "";
				String location = "";
				String hours = "";
				String typeOfFood = "";
				double price = -1.0;
				String sanitationStatus = "";
				boolean reservation = false;
				String openMonths = "";
				double radius = -1.0;
				System.out.println("What is the name of the restaurant?");
				name = scnr.nextLine();
				name = scnr.nextLine();
				System.out.println("Where is the restaurant located?");
				location = scnr.nextLine();

				System.out.println("What hours is the restaurant open?");
				hours = scnr.nextLine();

				System.out.println("What type of food does this restaurant serve?");
				typeOfFood = scnr.nextLine();

				while (price == -1.0) {
					System.out.println("What is the average cost of a meal?");
					try {
						price = scnr.nextDouble();
					} catch (Exception e) {
						System.out.println(
								"Your input was not valid. Please enter the price in number form. (No $ or letters)");
						String a = scnr.nextLine();
					}

				}
				System.out.println("What is the status of sanitation? (Approved or Not Approved)");
				sanitationStatus = scnr.nextLine();
				sanitationStatus = scnr.nextLine();
				System.out.println(
						"What type of restaurant would you like to add? \n 1. Sit Down Restaurant \n 2. Food Stand \n 3. Food Truck \n Type anything else to exit");

				while (scan == -1) {
					try {
						scan = scnr.nextInt();
						System.out.println();
						switch (scan) {
						case 1:
							int redo = -1;
							while (redo == -1) {
								System.out.println("This restaurant accepts reservations. (true or false)");
								String temp = scnr.next().toLowerCase();
								if (temp.compareTo("true") == 0) {
									reservation = true;
									redo = 1;
								} else if (temp.compareTo("false") == 0) {
									reservation = false;
									redo = 1;
								} else {
									System.out.println("Your input is invalid");
								}
							}
							super.add(new Sit_Down_IDJW(name, location, hours, typeOfFood, price, sanitationStatus,
									reservation));
							break;
						case 2:
							System.out.println("What are the Open months of this restaurant?");
							openMonths = scnr.nextLine();

							super.add(new Stand_IDJW(name, location, hours, typeOfFood, price, sanitationStatus,
									openMonths));
							break;
						case 3:

							while (radius == -1) {
								System.out.println(
										"What is the radius of appearance for this truck around the truck's location (input number)?");
								try {
									radius = scnr.nextDouble();
								} catch (Exception e) {
									System.out.println(
											"Your input was not valid. Please enter the price in number form. (No $ or letters)");
									String a = scnr.nextLine();
								}

							}
							super.add(
									new Truck_IDJW(name, location, hours, typeOfFood, price, sanitationStatus, radius));
							break;

						default:
							mainMenu();
						}
					} catch (Exception e) {
						System.out.println(scnr.next()
								+ " is not a valid choice. Please try again. \n Type anything to try again.");
						if (scnr.hasNext()) {
							System.out.println();

						}
					}
				}
				for (int i = 0; i < super.getArray().length; i++) {
					System.out.println(super.getRestaurantAtIndex(i));
//					write.println(super.getRestaurantAtIndex(i).toString());
				}
				break;
			case 6:
				// delete a restaurant from the list
				System.out.println("What is the name of the restaurant that will be deleted?");
				String rDelete;
				rDelete = scnr.nextLine();
				rDelete = scnr.nextLine().toLowerCase();
				System.out.println(rDelete);
				if (searchByName(rDelete) != -1) {
					super.delete(searchByName(rDelete));
				} else {
					System.out.println("The restuarant " + rDelete + " is not located in this restaurant list.");
				}
				for (int i = 0; i < super.getArray().length; i++) {
					System.out.println(super.getRestaurantAtIndex(i));
//					write.println(super.getRestaurantAtIndex(i));
				}
				break;

			case 7:
				// update restaurant
				Restaurant_IDJW[] array = super.getArray();

				int choice = -1;
				while (choice == -1) {

					System.out.println("Select a restaurant to update using the corresponding numbers.");
					for (int i = 0; i < super.getArray().length; i++) {
						System.out.println("" + (i + 1) + ". " + super.getRestaurantAtIndex(i));
					}
					try {
						choice = scnr.nextInt() - 1;
					} catch (Exception e) {
						System.out.println("Your input was not valid. Please enter a valid number");
						String a = scnr.nextLine();
					}
					if (choice > super.getArray().length - 1) {
						choice = -1;
					}

				}

				System.out.println("\n Editing: " + array[choice]);

				if (array[choice].type() == 1) {
					System.out.println(
							"What is out of date? \n 1. Name \n 2. Location \n 3. Hours \n 4. Food Type \n 5. Average Price per meal \n 6. Sanitation Status \n 7. Reservation Status");
					String num = scnr.nextLine();
					num = scnr.nextLine();
					switch (num) {
					case "1":
						System.out.println("What is the new name?");
						super.getRestaurantAtIndex(choice).setName(scnr.nextLine());
						break;
					case "2":
						System.out.println("What is the new location?");
						super.getRestaurantAtIndex(choice).setLocationA(scnr.nextLine());
						break;
					case "3":
						System.out.println("What are the new hours?");
						super.getRestaurantAtIndex(choice).setHours(scnr.nextLine());
						break;
					case "4":
						System.out.println("What is the new food type?");
						super.getRestaurantAtIndex(choice).setFoodType(scnr.nextLine());
						break;
					case "5":
						System.out.println("What is the new average price?");
						double input = -1.0;
						while (input == -1.0) {
							try {
								input = scnr.nextDouble();
								super.getRestaurantAtIndex(choice).setAvgPrice(input);
							} catch (Exception e) {
								System.out.println("Invalid Input. Please try again.");
								String x = scnr.nextLine();
							}
						}
						break;
					case "6":
						System.out.println("What is the new sanitation status?");
						super.getRestaurantAtIndex(choice).setSanitationStatus(scnr.nextLine());
						break;
					case "7":
						System.out.println("What is the new reservation status?");
						int redo = -1;
						boolean res = false;
						while (redo == -1) {
							System.out.println("This restaurant accepts reservations. (true or false)");
							String temp = scnr.next().toLowerCase();
							if (temp.compareTo("true") == 0) {
								res = true;
								redo = 1;
							} else if (temp.compareTo("false") == 0) {
								res = false;
								redo = 1;
							} else {
								System.out.println("Your input is invalid");
							}
						}
						((Sit_Down_IDJW) (super.getRestaurantAtIndex(choice))).setReservation(res);
						break;
					default:
						System.out.println("Invalid Input. Type anything to return to the main menu.");
						String a = scnr.next();
						mainMenu();
						break;
					}

				} else if (array[choice].type() == 2) {
					System.out.println(
							"What is out of date? \n 1. Name \n 2. Location \n 3. Hours \n 4. Food Type \n 5. Average Price per meal \n 6. Sanitation Status \n 7. Radius");
					String num = scnr.nextLine();
					num = scnr.nextLine();
					switch (num) {
					case "1":
						System.out.println("What is the new name?");
						super.getRestaurantAtIndex(choice).setName(scnr.nextLine());
						break;
					case "2":
						System.out.println("What is the new location?");
						super.getRestaurantAtIndex(choice).setLocationA(scnr.nextLine());
						break;
					case "3":
						System.out.println("What are the new hours?");
						super.getRestaurantAtIndex(choice).setHours(scnr.nextLine());
						break;
					case "4":
						System.out.println("What is the new food type?");
						super.getRestaurantAtIndex(choice).setFoodType(scnr.nextLine());
						break;
					case "5":
						System.out.println("What is the new average price?");
						double input = -1.0;
						while (input == -1.0) {
							try {
								input = scnr.nextDouble();
								super.getRestaurantAtIndex(choice).setAvgPrice(input);
							} catch (Exception e) {
								System.out.println("Invalid Input. Please try again.");
								String x = scnr.nextLine();
							}
						}
						break;
					case "6":
						System.out.println("What is the new sanitation status?");
						super.getRestaurantAtIndex(choice).setSanitationStatus(scnr.nextLine());
						break;
					case "7":
						double rad = -1.0;
						while (rad == -1.0) {
							System.out.println("What is the new radius?");
							try {
								rad = scnr.nextDouble();
							} catch (Exception e) {
								System.out.println("Invalid input. Please try again");
								String x = scnr.nextLine();
							}
						}
						((Truck_IDJW) (super.getRestaurantAtIndex(choice))).setRadius(rad);

						break;
					default:
						System.out.println("Invalid Input. Type anything to return to the main menu.");
						String a = scnr.next();
						mainMenu();
						break;
					}
				} else {
					System.out.println(
							"What is out of date? \n 1. Name \n 2. Location \n 3. Hours \n 4. Food Type \n 5. Average Price per meal \n 6. Sanitation Status \n 7. Open Months");
					String num = scnr.nextLine();
					num = scnr.nextLine();
					switch (num) {
					case "1":
						System.out.println("What is the new name?");
						super.getRestaurantAtIndex(choice).setName(scnr.nextLine());
						break;
					case "2":
						System.out.println("What is the new location?");
						super.getRestaurantAtIndex(choice).setLocationA(scnr.nextLine());
						break;
					case "3":
						System.out.println("What are the new hours?");
						super.getRestaurantAtIndex(choice).setHours(scnr.nextLine());
						break;
					case "4":
						System.out.println("What is the new food type?");
						super.getRestaurantAtIndex(choice).setFoodType(scnr.nextLine());
						break;
					case "5":
						System.out.println("What is the new average price?");
						double input = -1.0;
						while (input == -1.0) {
							try {
								input = scnr.nextDouble();
								super.getRestaurantAtIndex(choice).setAvgPrice(input);
							} catch (Exception e) {
								System.out.println("Invalid Input. Please try again.");
								String x = scnr.nextLine();
							}
						}
						break;
					case "6":
						System.out.println("What is the new sanitation status?");
						super.getRestaurantAtIndex(choice).setSanitationStatus(scnr.nextLine());
						break;
					case "7":
						System.out.println("What are the new open months?");
						((Stand_IDJW) (super.getRestaurantAtIndex(choice))).setOpenMonths(scnr.nextLine());
						break;
					default:
						System.out.println("Invalid Input. Type anything to return to the main menu.");
						String a = scnr.next();
						mainMenu();
						break;
					}
				}
//				for (int i = 0; i < super.getArray().length; i++) {
//					write.println(super.getRestaurantAtIndex(i));
//				}
				break;

			case 8:
				// exit
				System.exit(0);
				break;
			default:
				System.out.print(answer
						+ " is not a valid choice. Please try again. \n Type anything to return to the main menu.");
				if (scnr.hasNext()) {
					System.out.println();
					mainMenu();
				}
				break;
			}
			System.out.println("Type anything to return to the main menu.");
			if (scnr.hasNext()) {
				System.out.println();
				mainMenu();
			}
//			write.flush();
//			file.close();
//		} catch (Exception e) {
//			System.out.println("File not found");
//		}
	}

}