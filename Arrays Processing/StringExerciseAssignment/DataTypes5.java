import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 31st 2018
 * @Teacher Ms Leung
 */
public class DataTypes5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner	
		System.out.println("Please enter a word: "); // prompt user
		String s = sc.nextLine(); // get user input
		System.out.println("That word downwards is: "); // print
		for(int i = 0; i < s.length(); i++) { // runs from 0 to the length of the string
			System.out.println(s.charAt(i)); // print character at i
		}
		sc.close(); // close the Scanner
	}
}
