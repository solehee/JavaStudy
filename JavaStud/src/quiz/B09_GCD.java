package quiz;

import java.util.Scanner;

public class B09_GCD {
/*
 	# �ִ� �����
 	�� ���ڸ� �Է¹ް� �� ������ �ִ� ������� ���غ�����
 	- �� ������ ����� �� ���� ū �����
 	
 	20 [1, 2, 4, 5, 10, 20]
 	50 [1, 2, 5, 10, 25, 50]
 	�� ��� 10�� �ִ� �����
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		System.out.print("���� �� �� �Է� > ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max=Math.max(num, num2);
		int min=Math.min(num, num2);
		//int max=num>num2? num : num2;
		//int min=num<num2? num:num2;
		
		int gcd=1;
		for (int i = 1; 1<=min; ++i) {
			if (min%i == 0 && max%i==0) {
				gcd=i;
			}
		}
		System.out.printf("%d�� %d�� �ִ� ������� %d�Դϴ�.", num,num2,gcd);
		/* if (num>num2) {
		
			while(num2 !=0) {
				x=num%num2;
				num=num2;
				num2=x;
			}
			System.out.printf("�ִ� ������� %d �Դϴ�",num);
		}
		else {
			while(num !=0) {
				x=num2%num;
				num2=num;
				num=x;
			}
			System.out.printf("�ִ� ������� %d �Դϴ�", num2);
		}*/
		
	}
}
