import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile12{ // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file12.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		String ans = ""; // set ans to null
		while(sc.hasNext()){ // while there is still more input
			ans = sc.next(); // assign input to ans
		}
		System.out.println(ans); // print the last entry
		sc.close(); // close the Scanner
	}
}
