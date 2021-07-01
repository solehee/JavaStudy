package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
public static void main(String[] args) {
	/*
	 	사용자로부터 문장을 하나 입력받고
	 	해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
	 	(대소문자도 구분할 것)
	*/
	
	System.out.print("문장입력 > ");
	String word=new Scanner(System.in).nextLine();
	
	final String SYMBOLS = "ABCDEFGHIJKLMNOPOPQRSTUVWXYZabicdefhijllmnopqrstuvwxyz";
	int [] symbol_count = new int[SYMBOLS.length()];
	for (int i = 0,len=word.length();i<len;++i) {
		//SYMBOLS.indexOf(word[i]);
		char ch = word.charAt(i);
		for(int j=0, len2 = SYMBOLS.length();j<len2;++j) {
			if (ch==SYMBOLS.charAt(j)) {
				symbol_count[j]++;
				System.out.println("'"+ch+"'는 SYMBOLS의"
						+j+"번째에 있으므로 sysmbol_count의"
						+j+"번째 값을 증가시킵니다");
			break;
			}
		}
	}
	//------------------------------
	String text=new Scanner(System.in).nextLine();
	int[] alphabet_count = new int[52];
	for (int i =0, len=text.length();i<len;++i) {
		char ch = text.charAt(i);
		if(ch >='a'&&ch<='z') {
			alphabet_count[ch-'a']++;
		}
		else if(ch>='A'&&ch<='Z') {
			alphabet_count[ch-'A'+26]++;
		}
	}
	//-----------------------------
	int [] lowercount = new int[26];
	int [] uppercount = new int[26];
	
	for (int i=0,len = text.length();i<len;++i) {
		char ch = text.charAt(i);
		
		if(ch>='a'&&ch<='z') {
			lowercount[ch-'a']++;
		}
		else if (ch>='A'&&ch<='Z') {
			uppercount[ch-'A']++;
		}
	}
	for (int i =0;i<26;++i) {
		System.out.printf("대문자 %c는 %d번 등장\n", 'A'+i,uppercount[i]);
		System.out.printf("소문자 %c는 %d번 등장\n", 'a'+i,lowercount[i]);
	}
}


}
