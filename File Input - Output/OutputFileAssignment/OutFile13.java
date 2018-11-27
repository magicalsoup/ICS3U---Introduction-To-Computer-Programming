import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile13 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file13.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		String names[] = new String[5]; // create an array with size 5
		int marks[] = new int[5]; // create an array with size 5
		for (int i = 0; i < 5; i++) { // for loop that runs 5 times
			System.out.println("Enter A Name"); // prompt user
			names[i] = sc.nextLine(); // get user input
			System.out.print("Enter Mark:"); // prompt user
			marks[i] = sc.nextInt(); // get user input
			sc.nextLine(); // skip a line
		}
		for(int i = 0; i < 5; i++) { // for loop that runs 5 times
			out.println(names[i] + " " + marks[i] + "%"); // output names[i] and marks[i] to the file
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
