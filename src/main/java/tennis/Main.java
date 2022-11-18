package tennis;

public class Main {

	// Functions:
	static void pause() {
		try {
			Thread.sleep(3000); // 3 seconds.
			for(int i = 0; i < 2; i++) {
				System.out.println("");
			}
		} catch(InterruptedException e) {
			System.out.println("Error: The programme got interrupted.");
		}
	}
	
	// Main:
	public static void main(String[] args) {		
		System.out.println("* The tennis match is about to start.");
		System.out.println("* The audience gathers and cheers.");
		
		System.out.println("* The two players are about to skip warmming up...");
		TennisPlayer localPlayer = new TennisPlayer("Local Player", 0, "0");
		TennisPlayer guestPlayer = new TennisPlayer("Guest Player", 0, "0");
		localPlayer.chooseOpponent(guestPlayer);
		System.out.println("* The players get ready!");
		pause();
		
		// The match starts:
		localPlayer.score();
		localPlayer.score();
		guestPlayer.score();
		localPlayer.score();
		localPlayer.score(); // LocalPlayer wins the set.
		pause();
		
		// Next set:
		localPlayer.score();
		localPlayer.score();
		localPlayer.score();
		guestPlayer.score();
		guestPlayer.score();
		guestPlayer.score(); // Draw at 40 points.
		guestPlayer.score(); // GuestPlayer has advantage or A.
		localPlayer.score(); // Draw again.
		guestPlayer.score(); // GuestPlayer ahead again.
		guestPlayer.score(); // GuestPlayer wins the set.
	}
}
