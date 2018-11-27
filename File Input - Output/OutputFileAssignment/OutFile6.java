import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile6 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file6.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		int array[] = new int[10]; // create an array with size of 10
		for(int i = 0; i < 10; i++) { // for loop that runs 10 times
			System.out.println("Enter A Number"); // prompt user
			array[i] = sc.nextInt(); // get user input and assign it to array[i]
		}
		for(int i = 0; i < 10; i++) { // for loop that runs 10 times
			if(array[i] > 50) { // if array[i] is bigger than 50
				out.println(array[i]); // output arra[i] into file
			}
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
