package Game;
public class Generator {
	String mons[] = {"Byakachu", "Charmanview", "Bulbaby", "Squirtew", "Eevay"};
	public Generator() {
		
	}
	public String GenerateMons() {
			int random = (int)(Math.random() * 3);
			return mons[random];
	}
}
