package quiz;

import java.util.Scanner;

public class B09_31Game {
	/*
	 	# 31 게임을 만들어보세요
	 	1. 컴퓨터와 사람이 번갈아 가면서 숫자를 선택해야한다.
	 	(1,2,3 밖에 선택할 수 없음)
	 	
	 	2. 컴퓨터는 랜덤으로 숫자를 선택한다.
	 	
	 	3. 선공은 랜덤으로 결정한다
	 	
	 	4. 마지막에 31 이상의 숫자를 부르는 플래이어가 패버한다
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//0은 컴퓨터,1은사람
		int turn = (int)(Math.random()*2);
		int num=0;

		if (turn == 0) {
			System.out.println("컴퓨터 선공");
		}
		else {
			System.out.println("당신의 선공!");
		}
		while (num<31) {
			
			if(turn == 0) {
				int com = (int)(Math.random()*3+1);
				num +=com;
				System.out.printf("컴퓨터 %d를 골랐습니다. [현재 숫자: %d]\n", com,num);
			}else {
				int user=0;
				while(user<1||user>3) {
				System.out.print("1,2,3? ");
				user=sc.nextInt();
				}
				num+=user;
				System.out.printf("[현재 숫자 :%d]\n",num);
			}
			// 턴은 0과 1만 반복되게 함
			turn=(turn+1)%2;
		}
		String winner = turn==0? "컴퓨터":"플레이어";//삼항 연산자
		System.out.printf("게임종료! %s의 승리!\n", winner);
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int man;
		int game;
		int fist;
		boolean go = false;
		
		System.out.print("게임시작합니다\n");
		
		for (int a=0;a<2;++a) {
		fist=((int)(Math.random()*2));
		
		if (fist<0) {
		System.out.print("입력해주세요 > ");
		man = sc.nextInt();
		if (man >31) {
			System.out.println("게임 끝 사람 패배");
		}
		}
		else {
			System.out.print("입력해주세요 > ");
			man = sc.nextInt();
			if (man >31) {
				System.out.println("게임 끝 사람 패배");
				break;
			}
			while(go==false||man<=3) {
			for (a=0; a<3; ++a) {
				game=((int)(Math.random()*32+1));
				System.out.printf("컴퓨터 입력 값 > %d\n",game);
				go = game >31;
			}
	
			if(go==true) {
				System.out.println("게임 끝 컴퓨터 패배");
			break;
			}
			System.out.print("값을 입력해주세요 > ");
			man=sc.nextInt();
			}
			}
			}*/
		}
	}
	

	


