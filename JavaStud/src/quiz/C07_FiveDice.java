package quiz;

import java.util.Scanner;

import myobj.FiveDice.Dice;
import myobj.FiveDice.Player;

public class C07_FiveDice {
	/*
	 	�������� 5���� �ֻ����� ���� ������ �ֻ����� ����� ���� 
	 	������ �����ϴ� Ŭ������ ��������
	 	
	 	1. Ǯ�Ͽ콺 (���� �� 2�� + 3��) (11666/2332/55252)
	 	2. ���� ��Ʈ����Ʈ (1234/2345/3456)
	 	3. ���� ��Ʈ����Ʈ (12345/23456)
	 	4. 4 ���̽� (���� ���� 4��)
	 	5. 5 ���̽� (���� ���� 5��)
	 	
	 	(1) ��� �ֻ����� �ѹ��� ������ �޼���
	 	(2) ���ϴ� �ֻ����� �����ϰ� �������� ������ �޼���(�������ð���)
	 	(3) �ֻ����� ���� ���������� ������ Ȯ��
	*/
	
	public static void main(String[] args) {
		System.out.println("---------����---------");
		Dice d = new Dice();
		Player p = new Player();
		boolean turn = true;
				
		d.dices();
		p.countSame();
		
		while(turn) {			
		System.out.println("���ϴ� �ֻ��� ����");
		System.out.print("[1 ~ 5��]");
		System.out.print(" > ");
		Scanner sc = new Scanner(System.in);
		int diceNum= sc.nextInt();
		
		if (diceNum == 5) {			
		d.dices(diceNum);
		p.countSame();
		}
		else if(diceNum <=5 || diceNum>=1) {			
		System.out.println("�����ϰ� ���� �ֻ��� ��ȣ");
		System.out.print("[1 ~ 5��]");
		System.out.print(" > ");
		int exceptNum = sc.nextInt();
		
		d.dices((5-exceptNum)-diceNum);
		}
		else {
			System.out.println("��ȿ���� �ʽ��ϴ� �ٽ� �Է����ּ���");
			diceNum= sc.nextInt();
		}
		break;
		}
		
	}
}
