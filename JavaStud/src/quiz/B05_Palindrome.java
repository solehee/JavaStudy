package quiz;

import java.util.Scanner;

public class B05_Palindrome {
 /*
 사용자로부터 단어를 하나 입력받고
 해당단어가 회문이라면 "PALINDROME"을 출력
 회문이 아니라면 "NOT PALINDROME"을 출력
 
  ※ 회문이란 -MOM, BOB, ABBA, MADAM,EVE,TXT
 */
public static void main(String[] args) {
	String original = "LEVEL";
	
	int half = original.length()/2;
	int correct = 0;
	
	for (int i = 0; i<half;++i) {
		char front = original.charAt(i);
		char back = original.charAt(original.length()-1-i);
		
		System.out.printf("'%c와 %C를 비교합니다'\n", front,back);
		
		if (front != back) {
			correct++;
		}
	
	}
	if (correct==half) {
		System.out.println("palidrome");
	}else {
		System.out.println("not palidrome");
	}
	/*
	 #거꾸로 뒤집는 방법
	 
	String original = "LEVEL";
	
	String reverse = "";
	for (int i = original.length()-1;i>-1;--i) {
		reverse+=original.charAt(i);
	}
	if (original.equals(reverse)) {
		System.out.println("PALINDROME");
	}
	else {
		System.out.println("NOT PALINDROME");	
	}
	*/
	
	/*
	Scanner sc = new Scanner(System.in);
		
	System.out.print("문장을 입력해보세요 > ");
	String user = sc.nextLine();
	int word = user.length();
		for(int i = 1; i<(word/2);i++) {
		if (user.charAt(i) != user.charAt(word-i-1)) {
			System.out.println("NOT PALINDROME");
			}
		else {
			System.out.println("PALINDROME");
		}
		}
		
	*/	
	}
}
