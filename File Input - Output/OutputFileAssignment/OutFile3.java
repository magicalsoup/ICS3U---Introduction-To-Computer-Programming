import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile3{ // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file3.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		for(int i = 1; i <= 10; i++) { // create for loop that runs 10 times
			out.print(i + " "); // output i to my file
		}
		out.close(); // close the print writer
	}
}
