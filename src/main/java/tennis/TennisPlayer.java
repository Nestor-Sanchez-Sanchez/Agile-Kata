package tennis;

public class TennisPlayer {
	
	// Attributes:
	public String name;
	public int sets;
	public String points;
	public TennisPlayer opponent;
	
	// Constructor:
	public TennisPlayer(String name, int sets, String points) {
		this.name = name;
		this.points = points;
	}
	
	// Methods:
	public void chooseOpponent(TennisPlayer rival) {
		this.opponent = rival;
		rival.opponent = this;
	}
	
	public void winPointMessage() {
		System.out.println(String.format("[TV broadcast]: %s scores and now has %s points.", this.name, this.points));
	}
	
	public void winSet( ) {
		System.out.println(String.format("[TV broadcast]: %s wins a set against %s.", this.name, opponent.name));
		this.sets++;
		
		// Restarting the points.
		this.points = "0";
		opponent.points = "0";
	}
	
	public void score() {
		
		// Easy points:
		if(this.points == "0") { this.points = "15"; this.winPointMessage(); }
		else if(this.points == "15") { this.points = "30"; this.winPointMessage(); }
		else if(this.points == "30") { this.points = "40"; this.winPointMessage(); }
		
		// Complex points:
		else if(this.points == "40" && opponent.points == "40") {
			this.points = "A";
			System.out.println(String.format("[TV broadcast]: %s has advantage!", this.name));
		}
		else if(this.points == "40" && opponent.points == "A") {
			opponent.points = "40";
			System.out.println("[TV broadcast]: Still stuck in the deuce!");
		}
		else if(this.points == "A") {
			this.winSet();
		}
		else if(this.points == "40" && Integer.parseInt(opponent.points) < 40) {
			this.winSet();
		}
	}
	
}
