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
public class Var6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // name the Scanner
		System.out.println("Please Enter 2 Integers "); // ask for the 2 integers
		System.out.println("Please Enter The First Number"); // prompt user for first number
		int a = sc.nextInt(); // gets first number
		System.out.println("Please Enter The Second Number"); // prompt user for second number
		int b = sc.nextInt(); // gets second number
		int sum = a + b; // the sum of a+b
		int difference = a - b; // the difference of a-b
		int product = a * b; // the product of a*b
		int quotient = a / b; // the quotient of a/b
		int remainder = a % b; // the remainder of a/b
		System.out.println(a + "+" + b + " = " + sum); // prints sum
		System.out.println(a + "-" + b + " = " + difference); // prints difference
		System.out.println(a + "*" + b + " = " + product); // prints product
		System.out.println(a + "/" + b + " = " +quotient); // prints quotient
		System.out.println(a + "/" + b + "remainder is "+remainder); // prints remainder
		sc.close(); // close the Scanner
	}
}
