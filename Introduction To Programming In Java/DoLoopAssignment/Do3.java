/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 27th, 2018
 */

public class Do3 {
	public static void main(String[]args){
		int num = 0; // declare and set num as 0
		do { // do this first as long as num is smaller than 100
			System.out.println(num); 
			num++; // increment num by 1
		}
		while (num < 100); // first do loop condition
		
		do { // do this first as long as num is bigger than or equal 0 
			System.out.println(num);
			num--;// decrease num by 1
		}
		while(num >= 0); // second do loop condition
	}
}
