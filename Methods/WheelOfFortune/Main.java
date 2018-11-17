import java.util.Scanner;
public class Main {
	static int wheel[] = new int[25];
	static String phrase[] = new String[25], alpha[] = new String[26], board[], output = "", correctPhrase = "";
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String option = "";  initializeGame();
		do {
			System.out.println("Please Enter Your Name: ");  String playerName = sc.next(); 
			System.out.println("Welcome " + playerName + "!"); 
			int rounds = 1, playerScore = 0, playerWinnings = 0, computerWinnings = 0, computerScore = 0;
			while(rounds <= 3) {
				correctPhrase = randomPuzzleSelector(); initializeBoard(); resetAlpha(); updateWheel(rounds); int turns = 0;
				System.out.println("Round: " + rounds); getNewBoard("");
			round: while(true) {
					if(isPlayersTurn(turns)) {
						int spinValue = spin(); 
						while(true) {
							if(spinValue == -1) { playerScore = 0; playerWinnings = 0; System.out.println("You Landed On Bankrupt!"); break;} 
							if(spinValue == 0) {System.out.println("Your Turn Got Skipped!"); break;}
							System.out.println("You Got: " + spinValue);
							System.out.println("Options: ");
							System.out.println("1: Guess A Letter");
							System.out.println("2: Buy Vowels");
							System.out.println("3: Guess The Phrase");
							int choice = sc.nextInt();
							if(choice == 1) {
								System.out.println("Enter A Letter: "); String letter = sc.next(); 
								while(true) {
									if(letterFoundOnAlpha(letter) && !letterFoundOnBoard(letter) && !isVowel(letter)) break;
									System.out.println("Enter A Letter: "); letter = sc.next();
								}
								if(letterFoundOnCorrectPhrase(letter)) {
									int moneyGot = getMoney(letter, spinValue); playerScore += moneyGot; updateAlpha(letter); getNewBoard(letter);
									System.out.println("You Guessed: " + letter + " And You Got $" + moneyGot);
								}
								else { System.out.println("Letter Not Found On Phrase");}
								break;
							}
							else if(choice == 2) {
								if(canBuyVowel(playerScore)) {
									while(canBuyVowel(playerScore)) {
										System.out.println("Enter A Vowel: "); String vowel = sc.next(); playerScore -= 250; getNewBoard(vowel); updateAlpha(vowel);
										System.out.println("The Board2: "); printBoard();
										System.out.println("Would You Like To Buy Another Vowel? Y/N"); String respond = sc.next();
										if(respond.equals("N")) break;
									}
									break;
								}
								else {
									System.out.println("Sorry, You Don't Have Enough Money");
								}
							}
							else if(choice == 3) {
								System.out.println("Please Enter A Phrase: "); sc.nextLine(); String line = sc.nextLine(); 
								if(line.equals(correctPhrase)) {System.out.println("You Guessed Correctly!"); playerWinnings += playerScore > 1000 ? 1000 : playerScore; break round;}
								else {System.out.println("That Is Not The Correct Phrase"); break;}
							}
						}
					}
					else {
						int spinValue = spin();	if(spinValue == -1) { computerScore = 0; computerWinnings = 0; System.out.print("The Computer Got Bankrupt!"); turns++; continue;} 
						if(spinValue == 0) {System.out.println("The Computer's Turn Got Skipped!"); turns++; continue;} System.out.println("Computer Got: $" + spinValue);
						while(true) {
							int randomChoice = (int)(Math.random() * 3) + 1;
							if(randomChoice == 1) { 
								String letter = "";
								while(!letterFoundOnAlpha(letter) && !letterFoundOnBoard(letter)) { letter = getRandomLetter();}
								if(letterFoundOnCorrectPhrase(letter)) {
									int moneyGot = getMoney(letter, spinValue); computerScore += moneyGot; updateAlpha(letter); getNewBoard(letter);
									System.out.println("Computer Guessed: " + letter + " And Got $" + moneyGot); 
								}
								break;
							}
							else if(randomChoice == 2 && canBuyVowel(computerScore)) {
								System.out.println("The Computer Is Buying Vowels: ");
								if(canBuyVowel(computerScore)) {
									int randomTimes = (int)(Math.random() * 5) + 1;
									while(randomTimes-- > 0 && canBuyVowel(computerScore)) {
										String vowel = getRandomVowel();
										System.out.println("Computer Chose : " + vowel); updateAlpha(vowel); getNewBoard(vowel);
									}
									System.out.println("The Board: "); printBoard();
									break;
								}
							}
							else if(randomChoice == 3) {
								System.out.println("The Computer Is Trying To Guess The Phrase");
								int percentage = (int)(Math.random() * 100) + 1;
								if(percentage == 500) {System.out.println("The Computer Guessed Correctly"); computerWinnings += computerScore > 1000? 1000 : computerScore; break round;}
								else {System.out.println("The Computer Guessed Incorrectly"); break;}
							}
						}
					}
					System.out.println("The Board: "); printBoard();
					turns++;
				}
				rounds++;
			}
			if(computerWinnings > playerWinnings) {
				System.out.println("The Computer Won");
			}
			else if(playerWinnings > computerScore) {
				System.out.println("You Won!");
			}
			else {
				System.out.println("It Was A Tie!");
			}
			System.out.println("Would You Like To Play Again? Y/N");
			option = sc.next();
		} while(option.equalsIgnoreCase("Y"));
		sc.close();
	}
	static int getMoney(String c, int spin){ 
		int cnt = 0; 
		for(int i = 0; i < correctPhrase.length(); i++) 
			if(correctPhrase.substring(i, i + 1).equals(c)) cnt += spin; 
		return cnt;
	}
	
	static int spin() { 
		int rand = (int)(Math.random() * 24); 
		return wheel[rand];
	}
	
	static boolean puzzleSolved(String phrase, String output) { 
		return phrase.equals(output);
	}
	
	static boolean isPlayersTurn(int turn) {
		return turn % 2 != 0;
	}
	
	static boolean canBuyVowel(int money) { 
		return money >= 250;
	}
	
	static boolean isVowel(String c ){
		if(c.equals("A") || c.equals("I") || c.equals("E") || c.equals("O") || c.equals("U")) 
			return true; 
		return false;
	}
	
	static boolean letterFoundOnAlpha(String c) { 
		for(int i = 0; i < alpha.length; i++) { 
			if(alpha[i].equals(c)) return true;
		}
		return false;
	}
	
	static boolean letterFoundOnBoard(String letter){ 
		for(int i = 0; i < board.length; i++) {
			if(board[i].equals(letter)) return true; 
		}
		return false;	
	}
	
	static boolean letterFoundOnCorrectPhrase(String letter) {
		for(int i = 0; i < correctPhrase.length(); i++) {
			if(letter.equals(String.valueOf(correctPhrase.charAt(i)))) return true;
		}
		return false;
	}
	static void getNewBoard(String c) {
		for(int i = 0; i < correctPhrase.length(); i++) {
			if(!Character.isAlphabetic(correctPhrase.charAt(i))) board[i] = String.valueOf(correctPhrase.charAt(i));
			else if(correctPhrase.substring(i, i + 1).equals(c)) board[i] = c; 
		}
	}
	
	static void resetAlpha() { 
		for(int i = 0; i < 26; i++) {
			alpha[i] = String.valueOf((char)('A' + i));
		}
	}
	
	static void updateAlpha(String c){
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i].equals(c)) alpha[i] = "";
		}
	}
	
	static void initializeBoard() {
		board = new String[correctPhrase.length()];
		for(int i = 0; i < correctPhrase.length(); i++) {
			board[i] = "_";
		}
	}
	static void updateWheel(int round) {
		for(int i = 2; i < 21; i++) wheel[i] = (int)(Math.random() * 400) + 500;
		if(round == 1) wheel[23] = 2500;
		if(round == 2) wheel[23] = 3500;
		if(round == 3) wheel[23] = 5000;
		wheel[21] = wheel[22] = -1; wheel[1] = 0;
	}
	static void findVowel(String vowel) { 
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
		for(int i = 0; i < board.length; i++) { 
			System.out.print(board[i]);
		}
		System.out.println();
	}
	
	static String getRandomLetter() {
		for(int i = 0; i < alpha.length; i++) {
			if(!isVowel(alpha[i])) return alpha[i];
		}
		return "";
	}
	static String randomPuzzleSelector() { 
		int rand = (int)(Math.random() * 25); 
		return phrase[rand];
	}
	
	static String getRandomVowel() {
		String vowels[] = { "A", "E", "I", "O", "U"};
		int randomIndex = (int)(Math.random() * 5);
		return vowels[randomIndex];
	}
}
