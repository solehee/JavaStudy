package quiz;

import java.util.Scanner;

public class A06_CelToFahr {

	/*
	 	����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	 	(���� ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
	*/
	public static void main(String[] args) {
		
		Scanner user_temperature = new Scanner(System.in);
		
		System.out.print("�µ��� ���� �µ��� �Է����ּ��� >> ");
		double celsius_temperature = user_temperature.nextDouble();
		
		System.out.printf("ȭ�� �µ��δ� %.1f �� �Դϴ�",(celsius_temperature*1.8+32));
		
		//------------------------------------
		
		double cel, fahr;
		
		System.out.print(false);
		cel = new Scanner(System.in).nextDouble();
		// ���� �Է� �ÿ� �� ���ɳʸ� �������� ����� 2�� �̻� �� ��� ������� �ʴ� ���
		// �ѹ� ���� ������ ���� ���� 
		
		// (0��C * 9/5)+32=32��F
		fahr = cel * 9/5 +32;
		
		System.out.printf("%.1f��C�� %.1f��F �Դϴ�", cel, fahr);
		
		
	}
	
}
