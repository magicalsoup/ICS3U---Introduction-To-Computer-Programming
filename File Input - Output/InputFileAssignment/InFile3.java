import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class InFile3 { // main class
	public static void main(String[]args) throws Exception { //main method
		Scanner input = new Scanner(System.in); // create scanner
		System.out.println("Enter The File Name"); // prompt user
		String name = input.nextLine(); // get input name
		input.close(); // close the Scanner
		File myFile = new File(name+".txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		while(sc.hasNextLine()){ // while there's more input
			System.out.println(sc.nextLine()); // print the contents
		} 
		sc.close(); // close the Scanner
	}
}
