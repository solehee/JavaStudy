package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

import myobj.CheckPass.IllegalCharater;
import myobj.CheckPass.IllegalLength;
import myobj.CheckPass.NotSatisfiedPassword;
import myobj.CheckPass.NumbericPassword;

public class C17_InputRightPassword {
	public static void main(String[] args) {
		try {
			check_password("asdf12^558Q3");
			System.out.println("비밀번호가 정상입니다.");
		}catch(IllegalLength e) {
			System.out.println("길이가 잘못됐습니다.");
		}catch(NumbericPassword e) {
			System.out.println("모두 숫자인 비밀번호입니다. 사용하시겠습니다?");
		}catch(NotSatisfiedPassword e) {
			System.out.println("비밀번호에는 숫자, 특수문자, 대문자, 소문자가 모두 포함되어야 합니다.");
		}catch(IllegalCharater e) {
			System.out.println("허용되지않은 문자가 있습니다.");
		}
	}	
	
	public static void check_password(String password) 
			throws IllegalLength, NumbericPassword,NotSatisfiedPassword,IllegalCharater {
		
		int len = password.length();
		
		if(len<8 || len>24) {
			throw new IllegalLength();
		}
		
		if(check_numeric(password.toCharArray())) {
			throw new NumbericPassword();
		}
		
		if(!check_character_types(password.toCharArray())) {
			throw new NotSatisfiedPassword();
		}
	}
	
	private static boolean check_special(char ch) {
		String permit = "!@#$%^&*";
		
		for(int i=0; i<permit.length();++i) {
			if(ch==permit.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean check_character_types(char[] pass) throws IllegalCharater {
		int len = pass.length;
		boolean low = false;
		boolean upper= false;
		boolean special = false;
		boolean num = false; 
		
		for (int i=0;i<len;++i) {
		char ch = pass[i];
			if(ch>='0'&&ch<='9') {
				num = true;
			}else if(ch>='a'&&ch<='z') {
				low = true;
			}else if(ch>='A'&&ch<='Z') {
				upper = true;
			}else if(check_special(ch)) {
				special=true;
			}else {
				throw new IllegalCharater();
			}
		}
		return num&&low&&upper&&special;
	}
	
	private static boolean check_numeric(char[] pass) {
		for(int i= 0, len= pass.length;i<len;++i) {
			char ch= pass[i];
			if(ch<'0'||ch>'9') {
				return false;
			}
		}
		return true;
	}
}	
	/*
	 	# 올바른 패스워드를 만들기 위한 규칙
	 	
	 	 1. 모두 숫자이면 안됨
	 	 
	 	 2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함
	 	 
	 	 3. 특수 문자는 !, @, #, $, %, ^, &, *만 사용가능합니다.
	 	 
	 	 4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함
	 	 
	 	 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내 문구를 출력해보세요
	 	 (여러 규칙을 한번에 어겼다고 해서 모든 것이 나올 필요는 없음)
	
	

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password;
		while(true) {
			try {
			System.out.println("패스워드를 만들어보세요");
			System.out.println("대문자, 소문자, 숫자, 특수문자 포함");
			System.out.print("입력 >> ");
			password = sc.nextLine();
			
			checkNum(password);
			checkAlpha(password);
			checkLen(password);
			checkChar(password);
			
			System.out.println("성공");
			break;
		}catch(NotNumberException e) {
			System.out.println("다시 입력해보세요");
		}catch(NotAlphabetException e) {
			System.out.println("다시 입력해보세요");
		}catch(LengthException e) {
			System.out.println("다시 입력해보세요");
		}catch(SpecialCharacterException e) {
			System.out.println("다시 입력해보세요");
		}
		}
	System.out.println("프로그램 종료!");	
	}
	
	private static int CHECK_MAX_NUMBER = 24;
	
	public static void checkNum(String password) throws NotNumberException{
		for(int i=0;i<CHECK_MAX_NUMBER;++i) {
		if((password.charAt(i) >= 'a' && password.charAt(i) <='z')&&
				(password.charAt(i) >= 'A' && password.charAt(i) <='Z')&&
				(password.charAt(i) >= '1' && password.charAt(i) <='9')){
			System.out.println("[대문자, 소문자, 숫자가 입력됨]");
		}
		else if((password.charAt(i) >= '1' && password.charAt(i) <='9')) {
		System.out.println("[숫자만 입력됨]");
		throw new NotNumberException();
		}
		}
	}
	
	public static void checkAlpha(String password) throws NotAlphabetException{
		for(int i=0;i<CHECK_MAX_NUMBER;++i) {
			if(((password.charAt(i) >= 'a' && password.charAt(i) <='z')&&
					(password.charAt(i) >= 'A' && password.charAt(i) <='Z'))) {
				System.out.print(password);
				System.out.println("[대문자, 소문자]");
			}else if(((password.charAt(i) >= 'a' && password.charAt(i) <='z')||
					(password.charAt(i) >= 'A' && password.charAt(i) <='Z'))) {
				throw new NotAlphabetException();
			}
			}
	}
	
	public static void checkLen(String password) throws LengthException{
		if(password.charAt(password.length())>=8
				||password.charAt(password.length())<24) {
			System.out.println(password);
			System.out.println("적당한 길이의 비밀번호입니다.");
		}else {
			throw new LengthException();
		}
		}
	
	public static void checkChar(String password) throws SpecialCharacterException{
		for(int i=0;i<CHECK_MAX_NUMBER;++i) {	
		if((password.charAt(i) =='!'|| password.charAt(i) =='@' ||
				password.charAt(i)  =='#'||password.charAt(i) =='$' ||
				password.charAt(i) =='%'||password.charAt(i) == '^'|| 
				password.charAt(i) =='&'||password.charAt(i) == '*')) {
			System.out.println(password);
			System.out.println("사용가능한 특수문자입니다.");
		}else {
			throw new SpecialCharacterException();
				}
			}
		}
}
	class NotNumberException extends Exception{
	public NotNumberException() {
		super("모두 숫자로만 이루어져선 안됩니다");
	}
	}
	
	class NotAlphabetException extends Exception{
		public NotAlphabetException() {
			super("대문자와 소문자, 특수문자를 섞어주세요");
		}
		}
	
	class LengthException extends RuntimeException{
	public LengthException() {
		super("비밀번호의 길이는 8자리 이상 24자리 이하여야 합니다");
	}
	}
	
	class SpecialCharacterException extends Exception{
	public SpecialCharacterException() {
		super("사용가능한 특수문자 : [!, @, #, $, %, ^, &, *]");
	}
	}
*/

