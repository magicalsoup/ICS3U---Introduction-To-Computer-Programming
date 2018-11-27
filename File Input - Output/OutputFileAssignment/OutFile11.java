import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile11 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file11.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		String names[] = new String[5]; // create an array with size 5
		for (int i = 0; i < 5; i++) { // for loop that runs 5 times
			System.out.println("Enter A Name"); // prompt user
			names[i] = sc.nextLine(); // get user input
		}
		for(int i = 0; i < 5; i++) { // for loop that runs 5 times
			out.println(names[i]); // output names[i] to the file
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
