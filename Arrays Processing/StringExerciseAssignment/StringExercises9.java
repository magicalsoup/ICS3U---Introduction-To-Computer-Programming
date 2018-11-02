import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 1st 2018
 * @Teacher Ms Leung
 */
public class StringExercises9 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Enter a sentence: "); // prompt user
		String sentence = sc.nextLine(); // get user input
		String arr[] = sentence.split(" "); // get an array of words from the sentence
		System.out.println("Enter a word: "); // prompt user
		String word = sc.next(); // get user input
		for(int i = 0; i < arr.length; i++){ // loop through the array
			if(!arr[i].equals(word)){ // if arr[i] does not equal that word
				System.out.print(arr[i]+ " "); // print
			}
		}
		sc.close(); // close the Scanner
	}
}
