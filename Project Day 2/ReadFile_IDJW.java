package final_IDJW2018;

import java.util.Scanner;
import java.io.*;

public class ReadFile_IDJW {
	File input;
	Scanner read;
	Scanner lineCounter;
	int  counter = 0;
	public ReadFile_IDJW(){
		try{
			input = new File("RestaurantList.txt");
			read = new Scanner(input);
			lineCounter = new Scanner(input);
		}catch(Exception e) {
			System.out.println("RestaurantList.txt not found.");
		}
	}
	public String[] returnTokenArray() {
		while(lineCounter.hasNextLine()) {
			String exhaust = lineCounter.nextLine();
			counter++;
		}
		lineCounter.close();
		
		String[] tokens = new String[counter];
		int i = 0;
		while(read.hasNextLine()) {
			tokens[i] = read.nextLine();
					i++;
		}
		return tokens;
	}
	public int getCounter() {
		return counter;
	}

}
