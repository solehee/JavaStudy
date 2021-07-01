package quiz;
import java.util.Scanner;

public class D09_BruteForce {
	/*
	 	# ��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ 
	 	  ��й�ȣ�� ����غ�����
	 	- ���� ��/�ҹ���
	 	- ����
	 	- Ư������(shift ������ ������ �͵�)
	 	ex : 4������ ��� -> 0000 ->zzzz
	*/
	static String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
	
	public static void main(String[] args) {
		bruteforce(4);
	}
	/*
	 	# 10������ ���
	 	
	 	1234567
	 	
	 		1234567 % 10 => 7(���� �ڸ� �и�)
	 		1234567 / 10 => 123456(���� �ڸ� ����)
	 		123456 % 10 => 6(���� �ڸ� �и�)
	 		123456 / 10 => 12345(�����ڸ� ����)
	*/
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (long)Math.pow(charset.length(), password_size);
		
		for(long i=0;i<all_password;++i) {
			long value = i;
			
			String password = "";
			while(value > 0) {
			password += arr[(int)(value%len)];
				value /=len;
			}
			
			if(password.length()<password_size) {
				int gap = password_size - password.length();
				for(int j=0; j<gap;++j) {
					password = "a"+password;
				}
			}
			
			System.out.println(password);
		}
		
		System.out.println("len : "+len);
	}
}
