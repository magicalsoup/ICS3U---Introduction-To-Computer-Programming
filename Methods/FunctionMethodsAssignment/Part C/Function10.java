package FunctionMethodsAssignment;
import java.util.Scanner;
public class Function10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Cases:"); //prompt user to enter cases
		int n = sc.nextInt(); //number of cases
		for(int i = 0; i < n; i++) { //runs n times
			System.out.println("Please Enter The X - Coordinate For the First Point"); // prompt user
			int x1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Y - Coordinate For the First Point"); // prompt user
			int y1 = sc.nextInt(); // get user input
			System.out.println("Please Enter The X - Coordinate For the Second Point"); // prompt user
			int x2 = sc.nextInt(); // get user input
			System.out.println("Please Enter The Y - Coordinate For the Second Point"); // prompt user
			int y2 = sc.nextInt(); //get user input
			System.out.println("Please Enter The X - Coordinate For the Third Point"); //prompt user
			int x3 = sc.nextInt(); //get user input
			System.out.println("Please Enter The Y - Coordinate For the Third Point"); //prompt user
			int y3 = sc.nextInt(); // get user input
			if(isRightTriangle(x1, y1, x2, y2, x3, y3)) { // call the method and check
				System.out.println("Is A Right Triangle"); // print
			}
			else {
				System.out.println("Is Not A Right Triangle"); // print
			}
		}
		sc.close(); // close the scanner
	}
	static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = distance(x1, y1, x2, y2); //length of side a
		double b = distance(x2, y2, x3, y3); //length of side b
		double c = distance(x1, y1, x3, y3); //length of side c
		double a1 = square(a); // square of a
		double b1 = square(b); // square of b
		double c1 = square(c); // square of c
		System.out.println(a1 + " " + b1 + " " + c1) ;
		if(a1 + b1 == c1 || b1 + c1 == a1 || c1 + a1 == b1) { // if one of them is true
			return true; //return true
		}
		return false; // return false
	}
	static double square(double x) { // method to find the square of a number
		return Math.round(x * x * 100.0)/ 100.0; // return the square and rounds it
	}
	static double distance(double x1, double y1, double x2, double y2 ) { // method to calculate distance between 2 points
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); // return the calculation/distance
	}
	/**
	 * @Algorithm
	 * get the input
	 * call the check method
	 * and print either is a right triangle or not
	 * the method: first use the distance formula to get the distance
	 * then check if the squares of the side equals one another
	 * using the pythagorean theorem a^2 + b^2 = c^2
	 */
}

