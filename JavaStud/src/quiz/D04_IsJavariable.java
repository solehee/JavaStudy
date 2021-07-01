package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class D04_IsJavariable {
	/*
	 	����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ���
	 	�˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����
	*/

	public static void main(String[] args) {
		String str = "Java123";
		
		System.out.println(check(str.toCharArray()));
		System.out.println(check("int".toCharArray()));
		
	}
	public static boolean check(char[] str) {
		// Character.isJavaIdentifierStart : �ڹ� �������� ù ��° ���ڷ� �������� üũ
		boolean check =  Character.isJavaIdentifierStart(str[0]);
		
		for(int i = 1; i<str.length;++i) {
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
}
	/*static boolean check=false;
	public static void main(String[] args) {
		
		System.out.print("������ �Է����ּ��� > ");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		
		D04_IsJavariable(user);
		
	}
	

	
	static void D04_IsJavariable(String user) {
		ArrayList<Character> variable = new ArrayList<>();
		
		int right = 0;
		
		for(int i = 0; i<user.length();++i) {
			variable.add(user.charAt(i));
		}
		check = Character.isJavaIdentifierStart(variable.get(0));
		if(check){
			for(int i=1 ; i<variable.size();++i) {
				check = Character.isJavaIdentifierPart(variable.get(i)); 							
				if (check) {
					right++;
				}
			}
		}else if(right == (variable.size()-1)) {
			System.out.println("������ ��밡��");
			
		}
		else {
			System.out.println("������ ���Ұ�");	
		}
			
	}
	
}*/