import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter How Many Cases: "); // prompt user
		int n = sc.nextInt(); // get user input
		for(int i = 0; i < n; i++) { // runs for n times
			System.out.println("Please Enter The Start X  Coordinate"); // prompt user
			int x1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Start Y  Coordinate"); // prompt user
			int y1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The End X  Coordinate"); // prompt user
			int x2 = sc.nextInt(); // get user input
			System.out.println("Please Enter The End Y  Coordinate"); // prompt user
			int y2 = sc.nextInt(); //get user input
			System.out.println("Mid Point Of The Lines " + midpoint(x1, y1, x2, y2));
		}
		sc.close(); // close the Scanner
	}
	static String midpoint(int x1, int y1, int x2, int y2) { // method to calculate the midpoint of 2 points
		double x = (x1 + x2) / 2, y = (y1 + y2) / 2; // get the coordinates
		return "[ " + x + ", " + y + " ]"; // return the coordinates of the midpoint
	}
	static double distance(int x1, int y1, int x2, int y2 ) { // method to calculate distance between 2 points
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); // return the calculation/distance
	}
	/**
	 * @Algorithm
	 * Basic input and output stuff eg Scanner and main method
	 * prompt user, get input
	 * make a for loop to run that many test case as the input
	 * get the end points of the 2 points
	 * call the method and find the midpoint
	 * print the midpoint
	 * the method: returns the midpoint
	 */
}
