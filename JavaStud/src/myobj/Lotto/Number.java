package myobj.Lotto;

import java.util.Random;

public class Number {
	public int num;
	public int bonus;
	final private int MAX_NUMBER = 45;
	
	
	private static Random ran = new Random();
	
	public Integer number() {
		return num = ran.nextInt(MAX_NUMBER+1);
	}
	public Integer bonusNum() {
		return bonus = ran.nextInt(MAX_NUMBER+1);
	}
}
