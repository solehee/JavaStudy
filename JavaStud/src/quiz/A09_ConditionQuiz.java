package quiz;

public class A09_ConditionQuiz {
	public static void main(String[] args) {
				
		int a = 15, b = 7, c = 14 ;
		int hour = 13;
		int d=10, e=40;
		int year=100;
		int minsu_age = 20, charsu_age=45,
			minsu_birthm = 10, charsu_birthm = 4;
		int age;
		age = minsu_age - charsu_age; 		
		boolean powerOn = false; 
		String str = "yes";
		
		System.out.print("1. int형 변수 a가 10보다 크고 20보다 작을 때 ");
		System.out.println(a > 10 && a < 20 );
		
		System.out.print("2. int형 변수 b가 짝수일 때 ");
		System.out.println(b % 2 == 0); // b%2 != 1 으로 써도됨
		
		System.out.print("3. int형 변수 c가 7의 배수일 때 ");
		System.out.println(c % 7 == 0);
		
		System.out.print("4. ");
		System.out.println(!(hour < 0 || hour >=24)&& hour >= 12);
		System.out.println(hour < 24 && hour >= 12 );
		
		System.out.print("5. ");
		System.out.println(Math.abs(d - e) == 30); // d의 값이 더 작아 -30일 경우도 있어서 절대값 
		
		System.out.print("6. int형 변수 year가 400으로 나누어 떨어지거나 ");
		System.out.println(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0));
		
		
		System.out.println("7. "+ (age >=2 ));
		System.out.println("8. " + (minsu_birthm - charsu_birthm < 3));
		
		System.out.println("9. "+(powerOn == false));
		System.out.println(!powerOn);
		

		String str1 = "yes";
		String str2 = "yes ";
		String str3 = new String("yes");
		
		// 참조형 변수의 ==은 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다
		System.out.println("str1 == \"yes\" : "+(str1 == "yes"));
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다		
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		// 소문자로 시작하는 타입 변수들은 stack에 차곡차곡 쌓인다
		// 대문자로 시작하는 타입 변수들은 stack에는 주소값만 보관하고 실체는 heap에 존재한다
		// 대문자로 시작하는 타입 변수에는 주소값이 저장되어 있고, 
		// 거기에 .을 찍고 실제 대이터를 참조할 수 있다 
		
	}
}
