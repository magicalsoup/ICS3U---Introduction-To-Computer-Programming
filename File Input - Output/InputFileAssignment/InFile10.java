import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile10 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file2.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		String arr[] = new String[10]; // create an array of size 10 
		int index = 0; // set index to 0
		int sum = 0; // set sum to 0
		while(sc.hasNext()){ // while there's more input
			arr[index] = sc.next(); // set the input into the array
			index++; // increment index by 1
		} 
		for(int i = 0; i < arr.length; i++){ // runs 10 times
			sum += Integer.parseInt(arr[i]); // add the integer value of arr[i] to sum
			System.out.print(arr[i] + " "); // print arr[i]
		}
		System.out.println(); // print a line
		System.out.println("Sum: " + sum); // print the sum 
		sc.close(); // close the Scanner
	}
}
