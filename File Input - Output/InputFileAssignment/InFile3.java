import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile3 { // main class
	public static void main(String[]args) throws Exception { //main method
		Scanner input = new Scanner(System.in); // create scanner
		System.out.println("Enter The File Name"); // prompt user
		String name = input.nextLine(); // get input name
		input.close(); // close the Scanner
		File myFile = new File(name+".txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		int max = -1; // set the max to -1
		while(sc.hasNext()){ // while there's more input
			max = Math.max(max, sc.nextInt()); // make sure max is the biggest
		} 
		System.out.println(max);
		sc.close(); // close the Scanner
	}
}
