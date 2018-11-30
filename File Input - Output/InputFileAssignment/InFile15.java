import java.io.File; // import file
import java.util.Scanner; // import Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Nov 30, 2018
 */
public class InFile15{ // main class
	public static void main(String[]args) throws Exception { //main method
		File myFile = new File("file11.txt"); // create file
		Scanner sc = new Scanner(myFile); // create Scanner
		Scanner input = new Scanner(System.in); // create Scanner
		int marks[] = new int[5]; // make an array of size 5
		String names[] = new String[5]; // make an array of size 5
		int index = 0; // set index to 0
		double avg = 0; // set avg to 0
		while(sc.hasNext()){
			names[index] = sc.next(); // get file input
			System.out.println("Enter A Mark For Student: " + names[index]); // prompt user
			marks[index] = input.nextInt(); // get user input
			avg += marks[index]; // add marks[index] to avg
			index++; // increment index by 1
		}
		for(int i = 0; i < 5; i++){ // runs 5 times
			System.out.println("Name: " + names[i]); // print names[i]
			System.out.println("Mark: " + marks[i]); // print marks[i]
			System.out.println(); // print a line
		}
		System.out.println("Average: " + avg / 5.0); // print the average
		input.close(); // close the Scanner
		sc.close(); // close the Scanner
	}
}
