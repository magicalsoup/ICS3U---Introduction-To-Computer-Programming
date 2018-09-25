package WhileLoopsAssignment;
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 25th, 2018
 */
public class While3 {
	public static void main(String[]args){
		int counter = 0;
		while(counter < 100){ // runs as long counter is smaller than 100
			System.out.println(counter);
			counter++; // increment the counter by 1
		}
		while(counter >= 0){ // runs as long counter is bigger or equal to 0
			System.out.println(counter);
			counter--; // decrease the counter by 1
		}
	}
}
