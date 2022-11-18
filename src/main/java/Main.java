import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		System.out.println("Write: \n time-----returns berlin time \n berlinTime-----returns time");
		
		scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		if("time".equals(time)) {
			System.out.println("Introduce la hora en formato hh:mm:ss");
			time = scanner.nextLine();
			if(time.length()==8) {
				System.out.println("Entire Berlin Clock: "+entireBerlinClock(time));
			}
		}else if("berlinTime".equals(time)) {
			System.out.println("Write the time in berlin clock format");
			time = scanner.nextLine();
			if(time.length()==24) {
				System.out.println(transformerBerlinToTime(time)); 
			}
		}
		
		
		
	}
	
	public static String transformerBerlinToTime(String time) {
		
		String []timeSplitted = timeSplitter(time);
		return timeFormatted(timeSplitted);
	}
	
	private static String timeFormatted(String []timeSplitted) {
		int hours = 0;
		int mins = 0;
		for (int i = 0; i < timeSplitted[1].length(); i++) {
			if('O' != timeSplitted[1].charAt(i)) {
				hours += 5;
			}
		}
		for (int i = 0; i < timeSplitted[2].length(); i++) {
			if('O' != timeSplitted[2].charAt(i)) {
				hours += 1;
			}
		}
		for (int i = 0; i < timeSplitted[3].length(); i++) {
			if('O' != timeSplitted[3].charAt(i)) {
				mins += 5;
			}
		}
		for (int i = 0; i < timeSplitted[4].length(); i++) {
			if('O' != timeSplitted[4].charAt(i)) {
				mins += 1;
			}
		}
		
		return hours+":"+mins+":NaN";
	}
	
	private static String[] timeSplitter(String time) {
		String []temp = new String[5];
		temp[0] = time.substring(0, 1);//sec
		temp[1] = time.substring(1, 5);//five hour
		temp[2] = time.substring(5, 9);//single hour
		temp[3] = time.substring(9, 20);//five min
		temp[4] = time.substring(20, 24);//single min
		return temp;
	}

	public static String singleMinutesRow (String date) {
		
		String []splitted = date.split(":");
		
		String minTimer = "";
		
		int mins = Integer.parseInt(splitted[1]);
		
		for (int i = 0; i < (mins%5); i++) {
			minTimer += "Y";
		}
		for (int i = minTimer.length(); i < 4; i++) {
			minTimer += "O";
		}
		
		return minTimer;
	}
	
	public static String singleHoursRow (String date) {
		
		String []splitted = date.split(":");
		
		String hourTimer = "";
		
		int hours = Integer.parseInt(splitted[0]);
		
		for (int i = 0; i < (hours%5); i++) {
			hourTimer += "R";
		}
		for (int i = hourTimer.length(); i < 4; i++) {
			hourTimer += "O";
		}
		
		return hourTimer;
	}
	
	public static String fiveMinutesRow (String date) {
		
		String []splitted = date.split(":");
		
		String minTimer = "";
		
		int mins = Integer.parseInt(splitted[1]);
		
		for (int i = 0; i < (mins/5); i++) {
			if(minTimer.length()%2==0 && i!=0) {
				minTimer += "R";
			}else {
				minTimer += "Y";
			}
		}
		for (int i = minTimer.length(); i < 11; i++) {
			minTimer += "O";
		}
		
		return minTimer;
	}
	
	public static String fiveHoursRow (String date){
		
		String []splitted = date.split(":");
		
		String hourTimer = "";
		
		int hours = Integer.parseInt(splitted[0]);
		
		for (int i = 0; i < (hours/5); i++) {
			hourTimer += "R";
		}
		for (int i = hourTimer.length(); i < 4; i++) {
			hourTimer += "O";
		}
		
		return hourTimer;
		
	}
	
	public static String seconsLamp (String date){
		
		String []splitted = date.split(":");
		
		String lampTimer = "";
		
		int secs = Integer.parseInt(splitted[2]);
		
		if(secs%2==0) {
			lampTimer = "Y";
		}else {
			lampTimer = "O";
		}
		
		return lampTimer;
		
	}
	
	public static String entireBerlinClock (String date){
		
		String berlinTimer = "";
		
		berlinTimer += seconsLamp(date);
		berlinTimer += fiveHoursRow(date);
		berlinTimer += singleHoursRow(date);
		berlinTimer += fiveMinutesRow(date);
		berlinTimer += singleMinutesRow(date);
		
		return berlinTimer;
		
	}

}
