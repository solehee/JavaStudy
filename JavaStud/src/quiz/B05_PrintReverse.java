package quiz;

import java.util.Scanner;

public class B05_PrintReverse {
  // ����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	public static void main(String[] args) {
		String text = "I am a black cow";
		for (int i = text.length()-1;i>-1;--i) {
			System.out.print(text.charAt(i));
		}
		
		
		
	    Scanner sc = new Scanner(System.in);
		

		System.out.print("������ �Է��غ����� > ");
		String user = sc.nextLine();
		
		String reverse="";
		for (int i=user.length()-1;i>-1;i--) {
			reverse+=user.charAt(i);			
			}
		System.out.printf("%s�� ���ٷ� ����ϸ� %s\n",user,reverse); 
	
		
		}
}

