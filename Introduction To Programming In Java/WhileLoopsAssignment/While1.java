import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class While1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while(index < 10){ // this loops will run until index is equal to 10
			System.out.println("James Su");
			index++; // increment the index by 1
		}
		sc.close();
	}
}
