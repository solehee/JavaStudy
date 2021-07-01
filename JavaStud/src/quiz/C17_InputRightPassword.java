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
			System.out.println("��й�ȣ�� �����Դϴ�.");
		}catch(IllegalLength e) {
			System.out.println("���̰� �߸��ƽ��ϴ�.");
		}catch(NumbericPassword e) {
			System.out.println("��� ������ ��й�ȣ�Դϴ�. ����Ͻðڽ��ϴ�?");
		}catch(NotSatisfiedPassword e) {
			System.out.println("��й�ȣ���� ����, Ư������, �빮��, �ҹ��ڰ� ��� ���ԵǾ�� �մϴ�.");
		}catch(IllegalCharater e) {
			System.out.println("���������� ���ڰ� �ֽ��ϴ�.");
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
	 	# �ùٸ� �н����带 ����� ���� ��Ģ
	 	
	 	 1. ��� �����̸� �ȵ�
	 	 
	 	 2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
	 	 
	 	 3. Ư�� ���ڴ� !, @, #, $, %, ^, &, *�� ��밡���մϴ�.
	 	 
	 	 4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
	 	 
	 	 ��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����غ�����
	 	 (���� ��Ģ�� �ѹ��� ���ٰ� �ؼ� ��� ���� ���� �ʿ�� ����)
	
	

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password;
		while(true) {
			try {
			System.out.println("�н����带 ��������");
			System.out.println("�빮��, �ҹ���, ����, Ư������ ����");
			System.out.print("�Է� >> ");
			password = sc.nextLine();
			
			checkNum(password);
			checkAlpha(password);
			checkLen(password);
			checkChar(password);
			
			System.out.println("����");
			break;
		}catch(NotNumberException e) {
			System.out.println("�ٽ� �Է��غ�����");
		}catch(NotAlphabetException e) {
			System.out.println("�ٽ� �Է��غ�����");
		}catch(LengthException e) {
			System.out.println("�ٽ� �Է��غ�����");
		}catch(SpecialCharacterException e) {
			System.out.println("�ٽ� �Է��غ�����");
		}
		}
	System.out.println("���α׷� ����!");	
	}
	
	private static int CHECK_MAX_NUMBER = 24;
	
	public static void checkNum(String password) throws NotNumberException{
		for(int i=0;i<CHECK_MAX_NUMBER;++i) {
		if((password.charAt(i) >= 'a' && password.charAt(i) <='z')&&
				(password.charAt(i) >= 'A' && password.charAt(i) <='Z')&&
				(password.charAt(i) >= '1' && password.charAt(i) <='9')){
			System.out.println("[�빮��, �ҹ���, ���ڰ� �Էµ�]");
		}
		else if((password.charAt(i) >= '1' && password.charAt(i) <='9')) {
		System.out.println("[���ڸ� �Էµ�]");
		throw new NotNumberException();
		}
		}
	}
	
	public static void checkAlpha(String password) throws NotAlphabetException{
		for(int i=0;i<CHECK_MAX_NUMBER;++i) {
			if(((password.charAt(i) >= 'a' && password.charAt(i) <='z')&&
					(password.charAt(i) >= 'A' && password.charAt(i) <='Z'))) {
				System.out.print(password);
				System.out.println("[�빮��, �ҹ���]");
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
			System.out.println("������ ������ ��й�ȣ�Դϴ�.");
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
			System.out.println("��밡���� Ư�������Դϴ�.");
		}else {
			throw new SpecialCharacterException();
				}
			}
		}
}
	class NotNumberException extends Exception{
	public NotNumberException() {
		super("��� ���ڷθ� �̷������ �ȵ˴ϴ�");
	}
	}
	
	class NotAlphabetException extends Exception{
		public NotAlphabetException() {
			super("�빮�ڿ� �ҹ���, Ư�����ڸ� �����ּ���");
		}
		}
	
	class LengthException extends RuntimeException{
	public LengthException() {
		super("��й�ȣ�� ���̴� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� �մϴ�");
	}
	}
	
	class SpecialCharacterException extends Exception{
	public SpecialCharacterException() {
		super("��밡���� Ư������ : [!, @, #, $, %, ^, &, *]");
	}
	}
*/

