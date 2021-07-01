
package quiz;

import java.util.Scanner;

public class A06_GuessAge {

	/*
	 	사용자로부터 태어난 해와 올해의 년도를 입력받으면
	 	그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	*/
	
	public static void main(String[] args) {
		
		Scanner user_answer = new Scanner(System.in);
		//int birth_year, current_year 로 묶어서 써도 됨
		int age;
		
		System.out.print("태어난 년도를 입력해주세요 >>");
		int birth_year = user_answer.nextInt();
		// 위에 한번에 정의해주면 int 만 제외하고 nextInt 정의 
		
		System.out.print("올해의 년도를 입력해주세요 >>");
		int current_year = user_answer.nextInt();
		
		age= birth_year - current_year +1;
		
		System.out.println("당신의 나이는 " + age +"살 입니다.");
		//System.out.println("당신의 나이는 " + (1 + current_year - birth_year)+"살 입니다.");
	}
}
