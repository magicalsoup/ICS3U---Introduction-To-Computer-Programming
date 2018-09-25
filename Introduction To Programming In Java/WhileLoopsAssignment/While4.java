import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 25th, 2018
 */
public class While4 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int index = 1;
		while(index <= 10){ // this loop runs along as index is smaller or equal to 10, this loops runs from 1 to 10 inclusive
			System.out.println(index + ". James Su");
			index++; // increment the index by 1
		}
		sc.close();
	}
}
