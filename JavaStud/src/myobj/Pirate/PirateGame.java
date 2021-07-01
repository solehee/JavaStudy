package myobj.Pirate;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PirateGame{
	Scanner sc;
	int random = (int)(Math.random()*11+1);	
	boolean check = true; 
	private Settings env;
	int [] count= new int[10];
	int i=0;
	
	public PirateGame(Settings setting) {
		env = setting;
		sc = new Scanner(System.in);
	}
	
	public void start() {
		while(check) {	
		System.out.print("원하는 곳 찌르기 > ");
		int num = sc.nextInt();
			check = (random != num);
		count[i++]=num;
		}		
	}
}
