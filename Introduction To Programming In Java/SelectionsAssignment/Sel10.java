package SelectionsAssignment;
import java.util.Scanner; // import the Scanner
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Selections
 *@Date September 14th, 2018
 */
public class Sel10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Enter a number: "); // prompt the user for the number of times
		int num = sc.nextInt(); // get the number of times and store it
		// I think the if statements are pretty self explanatory, if num equals 1 print 1 time, 
		// if num equals 2 print 2 times and etc.
		if(num == 1) {
			System.out.println("Hello");
		}
		if(num == 2) {
			System.out.println("Hello");
			System.out.println("Hello");
		}
		if(num == 3) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		if(num == 4) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		if(num == 5) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		//--------------------------------------------------------------------------------------//
		sc.close(); // close the Scanner
	}
}
