import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 1st 2018
 * @Teacher Ms Leung
 */
public class StringExercises7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Sacnner
		System.out.println("Please Enter A Sentence/Word: "); // prompt user
		String words = sc.nextLine(); // get user input
		String temp = words.replace(" ", ""); // replace all the spaces with blank/nothing
		int random = (int)(Math.random() * temp.length()); // generate a random number
		System.out.println("Random Character: " + temp.charAt(random)); // print
		String arr[] = words.split(" ");
		int random2 = (int)(Math.random() * arr.length); // generate a random number
		System.out.println("Random Word: " + arr[random2]); // print
		sc.close(); // close the Scanner
	}
}
