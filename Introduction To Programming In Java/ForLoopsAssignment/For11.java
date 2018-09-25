package ForLoopsAssignment;
import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For11 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int low = 101; // the variable will store the lowest mark
		for(int i = 0; i < 5; i++){ // this loop runs 5 times, from 0 to 5
			System.out.println("Please Enter A Mark: "); // prompt user for a mark
			int mark = sc.nextInt(); // get the inputed mark
			if(mark < low){ // this loops test if the current mark is lower than the variable low, if it is low is equal to the lower mark
				low = mark;
			}
		}
		System.out.println("The Lowest Mark Is: " + low); // print the lowest mark
		sc.close();
	}
}

