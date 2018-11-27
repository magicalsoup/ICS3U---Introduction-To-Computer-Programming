import java.io.File; // import file
import java.io.PrintWriter; // import printWriter
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class OutFile7 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file7.txt"); // create file
		PrintWriter out = new PrintWriter(myFile); // create printWriter
		Scanner sc = new Scanner(System.in); // create Scanner
		int array[] = new int[15]; // create an array with size 15
		System.out.println("Enter 15 Numbers Between 1 - 20"); // prompt user
		for(int i = 0; i < 15; i++) { // for loop that runs 15 times
			System.out.println("Enter A Number"); // prompt user
			array[i] = sc.nextInt(); // get user input
		}
		boolean isSorted = false; // set boolean isSorted to false
		while(!isSorted) { // while isSorted is false
			isSorted = true; // set isSorted to true
			for(int i = 0; i < 14; i++) { // for loop that runs 14 times
				if(array[i] > array[i + 1]) { // if array[i] is bigger than array[i + 1]
					int tmp = array[i]; // set tmp to array[i];
					array[i] = array[i + 1]; // set array[i] to array[i + 1]
					array[i + 1] = tmp; //set array[i + 1] to tmp
					isSorted = false; // set isSorted to false
				}
			}
		}
		for(int i = 0; i < 15; i++) { // for loop that runs 15 times
			out.println(array[i]); // output array[i] into file
		}
		sc.close(); // close the Scanner
		out.close(); // close the print writer
	}
}
