package quiz;

import java.util.Scanner;

import myobj.BlackJack.CardDeck;

public class C07_BlackJack {
	/*	
	  	# ī��
	  	
	  		4������ ���� : ��Ʈ, Ŭ�ι�, ���̾Ƹ��, �����̵�
	  		
	  		���� : A 2 3 4 5 6 7 8 9 10 J Q K
	  		
	  		�� �������� A�� 1�� �� ���� �ְ� 11�ε� �� �� ����
	  		  J, Q, K�� 10 �̴�

	 	# ������ ����� ������
	 	1. ��ǻ��(����)�� ���(�÷��̾�)�� ī�带 �̴´�
	 	
	 	2. ó������ ��� 2�徿 �޴´�. �̶� ������ ī��� ���� �������´�.
	 	//ī�� ���� �Ⱥ��� ���°� ����
	 	
	 	3. �÷��̾�� ��Ȳ�� ���� �� ������(hit) ���⼭ ��������(stand) �����Ѵ�
	 	
	 	4. �÷��̾ ���߸� ������ ������ �ִ� ī�带 �����ϰ� ��ĥ�� ���� ī�带 �̴´�
	 	   (������ �ݵ�� ī�� ���� 16 �����϶� ������ �̰�, 17�̻��̸� ������ ������Ѵ�)
	 	
	 	5. �÷��̾��� ī�� ���ڵ��� ���� �������� ���ų� ��Ȯ�ϰ� 21�̶�� �¸��Ѵ�.
	 	   �÷��̾��� ī�� ���ڵ��� ���� 21���� ũ�� �й��Ѵ�. (A ~ K) 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CardDeck p1 = new CardDeck();
		
		boolean hit=true;
		while(hit) {
			System.out.println("---------���ӽ���---------");
			p1.turn(0);
			p1.turnComputer(0);			
			System.out.println("1. ī�� �̱�(hit) 2. ���߱�(stand)");
			System.out.print("���ڸ� �Է����ּ��� > ");	
			int play = sc.nextInt();
			if(play<2) {
				hit = true;
				p1.checkTurn(0);
			}
			else {
				p1.checkTurn(0);
				hit= false;
				// ���⼭ ����ī�� ���� 
				// �� �����ϴ� �޼��� �߰�
			}
		}
	}
}
