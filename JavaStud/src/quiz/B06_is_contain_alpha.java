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
	System.out.println("����"+contain);
	boolean only_alpha=true;
	for (int i=0; i<str.length(); ++i) {
		char ch = str.charAt(i);
		if (!(ch >='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			only_alpha=false;
			break;
		}
	}
	System.out.println("��� ���Գ���?"+only_alpha);
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
	System.out.print("�Է°� > ") ;
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
 	1. ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
 	2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true, �ƴϸ� false
 	3. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
 	  (����� ���� : ���ļҹ���,����,_,$,ù��° ���ڿ� ���� �Ұ�)
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�Է°� > ") ;
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
	
	System.out.print("�Է°� > ") ;
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
