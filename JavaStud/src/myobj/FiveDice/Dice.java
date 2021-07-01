package myobj.FiveDice;

import java.util.Arrays;

public class Dice {
	
	final public static int[] DICE = {1, 2, 3, 4, 5, 6};
	public static int RESULT= 5;
	
	
	private int cursor;
	
	int count;
	int tmp;
	
	public void dices() {
		for (int i=1;i<RESULT+1;++i) {			
				int random = (int)(Math.random()*(DICE.length+1)+1);
				DICE[i]= random;
				System.out.println("["+i+"주사위 번호]  ["+DICE[i]+"]");
			
			}
		}

	public void dices(int diceNum) {
		for (int i=1;i<diceNum+1;++i) {			
			int random = (int)(Math.random()*(DICE.length+1)+1);
			DICE[i]= random;
			System.out.println("["+i+"] [주사위 번호 : "+DICE[i]+"]");
		}
	}
	
}
