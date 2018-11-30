import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile6 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file7.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		String arr[] = new String[15]; // create an array of size 15
		int index = 0; // set index to 0
		while(sc.hasNext()){ // while there's more input
			arr[index] = sc.next(); // set the input into the array
			index++; // increment index by 1
		} 
		for(int i = arr.length - 1; i >= 0; i--){ // runs 15 times
			System.out.print(arr[i] + " "); // print arr[i]
		}
		sc.close(); // close the Scanner
	}
}
