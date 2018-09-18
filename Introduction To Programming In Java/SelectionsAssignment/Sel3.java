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
public class Sel3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // creating the object Scanner and naming it
		System.out.println("Please Enter A Temperature: "); // prompt the user for the temperature
		int temperature = sc.nextInt(); // get the temperature and store it
		// I think the codes below are pretty self explanatory ( the logic of the if loops and etc.)
		if(temperature > 30) {
			System.out.println("hot");
		}
		else if(temperature >= 20) {
			System.out.println("comfortable");
		}
		else if(temperature >= 10) {
			System.out.println("cool");
		}
		else {
			System.out.println("cold");
		}
		//-------------------------------------------------------------------------------------------//
		sc.close(); // close the Scanner
	}
}
