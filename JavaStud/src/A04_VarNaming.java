
public class A04_VarNaming {

	public static void main(String[] args) {
		
		/*
		
		 	# �츮�� ������ ����ϴ� ����
		 		
		 	1. ���� �ѹ��� ������ �� �ִ�
		 	 - ���� ������ ã�ƴٴϸ鼭 ������ �ʿ䰡 ��������.
		 	 
		 	2. ���� �ǹ̸� �ο��� �� �ִ�
		 	 - ������ �̸��� ���� �ش� ������ �뵵�� ���� ������ �ľ��� �� �ִ�
		 	 - ������ �̸��� �� ���°��� �ſ� �߿��ϴ�
		 	 
		 
		*/
		
		int apple_count = 5;
		int apple_price = 487;
		int apple_kcal = 123;
		
		System.out.println("����� ����: " + apple_count + "��");
		System.out.println("����� ���� ����: " + apple_price +"��");
		System.out.println("����� ���� Į�θ�: " + apple_kcal + "kcal");
		System.out.println("����� �� ����: " + apple_count * apple_price + "��");
		System.out.println("����� �� Į�θ�: " + apple_kcal*apple_count + "kcal");
	
		/*
		 	# ������ �۸� ��Ģ (���� ����)
		 	
		 	 (1) �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ� (snake_case)
		 	 	 ex: apple_count, minsu_age, minsu_math_score
		 	 
		 	 (2) �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ� (camelCase)
		 	     ex: appleCount, munsuAge, minsuMathScore
		 	     
		 	 (3) ������ ù ���ڴ� �ҹ��ڸ� ����Ѵ�.
		 	
		 	 (4) Ŭ������ ù ���ڴ� �빮�ڸ� ����Ѵ�
		 	 
		 	 (5) ���α׷� ���൵�� ���� ������ ���� ����(�����)�� ��� �빮�ڸ� ����Ѵ�
		 	     ex: APPLE_CALORIE, PI(3.14...)
		 	 
		 	 (6) ������ �뵵�� ������ �� �ִ� ������ �ܾ �������
		 	 
		 	 # �ʼ����� ������ �۸� ��Ģ (����Ű�� ����)
		 	 
		 	  (1) ������ ù ��° ���ڴ� ���ڰ� �� �� ����
		 	  ex: 1st, 2nd, 4apple
		 	  
		 	  (2) ������ ���̿��� ������ ����� �� ����
		 	  
		 	  (3) Ư�����ڴ� _�� $�� ����� �� �ִ�
		 	  
		 	  (4) �̹� ����ϰ� �ִ� Ű����� ���������� ��� �� �� ����
		 	  	(Eclipse �󿡼� ��������� ǥ�õ�
		 	  
		 	  ex: int, short, char, void, static, public, if, for, while ...
		 	  
		*/
	
	}
}