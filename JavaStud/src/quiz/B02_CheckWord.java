package quiz;
import java.util.Scanner;
public class B02_CheckWord {
/*
 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
 	ù ��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�
 	��ġ���� ������ "NOT OK"�� ����غ�����
 */
	
	public static void main(String[] args) {
		
		String word = "ABCA";
		boolean match = false;
		boolean alphabet = false;
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length()-1);
		
		//boolean match = first_letter == last_letter;
		//boolean alphabet = ((first_letter >= 'A'&& first_letter <= 'Z')|| (first_letter >='a' && first_letter >='z'));
		if (first_letter ==last_letter) {
			match = true;
		}
		if (match && alphabet) {
			System.out.println("ok");
		}
		
		/*	Scanner sc = new Scanner(System.in);
		
		String word_user;
		
		System.out.print("�ܾ ����� �Է����ּ��� > ");
		word_user = sc.nextLine();
		
		
		if (((word_user.charAt(0) >= 'a' && word_user.charAt(0) <='z')||
				(word_user.charAt(0) >= 'A' && word_user.charAt(0) <='Z'))
				&& (word_user.charAt(0) == word_user.charAt(word_user.length()-1)))
		{
	      System.out.println("OK");
		}		  
		else 
		{
			System.out.println("NOT OK");
		}
	*/
	}
}
