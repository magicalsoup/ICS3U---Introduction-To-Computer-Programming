import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 1st 2018
 * @Teacher Ms Leung
 */
public class StringExercises8 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter A Sentence/Word: "); // prompt user
		String sentence = sc.nextLine(); // get user input
		String arr[] = sentence.split(" "); // get an array of words from the sentence
		for(int i = 0; i < arr.length; i++){
			String ans = ""; // temp string variable
			if(i != 0){ // if its not the first word
				ans = String.valueOf(arr[i].charAt(0)).toUpperCase(); // temp string variable set it as the first character of the word and capitalize it
			}
			else{
				ans = String.valueOf(arr[i].charAt(0)).toLowerCase(); // temp string variable set it as the first character of the word and lower case it
			}
			for(int j = 1; j < arr[i].length(); j++){ // run from the second letter to the last  one
				ans +=  String.valueOf(arr[i].charAt(j)).toLowerCase(); // get the lower case character
			}
			System.out.print(ans); // print the word
		}
		sc.close(); // close the Scanner
	}
}
