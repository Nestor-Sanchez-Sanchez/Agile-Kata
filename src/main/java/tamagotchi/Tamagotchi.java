package tamagotchi;

public class Tamagotchi {
	
	// Attributes:
	public String name;
	public int hungriness;
	public int fullness;
	public int tiredness;
	public int happiness;
	
	// Constructor:
	public Tamagotchi(String name) {
		this.name = name;
		this.hungriness = 50;
		this.fullness = 0;
		this.tiredness = 0;
		this.happiness = 0;
	}
	
	// Methods:
	public void feed() {
		this.hungriness--;
		this.fullness++;
	}
	
	public void play() {
		this.tiredness++;
		this.happiness++;
	}
	
	public void sendToSleep() {
		this.tiredness--;
	}
	
	public void poop() {
		this.fullness--;
	}
	
	public void passTime() {
		this.hungriness++;
		this.tiredness++;
		this.happiness--;
	}
	
	public String toString() {
		String message;
		message = String.format("---[%s's status]---", this.name);
		message += String.format("\nHungriness: %s.\nFullness: %s.", this.hungriness, this.fullness);
		message += String.format("\nTiredness: %s.\nHappiness: %s.", this.tiredness, this.happiness);
		message += "\n----------";
		return message;
	}
	
}