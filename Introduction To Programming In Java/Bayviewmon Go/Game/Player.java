package Game;
import java.util.*;
import java.util.concurrent.*;
public class Player {
	String name;
	int level;
	double exp;
	int points;
	int bokeBalls;
	int breatBalls;
	int bultraBalls;
	int berries;
	int monsCatched;
	public Player(String name) {
		this.name = name;
		this.level = 1;
		this.exp = 1;
		this.points = 0;
		this.berries = 0;
		monsCatched = 0;
		Generateballs();
	}
	public void generateStopItems() {
		String ball1 = "";
		String ball2 = "";
		String ball3 = "";
		int random = (int)(Math.random() * 105 + 1);
		int numOfBoke = 0;
		int numOfBreat = 0;
		int numOfBultra = 0;
		int numOfBerry = 0;
		boolean gotSomething = false;
		if(random >= 30) {
			int random2 = (int)(Math.random() * 5 + 1);
			ball1 = random2 == 1? "BokeBall" : "BokeBalls";
			bokeBalls += random2;
			numOfBoke = random2;
			System.out.println("You Got " + numOfBoke + " " + ball1 + "!");
			gotSomething = true;
		}
		if(random >= 40) {
			int random2 = (int)(Math.random() * 3 + 1);
			ball2 = random2 == 1? "BreatBall" : "BreatBalls";
			breatBalls += random2;
			numOfBreat = random2;
			System.out.println("You Got " + numOfBreat + " " + ball2 + "!");
			gotSomething = true;
		}
		if(random >= 50){
			ball3 = "BultraBall";
			bultraBalls++;
			numOfBultra = 1;
			System.out.println("You Got " + numOfBultra + " " + ball3 + "!");
			gotSomething = true;
		}
		if(random >= 80){
			int random2 = (int)(Math.random() * 2 + 1);
			numOfBerry = random2;
			berries+= random2;
			System.out.println("You Got " + numOfBerry + " berries!");
			gotSomething = true;
		}
		if(!gotSomething)
			System.out.println("Sorry, You Didn't Get Anything");
	}
	public void bayviewMonStop() throws Exception{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if(monsCatched % 3 == 0 && monsCatched != 0) {
			System.out.println("Welcome To The BayviewStop!");
			System.out.println("Please Enter Spin");
			while(true) {
				String spin = sc.next();
				if(!spin.equalsIgnoreCase("spin")) {
					System.out.println("Please Try Again");
				}
				else {
					break;
				}
			}
			System.out.println("Spining");
			for(int i = 0; i < 5; i++) {
				System.out.print(".");
				TimeUnit.MILLISECONDS.sleep(250);
			}
			System.out.println();
			generateStopItems();
		}
	}
	public void useBall(Ball ball) {
		if(ball.name.equalsIgnoreCase("BokeBall"))
			bokeBalls--;
		else if(ball.name.equalsIgnoreCase("BreatBall"))
			breatBalls--;
		else if(ball.name.equalsIgnoreCase("BultraBall"))
			bultraBalls--;
	}
	public int ballType(Ball ball) {
		if(ball.name.equalsIgnoreCase("BokeBall"))
			return bokeBalls;
		else if(ball.name.equalsIgnoreCase("BreatBall"))
			return breatBalls;
		else if(ball.name.equalsIgnoreCase("BultraBall"))
			return bultraBalls;
		return 0;
	}
	public boolean hasBalls() {
		if(bokeBalls + breatBalls + bultraBalls != 0)
			return true;
		return false;
	}
	public void Generateballs() {
		for(int i = 0; i < 15; i++) {
			int random = (int)(Math.random() * 3 + 1);
			if(random == 1)
				bokeBalls++;
			else if(random == 2)
				breatBalls++;
			else if(random == 3)
				bultraBalls++;
		}
	}
	public void reset() {
		exp = 0;
		points = 0;
		level = 0;
		name = "";
		bokeBalls = breatBalls = bultraBalls = 0;
	}
	public void getExp() {
		this.exp = exp * 1.5;
	}
	public void getPoints(int points) {
		this.points += points; 
	}
	public void getLevel() {
		this.level++;
	}
	public void levelUp() {
		if(exp >= 10) {
			getLevel();
			System.out.println("You Have Leveled Up!");
			System.out.println("This Is Your New ");
			displayLevel();
		}
	}
	public void getBerries(int amount) {
		this.berries += amount;
	}
	public void catcherLevel() {
		if(points >= 20)
			System.out.println("You Are An Excellent BayviewMon Catcher");
		else if(points < 15)
			System.out.println("A Bit More Practice Is Needed");
		else 
			System.out.println("You Are A Decent BayviewMon Catcher");
	}
	public void displayResultOfCatch() {
		displayLevel();
		displayExperience();
		displayPoints();
		displayInventory();
	}
	public void displayStats() {
		displayName();
		displayExperience();
		displayLevel();
		displayPoints();
		displayMonsCatched();
		displayInventory();
	}
	public void displayName() {
		System.out.println("Name: " + name);
	}
	public void displayPoints() {
		System.out.println("Points " + points);
	}
	public void displayExperience() {
		System.out.println("Experience: "+ exp);
	}
	public void displayLevel() {
		System.out.println("Level: " + level);
	}
	public void displayMonsCatched(){
		System.out.println("MonsCatched: " + monsCatched);
	}
	public void displayInventory() {
		System.out.println("BokeBalls " + bokeBalls);
		System.out.println("BreatBalls " + breatBalls);
		System.out.println("BultraBalls " + bultraBalls);
	}
	public void turtorial() {
		
	}
}
