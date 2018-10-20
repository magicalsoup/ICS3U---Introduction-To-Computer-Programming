import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Oct 19th  2018
 */
public class ArrayProcessing4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		String arr[] = {"one", "two", "five", "four", "six", "three"}; // create the string array
		// swap
		String tmp = arr[2]; // set a temporary string variable to arr[2]
		arr[2] = arr[5]; // set arr[2] to arr[5]
		arr[5] = tmp; // set arr[5] to tmp
		System.out.print("The Array With The 2nd Index And 5th Index Swapped: ");
		for(int i = 0; i < arr.length; i++ ) { // runs from 0 to 6
			System.out.print(arr[i] + " "); // print arr at index i
		}
		System.out.println(); // print a blank line
		System.out.println("Please Enter 2 Values Between 0 - 5: "); // prompt user
		System.out.println("Please Enter The First Index: "); // prompt user
		int i = sc.nextInt(); // get user input
		System.out.println("Please Enter The Second Index: "); // prompt user
		int j = sc.nextInt(); // get user input
		//swap
		String temp = arr[i]; // set a temporary string variable to arr[i]
		arr[i] = arr[j]; // set arr[i] to arr[j]
		arr[j] = temp; // set arr[j] = temp
		System.out.print("The New Array: ");
		for(int cnt = 0; cnt < arr.length; cnt++) { // runs from 0 to 6
			System.out.print(arr[cnt]+ " "); // print arr[cnt]
		}
		sc.close(); // close the Scanner
	}
}
