import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For8 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sum = 0; // variable to store the sum of the numbers
		for(int i = 0; i < 5; i++){ // this loops runs 5 times, from 0 to 5
			System.out.println("Please Enter A Number: "); // prompt user for numbers
			int num = sc.nextInt(); // get the input number
			sum += num; // add up the numbers
		}
		System.out.println(sum); // print the sum of the 5 numbers
		sc.close();
	}
}
