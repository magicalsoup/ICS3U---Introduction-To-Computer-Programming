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
public class Sel2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("What is your Mark?"); // prompt user for the mark
		int mark = sc.nextInt(); // get the mark and store it
		if(mark >= 50) { // if the mark is bigger than or equal to 50
			System.out.println("You passed");
		}
		else { // else, meaning the mark is below 50
			System.out.println("sorry you failed."); 
		}
		sc.close(); // close the Scanner
	}
}
