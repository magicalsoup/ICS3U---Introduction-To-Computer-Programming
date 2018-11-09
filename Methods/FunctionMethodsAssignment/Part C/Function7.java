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
			System.out.println("Please Enter The Start X - Coordinate For the First Point"); // prompt user
			int x1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Start Y - Coordinate For the First Point"); // prompt user
			int y1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The End X - Coordinate For the First Point"); // prompt user
			int x2 = sc.nextInt(); // get user input
			System.out.println("Please Enter The End Y - Coordinate For the First Point"); // prompt user
			int y2 = sc.nextInt(); //get user input
			System.out.println("Please Enter The Start X - Coordinate For the Second Point"); // prompt user
			int x12 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Start Y - Coordinate For the Second Point"); // prompt user
			int y12 = sc.nextInt(); // get user input
			System.out.println("Please Enter The End X - Coordinate For the Second Point"); // prompt user
			int x22 = sc.nextInt(); // get user input
			System.out.println("Please Enter The End Y - Coordinate For the Second Point"); // prompt user
			int y22 = sc.nextInt(); //get user input
			if(slope(x1, y1, x2, y2) == slope(x12, y12, x22, y22)) { // call the method, and if its true
				System.out.println("Is Parallel"); // print
			}
			else {
				System.out.println("Is Not Parallel"); // print
			}
		}
		sc.close(); // close the Scanner
	}
	static double slope(int x1, int y1, int x2, int y2) { // method to calculate distance of 2 points
		if(x2 - x1 == 0) return 0; // in case, so no errors return 0
		return (y2 - y1) / (x2 - x1); // return the calculation / distance
	}
	/**
	 * @Algorithm
	 * Basic input and output stuff eg Scanner and main method
	 * prompt user, get input
	 * make a for loop to run that many test case as the input
	 * get the end points of the 2 points
	 * call the method and check if they are parallel
	 * print according to the method/boolean
	 * the method: check if the first slope equals the second slope
	 * the method: calculate the slope
	 */
}
