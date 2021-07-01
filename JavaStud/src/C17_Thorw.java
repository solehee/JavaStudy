
public class C17_Thorw {
	/*
	 	# throw
	 	 - ���ϴ� ���ܸ� �߻���Ų��
	 	 
	 	# throws
	 	 - �ش� �޼��忡�� �߻��ϴ� ���ܸ� ����Ѵ�
	 	 - �ش� �޼��带 ȣ���� ������ ����ó���� �̷��
	 	 
	 	# Exception Ŭ����
	 	 - Exception Ŭ������ ��ӹ޾� ���ܸ� ������ �� �ִ�
	 	 - Exception Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó���ؾ��ϴ� ���ܰ� �ȴ�
	 	 - �ݵ�� ���� ó���� �Ǿ� �־�� �������� ������ش�
	 	 
	 	# RuntimeException Ŭ����
	 	 - RuntimeException Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó������ �ʾƵ� �Ǵ� ���ܰ� �ȴ�
	 	 - ����ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ´�
	*/
	
	public static void main(String[] args) {
		test2();
		try {
			test();
		}catch(NotAnimalException e){
			e.printStackTrace();
			System.out.println("ȣ������� ������ �ƴմϴ�");
		}
		//throw new InputMismatchException();
	}
		
	public static void test() throws NotAnimalException{
		String name = "ȣ������";
		if(name.equals("ȣ����")) {
		System.out.println("����");
		}else if(name.equals("ȣ������")) {
		throw new NotAnimalException();
		}
		/*int[] num = new int[10];
		num[15] = 1;*/
	}

	public static void test2() {
		int a = 10;
		if(a%2 ==0) {
			System.out.println("¦��");
		}else {
			throw new NotEvenException();
		}
	}
}

class NotAnimalException extends Exception{
	public NotAnimalException() {
		super("������ �ƴմϴ�.");
	}
}

class NotEvenException extends RuntimeException{
	public NotEvenException() {
		super("¦���� �ƴմϴ�");
	}
}