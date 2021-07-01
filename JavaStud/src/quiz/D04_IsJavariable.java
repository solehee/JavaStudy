package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class D04_IsJavariable {
	/*
	 	사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로써 사용될 수 있는지
	 	검사하는 메서드를 만들고 테스트해보세요
	*/

	public static void main(String[] args) {
		String str = "Java123";
		
		System.out.println(check(str.toCharArray()));
		System.out.println(check("int".toCharArray()));
		
	}
	public static boolean check(char[] str) {
		// Character.isJavaIdentifierStart : 자바 변수명의 첫 번째 글자로 적합한지 체크
		boolean check =  Character.isJavaIdentifierStart(str[0]);
		
		for(int i = 1; i<str.length;++i) {
		// Character.isJavaIdentifierPart : 자바 변수명의 나머지 부분으로 적합한지 체크
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
}
	/*static boolean check=false;
	public static void main(String[] args) {
		
		System.out.print("변수를 입력해주세요 > ");
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
			System.out.println("변수로 사용가능");
			
		}
		else {
			System.out.println("변수로 사용불가");	
		}
			
	}
	
}*/