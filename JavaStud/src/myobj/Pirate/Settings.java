package myobj.Pirate;

public class Settings {
	private int numOfHole;
	private int numOfPlayer;
	private int numOfLaunchBtn;
	private int random;
	public Settings() {
		numOfHole = 10;
		numOfPlayer = 3;
		numOfLaunchBtn = 2;
		random = (int)(Math.random()*numOfLaunchBtn);
		int[] count = new int[10];
	}
	
	
	public Settings(int numOfHole) {
		this.numOfHole = numOfHole;
		this.numOfPlayer = 3;
		this.numOfLaunchBtn = 2;
		random = (int)(Math.random()*numOfLaunchBtn);
		int[] count = new int[10];
	}
	
	public Settings(int numOfHole, int numOfPlayer, int numOfLaunchBtn) {
		this.numOfHole = numOfHole;
		random = (int)(Math.random()*numOfLaunchBtn);
		int[] count = new int[numOfHole];
	}
	
}
