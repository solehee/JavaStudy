package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	/*
	 	����ڷκ��� �Է¹��� ���ڿ��� �ڵ��� ��ȣ���� �����ϴ� ���α׷��� ��������
	*/
	private static boolean checkNumeric(char[] phoneNumber) {
		for(int i=0; i<phoneNumber.length;++i) {
			if((i ==3||i==8)&&phoneNumber[i]=='-') {
				continue;
			}else if((i!=3 && i!=8)&&Character.isDigit(phoneNumber[i])) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void checkValidPhoneNumber(char[] phoneNumber) {
		boolean valid = true;
		
		String front = ""+phoneNumber[0]+phoneNumber[1]+phoneNumber[2];
		
		if(!front.equals("010")) {
			valid = false;
			System.out.println("[WARNING] �� ���� ���ڰ� ������ �ʴ� �����Դϴ�.");
		}else if(phoneNumber.length != 13) {
			valid = false;
			System.out.println("[WARNING] �ڵ��� ��ȣ�� ���̰� �ƴմϴ�");
		}else if(!checkNumeric(phoneNumber)){
			valid = false;
			System.out.println("[WARNING] ���� �ƴ� ���ڰ� ���ԵǾ��ų� -�� ��ġ�� �̻��մϴ�.");
		}
		
		System.out.println(new String(phoneNumber)+"�� " 
		+(valid? "�ùٸ� �ڵ��� ��ȣ�Դϴ�." : "�ùٸ��� ���� �ڵ��� ��ȣ�Դϴ�."));
	}
	
	
	 public static void main(String[] args) {
		 
		 checkValidPhoneNumber("010-abcd-1234".toCharArray());
		 
	/*	 Scanner sc = new Scanner(System.in);
		 System.out.println("�ڵ��� ��ȣ�� �Է����ּ��� > ");
		 String phoneNum = sc.nextLine();
		
		 char[] number = new char[phoneNum.length()]; 
		 for(int i =0; i<phoneNum.length();++i) {
			number[i]=(char) phoneNum.charAt(i)	;		 
		 }
		 
		check(number);
		check(phoneNum);*/
	}
	 
	 
	 /*
	 public static ArrayList<String> check(String phoneNum) {
		 int count;
		  count = phoneNum.indexOf("010");
		 if(count == 0) {
			boolean desh = phoneNum.charAt(3)=='-'
					&& phoneNum.charAt(8)=='-';
			
			
			
		 }else {
			 return false;
		 }
		 
		 return null; 
	 }
	 
	 public static void check(char[] number) {
		 boolean rule = number[0] =='0' && number[1] =='1'
				 &&number[2]=='0'&&number[3]=='-'&&number[8]=='-';
				 
		 if(rule && number.length==12) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
		 }
	 }*/
	 
	 
	/* public static boolean check (String phoneNum) {
		 //String number = "010";
		 if(phoneNum.matches("010-(.*)-(.*)")) {
			 return true;
		 }
		 return false;
		 
		012-4567-9101112
	 }*/
}
