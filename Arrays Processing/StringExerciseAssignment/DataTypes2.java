import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 31st 2018
 * @Teacher Ms Leung
 */
public class DataTypes2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter A Word Or Pharse"); // prompt user
		String s = sc.nextLine(); // get user input
		System.out.println("There are " + s.length() + " characters in your word/phrase"); // print the length of the string along with the sentence
		sc.close(); // close the Scanner
	}
}
