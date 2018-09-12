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
public class Var8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter The Amount Of Money: "); // prompt user for the money
		double money = sc.nextDouble(); // gets user's input and stores it
		System.out.println("Please Enter The Interest Rate: "); // prompt user for the interset rate
		double rate = sc.nextDouble(); // gets user's input and stores it
		System.out.println("Please Enter How Many Years: "); // prompt user for the number of years
		int years = sc.nextInt(); // gets user's input and stores it
		
		rate = rate/100.0;
		double interest = money * rate * years; // get final interset = I = p * r * t
		System.out.println("Your Interest Earned Over The Years Will Be: "+interest); // print their interest
		double total = money + interest; // get the total amount of money
		System.out.println("Your Total Amount Of Money Including Interest Will Be: "+total); // print the total
		sc.close(); // close the Scanner
	}
}
