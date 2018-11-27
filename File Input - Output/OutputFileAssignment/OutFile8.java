import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile8 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file8.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		System.out.println("Enter 20 Marks"); // prompt user
		for(int i = 0; i < 20; i++) { // for loop that runs 20 times
			System.out.println("Enter A Mark: "); // prompt user
			int mark = sc.nextInt(); // get user input
			if(mark >= 0 && mark <= 100) { // if mark is bigger than 0 and mark is smaller than 100
				out.println(mark); // output mark to the file
			}
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
