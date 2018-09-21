import java.util.Scanner; // import the Scanner
/**
 *@author amagicalsoup
 *@author James Su
 *@Teacher Ms Leung
 *@ClassCode ICS3U
 *@Class ForLoops
 *@Date September 21th, 2018
 */
public class For1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // creating the object from class Scanner and naming it
		for(int i = 0 ; i < 10 ; i++){ // this runs the loop 10 times
			System.out.println("James"); // prints my name on  separate lines
		}
		sc.close(); // closing the Scanner
	}
}
