package quiz;
import java.util.Scanner;

public class B05_ForBasicQuiz {
/*
  	사용자가 숫자를 입력 했을 때
  	1. 10 부터 입력한 숫자까지의 총합을 구해보세요
  	2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요
  	3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
*/
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력해보세요 > ");
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
	System.out.printf("10부터 %d까지의 총합은 %d입니다",user,sum);
	
	System.out.print("2.숫자를 입력해주세요 > ");
	user = sc.nextInt();	
	if (user > 1000){
	for (int i= 1000; i <= user; ++i){
	System.out.printf("1000부터 %d까지 출력: %d\n", user,i); 
	}}
	else{
	for(int i = 1000; i >= user; --i){
	System.out.printf("1000부터 %d까지 출력 : %d\n", user,i);
	}
	}
	
	System.out.print("3.숫자를 입력해주세요 > ");
	user = sc.nextInt();	
	if (user > 1){
	for (int i= 1; i <= user; ++i){
		if (i % 5 ==0) {
			
			System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", user,i); 
		}
	}}
	else{
	for(int i = 1; i >= user; --i){
		if (i % 5 ==0) {
			System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", user,i);
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
	
	System.out.print("1.숫자를 입력해주세요 > ");
	user_one = sc.nextInt();
	
	for (i=10; i<=user_one; i++){
		sum +=i
		System.out.println("1. "+sum);
		
	}
	
	System.out.print("2.숫자를 입력해주세요 > ");
	user_two = sc.nextInt();	
	if (user > 1000){
	for (int 1= 1000; i <= user; ++i){
	System.out.printf("1000부터 %d까지 출력: %d\n", user,i);
	}
	else{
	for(int i = 1000; i >= user; --i){
	System.out.printf("1000부터 %d까지 출력 : %d\n", user,1);
	}
	}
	}
	for (number=1000; number<=user_two ;number++) {
		
			System.out.println("2. "+ number);

		}
	System.out.print("3.숫자를 입력해주세요 > ");
	user_three = sc.nextInt();
	
	for (multiple=1; multiple<=user_three; multiple+=5){
		System.out.println("3. "+multiple);
		
	}*/
	}
}
