import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile13{ // main class
	public static void main(String[]args) throws Exception { //main method
		Scanner input = new Scanner(System.in); // create scanner
		System.out.println("Enter Your Username");
		String username = input.nextLine(); // get user input
		input.close(); // close the input
		File myFile = new File("file10.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		while(sc.hasNext()){ // while there is still more input
			if(username.equals(sc.next())){ // if username equals the input
				System.out.println("You are logged on"); // print
				sc.close(); // close the scanner
				return; // terminate program
			}
		}
		System.out.println("You do not have a valid account"); // print
		sc.close(); // close the Scanner
	}
}
