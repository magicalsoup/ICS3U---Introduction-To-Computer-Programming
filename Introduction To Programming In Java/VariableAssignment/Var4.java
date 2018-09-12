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
public class Var4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter Two Numbers "); // ask user to enter two numbers
		System.out.println("Please Enter The First Number : "); // prompt user for first number
		int a = sc.nextInt(); // gets first number
		System.out.println("Please Enter The Second Number : "); // prompt user for second number	
		int b = sc.nextInt(); // gets second number
		int result = a + b; // adds a and b
		System.out.println(result); // prints result
		sc.close(); // close the Scanner
	}
}
