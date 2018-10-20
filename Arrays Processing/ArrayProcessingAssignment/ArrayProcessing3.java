package ArrayProcessingAssignment;
import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Oct 19th  2018
 */
public class ArrayProcessing3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		String names[] = new String[10]; // creating a string array with size of 10
		String areaCode[] = new String[10]; // creating a string array with size of 10
		String phoneNumbers[] = new String[10]; // creating a string array with size of 10
		for(int i = 0; i < 10; i++) { // runs from to 0 to 10
			System.out.println("Please Enter Your Name: "); // prompt user
			names[i] = sc.next(); // get user input
			System.out.println("Please Enter Your Area Code: "); // prompt user
			areaCode[i] = sc.next(); // get user input
			System.out.println("Please Enter Your Phone Number "); // prompt user
			phoneNumbers[i] = sc.next(); // get user input
		}
		System.out.println("The Students With Area Code 905: "); // print
		for(int i = 0; i < 10; i++) { // runs from 0 to 10
			if(areaCode[i].equals("905")) { // if areaCode at index i equals 905
				System.out.println(names[i]); // print
			}
		}
		System.out.println("All The Student's Names And PhoneNumbers: "); // print
		for(int i = 0; i < 10; i++) { // runs 0 to 10
			System.out.println(names[i] + " (" + areaCode[i] + ") " + phoneNumbers[i]); // print
		}
		sc.close(); // close the Scanner
	}
}
