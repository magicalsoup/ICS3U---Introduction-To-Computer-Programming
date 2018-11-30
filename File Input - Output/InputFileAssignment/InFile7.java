import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile7 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file4.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		String arr[] = new String[20]; // create an array of size 20
		int index = 0; // set index to 0
		while(sc.hasNext()){ // while there's more input
			arr[index] = sc.next(); // set the input into the array
			index++; // increment index by 1
		} 
		for(int i = 0; i < arr.length; i++){ // runs 20 times
			System.out.print(arr[i] + " "); // print arr[i]
		}
		sc.close(); // close the Scanner
	}
}
