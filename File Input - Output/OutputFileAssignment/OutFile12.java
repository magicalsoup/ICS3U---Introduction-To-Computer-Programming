import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile12 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file12.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		String names[] = new String[5]; // create an array with size 5
		for (int i = 0; i < 5; i++) { // for loop that runs 5 times
			System.out.println("Enter A Name"); // prompt user
			names[i] = sc.nextLine(); // get user input
		}
		boolean isSorted = false; // set boolean isSorted to false
		while(!isSorted) { // while isSorted is false
			isSorted = true; // set isSorted to true
			for(int i = 0; i < 4; i++) { // for loop that runs 14 times
				if(names[i].compareTo(names[i + 1]) > 0) { // if names[i] is bigger than names[i + 1]
					String tmp = names[i]; // set tmp to names[i];
					names[i] = names[i + 1]; // set names[i] to names[i + 1]
					names[i + 1] = tmp; //set names[i + 1] to tmp
					isSorted = false; // set isSorted to false
				}
			}
		}
		for(int i = 0; i < 5; i++) { // for loop that runs 5 times
			out.println(names[i]); // output names[i] to the file
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
