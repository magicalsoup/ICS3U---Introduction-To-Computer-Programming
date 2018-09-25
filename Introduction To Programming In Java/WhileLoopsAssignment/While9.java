import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 25th, 2018
 */
public class While9 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Key Word: "); // prompt user for the key word
		String key = sc.next(); // get user inputed word
		int guesses = 0;
		while(true){ // this loop will run forever unless a break or return or exit statement is called
			System.out.println("Please Enter A Word: "); // prompt user for a word
			String word = sc.next(); 
			if(word.equals(key)) // if the word is the key word
				break; // break out of the loop
			else 
				System.out.println("Wrong, Guess Again"); 
			guesses++;
		}
		System.out.println("The Word Was: " + key); // print the key word
		System.out.println("You Guessed It In: " + guesses + " Guesse(s)"); // print the amount of guess(s)
		sc.close();
	}
}
