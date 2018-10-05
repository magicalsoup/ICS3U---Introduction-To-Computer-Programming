package Game;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Name Player: ");
		String playerName = sc.next();
		Player player = new Player(playerName);
		System.out.println("This Is Your CurrentStats ");
		player.displayStats();
		
		sc.close();
	}
}
