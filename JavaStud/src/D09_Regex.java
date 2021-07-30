 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 	# ����ǥ���� (Regular Expression)
	 	 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
	 	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�
	 	 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	 	 
	 	 # Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
	 	 - Pattern
	 	 - Matcher
	 	 
	*/
	public static void main(String[] args) {
		
		// Pattern.matchs(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		Pattern.matches("sleep", "sleep");
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �մ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijk]", "sleed"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijkABCDEFG]", "sleed"));
		
		/*
		 	[abc] : �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
		 	[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
		 	[a-z] : a���� z���� ��� ���
		 	[A-Z] : A���� Z���� ��� ���
		 	[\\-] : ���ڷμ� -�� ��� (Escape)
		 	[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ���(������)
		*/
		
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]eep", "sceep"));
		
		/*
		 	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		 	. : ��� ����
		 	\d : ��� ����
		 	\D : ���ڸ� ������ ��� ��
		 	\s : ��� ����
		 	\S : ������ ������ ��� ��
		 	\w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 	\W : \w�� ������ ��� ��
		*/
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		
		/*
		 	# �ش� �д��� ����� ������ ������ �����ϴ� ���
		 	[.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 	[.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
			[.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
		 	[.]? : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�
		 	[.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�
		 	[.]* : * ���� ������ 0�� �̻� ���;� �Ѵ�
		 	
		  */
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abs.."));
		System.out.println(Pattern.matches("[.]{2,5}","."));
		System.out.println(Pattern.matches("[.]{2,5}",".."));
		System.out.println(Pattern.matches("s?heep","sheep"));
		System.out.println(Pattern.matches("s?heep","ssssheep"));
		System.out.println(Pattern.matches("s?heep","heep"));
		System.out.println(Pattern.matches("s?heep","kheep"));
		System.out.println(Pattern.matches("s+heep","sssssheep"));
		System.out.println(Pattern.matches("s+heep","heep"));
		
		// 010-1234-1234
		// �������� : �ش繮�ڿ��� �ڵ��� ��ȣ���� �˻��Ҽ� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("010(-?\\d{4}){2}", "01012341234"));
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", "010-1234-1234"));
		
		// [] �� |(or)�� ��� ������ �Ǵµ� ()�ȿ��� |�� �־ �������ش�
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches(
				"\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[0-3][0-9]-[1-4]\\d{6}", "001212-123456"));
		
		// �������� : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		// ���̵� ���̴� 64�ڷ� ����(Ư������ ���) 
		// �������� ��� 63�ڷ� ����
		String emaill = "j*@na.com.dk";
		boolean check = Pattern.matches(
				"(\\w|\\W){1,64}@\\w{2,63}([.]\\w{2,63})+", emaill);
		if(check && emaill.length()<255) {
			System.out.println("�ùٸ� �����ּ��Դϴ�");
	 	} else {
	 		System.out.println("�߸��� �����ּ��Դϴ�");
	 	}
		
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?", "g@g.c.k"));
		
		// #  Matcher����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		Pattern pattern1 = Pattern.compile("na");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while(matcher.find()) {
			System.out.println("ã�� ��: "+matcher.group());
			System.out.println("��ġ: "+matcher.start()+"����"+matcher.end()+"����");
			System.out.println(fruit.substring(matcher.start(),matcher.end()));
		}
		
	 }
}
  