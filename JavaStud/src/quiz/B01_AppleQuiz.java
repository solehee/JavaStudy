package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {

	/* 
	  	����� 10�� �� ���� �� �ִ� �ٱ��ϰ� �ִ�
	  	
	  	 ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	  	 ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������
	 
	*/
	//�귡��ũ����Ʈ, ����� â ����Ű �ٽ� Ȯ��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int apple;
		int basket_size = 10;
		int basket;
	/* double basket_size = 20;
		double basket;
		
		System.out.print("���� > ");
		apple = sc.nextInt();
		basket = apple / basket_size;
		// Math.ceil(a) : a��  �Ҽ� ù° �ڸ����� �ø���
		// Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������
		System.out.println("�ʿ��� �ٱ����� ������ "+(int)Math.ceil(basket));
		System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�. ", (int)Math.ceil(basket));
	*/
		System.out.print("�����ϰ� ���� ����� ������ �Է��Ͻÿ� > ");
		apple = sc.nextInt();

		// 10,20,30 �� �ٱ��� ũ��� �� �¾� �������� ���
		if (apple % basket_size == 0)
		{
			basket = apple / basket_size;
		}
		else 
		{
			basket= apple/basket_size+1;
		}
		if(apple <0)
		{
		System.out.println("�ùٸ� ��� ������ �ƴմϴ�.");
		}
		else
		{
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�", basket);
		}
			
		
		System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�.",basket);
		
	}
}
