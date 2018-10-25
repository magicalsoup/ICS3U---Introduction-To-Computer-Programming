import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Oct 25th 2018
 */
public class Sort7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		String names[] = new String[5]; // create  a String array with a size of 5
		int marks[] = new int[5]; // create an integer array with a size of 5
		for(int i = 0; i < 5; i++){ // loop that runs 0 to 5
			System.out.println("Please Enter Your Name: "); // prompt user
			names[i] = sc.nextLine(); // get user input
			System.out.println("Please Enter Your Mark: "); // prompt user
			marks[i] = sc.nextInt(); // get user input
			sc.nextLine(); // get rid of scanner glitch
		}	
		boolean isSorted = false; // set a isSorted boolean to false
		while(!isSorted){ // while isSorted equals false
			isSorted = true; // set it to true
			for(int i = 0; i < marks.length - 1; i++){ // loop that runs 0 to 4
				if(marks[i] > marks[i + 1]){ // if arr[i] is bigger than arr[i + 1]
					int temp = marks[i]; // set temp to arr[i]
					marks[i] = marks[i+1]; // set arr[i] to arr[i+1]
					marks[i+1] = temp; // set arr[i+1] to temp
					String temp2 = names[i];
					names[i] = names[i+1];
					names[i + 1] = temp2;
					isSorted = false; // set isSorted to false
				}
			}
		}
		System.out.println("The Sorted Marks: ");
		for(int i = 0; i < marks.length; i++){ // loop that runs from 0 to 5
			System.out.println("Name: " + names[i]); // print the values in the array
			System.out.println("Mark: " + marks[i] ); // print the values in the array
		}
		sc.close(); // close the Scanner
	}
}
