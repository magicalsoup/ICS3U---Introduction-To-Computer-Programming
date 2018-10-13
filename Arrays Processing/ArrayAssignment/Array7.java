import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 12, 2018
 * @Teacher Ms Leung
 */
public class Array7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		int positives[] = new int[10]; // create an array with size of 10
		int negatives[] = new int[10]; // create an array with size of 10
		for(int i = 0; i < 10; i++) { // a for loop that runs 10 times
			System.out.println("Please Enter An Integer: "); // prompt user
			int num = sc.nextInt(); // get user input
			if(num == 0) { // if num is equal to 0
				break; // break out of the for loop
			}
			if(num < 0) { // if num is smaller than 0 
				negatives[i] = num; // negatives at index i is equal to num
			}
			if(num > 0) { // ifn um is bigger than 0
				positives[i] = num; // positives at index i is equal to num
			}
			
		}
		System.out.print("The Positive Integers: "); // print
		for(int i = 0; i < positives.length; i++) { // a for loop that runs 10 times
			if(positives[i] > 0) { // if positives at index i is bigger than 0
				System.out.print(positives[i] + " "); // print positives at index i
			}
		}
		System.out.println(); // prints a blank line
		System.out.print("The Negative Integers: "); // print
		for(int i = 0; i < negatives.length; i++) {
			if(negatives[i] < 0) { // if negatives at index i is smaller than 0
				System.out.print(negatives[i] + " "); // print negatives at index i
			}
		}
		sc.close(); // close the Scanner
	}
}
