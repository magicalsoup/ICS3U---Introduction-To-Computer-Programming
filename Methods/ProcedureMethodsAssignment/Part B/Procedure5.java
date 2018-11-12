import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part B
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The First Number: "); // prompt user
		int a = sc.nextInt(); // get user input
		System.out.println("Please Enter The Second Number: "); // prompt user
		int b = sc.nextInt(); // get user input
		System.out.println("Please Enter The Third Number: "); // prompt user
		int c = sc.nextInt(); // get user input
		print(a, b, c); // call method
		sc.close(); // close the Scanner
	}
	static void print(int a, int b, int c) { 
		int max = Math.max(a, Math.max(b, c)); // get the max
		int min = Math.min(a, Math.min(b, c)); // get the min
		System.out.println("Min: " + min); // print min
		System.out.println("Max: " + max); // print max
	}
}
