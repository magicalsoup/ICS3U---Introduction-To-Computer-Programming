package FunctionMethodsAssignment;
import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 11th 2018
 */
public class Function4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The X - Coordinate For the First Point"); // prompt user
		int x1 = sc.nextInt(); // get user input
		System.out.println("Please Enter The Y - Coordinate For the First Point"); // prompt user
		int y1 = sc.nextInt(); // get user input
		System.out.println("Please Enter The X - Coordinate For the Second Point"); // prompt user
		int x2 = sc.nextInt(); // get user input
		System.out.println("Please Enter The Y - Coordinate For the Second Point"); // prompt user
		int y2 = sc.nextInt(); //get user input
		System.out.println("The Distance Of The 2 Points Is: " + distance(x1, y1, x2, y2)); // print the distance
		System.out.println("The Slope Of The 2 Points Is: " + slope(x1, y1, x2, y2)); // print the slope
		System.out.println("The Midpoint Of The 2 Points Is: " + midpoint(x1, y1, x2, y2)); // print the midpoint
		sc.close(); // close the Scanner
	}
	static double distance(int x1, int y1, int x2, int y2 ) { // method to calculate distance between 2 points
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); // return the calculation/distance
	}
	static double slope(int x1, int y1, int x2, int y2) { // method to calculate distance of 2 points
		if(x2 - x1 == 0) return 0; // in case, so no errors return 0
		return (y2 - y1) / (x2 - x1); // return the calculation / distance
	}
	static String midpoint(int x1, int y1, int x2, int y2) { // method to calculate the midpoint of 2 points
		double x = (x1 + x2) / 2, y = (y1 + y2) / 2; // get the coordinates
		return "[ " + x + ", " + y + " ]"; // return the coordinates of the midpoint
	}
}
