import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 31st 2018
 * @Teacher Ms Leung
 */
public class DataTypes4 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner	
		System.out.println("Enter A Word Or Pharse"); // prompt user
		String s = sc.nextLine(); // get user input
		int e = 0; // set integer e to 0
		for(int i = 0; i < s.length(); i++) { // runs from 0 to the length of the string
			if(s.charAt(i) == 'e') { // if character at i is equal to e
				e++; // increment e
			}
		}
		System.out.println("The Letter e Appears " + e + " Times In Your Word/Phrase"); // print e
		sc.close(); // close the Scanner
	}
}
