import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part B
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The Height: "); // prompt user
		int height = sc.nextInt(); // get user input
		System.out.println("Please Enter The Width: "); // prompt user
		int width = sc.nextInt(); // get user input
		System.out.println("Please Enter The Symbol: "); // prompt user
		char symbol = sc.next().charAt(0); // get user input
		printRectangle(height, width, symbol); // call method
		sc.close(); // close the Scanner
	}
	static void printRectangle(int height, int width, char symbol) {
		for(int i = 0; i < height; i++) { // runs from 0 to height 
			for(int j = 0; j < width; j++) { // runs from 0 to width
				System.out.print(symbol); // print the symbol
			}
			System.out.println(); // print a line
		}
	}
}
