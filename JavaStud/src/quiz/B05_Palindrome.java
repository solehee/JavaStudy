package quiz;

import java.util.Scanner;

public class B05_Palindrome {
 /*
 ����ڷκ��� �ܾ �ϳ� �Է¹ް�
 �ش�ܾ ȸ���̶�� "PALINDROME"�� ���
 ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
 
  �� ȸ���̶� -MOM, BOB, ABBA, MADAM,EVE,TXT
 */
public static void main(String[] args) {
	String original = "LEVEL";
	
	int half = original.length()/2;
	int correct = 0;
	
	for (int i = 0; i<half;++i) {
		char front = original.charAt(i);
		char back = original.charAt(original.length()-1-i);
		
		System.out.printf("'%c�� %C�� ���մϴ�'\n", front,back);
		
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
	 #�Ųٷ� ������ ���
	 
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
		
	System.out.print("������ �Է��غ����� > ");
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
