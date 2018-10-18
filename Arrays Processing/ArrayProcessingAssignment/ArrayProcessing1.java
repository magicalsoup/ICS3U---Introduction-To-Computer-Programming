import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Teacher Ms Leung
 * @Date Oct 18th  2018
 */
public class ArrayProcessing1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		int arr[] = new int[10]; // create the Array with size of 10
		System.out.println("Please Enter 10 Integers: "); // prompt user
		for(int i = 0; i < arr.length; i++){ // a for loop that runs 10 times
			System.out.println("Please Enter An Integer: "); // prompt user;
			arr[i] = sc.nextInt(); // arr at index i is equal to user input
		}
		
		System.out.print("The Array: "); // print
		for(int i = 0; i < arr.length; i++){ // a for loop that runs 10 times
			System.out.print(arr[i] + " "); // print arr at index i
		}
		System.out.println(); // print a blank line
		
		int min = Integer.MAX_VALUE; // set min equal to 2147483648
		int max = Integer.MIN_VALUE; // set max equal to -2147483648
		int sum = 0;
		for(int i = 0; i < arr.length; i++) { // for loop that runs 10 times
			if(arr[i] < min) { // if arr at index i is smaller than min
				min = arr[i]; // min is equal to arr at index i
			}
			if(arr[i] > max) { // if arr at index i is bigger than max
				max = arr[i]; // max is equal to arr at index i
			}
			sum += arr[i];	
		}
		// swap the 4th and 5th element of the array
		int tmp = arr[3]; // set int tmp to arr at index 3
		arr[3] = arr[4]; // set arr at index 3 to arr at index 4
		arr[4] = tmp; // set arr at index 4 to tmp
		System.out.println("The Max Value Is : " + max); // print the max value
		System.out.println("The Minimum Value Is: " + min); // print the minimum value
		System.out.println("The Sum Of The Array Is: " + sum); // print the sum
		System.out.print("The Array With The 4th And 5th Elements Swapped : ");
		for(int i = 0 ; i < arr.length; i++) { // a for loop that runs 10 times
			System.out.print(arr[i] + " "); // print arr at index i
		}
		System.out.println(); // print a blank line
		// bubble sort
		boolean isSorted = false; // set isSorted to false
		while(!isSorted){ // while isSorted is equal to false
			isSorted = true; // set isSorted to true
			for(int i = 0; i < arr.length - 1; i++){ // a loop that runs arr.length - 1 times
				if(arr[i] > arr[i+1]){ // if arr at index i is bigger than arr at index i + 1
					// swap
					int temp = arr[i]; // set temp to arr at index i
					arr[i] = arr[i+1]; // set arr at index i to arr at index i + 1
					arr[i+1] = temp; // set arr at index i + 1 to temp
					isSorted = false; // set isSorted to false
				}
			}
		}
		System.out.print("The Sorted Array In Ascending Order: "); // print
		for(int i = 0; i < arr.length; i++){ // a for loop that runs 10 times
			System.out.print(arr[i] + " "); // print arr at index i
		}
		sc.close(); // close the Scanner
	}
}
