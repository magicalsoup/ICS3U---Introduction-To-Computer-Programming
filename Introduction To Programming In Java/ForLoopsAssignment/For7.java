import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please Enter The Starting Number: "); // prompt user for starting number
		int start = sc.nextInt(); // get the starting number
		System.out.println("Please Enter The End Number: "); // prompt user for the end number
		int end = sc.nextInt(); // get the end number
		int cnt = 0;
		for(int i = start; i <= end; i++){ // this loop runs from start to end inclusive
			cnt = i;
		}
		System.out.println(cnt); // print the count 
		sc.close(); 
	}
}
	
