
package quiz;

import java.util.Scanner;

public class B07_Prime {
	/*
	 ����ڷκ��� ����(���)�� �Է¹�����
	 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	 (������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
	 �� �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ����
	 
	     2, 3, 5, 7, 11, 13...
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �Է� > ");
		int number = sc.nextInt();
		
		for (;number<2;) {
			System.out.println("�߸��Ȱ� �ٽ� �Է�");
		    System.out.print("> ");
		    number = sc.nextInt();
			}
			
				for (int i= 2; i <= number; ++i){
					int count=0;
					boolean prime = true;
					for(int j=2;j<=Math.sqrt(i);++j) {
					if(i%j==0) {
					prime = false;	
							
				}
				}
					if(prime) {							
						System.out.println(i); 		
					}
				}
	}
}


