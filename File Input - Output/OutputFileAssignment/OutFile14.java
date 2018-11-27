import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile14 { // main class
	static PrintWriter out;
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file14.txt"); // create file
		out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		System.out.println("Enter The Height:"); // prompt user
		int height = sc.nextInt(); // get user input
		printTree(height); // call method
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
	static void printTree(int height) {
		for(int i = 0; i < height; i++) { // runs from i to height
			for(int j = 0; j <= i; j++) { // runs from j to i
				out.print("*"); // print an asterisk
			}
			out.println(); // prints a line
		}
	}
}
