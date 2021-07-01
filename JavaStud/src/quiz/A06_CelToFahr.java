package quiz;

import java.util.Scanner;

public class A06_CelToFahr {

	/*
	 	사용자로부터 섭씨 온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	 	(변한 공식은 검색 허용, 출력은 소수 첫째 자리까지)
	*/
	public static void main(String[] args) {
		
		Scanner user_temperature = new Scanner(System.in);
		
		System.out.print("온도를 섭씨 온도로 입력해주세요 >> ");
		double celsius_temperature = user_temperature.nextDouble();
		
		System.out.printf("화씨 온도로는 %.1f 도 입니다",(celsius_temperature*1.8+32));
		
		//------------------------------------
		
		double cel, fahr;
		
		System.out.print(false);
		cel = new Scanner(System.in).nextDouble();
		// 다음 입력 시에 또 스케너를 만들어야함 만들고 2번 이상 쓸 경우 사용하지 않는 방법
		// 한번 쓰고 다음엔 쓰지 못함 
		
		// (0˚C * 9/5)+32=32˚F
		fahr = cel * 9/5 +32;
		
		System.out.printf("%.1f˚C는 %.1f˚F 입니다", cel, fahr);
		
		
	}
	
}
