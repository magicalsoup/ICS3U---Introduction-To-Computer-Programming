import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 27th, 2018
 */
public class Do5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please Enter A Word: "); // prompt user for a word
		String word = sc.next(); // get user's input
		System.out.println("How Many Times?"); // prompt user for the number of times
		int times = sc.nextInt(); // get user's input
		int index = 0; // declare and set index as 0
		do { // do this first as long as index is smaller than times
			System.out.println(word);
			index++; // increment the index by 1
		}
		while (index < times); // do loop condition
		sc.close();
	}
}
