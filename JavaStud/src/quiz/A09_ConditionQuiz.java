package quiz;

public class A09_ConditionQuiz {
	public static void main(String[] args) {
				
		int a = 15, b = 7, c = 14 ;
		int hour = 13;
		int d=10, e=40;
		int year=100;
		int minsu_age = 20, charsu_age=45,
			minsu_birthm = 10, charsu_birthm = 4;
		int age;
		age = minsu_age - charsu_age; 		
		boolean powerOn = false; 
		String str = "yes";
		
		System.out.print("1. int�� ���� a�� 10���� ũ�� 20���� ���� �� ");
		System.out.println(a > 10 && a < 20 );
		
		System.out.print("2. int�� ���� b�� ¦���� �� ");
		System.out.println(b % 2 == 0); // b%2 != 1 ���� �ᵵ��
		
		System.out.print("3. int�� ���� c�� 7�� ����� �� ");
		System.out.println(c % 7 == 0);
		
		System.out.print("4. ");
		System.out.println(!(hour < 0 || hour >=24)&& hour >= 12);
		System.out.println(hour < 24 && hour >= 12 );
		
		System.out.print("5. ");
		System.out.println(Math.abs(d - e) == 30); // d�� ���� �� �۾� -30�� ��쵵 �־ ���밪 
		
		System.out.print("6. int�� ���� year�� 400���� ������ �������ų� ");
		System.out.println(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0));
		
		
		System.out.println("7. "+ (age >=2 ));
		System.out.println("8. " + (minsu_birthm - charsu_birthm < 3));
		
		System.out.println("9. "+(powerOn == false));
		System.out.println(!powerOn);
		

		String str1 = "yes";
		String str2 = "yes ";
		String str3 = new String("yes");
		
		// ������ ������ ==�� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�
		System.out.println("str1 == \"yes\" : "+(str1 == "yes"));
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�		
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		// �ҹ��ڷ� �����ϴ� Ÿ�� �������� stack�� �������� ���δ�
		// �빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
		// �빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, 
		// �ű⿡ .�� ��� ���� �����͸� ������ �� �ִ� 
		
	}
}
