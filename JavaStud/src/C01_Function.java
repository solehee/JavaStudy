
public class C01_Function {
	/*
	 	# �Լ� (Function)
	 	
	 	 - ����� �̸� �����صΰ� ���߿� ������ ���� ��
	 	 
	 	 - ������ ���������� ������� �ʰ�,
	 	   �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� ����ȴ�
	 	   
    	 - ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
    	   �۾��� �ݺ��� ���� �� �ִ�
    	   
    	 - �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο�  �����ؾ� �Ѵ�
 	  	
 	  	# �Լ��� ���� (return)
 	  	
 	  	- �Լ��� ������ �� �Լ� �տ� �ش� �Լ��� ��ȯ�ϴ� ���� Ÿ���� ���´�
 	  	
 	  	- �Լ��� ȣ���ϸ� ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ(return)�ȴ�
 	  	
 	    - ����Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� �ǹ��ϴ� ��ȯ Ÿ���̴�
 	  	 
 	    # �Լ��� �Ű����� (arguments)
 	    
 	    - �Լ��� ȣ���� �� ()�ȿ� �����ϴ� ���� ���ڶ�� �Ѵ�
 	    
 	    - �Լ��� ������ �� ()�ȿ� ���ڸ� ���� �� �ִ� �������� �����ϴµ�, �̸� �Ű�������� �Ѵ�
	*/
	public static void main(String[] args) {
		
		for(int i=0;i<10;++i) {		
			printRabbit();
		}
		
		int need = appleBasket(31,10);
		System.out.println("�ʿ��� �ٱ����� ������ "+need+"�� �Դϴ�.");
		
		//�ܼ� ���
		System.out.println(appleBasket(31,10));
		
	}
	public static void printRabbit(){
		System.out.println(" /)/)");
		System.out.println("( ..)");
		System.out.println("( >��)");
	}
	
	// ex: ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	public static int appleBasket(int apple, int size) {
		int basket = apple%size==0? apple/size: apple/size+1;
		
		return basket;
	}
}
