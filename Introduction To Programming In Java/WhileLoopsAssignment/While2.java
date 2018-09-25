import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class While2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		while(counter < 100){ // this loop will run until counter equals 100, so counter will count from 0 to 99
			System.out.println(counter);
			counter++; // increment the counter by 1
		}
		sc.close();
	}
}
