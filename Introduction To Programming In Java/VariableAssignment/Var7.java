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
public class Var7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter the Length: "); // prompts user for the length
		int length = sc.nextInt(); // gets the length
		System.out.println("Please Enter the Width: "); // prompts user for the width
		int width = sc.nextInt(); // gets the width
		int area = length * width; // getst the area
		int perimeter  = 2 * ( length + width ); // gets the perimeter
		System.out.println("The Area Is : " + area + " The Perimeter Is : " + perimeter); // prints the area and perimeter
		sc.close(); // close the Scanner
	}
}
