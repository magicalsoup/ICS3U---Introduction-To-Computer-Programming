import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 12, 2018
 * @Teacher Ms Leung
 */
public class Array3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter 10 Integers: "); // prompt user
		int arr[] = new int[10]; // create the array with size of 10
		for(int i = 0; i < arr.length; i++) { // a for loop that runs 10 times
			System.out.println("Please Enter An Integer: "); // propt user
			arr[i] = sc.nextInt(); // arr at index i is equal to the user's input
		}
		System.out.println("Please Enter A Limit: "); // promt user
		int limit = sc.nextInt(); // get user input
		System.out.print("The Integers That Are Greater Or Equal To The Limit: ");
		for(int i = 0 ; i < arr.length; i++) { //a for loop that runs 10 times
			if(arr[i] >= limit) { // if arr at index i is bigger or equal to the limit
				System.out.print(arr[i] + " "); // print arr at index i
			}
		}
		sc.close(); // close the Scanner
	}
}
