package quiz;

import java.util.Scanner;

public class B09_31Game {
	/*
	 	# 31 ������ ��������
	 	1. ��ǻ�Ϳ� ����� ������ ���鼭 ���ڸ� �����ؾ��Ѵ�.
	 	(1,2,3 �ۿ� ������ �� ����)
	 	
	 	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
	 	
	 	3. ������ �������� �����Ѵ�
	 	
	 	4. �������� 31 �̻��� ���ڸ� �θ��� �÷��̾ �й��Ѵ�
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//0�� ��ǻ��,1�����
		int turn = (int)(Math.random()*2);
		int num=0;

		if (turn == 0) {
			System.out.println("��ǻ�� ����");
		}
		else {
			System.out.println("����� ����!");
		}
		while (num<31) {
			
			if(turn == 0) {
				int com = (int)(Math.random()*3+1);
				num +=com;
				System.out.printf("��ǻ�� %d�� ������ϴ�. [���� ����: %d]\n", com,num);
			}else {
				int user=0;
				while(user<1||user>3) {
				System.out.print("1,2,3? ");
				user=sc.nextInt();
				}
				num+=user;
				System.out.printf("[���� ���� :%d]\n",num);
			}
			// ���� 0�� 1�� �ݺ��ǰ� ��
			turn=(turn+1)%2;
		}
		String winner = turn==0? "��ǻ��":"�÷��̾�";//���� ������
		System.out.printf("��������! %s�� �¸�!\n", winner);
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int man;
		int game;
		int fist;
		boolean go = false;
		
		System.out.print("���ӽ����մϴ�\n");
		
		for (int a=0;a<2;++a) {
		fist=((int)(Math.random()*2));
		
		if (fist<0) {
		System.out.print("�Է����ּ��� > ");
		man = sc.nextInt();
		if (man >31) {
			System.out.println("���� �� ��� �й�");
		}
		}
		else {
			System.out.print("�Է����ּ��� > ");
			man = sc.nextInt();
			if (man >31) {
				System.out.println("���� �� ��� �й�");
				break;
			}
			while(go==false||man<=3) {
			for (a=0; a<3; ++a) {
				game=((int)(Math.random()*32+1));
				System.out.printf("��ǻ�� �Է� �� > %d\n",game);
				go = game >31;
			}
	
			if(go==true) {
				System.out.println("���� �� ��ǻ�� �й�");
			break;
			}
			System.out.print("���� �Է����ּ��� > ");
			man=sc.nextInt();
			}
			}
			}*/
		}
	}
	

	


