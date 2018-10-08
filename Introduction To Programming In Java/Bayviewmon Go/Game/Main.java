package Game;
import java.util.*;
public class Main {
	public static void main(String[]args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String respond = "";
		do {
			Generator gen = new Generator();
			System.out.println("Please Enter Your Name Player: ");
			String playerName = sc.next();
			Player player = new Player(playerName);
			System.out.println("This Is Your CurrentStats ");
			player.displayStats();
			player.turtorial();
			System.out.println();
			while(true) {
				if(!player.hasBalls()) {
					System.out.println("Sorry, You Ran Out Of Balls!");
					break;
				}
				Mons BayviewMon = new Mons(gen.GenerateMons());
				Ball ball = new Ball("");
				System.out.println("A Wild " + BayviewMon.name + " Has Appeared");
				while(true) {
					while(true) {
						if(ball.used)
							break;	
						System.out.println("What Type Of ball Would You Like To Use?");
						ball = new Ball(sc.next());
						ball.evaluate(ball, player);
					}
					if(!player.hasBalls()) {
						System.out.println("Sorry, You Ran Out Of Balls");
						break;
					}
					int percentage = (int)(Math.random() * 100 + 1);
					State outcome = new State(percentage + ball.value);
					outcome.outCome(BayviewMon, player);
					if(!BayviewMon.miss)
						break;
				}
				System.out.println();
				player.levelUp();
				player.bayviewMonStop();
			}
			player.catcherLevel();
		} while(respond.equals("Yes"));
		sc.close();
	}
}
