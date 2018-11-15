import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 15, 2018
 * @Teacher Ms Leung
 */
public class Practice4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter The Base: "); // prompt user
		int base = sc.nextInt(); // get user input
		System.out.println("Enter The Power: "); // prompt user
		int power = sc.nextInt(); // get user input
		System.out.println("The Result: " + powerOf(base, power));// call the method and print it
		sc.close(); // close the Scanner
	}
	static long powerOf(int base, int power) {
		int result = 1; // set the result of 1
		for(int i = 0; i < power; i++) { // runs from 0 to power
			result *= base; // multiply the result by the base 
		}
		return result; // return the result
	}
}
