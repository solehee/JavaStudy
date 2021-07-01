package quiz;
import java.util.Scanner;

public class B06_is_contain_alpha {
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
		
	boolean contain = false;
	String str="z0000o";
	for(int i=0; i<str.length() ;++i) {
		
		char ch = str.charAt(i);
		if ((ch >='a'&&ch<='z')||(ch >='A'&&ch<='z')) {
			contain=true;
			break;
		}
	}
	System.out.println("영어"+contain);
	boolean only_alpha=true;
	for (int i=0; i<str.length(); ++i) {
		char ch = str.charAt(i);
		if (!(ch >='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			only_alpha=false;
			break;
		}
	}
	System.out.println("영어만 나왔나요?"+only_alpha);
	//--------------------------------
	
	boolean first_letter_check = true, letter_check= true;
	first_letter_check = !(str.charAt(0)>='0'&&str.charAt(0)<='9');
	//if(str.charAt(0)>='0'&&str.charAt(0)<='9') {
		//first_letter_check=false;
	//}
	for(int i =0; i<str.length();++i) {
		char ch = str.charAt(i);
		if (ch>='0'&&ch<='9'||ch>='a'&&ch<='z'||
				ch=='_'|ch=='$') {
			letter_check = false;
		break;
		}
	}
	if (first_letter_check&&letter_check) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
	
	/*
	System.out.print("입력값 > ") ;
	String word = sc.nextLine();
	
	boolean rule=true;
	boolean number = true;
	for (int i=0; i<word.length(); ++i) {
		char check = word.charAt(i);		
		if ((check >='a'&&check<='z')||(word.equals('_')||(word.equals('$')))) {
			rule=false;
		}
		
	}
	for(int i=1; i<word.length();++i) {
		if (word.charAt(i)>='0'&&word.charAt(i)<='9') {
			rule=true;
			break;
		}
	}
	System.out.println("3. "+rule);
*/
	
/*
 	1. 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
 	2. 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true, 아니면 false
 	3. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니면 false
 	  (허락한 문자 : 알파소문자,숫자,_,$,첫번째 문자에 숫자 불가)
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("입력값 > ") ;
	String word = sc.nextLine();
	boolean start= false ;
	
	int length = word.length();
		
	for (int i = 0; i <= length ; ++i) {		
		start = (word.charAt(i) >= 'a' && word.charAt(i) <='z')||
		(word.charAt(i) >= 'A' && word.charAt(i) <='Z');
		break;
	}
	
	if (start == true) {
		System.out.println("OK");
	}
	else {	
		System.out.println("NOT OK");
	}
	
	System.out.println("--------------------");
	
	System.out.print("입력값 > ") ;
	String user = sc.nextLine();
	
	boolean start_user= false ;
	boolean end  = false;
	char end_word;
	int half = user.length()/2;
	
	for (int i = 0; i<half;++i) {
	char front = user.charAt(i);
	char back = user.charAt(user.length()-1-i);
	
	start_user =(front>='a'&&front<='z')||(front>='A'&&front<='Z');
	end =(front>='a'&&front<='z')||(front>='A'&&front<='Z');
	}
	if (start_user&&end ==true) {
		System.out.println("OK");
	}
	else {
		System.out.println("NOT OK");
	} */
	}
}
