import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter Distance In Kilometers: "); // prompt user
		double cm = sc.nextDouble(); // get user input;
		System.out.println("That Distance In Miles: " + convert(cm)); // print calc from the method
		sc.close(); // close the Scanner
	}
	static double convert(double kilometers) { // method to convert kilometers into miles
		return Math.round(kilometers * 1.6 * 100.0) / 100.0; // return the calculation rounded to 2 decimal places
	}
}
