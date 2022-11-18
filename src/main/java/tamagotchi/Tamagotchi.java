package tamagotchi;

import java.util.Scanner;

public class Tamagotchi {

	private static final int INITIAL_STATE = 5;
	private static final int STATE_CHANGE_AMOUNT = 1;

	private int hunger;
	private int fullness;
	private int tiredness;
	private int happiness;

	public Tamagotchi() {
		this.hunger = INITIAL_STATE;
		this.fullness = INITIAL_STATE;
		this.tiredness = INITIAL_STATE;
		this.happiness = INITIAL_STATE;
	}

	public void feed() {
		hunger = decrease(hunger);
		fullness = increase(fullness);
	}

	public void play() {
		happiness = increase(happiness);
		tiredness = increase(tiredness);
	}

	public void putToBed() {
		tiredness = decrease(tiredness);
	}

	public void poop() {
		fullness = decrease(fullness);
	}

	public void tick() {
		hunger = increase(hunger);
		tiredness = increase(tiredness);
		happiness = decrease(happiness);
	}

	private int increase(int state) {
		return state + STATE_CHANGE_AMOUNT;
	}

	private int decrease(int state) {
		return state - STATE_CHANGE_AMOUNT;
	}

	public int getHunger() {
		return hunger;
	}

	public int getFullness() {
		return fullness;
	}

	public int getTiredness() {
		return tiredness;
	}

	public int getHappiness() {
		return happiness;
	}
	
	public static void main(String[] args) {
		
		Tamagotchi tm = new Tamagotchi();
		Scanner sc=new Scanner(System.in);
		String action="";
		
		do {
			System.out.println("Hunger: "+tm.getHunger());
			System.out.println("Fullness: "+tm.getFullness());
			System.out.println("Tired: "+tm.getTiredness());
			System.out.println("Happiness: "+tm.getHappiness());
			
			System.out.println("What do you want: feed, play, beed, poop, tick");
			action=sc.nextLine();
			switch (action) {
			case "feed":
				tm.feed();
				break;
			case "play":
				tm.play();
				break;
			case "beed":
				tm.putToBed();
				break;
			case "poop":
				tm.poop();
				break;
			case "tick":
				tm.tick();
				break;
			default:
				break;
			}
		}while(tm.getHunger()<=10 || tm.getTiredness()<=10);
		
		System.out.println("tamagotchi died");
		
		
		
	}

}