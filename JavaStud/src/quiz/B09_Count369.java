package quiz;

import java.util.Scanner;

public class B09_Count369 {
/*
 	����ڷκ��� ������ �ϳ� �Է¹��� ��
 	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ� �ϴ��� ������� 
	(�� 33, 36, 39...���� ���ڴ� ���� �� Ĩ�ϴ�.)
*/
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� > ");
		int num = sc.nextInt();
		
		/*
		 	�����ذ�� - ������ Ǫ�� ���� ã�� ��
		 	������ - �����س� ���� �ڵ�� �����ϴ� ��
		 	��� ���ط� - ����ϴ� �� ���� ���� ���ص�
		*/
		int count = 0;
		for (int i  = 1; i <= num; ++i) {
			int checkNum =	i;
			System.out.printf("[%d]\t",checkNum);
			while(checkNum !=0) {
				int digit = checkNum%10;
				
			if (digit!=0&&digit%3==0) {
				System.out.print("¦");
				count++;
			}
				checkNum/=10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n",count);
		
		/*if (num>1) {
		for (int i =1; i<=num; ++i) {
				int one = i%10;
				int two = i/10;
				int three = i/100;
			if ((two==3||two==6||two==9)&&(one==3||one==6||one==9)
				&&(three==3||three==6||three==9)) {
			count+=3;	
			}
			else if ((two==3||two==6||two==9)&&(one==3||one==6||one==9)
					||(three==3||three==6||three==9)) {
			count+=2;	
			}
			else if ((two==3||two==6||two==9)||(one==3||one==6||one==9)
					&&(three==3||three==6||three==9)) {
			count+=2;
			}
			else if((two==3||two==6||two==9)||(one==3||one==6||one==9)
					||(three==3||three==6|three==9)) {
			count+=1;
			}	
		}
			System.out.printf("�ڼ� %d��",count);
		}
		else {
			System.out.print("��ȿ���� ���� �� �Դϴ�");
		}*/
	}

}
