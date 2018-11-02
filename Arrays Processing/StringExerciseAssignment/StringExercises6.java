import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 1st 2018
 * @Teacher Ms Leung
 */
public class StringExercises6 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Sacnner
		System.out.println("Please Enter A Sentence: "); // prompt user
		String str = sc.nextLine(); // get user input
		//sc.nextLine(); // get rid of scanner glitch
		System.out.println("Enter The Starting Index: "); // prompt user
		int startIndex = sc.nextInt(); // get the index 
		System.out.println("Enter The End Index: "); // prompt user
		int endIndex = sc.nextInt(); // get end index;
		if(startIndex >= 0 && endIndex < str.length()){ // if its in bounds
			System.out.println(str.substring(startIndex, endIndex + 1)); // print
		}
		else{
			System.out.println("Invalid Input"); // print
		}
		sc.close(); // close the Scanner
	}
}
