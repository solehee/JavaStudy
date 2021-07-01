
public class A09_Operator02 {

	public static void main(String[] args) {

	
	/*
	 
	  �������� ��� -> �� -> �� ������
	
	
	  	# �� ������
	  	- �� ���� ���ϴ� ����
	  	- �� ������ ����� boolean Ÿ���̴� (�� �Ǵ� ����)
	  	- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
	*/
	
		int a = 10, b = 7;
		System.out.println(a > b);
		System.out.println(a < b);
		
		// �� �ݵ�� �ε�ȣ�� ���� ���;� �� (��ȣ�� ���� ������ �ȵ�)
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b); // �� ���� ���� ������ true
		System.out.println(a != b); // �� ���� ���� �ٸ��� true
		
		/*
		
		 	# �� ������
		 	
		 	- boolean Ÿ�� ������ �ϴ� ����
		 	- �� ����� �� ������ �Բ� ������ �� ������ ���� ����Ѵ�
		 	- && : �� ���� ���� ��� true �϶��� true (AND)
		 	- || : �� ���� �� �� �ϳ��� true ���� true (OR)
		 	- ! : true�� false, false�� true (NOT)
		 	
		*/
		System.out.println("true && true : "+ (true && true));
		System.out.println("true && false : "+ (true && false));
		System.out.println("false && true : "+ (false && true));
		System.out.println("false && false : "+ (false && false));
		
		System.out.println("true || true : "+ (true || true));
		System.out.println("true || false : "+ (true || false));
		System.out.println("false || true : "+ (false || true));
		System.out.println("false || false : "+ (false || false));
		
		System.out.println(!true);
		System.out.println(!false);
		
		int c= 51;
		
		System.out.print("C�� ¦�� �ΰ���? ");
		System.out.println(c % 2 == 0);
		
		System.out.print("C�� Ȧ�� �ΰ���? ");
		System.out.println(c % 2 == 1);
		System.out.println(!(c % 2 == 0));
		System.out.println(c % 2 != 0);

		System.out.print("C�� ¦���̸鼭 50���� ū����? ");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.print("C�� ¦���̰ų� 50���� ū����? ");
		System.out.println(c % 2 == 0 || c > 50);
		
		// ��������: ���� x, y, z �� ��� 3�� ����� �ƴ� �� true �� �Ǵ� �� ������ ����� ������
		int x= 2, y=5, z=7;
		System.out.print("x, y, z �� ��� 3�� ����� �ƴϴ� : ");
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 !=0);
		System.out.println(!(x % 3 == 0 || y % 3 == 0 || z % 3 ==0));
		
		
	}
}
