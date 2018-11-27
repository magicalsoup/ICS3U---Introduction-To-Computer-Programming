import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile5{ // main class
	public static void main(String[]args) throws Exception { //main method
		Scanner sc = new Scanner(System.in); // create scanner
		System.out.println("Enter A Name For The File: "); // prompt user
		String FileName = sc.next(); // get user input
		FileName += ".txt"; // add .txt to the
		File myFile = new File(FileName); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		int array[] = new int[20]; // create an array of size 20
		for(int i = 0; i < 20; i++) { // create for loop that runs 20 times
			System.out.println("Enter A Number"); // prompt user
			array[i] = sc.nextInt(); // get user input and assign it to array[i]
		}
		for(int i = 0; i < 20; i++) { // create for loop that runs 20 times
			out.println(array[i]); // output array[i] into my file
		}
		sc.close();
		out.close();
	}
}
