/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 21th, 2018
 */
public class For2 {
	public static void main(String[]args){
		int cnt = 0;
		for(int counter = 0; counter < 100; counter++){ // this loop runs 100 times
			// on the last run, this counter will be 99 and then the loop will exit
			cnt = counter;
		} 
		System.out.println(cnt); // a print line to check the number the counter is on
	}
}
