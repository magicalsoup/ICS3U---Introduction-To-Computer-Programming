import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For6 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please Enter A Word: "); // prompt user for a word
		String word = sc.next(); // ask for the word
		System.out.println("Please Enter The Number Of Times: "); // prompt user for the number of times
		int times = sc.nextInt(); // ask for the # of times
		for(int i = 1; i <= times; i++){ // this loop runs 'times' number of times Example: if times = 5, it runs 5 times
			System.out.println(i + ". " + word); // print the line number and the word 
		}
		sc.close(); 
	}
}
