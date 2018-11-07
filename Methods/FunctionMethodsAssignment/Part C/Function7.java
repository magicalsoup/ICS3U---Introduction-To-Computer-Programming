import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter How Many Cases: "); // prompt user
		int n = sc.nextInt(); // get user input
		for(int i = 0; i < n; i++) { // runs for n times
			System.out.println("Please Enter The X - Coordinate For the First Point"); // prompt user
			int x1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Y - Coordinate For the First Point"); // prompt user
			int y1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The X - Coordinate For the Second Point"); // prompt user
			int x2 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Y - Coordinate For the Second Point"); // prompt user
			int y2 = sc.nextInt(); //get user input
			if(parallel(x1, y1, x2, y2)) { // call the method, and if its true
				System.out.println("Is Parallel"); // print
			}
			else {
				System.out.println("Is Not Parallel"); // print
			}
		}
		sc.close(); // close the Scanner
	}
	static boolean parallel(int x1, int y1, int x2, int y2) { // method to check if its a parallel line
		return y1 / x1 == y2 / x2; // return the boolean of this expression
	}
	/**
	 * @Algorithm
	 * Basic input and output stuff eg Scanner and main method
	 * prompt user, get input
	 * make a for loop to run that many test case as the input
	 * get the end points of the 2 points
	 * call the method and check if they are parallel
	 * print according to the method/boolean
	 * the method: check if the first slope equals the second slope, assuming the start points are 0 as 
	 * the user does not enter the start points
	 */
}
