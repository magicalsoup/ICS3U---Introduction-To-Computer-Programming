package Game;

public class Ball {
	String name;
	int value;
	boolean used = false;
	public Ball(String name){
		this.name = name;
		this.value = type(name);
		used = false;
	}
	public void use() {
		used = true;
	}
	public int type(String ball) {
		if(ball.equals("BokeBall"))
			return 10;
		else if(ball.equals("BreatBall"))
			return 20;
		else if(ball.equals("BultrBall"))
			return 30;
		return 0;
	}
	public void evaluate(Ball ball, Player player) {
		if(player.ballType(ball) == 0) {
			System.out.println("Sorry, You Ran Out Of " + ball.name + ", Please Choose Another Type Of Ball");
			this.used = false;
		}
		else {
			player.useBall(ball);
			this.used = true;
		}
	}
}
