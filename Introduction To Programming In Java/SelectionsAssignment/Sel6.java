
import java.util.Scanner; // import the Scanner
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Selections
 *@Date September 14th, 2018
 */
public class Temp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("What Is Your Mark?"); // ask user for their mark
		int mark = sc.nextInt(); // get the user's mark and store it
		// I think the if statements are pretty self explanatory 
		if(mark >= 75 && mark <= 100) {
			System.out.println("Great");
		}
		else if(mark >= 50 && mark <= 100) {
			System.out.println("Pass");
		}
		else if(mark >= 0 && mark <= 100) {
			System.out.println("Fail");
		}
		else { 
			System.out.println("Invalid");
		}
		//-------------------------------------------------------//
		sc.close(); // close the Scanner
	}
}
