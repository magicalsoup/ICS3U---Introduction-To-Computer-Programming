package Game;

public class Mons {
	String name;
	int points;
	boolean miss;
	public Mons(String name) {
		this.name = name;
		this.points = type(name);
		miss = false;
	}
	public void missed() {
		miss = true;
	}
	public int type(String name) {
		if(name.equals("Baykachu") || name.equals("Bulbabay"))
			return 2;
		else if(name.equals("Charmanview"))
			return 3;
		else if(name.equals("Squirtew"))
			return 4;
		else if(name.equals("Eevay"))
			return 5;
		return 0;
	}
}
