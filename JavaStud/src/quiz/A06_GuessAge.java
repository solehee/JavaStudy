
package quiz;

import java.util.Scanner;

public class A06_GuessAge {

	/*
	 	����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
	 	�� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	*/
	
	public static void main(String[] args) {
		
		Scanner user_answer = new Scanner(System.in);
		//int birth_year, current_year �� ��� �ᵵ ��
		int age;
		
		System.out.print("�¾ �⵵�� �Է����ּ��� >>");
		int birth_year = user_answer.nextInt();
		// ���� �ѹ��� �������ָ� int �� �����ϰ� nextInt ���� 
		
		System.out.print("������ �⵵�� �Է����ּ��� >>");
		int current_year = user_answer.nextInt();
		
		age= birth_year - current_year +1;
		
		System.out.println("����� ���̴� " + age +"�� �Դϴ�.");
		//System.out.println("����� ���̴� " + (1 + current_year - birth_year)+"�� �Դϴ�.");
	}
}
