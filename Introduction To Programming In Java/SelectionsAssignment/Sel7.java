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
public class Sel7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter The Password: "); // prompt user for the password
		String passWord = sc.next(); // get the password and store it
		if(passWord.equals("happy") ) { // if the password equals happy
			System.out.println("you are logged it")	;
		}
		else { // if its not the right password
			System.out.println("incorrect password");
		}
		sc.close(); // close the Scanner
	}
}
