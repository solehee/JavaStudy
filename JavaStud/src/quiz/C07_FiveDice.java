package quiz;

import java.util.Scanner;

import myobj.FiveDice.Dice;
import myobj.FiveDice.Player;

public class C07_FiveDice {
	/*
	 	랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 
	 	다음을 구분하는 클래스를 만들어보세요
	 	
	 	1. 풀하우스 (같은 눈 2개 + 3개) (11666/2332/55252)
	 	2. 스몰 스트레이트 (1234/2345/3456)
	 	3. 라지 스트레이트 (12345/23456)
	 	4. 4 다이스 (같은 숫자 4개)
	 	5. 5 다이스 (같은 숫자 5개)
	 	
	 	(1) 모든 주사위를 한번에 던지는 메서드
	 	(2) 원하는 주사위를 제외하고 나머지만 던지는 메서드(개수선택가능)
	 	(3) 주사위를 새로 던질때마다 족보를 확인
	*/
	
	public static void main(String[] args) {
		System.out.println("---------시작---------");
		Dice d = new Dice();
		Player p = new Player();
		boolean turn = true;
				
		d.dices();
		p.countSame();
		
		while(turn) {			
		System.out.println("원하는 주사위 갯수");
		System.out.print("[1 ~ 5번]");
		System.out.print(" > ");
		Scanner sc = new Scanner(System.in);
		int diceNum= sc.nextInt();
		
		if (diceNum == 5) {			
		d.dices(diceNum);
		p.countSame();
		}
		else if(diceNum <=5 || diceNum>=1) {			
		System.out.println("제외하고 싶은 주사위 번호");
		System.out.print("[1 ~ 5번]");
		System.out.print(" > ");
		int exceptNum = sc.nextInt();
		
		d.dices((5-exceptNum)-diceNum);
		}
		else {
			System.out.println("유효하지 않습니다 다시 입력해주세요");
			diceNum= sc.nextInt();
		}
		break;
		}
		
	}
}
