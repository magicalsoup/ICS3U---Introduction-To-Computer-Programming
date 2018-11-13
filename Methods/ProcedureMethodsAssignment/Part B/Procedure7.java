import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part B
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The Height Of The Triangle "); // prompt user
		int height = sc.nextInt(); // get user input
		printTriangle(height); // call the method
		sc.close(); // close the Scanner
	}
	static void printTriangle(int height) {
		System.out.println("The Triangle: "); // print
		for(int i = 0; i < height; i++) { // runs from i to height
			for(int j = 0; j <= i; j++) { // runs from j to i
				System.out.print("*"); // print an asterisk
			}
			System.out.println(); // prints a line
		}
	}
}
