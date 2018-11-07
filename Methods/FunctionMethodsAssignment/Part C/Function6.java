import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter Length Centimeters: "); // prompt user
		double cm = sc.nextDouble(); // get user input;
		System.out.println("That Length In Inches: " + convert(cm));
		sc.close(); // close the Scanner
	}
	static double convert(double cm) { // method to convert cm into inches
		return Math.round(cm / 2.54 * 100.0) / 100.0; // return the calculation rounded to 2 decimal places
	}
	/**
	 * @Algorithm
	 * Basic input and output stuff eg Scanner and main method
	 * prompt user, get input
	 * call the method that returns conversion of cm to inches
	 * print it
	 * the method: returns the input divided by 2.54 then rounded to 2 decimal places
	 */
}
