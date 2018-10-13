import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 12, 2018
 * @Teacher Ms Leung
 */
public class Array6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		String firstNames[] = new String[10]; // create a string array with size of 10
		String lastNames[] = new String[10]; // create a string array with size of 10
		int marks[] = new int[10]; // create a integer array with size of 10
		for(int i = 0; i < 10; i++) {
			System.out.println("Please Enter Your First Name: "); // prompt user
			firstNames[i] = sc.next(); // firstNames at index i is equal to the user input
			System.out.println("Please Enter Your Last Name: "); // prompt user
			lastNames[i] = sc.next(); // lastNames at index i is equal to the user input
			System.out.println("Please Enter Your Mark: "); // prompt user
			marks[i] = sc.nextInt(); // marks at index i is equal to user input
		}
		System.out.println("Print The Ones That Passed Or Failed? Pass / Fail "); // prompt user
		String respond = sc.next(); // get user input
		if(respond.equalsIgnoreCase("Pass")) { // if respond equals Pass 
			double average = 0; // initialize and declare variable average
			int numOfStudents = 0; // initialize and declare variable numOfStudents
			for(int i = 0; i < 10; i++) { // a for loop that runs 10 times
				if(marks[i] >= 50) { // if marks at index i is bigger or equal to 50
					System.out.println(firstNames[i] + " " + lastNames[i]); // print firstNames at index i and lastNames at index i
					numOfStudents++; // increment numOfStudents by 1
					average += marks[i]; // add on marks at index i to the average
				}
			}
			average = average / numOfStudents; // calculate the average
			System.out.println("The Average Was: " + average); // print the average
		}
		else { // else
			double average = 0; // initialize and declare variable average
			int numOfStudents = 0; // initialize and declare variable numOfStudents
			for(int i = 0; i < 10; i++) { // a for loop that runs 10 times
				if(marks[i] < 50) { // if marks at index i is smaller than 50
					System.out.println(firstNames[i] + " " + lastNames[i]); // print firstNames at index i and lastNames at index i
					numOfStudents++; // increment numOfStudents by 1
					average += marks[i]; // add on marks at index i to the average
				}
			}
			average = average / numOfStudents; // calculate the average
			System.out.println("The Average Was: " + average); // print the average
		}
		sc.close(); // close the Scanner
	}
}
