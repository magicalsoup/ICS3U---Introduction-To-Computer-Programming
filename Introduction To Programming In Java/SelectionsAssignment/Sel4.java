package SelectionsAssignment;
import java.util.Scanner; // importing the Scanner
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Selections
 *@Date September 14th, 2018
 */
public class Sel4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter a Number: "); // prompt user for a number
		int number = sc.nextInt(); // get the number and store it
		if(number == 66) { // if the number is 66
			System.out.println("you got it");
		}
		else { // if the number is not 66
			System.out.println("guess again");
		}
		sc.close(); // close the Scanner
	}
}
