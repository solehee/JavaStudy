package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {
/*
  	����ڷκ��� ���ڸ� �Է¹����� �ش� ���� ��ŭ�� ���� ������ �����Ѵ�
  	(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
  	
  	�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
*/
	public static void main(String[] args) {
		System.out.print("���� �Է�> ");
		int num = new Scanner(System.in).nextInt();
		
		
		String[] fruits = {"apple", "banana","kiwi","orange","grape","peach"};
		
		int [] fruit_count=new int[fruits.length];
		
		for(int i=0;i<num;++i){
			int random_number=(int)(Math.random()*fruits.length);
			System.out.println(fruits[random_number]);
			fruit_count[random_number]++;
		}
		System.out.println("###### ���� #####");
		for (int i = 0;i<fruits.length;++i) {
			System.out.printf("%s�� %d�� ����\n", fruits[i],fruit_count[i]);
		}
		
		
		
		
		
		
		
		/*int count=0;
		String[] fruit = new String[6];
		fruit[0] = "apple";
		fruit[1] = "banana";
		fruit[3] = "kiwi";
		fruit[4] = "orange";
		fruit[5] = "grape";
		fruit[6] = "peach";
		int [] fruit_count=new int [fruits.length];
		//������ ��ŭ �迭 �ּ� �ݺ��ǰ� �ϱ�
		for (int i = 0 ; i<=num;++i) {
		int random_count  = (int)(Math.random()*fruit.lenght);
		// ����ڰ� �Է��� ����ŭ �ݺ� ��Ű����
		// �������� ���� ����+i�� ����
		System.out.println(fruits[randon_count]);
		fruit[random_count]++;
			
		}
		for (int = 0 ; i<fruits.length;++i){
		System.out.printf("%d��ŭ %d�� %d�� ����\n",fruit[i],friut_count);
		}*/
	}
}
