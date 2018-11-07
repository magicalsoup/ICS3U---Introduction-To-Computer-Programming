import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter A Number: "); // prompt user
		int a = sc.nextInt(); // get user input
		System.out.println(a + " Squared Is: " + squared(a)); // print and call the method below
		sc.close(); // close the Scanner
	}
	static long squared(int num) { // method for calculating squares
		return num * num; // return the square
	}
	/**
	 * @Algorithm
	 * Basic input and output stuff eg Scanner and main method
	 * prompt user, get input
	 * call the method that returns squares of the input
	 * print it
	 * the method: returns the input multiplied by itself
	 */
}
