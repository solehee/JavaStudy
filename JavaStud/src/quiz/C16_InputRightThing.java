package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	/*
	 	사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어보세요.
	 	(다른 타입의 값이 입력되어도 프로그램이 강제 종료 되지 않아야합니다)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 스케너에는 잘못된 입력을 하면 찌꺼기가 남아있게 된다
		
		while(true) {
			try {
			System.out.println("잘못된 입력입니다");
			System.out.print("숫자 >> ");
			int a = sc.nextInt();
			System.out.println(a);
			System.out.println("성공");
			break;
		}catch(InputMismatchException num) {
			System.out.println("제대로 된 숫자로 다시 입력해주세요!");
			System.out.println("잘못 입력됐던 것: "+sc.nextLine());
			// nextLine 으로 찌꺼기를 뺴준다
			}
		}
	System.out.println("프로그램 종료!");	
	}
}
