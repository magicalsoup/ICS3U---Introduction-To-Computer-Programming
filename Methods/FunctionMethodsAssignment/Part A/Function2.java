import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter Weight In Poundes: "); // prompt user
		double cm = sc.nextDouble(); // get user input;
		System.out.println("That Weight In Kilograms: " + convert(cm)); // print calc from the method
		sc.close(); // close the Scanner
	}
	static double convert(double lb) { // method to convert pound into kilograms
		return Math.round(lb / 2.2 * 100.0) / 100.0; // return the calculation rounded to 2 decimal places
	}
}
