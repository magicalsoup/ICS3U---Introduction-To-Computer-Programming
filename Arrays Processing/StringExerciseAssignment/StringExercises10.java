import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 1st 2018
 * @Teacher Ms Leung
 */
public class StringExercises10 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter A String: "); // prompt user
		String str = sc.nextLine(); // get user input
		int cnt = 0; // set up a counter
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i); // get a character
			if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u' ) { // if c is a vowel
				cnt++; // increment the counter by 1
			}
		}
		System.out.println("The Number Of Vowels In That String Is: " + cnt); // print
		sc.close(); // close the Scanner
	}
}
