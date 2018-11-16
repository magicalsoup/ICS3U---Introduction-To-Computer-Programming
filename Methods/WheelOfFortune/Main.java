import java.util.Scanner;
public class Main {
	static int wheel[] = new int[24];
	static String phrase[] = new String[25];
	static String board;
	static String alpha[] = new String[26]; 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String option = "";
		do {
			int rounds = 1;
			int computerScore = 0;
			int playerScore = 0;
			System.out.println("Please Enter Your Name: "); // prompt user
			String playerName = sc.next(); // get player name
			System.out.println("Welcome " + playerName + "!"); // print
			while(rounds <= 3) {
				initializeGame();
				updateWheel(rounds);
				resetBoard();
				boolean foundTheWord = false;
				while(!foundTheWord) {
					int turn = 1;
					if(isPlayersTurn(turn)) {
						System.out.println("Spin");
						int spinValue = spin();
						System.out.println("You Got: $" + spinValue);
						System.out.println("Options: ");
						System.out.println("1: Guess A Letter");
						System.out.println("2: Buy Vowels");
						System.out.println("3: Guess The Phrase");
						int choice = sc.nextInt();
						if(choice == 1) {
							System.out.println("Please Enter A Letter: ");
							char letter = sc.next().charAt(0);
							while(!validInput(letter)) { 
								letter = sc.next().charAt(0);
							}
						}
						if(choice == 2) {
							if(canBuy(playerScore)) {
								System.out.println("Please Enter A Vowel");
								
							}
						}
					}
					turn++;
				}
				rounds++;
			}
		} while(!option.equalsIgnoreCase("N"));
		sc.close();
	}
	static boolean isPlayersTurn(int turn) {
		return turn % 2 != 0;
	}
	static boolean canBuy(int money) {
		return money >= 250;
	}
	static boolean validInput(char c) {
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i].equals(String.valueOf(c))) return true;
		}
		return false;
	}
	static int spin() {
		int rand = (int)(Math.random() * 24);
		return wheel[rand];
	}
	static void resetBoard() {
		for(int i = 0; i < 26; i++) {
			alpha[i] = String.valueOf((char)('A' + i));
		}
	}
	static void updateWheel(int round) {
		for(int i = 2; i < 21; i++) {
			wheel[i] = (int)(Math.random() * 400) + 500;
		}	
		if(round == 1) wheel[23] = 2500;
		if(round == 2) wheel[23] = 3500;
		if(round == 3) wheel[23] = 5000;
		wheel[21] = wheel[22] = -1; wheel[1] = 0;
	}
	static void findVowel(char vowel) {
		getNewBoard(vowel);
	}
	static void initializeGame() {
		phrase[0] = "CHURN DOWN FOR WHAT";
		phrase[1] = "WHAT IF I TOLD YOU IT REALLY WAS BUTTER?";
		phrase[2] = "WHO YA GONNA CALL? GOATS BUTTER!";
		phrase[3] = "BUTTER SAFE THAN SORRY";
		phrase[4] = "YOU BUTTER BELIEVE IT";
		phrase[5] = "I DON'T ALWAYS RUN, BUT WHEN I DO, I RUN FOR GRADE 9 REP";
		phrase[6] = "NO U";
		phrase[7] = "ONE DOES NOT SIMPLY PUT MEMES FOR A SCHOOL ASSIGNMENT";
		phrase[8] = "CASH ME OUSSIDE HOWBOW DAH?";
		phrase[9] = "YOU DON'T SAY?";
		phrase[10] = "RICK ROLL";
		phrase[11] = "BUT THAT'S NONE OF MY BUSINESS";
		phrase[12] = "YOU MAD BRO?";
		phrase[13] = "DOGE!";
		phrase[14] = "I DON'T WHO GAVE MY CHILD A WHISTLE, BUT I WILL FIND YOU AND I WILL KILL YOU";
		phrase[15] = "WHAT LIFE? DAB! FORTNITE";
		phrase[16] = "ORANGE JUSTICE";
		phrase[17] = "ASIANS: A+ ON MS HUNG'S MATH TEST, WON'T HAVE TO SLEEP IN DOG HOUSE ANYMORE";
		phrase[18] = "F RESH AVA CA DO";
		phrase[19] = "DONALD TRUMP";
		phrase[20] = "THE FLOOR IS LAVA!";
		phrase[21] = "SALT BAE";
		phrase[22] = "IDIOT SANDWICH!";
		phrase[23] = "WHERE IS THE LAMB SAUCE?";
		phrase[24] = "TWO PLUS TWO IS FOUR, MINUS ONE IS THREE QUICK MATH";
	}
	static void displayGameState() {
		System.out.println("Letters Left: ");
		for(int i = 0; i < alpha.length; i++) {
			if(!alpha[i].equals("")) System.out.print(alpha[i] + " ");
		}
	}
	static void printBoard() {
		for(int i = 0; i < board.length(); i++) {
			System.out.print(board.charAt(i));
		}
	}
	static String randomPuzzleSelector() {
		int rand = (int)(Math.random() * 25);
		return phrase[rand];
	}
	static String getNewBoard(char c) {
		String result = "";
		for(int i = 0; i < board.length(); i++) {
			if(!Character.isAlphabetic(board.charAt(i))) result += board.charAt(i);
			else if(board.charAt(i) == c) result += c;
			else result += "_";
		}
		return result;
	}
}
