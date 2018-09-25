package ForLoopsAssignment;
import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For9 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double sum = 0; // variable to store the sum of the numbers
		for(int i = 0; i < 3; i++){ // this loop runs 3 times, from 0 to 3
			System.out.println("Please Enter A Mark: "); // prompt user for a mark
			int num = sc.nextInt(); 
			sum += num;// add up the numbers
		}
		double average =  (sum/3.0); // get the average of the 3 numbers
		System.out.println("The Average Of The Numbers is " + average); // print the average
		sc.close();
	}
}
