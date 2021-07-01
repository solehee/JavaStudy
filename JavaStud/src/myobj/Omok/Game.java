package myobj.Omok;

import java.util.Scanner;

public class Game implements Interface {
	
	// 좌표
	int[][] omok = new int[10][10];
	
	@Override
	public void viewOmok() {
		int y = 0;
		int x = 64;
		
		for(int[] i : omok) {
			y++;
			System.out.print(y<10? y+" ":y);
		
		for(int j : i) {
			if(j == 1) {
				System.out.print(" ●");
			}else if(j==2) {
				System.out.print(" ○");
			}else {
				System.out.print(" □");
			}
		}
		System.out.println();
		}
		System.out.print("   ");
		for(int[] i : omok) {
			x++;
			System.out.print((char)x+" ");
		}
		System.out.println();
	}

	@Override
	public int OmokAction(char x, int y, int turn) {
		int chX=((int)x) - 97;
		
		int chY = --y;		
		int _x,_y=0;
		
		String team;
		team=turn==1? "흑돌" : "백돌";
		
		if(omok[chY][chX] != 0) {
			System.out.println("게임준비가 되었습니다.");			
			return 0;
		}else {
			omok[chY][chX] = turn;
		}
		_x = chX;
		_y = chY;
		
		int count =0;
			while(omok[_y][_x] == turn &&_x>0) {
				_x--;
			}
			while(omok[_y][_x] == turn &&_x<=10) {
				count++;
			}
			if(count == 5) {
				System.out.println(team+"[win]");
				return 1;
			}
		_x = chX;
		_y = chY;
		
		count =0;
			while(omok[_y][_x] == turn &&_y>0) {
				_y--;
			}
			while(omok[_y][_x] == turn &&_y<=10) {
				count++;
			}
			if(count == 5) {
				System.out.println(team+"[win]");
				return 1;
			}
		_x = chX;
		_y = chY;
		
		count =0;
			while(omok[_y][_x] == turn &&_y>0&&_x>0) {
				_y--;
				_x--;
			}
			while(omok[++_y][++_x] == turn &&_y<=10&&_x<=10) {
				count++;
			}
			if(count ==5) {
				System.out.println(team+"[win]");
				return 1;
			}
		_x = chX;
		_y = chY;
		
		count =0;
			while(omok[_y][_x] == turn &&_y>0&&_x>0) {
				_y++;
				_x++;
			}
			while(omok[--_y][--_x] == turn &&_y<=10&&_x<=10) {
				count++;
			}
			if(count ==5) {
				System.out.println(team+"[win]");
				return 1;
			}
			return 0;


	}

	
	
}
