package quiz;
import java.util.Scanner;

public class B05_ForBasicQuiz {
/*
  	����ڰ� ���ڸ� �Է� ���� ��
  	1. 10 ���� �Է��� ���ڱ����� ������ ���غ�����
  	2. 1000���� �Է��� ���ڱ��� ������� ������ ��������
  	3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
*/
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���ڸ� �Է��غ����� > ");
	int user = sc.nextInt();
	
	int sum =0;
	
	int start = 10;
	int end = user;
	if (user > 10) {
		start =10;
		end = 10;
	}else {
		start = user;
		end = 10;
	}
	for (int i = start; i<=end; i++) {
		sum +=i;
	}
	System.out.printf("10���� %d������ ������ %d�Դϴ�",user,sum);
	
	System.out.print("2.���ڸ� �Է����ּ��� > ");
	user = sc.nextInt();	
	if (user > 1000){
	for (int i= 1000; i <= user; ++i){
	System.out.printf("1000���� %d���� ���: %d\n", user,i); 
	}}
	else{
	for(int i = 1000; i >= user; --i){
	System.out.printf("1000���� %d���� ��� : %d\n", user,i);
	}
	}
	
	System.out.print("3.���ڸ� �Է����ּ��� > ");
	user = sc.nextInt();	
	if (user > 1){
	for (int i= 1; i <= user; ++i){
		if (i % 5 ==0) {
			
			System.out.printf("1���� %d���� 5�� ����� ���: %d\n", user,i); 
		}
	}}
	else{
	for(int i = 1; i >= user; --i){
		if (i % 5 ==0) {
			System.out.printf("1���� %d���� 5�� ����� ���: %d\n", user,i);
		}
	}
	}
	
	/*
	int user_one;
	int user_two;
	int user_three;
	int number;
	int multiple;
	int sum;
	
	System.out.print("1.���ڸ� �Է����ּ��� > ");
	user_one = sc.nextInt();
	
	for (i=10; i<=user_one; i++){
		sum +=i
		System.out.println("1. "+sum);
		
	}
	
	System.out.print("2.���ڸ� �Է����ּ��� > ");
	user_two = sc.nextInt();	
	if (user > 1000){
	for (int 1= 1000; i <= user; ++i){
	System.out.printf("1000���� %d���� ���: %d\n", user,i);
	}
	else{
	for(int i = 1000; i >= user; --i){
	System.out.printf("1000���� %d���� ��� : %d\n", user,1);
	}
	}
	}
	for (number=1000; number<=user_two ;number++) {
		
			System.out.println("2. "+ number);

		}
	System.out.print("3.���ڸ� �Է����ּ��� > ");
	user_three = sc.nextInt();
	
	for (multiple=1; multiple<=user_three; multiple+=5){
		System.out.println("3. "+multiple);
		
	}*/
	}
}
