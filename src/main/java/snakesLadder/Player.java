package snakesLadder;

public class Player {
	
	// Attributes:
	public String name;
	public int position;
	public boolean won;
	
	// Constructor:
	public Player(String name) {
		this.name = name;
		this.position = 1;
		this.won = false;
	}
	
	// Methods:
	public void move() {
		
		if(this.won) {
			System.out.println(this.name + " already won.");
			
		}
		else {
			int dice = (int) (6.0 * Math.random()) + 1;
			this.position += dice;
			
			String message;
			message = String.format("%s rolls the dice and gets a %s,", this.name, dice);
			message += String.format(" moving to the square %s.", this.position);
			System.out.println(message);
			
			switch(this.position) {
			
				// Victory:
				case 100:
					System.out.println(this.name + " has won the game!");
					this.won = true;
					break;
				
				// Exceeding the limit:
				case 101, 102, 103, 104, 105:
					this.position -= dice;
					System.out.println(this.name + " has exceeded the goal and returned to the former position.");
					break;
				
				// Snake:
				case 12:
					this.position = 2;
					System.out.println(this.name + " has stumbled across a snake.");
					System.out.println(this.name + " is dragged to the square 2.");
					break;
				
				// Ladder:
				case 2:
					this.position = 12;
					System.out.println(this.name + " goes upstairs to the square 12.");
					break;
			}
		}
	}
}
