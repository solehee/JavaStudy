
public class A10_TypeCasting {
	
	/*
	 	# Ÿ�� ĳ����
	 	1. Ÿ���� �ڿ������� ���ϴ� ���(�Ϲ����� Ÿ��ĳ����)
	 	- ���� Ÿ�Կ��� ū Ÿ������ ���� ���� �ƹ� ������ ������ �ʴ´�
	 	- �ڿ������� Ÿ���� ���Ѵ�
	 	
	 	2. Ÿ���� ������ ��ȯ��Ű�� ���(������� Ÿ��ĳ����)
	 	- Ÿ���� ��ȯ ��ų �� ������ ���� ���ɼ��� �ִ� ��쿡��
	 	  ���α׷��Ӱ� ���� ��������� Ÿ���� ��ȯ���Ѿ� �Ѵ�
 	  
 	   # Ÿ�� ũ�� ����
 	   
 	   - byte < short <= char < int < long < float < double
 	   - long Ÿ���� 8byte�̰� float�� 4byte ���� ǥ�������� float�� �� �д�
 	   - �Ǽ� Ÿ���� ���� Ÿ�Ժ��� ǥ�� ������ �д�
	*/
	public static void main (String[] args) {

		// �ڿ������� Ÿ�� ĳ����		
		char ch = 75;
		int num = ch;
		System.out.println((char)75);
		
		// ����� Ÿ�� ĳ����
		int i = 3000;
		byte b= (byte)i;
		System.out.println(b);
		
		// �������� �����ϰ� �ִ� Ÿ���� char Ÿ������ ��ȯ�Ҷ� ������ ���� ������ �ִ�
		byte num1 = -50;
		char ch2 = (char)num1; // ����Ÿ�Կ��� ������ �� �� ��� ������ �����
		
		System.out.println((int)ch2);
		
		// �Ϲ������δ� ũ�Ⱑ ū Ÿ�Կ��� ���� Ÿ������ ���� ���� ������� Ÿ�� ĳ������ �ʿ��ϴ�
		float f = 123.123f;
		long l = (long)f;
		
		System.out.println(l);
		
		// ������ �������� ������ ���� ���� �ٸ��� �ؼ��� �ʿ䰡 �ִ� ��쿡��
		// ����� Ÿ�� ĳ������ �ʿ��ϴ�
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(80);
		System.out.println((char)80);
	}
}
