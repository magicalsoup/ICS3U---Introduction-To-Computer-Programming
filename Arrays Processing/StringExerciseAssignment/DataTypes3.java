import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 31st 2018
 * @Teacher Ms Leung
 */
public class DataTypes3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner	
		System.out.println("Enter A Word Or Pharse"); // prompt user
		String s = sc.nextLine(); // get user input
		System.out.println("The first character is + " + s.charAt(0)); // print the first character
		System.out.println("The last character is " + s.charAt(s.length() - 1)); // print the last character
		sc.close(); // close the Scanner
	}
}
