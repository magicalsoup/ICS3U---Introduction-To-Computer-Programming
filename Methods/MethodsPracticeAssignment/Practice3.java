import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 15, 2018
 * @Teacher Ms Leung
 */
public class Practice3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter The Width: "); // prompt user
		int width = sc.nextInt(); // get user input
		System.out.println("Enter The Height: "); // prompt user
		int height = sc.nextInt(); // get user input
		drawBox(width, height); // call the method
		sc.close(); // close the Scanner
	}
	static void drawBox(int width, int height) {
		for(int i = 0; i < height; i++) { // for loop that runs from 0 to height
			drawBar(width); // call the drawBar method
		}
	}
	static void drawBar(int width) {
		for(int i = 0; i < width; i++) { // for loop that runs from 0 to width
			System.out.print("*"); // print
		}
		System.out.println(); // print a line
	}
}
