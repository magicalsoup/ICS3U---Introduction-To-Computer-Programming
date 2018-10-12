/**
 * @author James Su
 * @Date Oct 12, 2018
 * @Teacher Ms Leung
 */
public class Array1 {
	public static void main(String[]args){ 
		int arr[] = new int[20]; // create the array with size of 20
		for(int i = 0; i < arr.length; i++) { // for loop that runs 20 times
			arr[i] = i + 1; // array at index i equals i + 1
		}
		for(int i = 0; i < arr.length; i++) { // for loop that runs 20 times
			System.out.print(arr[i] + " "); // print the integers in the array
		}
	}
}
