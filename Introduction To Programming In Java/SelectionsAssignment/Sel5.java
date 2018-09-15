package SelectionsAssignment;
import java.util.Scanner; // import the Scanner
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Variables
 *@Date September 14th, 2018
 */
public class Sel5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter A Secret Number: "); // prompt user for secret number
		int secret = sc.nextInt(); // get the secret number and store it
		System.out.println("Please Enter A Number: "); // prompt the other user for a number
		int number = sc.nextInt(); // get the number and store it
		if(number == secret) { // if they got the secret number
			System.out.println("you got it");
		}
		else { // if the didn't get the secret number
			System.out.println("guess again");
		}
		sc.close(); // close the Scanner
	}
}
