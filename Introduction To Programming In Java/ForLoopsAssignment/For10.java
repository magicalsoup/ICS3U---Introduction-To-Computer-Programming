import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For10 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int high = -1; // the variable will store the highest mark
		for(int i = 0; i < 5; i++){ // this loop runs 5 times, from 0 to 5
			System.out.println("Please Enter A Mark: "); // prompt user for a mark
			int mark = sc.nextInt(); // get the inputed mark
			if(mark > high){ // this loops test if the current mark is higher than the variable high, if it is high is equal to the higher mark
				high = mark;
			}
		}
		System.out.println("The Highest Mark Is: " + high); // print the highest mark
		sc.close();
	}
}
