import java.util.Scanner; // import the Scanner
/**
 * @author James S
 * @Teacher Ms Leung
 * @Date Oct 25th 2018
 */
public class Sort2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		int arr[] = new int[5]; // create an integer array with a size of 5
		for(int i = 0; i < 5; i++){ // loop that runs 0 to 5
			System.out.println("Please Enter An Integer: "); // prompt user
			arr[i] = sc.nextInt(); // get user input
		}	
		System.out.print("The Array: "); // print
		for(int i = 0; i < arr.length; i++){ // loop that runs 0 to 5
			System.out.print(arr[i] + " "); // print the values in the array
		}
		System.out.println(); // print a blank line
		boolean isSorted = false; // set a isSorted boolean to false
		while(!isSorted){ // while isSorted equals false
			isSorted = true; // set it to true
			for(int i = 0; i < arr.length - 1; i++){ // loop that runs 0 to 4
				if(arr[i] < arr[i + 1]){ // if arr[i] is bigger than arr[i + 1]
					int temp = arr[i]; // set temp to arr[i]
					arr[i] = arr[i+1]; // set arr[i] to arr[i+1]
					arr[i+1] = temp; // set arr[i+1] to temp
					isSorted = false; // set isSorted to false
				}
			}
		}
		System.out.print("The Sorted Array In Descending Order: ");
		for(int i = 0; i < arr.length; i++){ // loop that runs from 0 to 5
			System.out.print(arr[i] + " "); // print the values in the array
		}
		sc.close(); // close the Scanner
	}
}
