import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Oct 31st 2018
 * @Teacher Ms Leung
 */
public class StringExercises1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Please Enter True or False: "); // prompt user
		String s = sc.next(); // get user input
		boolean flag = false; // set flag to false
		if(s.equals("true")){ // if s equals true
			flag = true; // assing the value
		}
		System.out.println(flag); // print flag
		sc.close(); // close the Scanner
	}
}
