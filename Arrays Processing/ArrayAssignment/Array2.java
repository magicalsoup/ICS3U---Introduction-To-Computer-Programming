import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 12, 2018
 * @ClassMs Leung
 */
public class Array2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter 10 Integers: "); // prompt user
		int arr[] = new int[10]; // create the array
		for(int i = 0; i < arr.length; i++) { // for loop that runs 10 times
			System.out.println("Please Enter An Integer: "); // prompt user
			arr[i] = sc.nextInt(); // array at index i is equal to the user's input
		}
		// prints them in order
		System.out.print("The Array In Order: "); // print
		for(int i = 0; i < arr.length; i++) {// for loop that runs 10 times
			System.out.print(arr[i] + " "); // prints the integers in the array
		}
		System.out.println(); // print a blank line
		System.out.print("The Array In Reverse Order: "); // print
		// prints them in reverse order
		for(int i = arr.length - 1; i >= 0; i--) {// for loop that runs 10 times
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // print a blank line
		System.out.print("The Positive Integers: "); // print
		// prints all postive integers including 0
		for(int i = 0; i < arr.length; i++) { // for loop that runs 10 times
			if(arr[i] >= 0) { // if the arr at index i is bigger or equal to 0
				System.out.print(arr[i] + " "); // prints arr at index i
			}
		}
		System.out.println(); // print a blank line
		System.out.print("The Negative Integers: ");
		for(int i = 0; i < arr.length; i++) { // for loop that runs 10 times 
			if(arr[i] < 0) { // if the arr at index i is smaller than 0
				System.out.print(arr[i] + " "); // print arr at index i
			}
		}
		sc.close();
	}
}
