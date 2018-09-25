import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 25th, 2018
 */
public class While3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		while(counter < 100){ // runs from 0 to 99, the condition is that when counter equals 100, it stops
			System.out.println(counter);
			counter++; // increment the counter by 1
		}
		while(counter >= 0){ // runs from 100 to 0, since previously the counter was 100 from the first while loop, all this does is count back down to 0
			System.out.println(counter);
			counter--; // decrease the counter by 1
		}
		sc.close();
	}
}
