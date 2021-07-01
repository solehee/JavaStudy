package quiz;

import java.util.Scanner;

import myobj.BlackJack.CardDeck;

public class C07_BlackJack {
	/*	
	  	# 카드
	  	
	  		4가지의 문양 : 하트, 클로버, 다이아몬드, 스페이드
	  		
	  		숫자 : A 2 3 4 5 6 7 8 9 10 J Q K
	  		
	  		※ 블랙젝에서 A는 1로 쓸 수도 있고 11로도 쓸 수 있음
	  		  J, Q, K는 10 이다

	 	# 블랙잭을 만들어 보세요
	 	1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다
	 	
	 	2. 처음에는 모두 2장씩 받는다. 이때 딜러의 카드는 한장 가려놓는다.
	 	//카드 보임 안보임 상태가 있음
	 	
	 	3. 플레이어는 상황을 보고 더 뽑을지(hit) 여기서 멈출지를(stand) 결정한다
	 	
	 	4. 플레이어가 멈추면 딜러가 가려져 있던 카드를 오픈하고 규칠에 따라 카드를 뽑는다
	 	   (딜러는 반드시 카드 합이 16 이하일때 무조건 뽑고, 17이상이면 무조건 멈춰야한다)
	 	
	 	5. 플레이어의 카드 숫자들의 합이 딜러보다 높거나 정확하게 21이라면 승리한다.
	 	   플레이어의 카드 숫자들의 합이 21보다 크면 패배한다. (A ~ K) 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CardDeck p1 = new CardDeck();
		
		boolean hit=true;
		while(hit) {
			System.out.println("---------게임시작---------");
			p1.turn(0);
			p1.turnComputer(0);			
			System.out.println("1. 카드 뽑기(hit) 2. 멈추기(stand)");
			System.out.print("숫자를 입력해주세요 > ");	
			int play = sc.nextInt();
			if(play<2) {
				hit = true;
				p1.checkTurn(0);
			}
			else {
				p1.checkTurn(0);
				hit= false;
				// 여기서 딜러카드 오픈 
				// 합 정산하는 메서드 추가
			}
		}
	}
}
