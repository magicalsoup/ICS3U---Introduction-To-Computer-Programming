package WhileLoopsAssignment;
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 25th, 2018
 */
public class While8 {
	public static void main(String[]args){
		int num = 1;
		int sum = 0;
		while(num <= 10){ // this loop will run as long as num is smaller or equal to 10
			System.out.println(num);
			sum += num; // add num to sum
			num++; // increment num by 1
		}
		System.out.println("The Sum Is: " + sum);
		double average = sum / 10; // calculate the average
		System.out.println("The Average Is: " + average);
	}
}
