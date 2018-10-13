import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 12, 2018
 * @Teacher Ms Leung
 */
public class Array8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		String firstNames[] = new String[10]; // create a string array with size of 10
		String lastNames[] = new String[10]; // create a string array with size of 10
		int marks[] = new int[10]; // create a integer array with size of 10
		for(int i = 0; i < marks.length; i++) { // a for loop that runs 10 times
			marks[i] = -1; // fill the array with -1s
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("Please Enter Your First Name: "); // prompt user
			firstNames[i] = sc.next(); // firstNames at index i is equal to the user input
			System.out.println("Please Enter Your Last Name: "); // prompt user
			lastNames[i] = sc.next(); // lastNames at index i is equal to the user input
			System.out.println("Please Enter Your Mark: "); // prompt user
			int num = sc.nextInt(); // get user input
			if(num < 0) { // if num is smaller than 0
				System.out.println("Sorry, Invalid Mark"); // print
				break;
			}
			marks[i] = num; // marks at index i is equal to num
		}
		if(marks[0] < 0) { // if marks at index 0 is samller than or equal to 0
			System.out.println("There Was No Marks Above Or Equal To 0"); // print
			System.exit(0); // exit the program
		}
		double average = 0; // initialize and declare variable average
		int numOfStudents = 0; // initialize and declare variable numOfStudents
		for(int i = 0; i < 10; i++) { // a for loop that runs 10 times
			if(marks[i] >= 0) { // if marks at index i is bigger than or equal to 0
				System.out.println("Name: " + firstNames[i] + " " + lastNames[i]); // print firstNames at index i and lastNames at index i
				System.out.println("Mark: " + marks[i]); // print marks at index i
				System.out.println();
				numOfStudents++; // increment numOfStudents by 1
				average += marks[i]; // add on marks at index i to the average
			}
		}
		average = average / numOfStudents; // calculate the average
		System.out.println("The Class Average Was: " + average); // print the average
		sc.close(); // close the Scanner
	}
}
