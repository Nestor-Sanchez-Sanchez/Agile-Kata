package tamagotchi;

public class Main {

	public static void main(String[] args) {
		
		// Be careful that no attribute surpasses 100 or is below 0.
		Tamagotchi pepito = new Tamagotchi("Pepito");
		
		pepito.feed();
		pepito.feed();
		
		pepito.play();
		pepito.sendToSleep();
		pepito.poop();
		
		System.out.println(pepito.toString());
	}

}
