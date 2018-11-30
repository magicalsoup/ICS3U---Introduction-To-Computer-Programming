import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile9 { // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file2.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		double avg = 0; // set avg to 0
		while(sc.hasNext()){
			avg += sc.nextInt(); // add the input to avg
		}
		System.out.println(avg / 10.0); // print the average
		sc.close(); // close the Scanner
	}
}
