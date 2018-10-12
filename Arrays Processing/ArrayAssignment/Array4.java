import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 12, 2018
 * @Teacher Ms Leung
 */
public class Array4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter 10 Words: ");
		String arr[] = new String[10]; // create an string array with size of 10;
		for(int i = 0 ; i < arr.length; i++) { // a for loop that runs 10 times
			System.out.println("Please Enter A Word: "); // prompt user
			arr[i] = sc.next(); // get user input
		}
		System.out.print("The Words In Reverse Order: ");
		for(int i = arr.length - 1; i >= 0 ;i--) { // a for loop that runs 10 times
			System.out.print(arr[i] + " "); // print arr at index i
		}
		sc.close(); // close the Scanner
	}
}
