import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Part A
 * @Teacher Ms Leung
 * @Date Nov 12th 2018
 */
public class Procedure2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter The Balance And The Rate: "); // prompt user
		double balance = sc.nextDouble(); // get user input
		double rate = sc.nextDouble(); //get user input
		interestBalance(balance, rate); // call method
		sc.close(); // close the Scanner
	}
	static void interestBalance(double balance, double rate){
		double newBalance = balance * (1  + (rate / 100.0)); // get the new balance
		System.out.println("Balance: " + newBalance); // print the new balance
	}
}
