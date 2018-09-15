package SelectionsAssignment;
import java.util.Scanner; // import the Scanner
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class Selections
 *@Date September 14th, 2018
 */
public class Sel8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter Your First Mark That is Between 1 - 100: "); // prompt user for their first mark
		int firstMark = sc.nextInt(); // get the first mark and store it
		System.out.println("Please Enter Your Second Mark That is Between 1 - 100: "); // prompt user for their second mark
		int secondMark = sc.nextInt(); // get the second mark and store it
		if(firstMark > secondMark) { // if the first mark is higher than the second mark
			System.out.println(firstMark);
		}
		else { // if the second mark is higher than the first mark OR both are equal
			System.out.println(secondMark);
		}
		sc.close(); // close the Scanner
	}
}
