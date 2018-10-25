import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Oct 25th 2018
 */
public class Sort6 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		String names[]; // create a String 
		System.out.println("How Many Names Are You Going To Enter? "); // prompt user
		int n = sc.nextInt(); // get user input
		sc.nextLine(); // get rid of scanner glitch
		names = new String[n]; // create it with size of n
		for(int i = 0; i < n; i++) {// loop that runs from 0 to n
			System.out.println("Please Enter A Name: "); // prompt user
			names[i] = sc.nextLine(); // get user input
		}
		boolean isSorted = false; // set a isSorted boolean to false
		while(!isSorted){ // while isSorted equals false
			isSorted = true; // set it to true
			for(int i = 0; i < names.length - 1; i++){ // loop that runs 0 to 4
				if(names[i].compareTo(names[i + 1]) > 0){ // if arr[i] is bigger than arr[i + 1] in terms of value of strings
					String temp = names[i]; // set temp to arr[i]
					names[i] = names[i+1]; // set arr[i] to arr[i+1]
					names[i+1] = temp; // set arr[i+1] to temp
					isSorted = false; // set isSorted to false
				}
			}
		}
		System.out.println("The Names In Alphabetical Order: "); // print
		for(int i = 0; i < n; i++) { // loop that runs from 0 to n
			System.out.println(names[i] + " "); // print the values in the array
		}
		sc.close(); // close the Scanner
	}
}
