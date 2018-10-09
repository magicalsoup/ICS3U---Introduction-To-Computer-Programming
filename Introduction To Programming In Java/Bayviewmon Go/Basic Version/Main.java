import java.util.Scanner;
/**
 * @File BayviewMon Go! game
 * @author James Su
 * @Date October 3rd 2018
 * @Teacher Ms Leung
 * @Class ICS3U1 - Period 3
 * @Purpose Summative
 */
	/**
	 * @Description
	 * This Program allows the user to catch Bayviewmons
	 */
public class Main {
	public static void main(String[]args)  { // main method
		Scanner sc = new Scanner(System.in); // create the Scanner
		System.out.println("Welcome To BayviewMon Go!"); // title
		System.out.println(); // print a blank line
		System.out.println("Please Enter Your Name: "); // prompt user for their name
		String playerName = sc.next(); // get the player's name
		System.out.println("Welcome " + playerName); // print
		System.out.println("Do You Wish To Start? Yes/No "); // prompt user to start the game
		String respond = sc.next(); // get user's answer
		if(respond.equalsIgnoreCase("No")) { // if respond equals to No
			System.out.println("Too bad, Teacher says we need to play at least once!"); // print
		}
		do { // run this first and then check the condition 
			int totalPoints = 0; // amount of totalPoints
			//-------------------Generate the Different types of balls------------------------//
			boolean stillHaveMoreBalls = true;
			int ballsLeft = 15; // 15 BayviewMon balls in total
			int bokeBalls = 0;
			int breatBalls = 0;
			int bultraBalls = 0;
			for(int i = 0; i < 15; i++) { // this loops runs from 0 to 15 
				int randomBall = (int)(Math.random() * 3 + 1); // generate a random integer from 1 to 3
				if(randomBall == 1) { // if RandomBall equals to 1
					bokeBalls++; // increment the number of bokeBalls by 1
				}
				if(randomBall == 2) { // if RandomBall equals to 2
					breatBalls++; // increment the number of breatBalls by 1
				}
				if(randomBall == 3) { // if RandomBall equals to 3
					bultraBalls++; // increment the number of bultraBalls by 1
				}
			}
			//--------------------------------------------------------------------------------//
			while(true) { // runs until an exit statement is called
				if(ballsLeft == 0) { // if there is no more balls
					System.out.println("Sorry, You Ran Out Of Balls!");
					break; // break out of the loop
				}
				String bayviewMon = ""; // declare and initialize variable BayviewMon as empty
				int bayviewMonPoints = 0; // declare and initialize variable BayviewMonPoints as 0
				int random = (int)(Math.random() * 5 + 1); // generate an random integer from 1 to 5 inclusive
				if(random == 1) { // if Random equals 1
					bayviewMon = "Baykachu"; // set bayviewMon as Baykachu
					bayviewMonPoints = 2; // set bayviewMonPoints as 2
				}
				if(random == 2) { // if Random equals 2
					bayviewMon = "Charmanview";// set bayviewMon as Charmanview
					bayviewMonPoints = 3; // set bayviewMonPoints as 3
				}
				if(random == 3) { // if Random equals 3
					bayviewMon = "Bulbabay";// set bayviewMon as Bulbabay
					bayviewMonPoints = 2; // set bayviewMonPoints as 2
				}
				if(random == 4) { // if Random equals 4
					bayviewMon = "Squirtew";// set bayviewMon as Squirtew
					bayviewMonPoints = 4; // set bayviewMonPoints as 4
				}
				if(random == 5) { // if Random equals 5
					bayviewMon = "Eevay";// set bayviewMon as Eevay
					bayviewMonPoints = 2; // set bayviewMonPoints as 5
				}
				String typeOfBall = ""; // declare and set variable typeOfBall as empty
				System.out.println("A Wild " + bayviewMon + " Appeared");
				while(true) { // a loops that runs until a break statement is called 
					while(true) { // a while loop that runs until a break statement is called
						System.out.println("You Have " + bokeBalls + " BokeBalls and " + breatBalls + " BreatBalls and " + bultraBalls + " BultraBalls left" );
					if(ballsLeft == 0) {
						stillHaveMoreBalls = false;
						System.out.println("Sorry, You Ran Out Of Balls!");
						break;
					}
					System.out.println("What Type Of Ball Would You Like To Use? "); // ask user for type of ball
					typeOfBall = sc.next(); // get users input
						if(typeOfBall.equalsIgnoreCase("BokeBall")) { // if typeOfBall equals to BokeBall
							if(bokeBalls == 0) { // if there is none BokeBalls left
								System.out.println("Sorry, You Ran Out Of BokeBalls, Please Choose Another Type Of Ball"); // print
							}
							else {
								System.out.println("You Chose The BokeBall!"); // print
								bokeBalls--; // decrease the number of bokeBalls by 1
								ballsLeft--; // decrease the amount of total balls by 1
								break; // break out of the while loop
							}
						}
						else if(typeOfBall.equalsIgnoreCase("BreatBall")) { // if typeOfBall equals to BreatBall
							if(breatBalls == 0) { // if there is none BreatBalls left
								System.out.println("Sorry, You Ran Out Of BreatBalls, Please Choose Another Type Of Ball"); // print
							}
							else {
								System.out.println("You Chose the BreatBall!"); // print
								breatBalls--; // decrease the number of breatBalls by 1
								ballsLeft--; // decrease the amount of total balls by 1
								break; // break out of the while loop
							}
						}
						else if(typeOfBall.equalsIgnoreCase("BultraBall")) {
							if(bultraBalls == 0) { // if there is none bultraBalls left
								System.out.println("Sorry, You Ran Out Of BultraBalls, Please Choose Another Type Of Ball"); // print
							}
							else {				
								System.out.println("You Chose The BultraBall!"); // print
								bultraBalls--; // decrease the number of bultraBalls by 1
								ballsLeft--; // decrease the amount of total balls by 1
								break; // break out of the while loop
							}
						}
						else { // if the user enters incorrect input
							System.out.println("INCORRECT INPUT"); // print
							System.out.println("Please Try Again"); // print
						}
					} // end of inner while loop 
					if(stillHaveMoreBalls == false) { // if there's no more balls
						System.out.println("Sorry, You Ran Out Of Balls!");
						break; // break out of the loop
					}
					int percentage = (int)(Math.random() * 100 + 1); // generate an integer from 1 to 100
					if(typeOfBall.equalsIgnoreCase("BokeBall")) { // if typeOfBall equals BokeBall
						percentage += 10; // add 10 to the percentage
					}
					else if(typeOfBall.equalsIgnoreCase("BreatBall")) { // if typeOfBall equals BreatBall
						percentage += 20; // add 20 to the percentage
					}
					else if(typeOfBall.equalsIgnoreCase("BultraBall")) { // if typeOfBall equals BultraBall
						percentage += 30; // add 30 to the percentage
					}
					if(percentage >= 50) { // if the percentage is higher or equal to 50
						System.out.println("You Caught The " + bayviewMon + "!"); // print
						System.out.println("Waiting For The Next Bayviewmon To Appear....."); // print
						System.out.println("..."); // print
						totalPoints += bayviewMonPoints; // add the value of the bayviewMon to the total amount of points
						break; // break out of the while loop
					}
					else {
						int randomOutcome = (int)(Math.random() * 2 + 1); // generate a number from 1 to 2
						if(randomOutcome == 1) { // if rnadomOutcome equals 1
							System.out.println("Oh No! The " + bayviewMon + " Has Ran Away!"); // print
							break; // break out of the while loop
						}
						else if(randomOutcome == 2) { // if randomOutcome equals 2
							System.out.println("You Missed!"); // print
							System.out.println("Please Try Again"); // print
						}
					}				
				} // end of middle while loop
			}// end of outer while loop
			if(totalPoints >= 20) { // if the totalPoints is more than or equal to 20
				System.out.println("You Are An Excellent Bayviewmon Catcher"); // print
			}
			else if(totalPoints < 15) { // if the totalPoints is smaller than 15
				System.out.println("A Bit More Practice Is Needed"); // print
			}
			else { 
				System.out.println("You Are A Decent Bayviewmon Catcher"); // print
			}
			System.out.println("Your Total Amount Of Points Was " + totalPoints); // print
			System.out.println("Do You Want To Play Again? Yes/No"); // ask user if they want to play again
			respond = sc.next(); // get the user's input
		} while(respond.equalsIgnoreCase("Yes")); // if respond equals yes, run the loop
	
		System.out.println("Bye - Bye!"); // print
		sc.close();
	} // end of main method
}
