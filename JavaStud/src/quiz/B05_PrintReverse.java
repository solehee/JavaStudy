package quiz;

import java.util.Scanner;

public class B05_PrintReverse {
  // 사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	public static void main(String[] args) {
		String text = "I am a black cow";
		for (int i = text.length()-1;i>-1;--i) {
			System.out.print(text.charAt(i));
		}
		
		
		
	    Scanner sc = new Scanner(System.in);
		

		System.out.print("문장을 입력해보세요 > ");
		String user = sc.nextLine();
		
		String reverse="";
		for (int i=user.length()-1;i>-1;i--) {
			reverse+=user.charAt(i);			
			}
		System.out.printf("%s를 꺼꾸로 출력하면 %s\n",user,reverse); 
	
		
		}
}

