package Game;
public class Player {
	String name;
	int level;
	double exp;
	int points;
	int bokeBalls;
	int breatBalls;
	int bultraBalls;
	public Player(String name) {
		this.name = name;
		this.level = 1;
		this.exp = 1;
		this.points = 0;
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
		this.exp = exp * 1.3;
	}
	public void getPoints(int points) {
		this.points += points; 
	}
	public void levelUp() {
		this.level++;
	}
	
	public void displayStats() {
		System.out.println("Name: " + name);
		System.out.println("Experience: "+ exp);
		System.out.println("Level: " + level);
		System.out.println("Points " + points);
	}
	public void turtorial() {
		
	}
}
