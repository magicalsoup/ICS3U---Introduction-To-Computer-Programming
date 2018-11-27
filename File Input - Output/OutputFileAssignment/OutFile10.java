import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile10{ // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file10.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		while(true) { // create while loop
			System.out.println("Enter The Password:"); // prompt user
			String password = sc.next(); // get user input
			if(password.equals("quit")) { // if password equals quit
				break; // break out of while loop
			}
			if(password.equals("happy")) { // if password equals happy
				System.out.println("Enter Name:"); // prompt user
				sc.nextLine(); // skip a line
				String name = sc.nextLine(); // get user input
				out.println(name); // output name into file
			}
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
