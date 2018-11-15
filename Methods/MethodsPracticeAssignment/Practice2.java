import java.util.Scanner; // import the Scanner
/**
 * @author James Su
 * @Date Nov 15, 2018
 * @Teacher Ms Leung
 */
public class Practice2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); // create the Scanner
		for(int i = 1; i <= 10; i++) { // for loop that runs from 1 to 10
			System.out.println(i + " " + spanishNumbers(i)); // print
		}
		sc.close(); // close the Scanner
	}
	static String spanishNumbers(int number) {
		if(number == 1) { // if number equals 1
			return "uno"; // return the Spanish equivalent
		}
		if(number == 2) { // if number equals 2
			return "dos"; // return the Spanish equivalent
		}
		if(number == 3) { // if number equals 3
			return "tres"; // return the Spanish equivalent
		}
		if(number == 4) { // if number equals 4
			return "cuatro"; // return the Spanish equivalent
		}
		if(number == 5) { // if number equals 5
			return "cinco"; // return the Spanish equivalent
		}
		if(number == 6) { // if number equals 6
			return "seis"; // return the Spanish equivalent
		}
		if(number == 7) { // if number equals 7
			return "siete"; // return the Spanish equivalent
		}
		if(number == 8) { // if number equals 8
			return "ocho"; // return the Spanish equivalent
		}
		if(number == 9) { // if number equals 9
			return "nueve"; // return the Spanish equivalent
		}
		return "diez"; // return 10 in Spanish
	}
}
