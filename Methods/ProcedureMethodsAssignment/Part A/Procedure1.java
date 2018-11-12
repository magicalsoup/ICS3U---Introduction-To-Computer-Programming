import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The Width And Length: "); // prompt user
		double width = sc.nextDouble(); // get user input
		double length = sc.nextDouble(); // get user input
		writeArea(length, width); // call method
		sc.close(); // close the Scanner
	}
	static void writeArea(double length, double width){
		System.out.println(Math.round(length * width)); // return the area
	}
}
