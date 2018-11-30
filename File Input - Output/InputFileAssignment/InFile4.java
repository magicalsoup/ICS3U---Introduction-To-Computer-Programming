import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile4 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file11.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		while(sc.hasNextLine()){ // while there's more input
			System.out.println(sc.nextLine()); // print the contents
		} 
		sc.close(); // close the Scanner
	}
}
