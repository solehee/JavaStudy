package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
public static void main(String[] args) {
	/*
	 	����ڷκ��� ������ �ϳ� �Է¹ް�
	 	�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
	 	(��ҹ��ڵ� ������ ��)
	*/
	
	System.out.print("�����Է� > ");
	String word=new Scanner(System.in).nextLine();
	
	final String SYMBOLS = "ABCDEFGHIJKLMNOPOPQRSTUVWXYZabicdefhijllmnopqrstuvwxyz";
	int [] symbol_count = new int[SYMBOLS.length()];
	for (int i = 0,len=word.length();i<len;++i) {
		//SYMBOLS.indexOf(word[i]);
		char ch = word.charAt(i);
		for(int j=0, len2 = SYMBOLS.length();j<len2;++j) {
			if (ch==SYMBOLS.charAt(j)) {
				symbol_count[j]++;
				System.out.println("'"+ch+"'�� SYMBOLS��"
						+j+"��°�� �����Ƿ� sysmbol_count��"
						+j+"��° ���� ������ŵ�ϴ�");
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
		System.out.printf("�빮�� %c�� %d�� ����\n", 'A'+i,uppercount[i]);
		System.out.printf("�ҹ��� %c�� %d�� ����\n", 'a'+i,lowercount[i]);
	}
}


}
