package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	/*
			 ���� �Է� ������ ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
			 90�� �̻� : A
			 80�� �̻� : B
			 70�� �̻� : c
			 60�� �̻� : D
			 �� �� : F
			 �� ��ȿ�� ������ 0~ 100���Դϴ�. 
	 */
	public static void main(String[] args) {
		
		// �� �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����
		Scanner sc = new Scanner(System.in);
		char grade = 'Z';
		int score;
		
		
		System.out.print("������ �Է����ּ��� > ");
		score = sc. nextInt();
		
		if (score < 0 || score >100) {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
		else if(score >= 90) {
			grade= 'A';
		}
		else if(score>=80) {
			grade='B';
		}
		else if (score>=70) {
			grade='C';
		}
		else if(score>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.printf("����� ����� %c�Դϴ�\n", grade);
		
		/*double score;
		int grade;
		
		System.out.print("���� �Է� > ");
		score = sc.nextDouble();
		
		if (score <0 || score >=101 ) 
		{
			System.out.println("��ȿ���� ���� �����Դϴ�");
			
		}
		else if(score>=90 && score <=100)
		{
			System.out.println("A");
		}
		else if(score >= 80 && score < 90)
		{
			System.out.println("B");
		}
		else if (score>=70 && score<80)
		{
			System.out.println("C");
		}
		else if (score >=60 && score <70)
		{
			System.out.println("D");
		}
		else if (score >=0 && score < 60)
		{
			System.out.println("F");
		}
			
		*/
	}
}
