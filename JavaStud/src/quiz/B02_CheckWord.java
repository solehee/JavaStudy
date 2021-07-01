package quiz;
import java.util.Scanner;
public class B02_CheckWord {
/*
 	사용자로부터 단어를 하나 입력받고
 	첫 번째 글자가 영어이면서 마지막 번째 글자가 일치하면 "OK"를 출력하고
 	일치하지 않으면 "NOT OK"를 출력해보세요
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
		
		System.out.print("단어를 영어로 입력해주세요 > ");
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
