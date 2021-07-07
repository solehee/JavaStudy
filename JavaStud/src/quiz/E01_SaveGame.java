package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E01_SaveGame {
	
	/*
	 	������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ������ ���Ͽ� �����غ�����
	*/
	static int com;
	static int user;
	public static void main(String[] args) {
		
		try {
		FileOutputStream out = new FileOutputStream("game.txt", true);	
		Scanner sc = new Scanner(System.in);
		
		boolean win = true;
		
		while(win) {
				// ��ǻ�� ����
				com = (int)(Math.random()*3+1);
			
				int user=0;
				while(user<1||user>3) {
					System.out.println("[1.���� 2.���� 3.��]");
					System.out.print("������������ �������ּ��� > ");
					user=sc.nextInt();
				}
				System.out.printf("[��ǻ�� %d / ���� %d]\n",com,user);
				game(com,user,win);
				 String n= "[��ǻ�� "+com+" / ���� "+user+"]\n";
				
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
			System.out.println("�������� ��ǻ���� �¸�");
			win = false;
		}else if(com==1 && user==2||com==2&&user==3||com==3&& user==1){
			System.out.println("�������� �÷��̾��� �¸�");
			win = false;
		}
		
		
	}
}
