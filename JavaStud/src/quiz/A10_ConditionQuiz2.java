package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char a = 'D';		
		char b = '°¡';
		char c = '1';
		char d = 'z';
		char e = 'ÀÌ';
		char f = 'ª¡';
		
		System.out.println(a=='q'||a=='Q');
		System.out.println(b != ' ' && b != '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'a' && d <= 'z') || (d>= 'A'&&d<='z'));
		System.out.println(e >= '°¡' && e <= 'ÆR');
		System.out.println((f>=0x3041 && f<= 0x3096) || 
				(f>=0x30A1 && f<=0x30FF));
		
		System.out.print("exitÀ» ÀÔ·ÂÇÏ¸é true°¡ ³ª¿É´Ï´Ù >");
		String txt = sc.nextLine();
		System.out.println(txt.equals("exit"));
	}
}
