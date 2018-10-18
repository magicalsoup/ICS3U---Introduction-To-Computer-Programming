import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Oct 18th  2018
 */
public class ArrayProcessing2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		int[] mathMarks = new int[10]; // create an int array with size of 10
		int[] sciMarks = new int[10]; // create an int array with size of 10
		String[] names = new String[10]; // create an string array with size of 10
		for(int i = 0; i < 10; i++){ // a for loop that runs 10 times
			System.out.println("Please Enter Your Name: "); // prompt user
			names[i] = sc.next(); // names at index i is equal to user input
			System.out.println("Please Enter Your Math Mark: "); // prompt user
			mathMarks[i] = sc.nextInt(); // mathMarks at index i is equal to user input
			System.out.println("Please Enter Your Science Mark: "); // prompt user
			sciMarks[i] = sc.nextInt(); // sciMarks at index i is equal to user input
		}
		for(int i = 0; i < 10; i++){ // a for loop that runs 10 times
			System.out.println("Name : " + names[i]); // print names at index i
			System.out.println("Average: " + (mathMarks[i] + sciMarks[i]) / 2.0); // print out the average
		}
		sc.close(); // close the Scanner
	}
}
