package Game;
import java.util.concurrent.TimeUnit;
public class State {
	String state[] = {"Fled" , "Missed"};
	String state2[] = {"Caught" , "Broke"};
	int percentage;
	public State(int percentage) {
		this.percentage = percentage;
	}
	public void outCome(Mons mon, Player player) throws Exception{
		if(calculate(percentage).equals("Caught")) {
			System.out.println("You Have Caught The " + mon.name + "!");
			player.monsCatched++;
			findingNextBayviewMon();
		}
		
		else if(calculate(percentage).equalsIgnoreCase("Fled")) {
			System.out.println("The " + mon.name + " Has Ran Away!");
			findingNextBayviewMon();
		}
	
		else if(calculate(percentage).equalsIgnoreCase("Missed")) {
			System.out.println("You Missed!");
			System.out.println("Please Try Again");
			mon.missed();
		}
		else if(calculate(percentage).equalsIgnoreCase("Broke")) {
			System.out.println("The BayviewMon Broke Out Of The Ball!");
			System.out.println("Please Try Again");
			mon.missed();
		}
	}
	public void findingNextBayviewMon() throws Exception{
		System.out.println("Waiting For Next BayviewMon To Appear...");
		for(int i = 0; i < 5; i++) {
			TimeUnit.MILLISECONDS.sleep(250);
			System.out.print(".");
		}
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println();
	}
	public String calculate(int percentage) {
		if(percentage >= 70) {
			return "Caught";
		}
		else if(percentage >= 50) {
			int random = (int)(Math.random() * 2);
			return state2[random];
		}
		else {
			int random = (int)(Math.random() * 2);
			return state[random];
		}
	}
}
