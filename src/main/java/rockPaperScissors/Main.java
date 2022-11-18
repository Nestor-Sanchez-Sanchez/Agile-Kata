package rockPaperScissors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input a movement (rock, paper, scissors)");
		Scanner scanner = new Scanner(System.in);
		String player1 = scanner.nextLine();
		System.out.println("Input a movement (rock, paper, scissors)");
		String player2 = scanner.nextLine();
		System.out.println(game(player1, player2));
		
		
	}
	
	public static String game(String player1, String player2) {
		String win = "player1 wins";
	    if (player1.equals(player2))
	      return "draw";
	    if (player1.equals("rock") && player2.equals("scissors"))
	      return "player1 wins";
	    if (player1.equals("scissors") && player2.equals("paper"))
	      return "player1 wins";
	    if (player1.equals("paper") && player2.equals("rock"))
	      return "player1 wins";
	    return "player2 wins";
	  }

}
