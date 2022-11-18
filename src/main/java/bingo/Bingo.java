package bingo;

import java.util.ArrayList;

public class Bingo {
	
	// Constants:
	final static int bingoSize = 75;
	
	// Functions:
	static ArrayList<Integer> castNumber(ArrayList<Integer> bingoBall) {
		
		// Getting a random number:
		int number = (int) ((float) bingoBall.size() * Math.random()) + 1;
		number = bingoBall.get(number - 1);
		System.out.println("* It rolls the number: " + number);
		
		// Removing a number from the bingo ball.
		for(int i = 0; i < bingoBall.size(); i++) {
			if(number == bingoBall.get(i)) {
				bingoBall.remove(i);
			}
		}
		
		return bingoBall;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> bingoBall = new ArrayList<Integer>();
		for(int i = 0; i < bingoSize; i++) {
			bingoBall.add(i + 1);
		}
		System.out.println(bingoBall.get(1));
		
		//int[] player = { 3, 10, 20, 30, 40 };
		
		// Starting playing:
		for(int i = 0; i < bingoSize; i++) {
			bingoBall = castNumber(bingoBall);
		}
		
	}

}

