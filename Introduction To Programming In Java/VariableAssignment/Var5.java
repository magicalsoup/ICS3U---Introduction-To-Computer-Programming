package VariablesAssignment;
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Variables
 *@Date September 10th, 2018
 */
import java.util.Scanner; // import Scanner
public class Var5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter The First Number ");
		int num = sc.nextInt(); // gets user's number
		int result = num*2; // double the user's number
		System.out.println(result); // prints result
		sc.close(); // close the Scanner
	}
}
