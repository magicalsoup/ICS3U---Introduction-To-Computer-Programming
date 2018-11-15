import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 15, 2018
 * @Teacher Ms Leung
 */
public class Practice5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		double sum = 0; // set the total sum as 0;
		System.out.println("Enter your total coins: "); // prompt user
		System.out.println("Quarters: "); // prompt user
		int quarters = sc.nextInt(); // get user input
		sum += getDollarAmount(quarters, 0.25); // call the method and add the value to the sum
		System.out.println("Dimes: "); // prompt user
		int dimes = sc.nextInt(); // get user input
		sum += getDollarAmount(dimes, 0.1); // call the method and add the value to the sum
		System.out.println("Nickels: "); // prompt user
		int nickels = sc.nextInt(); // get user input
		sum += getDollarAmount(nickels, 0.05); // call the method and add the value to the sum
		System.out.println("Pennies: "); // prompt user
		int pennies = sc.nextInt(); // get user input
		sum += getDollarAmount(pennies, 0.01); // call the method and add the value to the sum
		System.out.println(); // print a line
		System.out.println("Total: $" + sum); // print
		sc.close(); // close the Scanner
	}
	static double getDollarAmount(int number, double type) {
		return number * type; // return the amount
	}
}
