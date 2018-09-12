package VariablesAssignment;
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Variables
 *@Date September 10th, 2018
 */
import java.util.Scanner; // import the Scanner 
public class Var9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("What Is Your First Name?"); // ask user for their first name
		String first = sc.next(); // gets user's first name and stores it
		System.out.println("What Is Your Last Name?"); // ask user for their last name
		String last = sc.next(); // gets user's last name and stores it
		System.out.println("Hello "+first+" "+last+"! How are you?");// prints 'Hello' with their full name + 'How are you?'
		sc.close(); // close the Scanner
	}
}
