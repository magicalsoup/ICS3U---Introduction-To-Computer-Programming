import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Practice1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Choose 1 Of The 4 Options Below: "); // print
		System.out.println("1: Convert Hours To Minutes"); // print
		System.out.println("2: Convert Minutes To Hours"); // print
		System.out.println("3: Convert Days To Hours"); // print
		System.out.println("4: Convert Hours To Days"); // print
		int option = sc.nextInt(); // get user input
		if(option == 1){ // if option equals 1
			System.out.println("Please Enter The Amount Of Hours: "); // prompt user
			int hours = sc.nextInt(); // get user input
			System.out.println("Conversion: " + convertHoursToMinuntes(hours) + " Minutes"); // call method
		}
		if(option == 2){ // if option equals 2
			System.out.println("Please Enter The Amount Of Minutes: "); // prompt user
			int minutes = sc.nextInt(); // get user input
			System.out.println("Conversion: " + convertMinutesToHours(minutes) + " Hours"); // call method
		}
		if(option == 3){ // if option equals 3
			System.out.println("Please Enter The Amount Of Days: "); // prompt user
			int days = sc.nextInt(); // get user input
			System.out.println("Conversion: " + convertDaysToHours(days) + " Hours"); // call method
		}
		if(option == 4){ // if option equals 4
			System.out.println("Please Enter The Amount Of Hours: "); // prompt user
			int hours = sc.nextInt(); // get user input
			System.out.println("Conversion: " + convertHoursToDays(hours)); // call method
		}
		sc.close(); // close the Scanner
	}
	static int convertHoursToMinuntes(int hours){
		return hours * 60; // return calc
	}
	static double convertMinutesToHours(int minutes){
		return minutes / 60; // return calc
	}
	static int convertDaysToHours(int days){
		return days * 24; // return calc
	}
	static double convertHoursToDays(int hours){
		return hours / 24; // return calc
	}
}
