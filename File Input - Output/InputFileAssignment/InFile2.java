import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class InFile2 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file3.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		while(sc.hasNextLine()){ // while theres more input
			System.out.println(sc.nextLine()); // print the contents
		} 
		sc.close(); // close the Scanner
	}
}
