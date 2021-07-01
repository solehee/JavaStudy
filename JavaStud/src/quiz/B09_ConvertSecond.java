package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
/*
 		�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
 		�� ��, �ʿ���� ������ ������� ����
 		ex: 0�� 0�� 13�ð� 0�� 5���� ��� -> 13�ð� 0�� 5�ʸ� ���;� ��
*/
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� > ");
		int time = sc.nextInt();
		
		int[] converted = new int[4];
		int[] seconds = new int[4];
		String[] units = {"��","��","��","��"};
		
		seconds[0] = 365*24*60*60;
		seconds[1] = 24*60*60;
		seconds[2] = 60*60;
		seconds[3] = 60;
		
		for(int i=0; i<converted.length;++i) {
		converted[i] = time/seconds[i];
		time%=seconds[i];
		}
		boolean exist = false;
		
		for (int i=0; i<converted.length;++i) {
			if(converted[i]!=0||exist) {
				System.out.printf("%d%s",converted[i],units[i]);
				exist=true;
			}
		}
		System.out.printf("%d��",time);
		System.out.println();
		/*int y=0,d=0,h=0,m=0,s=0;
		
		y = time / 60/60/24/365;
		
		final int SECOND_PER_YEAR = 365*24*60*60;
		final int SECOND_PER_DAY = 24*60*60;
		final int SECOND_PER_HOUR = 60*60;
		final int SECOND_PER_MINUTE = 60;
		
		System.out.printf("'%d��'�� ��ȯ�ϸ�", time);
		
		y =  time/SECOND_PER_YEAR;
		time %= SECOND_PER_YEAR;
		
		d= time/ SECOND_PER_DAY;
		time %= SECOND_PER_DAY;
		
		h= time / SECOND_PER_HOUR;
		time %= SECOND_PER_HOUR;
		
		m = time/ SECOND_PER_MINUTE;
		time %= SECOND_PER_MINUTE;
		
		boolean exist = false;
		
		if (y!=0) {
			System.out.print(y+"��");
			exist = true;
		}
		if (d !=0 || exist) {
			System.out.print(d+"��");
			exist = true;
		}
		if (h!=0 || exist) {
			System.out.print(h+"�ð�");
			exist = true;
		}
		if (m!=0 || exist) {
			System.out.print(m+"��");
			exist = true;
		}
		System.out.print(time+"��");*/
		
  }
	
}
