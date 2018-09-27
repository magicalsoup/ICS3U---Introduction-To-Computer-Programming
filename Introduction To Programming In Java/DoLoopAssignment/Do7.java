import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 27th, 2018
 */
public class Do7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String str = ""; // declare and initialize str to null or nothing
		do { // do this first as long as str is equal to yes
			System.out.println("Please Enter How Many Bags Of Chips "); // prompt user for how many bags of chips	
			int chips = sc.nextInt(); // get user's input
			double cost = chips * 1.25; // calculation for total cost
			System.out.println("Your Total Cost is: " + cost); // print the cost
			System.out.println("Would You Like To Make Another Purchase? "); // ask user if they want to make another purchase
			str = sc.next(); // get user's input
		}
		while(str.equalsIgnoreCase("yes"));
		sc.close();
	}
}
