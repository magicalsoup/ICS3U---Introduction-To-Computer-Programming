package ProcedureMethodsAssignment;
import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The Length: "); // prompt user
		int n = sc.nextInt(); // get user input
		System.out.println("Please Enter The Character: "); // prompt user
		char c = sc.next().charAt(0); // get user input
		printGraph(n, c); // call the method
		sc.close(); // close the Scanner
	}
	static void printGraph(int n, char c) {
		for(int i = 0; i < n; i++) { // runs from 1 to n
			System.out.print(c); // print the character
		}
	}
}
