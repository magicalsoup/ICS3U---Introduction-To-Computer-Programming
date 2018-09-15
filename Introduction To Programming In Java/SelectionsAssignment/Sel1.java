package SelectionsAssignment;
import java.util.Scanner; // import the Scanner
public class Sel1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter a Number between 1 and 10"); // prompt the user for a number
		int num = sc.nextInt(); // get the number and store it
		if(num >= 5) { // if number is bigger than or equal to 5
			System.out.println("You won!");
		}
		sc.close(); // close the Scanner
	}
}
