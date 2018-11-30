import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 27, 2018
 */
public class InFile8 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file9.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		int max = -1; // set the max to -1
		while(sc.hasNext()){ // while there's more input
			max = Math.max(max, sc.nextInt()); // make sure max is the biggest
		} 
		System.out.println(max * 0.9);
		sc.close(); // close the Scanner
	}
}
