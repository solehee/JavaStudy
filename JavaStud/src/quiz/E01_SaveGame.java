package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E01_SaveGame {
	
	/*
	 	간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 전적을 파일에 저장해보세요
	*/
	static int com;
	static int user;
	public static void main(String[] args) {
		
		try {
		FileOutputStream out = new FileOutputStream("game.txt", true);	
		Scanner sc = new Scanner(System.in);
		
		boolean win = true;
		
		while(win) {
				// 컴퓨터 랜덤
				com = (int)(Math.random()*3+1);
			
				int user=0;
				while(user<1||user>3) {
					System.out.println("[1.가위 2.바위 3.보]");
					System.out.print("가위바위보를 선택해주세요 > ");
					user=sc.nextInt();
				}
				System.out.printf("[컴퓨터 %d / 유저 %d]\n",com,user);
				game(com,user,win);
				 String n= "[컴퓨터 "+com+" / 유저 "+user+"]\n";
				
				out.write(n.getBytes());
				
				out.close();
				
				
			}	
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void game(int com, int user,boolean win) {
		if(com==user) {
			win = true;
		}else if(user==1&&com==2||user==2&&com==3||user==3&&com==1) {
			System.out.println("게임종료 컴퓨터의 승리");
			win = false;
		}else if(com==1 && user==2||com==2&&user==3||com==3&& user==1){
			System.out.println("게임종료 플레이어의 승리");
			win = false;
		}
		
		
	}
}
