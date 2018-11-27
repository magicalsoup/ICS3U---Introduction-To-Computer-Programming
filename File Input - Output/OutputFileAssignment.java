import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile1 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file1.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		out.println("James Su"); // output my name into the file
		out.close(); // close the print writer
	}
}
