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
public class Var3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter Your Name "); // prompt user for name
		String name = sc.next(); // gets user's name
		System.out.println("Please Enter Your Age "); // prompt user for age
		int age = sc.nextInt(); // gets user's age
		System.out.println("Name : " + name + " Age : " + age); // prints the age
		sc.close(); // close the Scanner
	}
}
