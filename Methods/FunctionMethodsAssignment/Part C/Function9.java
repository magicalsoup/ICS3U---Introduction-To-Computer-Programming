import java.util.*;
public class Function9 {
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
		System.out.println("The Area of the Triangle is " + triangleArea(x1,y1,x2,y2,x3,y3)); //prints out answer
	}
	sc.close();
	}
	public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		//d = Square Root[(x2 - x1)^2 + (y2 - y1)^2];
		double a = distance(x1, y1, x2, y2); //length of side a
		double b = distance(x1, x2, y1, y2); //length of side b
		double c = distance(x1, y3, x1, y3); //length of side 
		double s = (a+b+c)/2; //S in Heron's formula
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //calculating heron's formula
		return Math.round(area); //returning triangle area to main function
	}
	static double distance(double x1, double y1, double x2, double y2 ) { // method to calculate distance between 2 points
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); // return the calculation/distance
	}
	/**
	 * @Algorithm
	 * get the input
	 * use herons formula and make a method
	 * call that method and calculate the area
	 * and print it
	 * the method: first use the distance formula to get a, b, and the c side lengths
	 * then use herons formula to find the area
	 */
}
