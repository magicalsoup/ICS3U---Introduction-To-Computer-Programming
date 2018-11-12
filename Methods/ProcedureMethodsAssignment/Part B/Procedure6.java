import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part B
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The First Side Length: "); // prompt user
		int a = sc.nextInt(); // get user input
		System.out.println("Please Enter The Second Side Length: "); // prompt user
		int b = sc.nextInt(); // get user input
		System.out.println("Please Enter The Third Side Length: "); // prompt user
		int c = sc.nextInt(); // get user input
		canFormTriangle(a, b, c); // call the method
		sc.close(); // close the Scanner
	}
	static void canFormTriangle(int a, int b, int c) {
		if(a + b > c || a + c > b || b + c > a) { // if its possible
			System.out.println("Can Form Triangle"); // print
		}
		else {
			System.out.println("Cannot Form Triangle"); // print
		}
	}
}
