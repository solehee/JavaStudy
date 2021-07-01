
import java.util.Scanner;
//	Scanner sc = new Scanner(Sysetem.in)�ϰ� import�Ҷ� // Cental + Shift + o

public class A08_Scanner {

	/*
		# java.util.Scanner Ŭ����
		 - ���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� �̸� �����Ǿ� �ִ� Ŭ���� 
		 - ��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�(����(�ϵ��ũ), ����, Ű����)
		 - �ַܼκ��� �Է¹ް� ���� ���� System.in�� ����Ѵ�
	 
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* # new Scanner(System.in) 
		   - new �� ���ο� ��ĳ�ʸ� ������ �� ����Ѵ�
		   - new�� �Ҷ� ��ĳ�ʿ� ������ �Է����(InputStream)�� ����ϴ� ��ĳ�ʸ� �����Ѵ�
		   - ��, System.in ���κ��� �Է¹޴� ���ο� ��ĳ�ʸ� �ϳ� �����Ѵ�
		   - �� �� Scanner Ÿ�� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�
		*/
		 
		 
		/* #Scanner Ŭ������ nextInt()
		   - �������� ������ ���� �ϳ� ������
		   - ��ĳ�ʿ� ���� ���� �ƹ��͵� ���� ���� ���缭 �Է��� ��� ��ٸ���
		   - ������ �Է¹޾ƾ� �Ѵ� 
		*/
		System.out.print("��� �� �� �ʿ��ϼ���? > ");
		int num = sc.nextInt();
		// ����ڷκ��� ������ �ޱ������� ��ٷȴٰ� ������ ������ �����Ѵ�
		
		System.out.println(num*500 +"�� �Դϴ�.");
		
		// �Ǽ��� �Է¹��� ���� nextDouble()�� ����Ѵ�
		System.out.print("�̹����� �Ҽ��� �Է��غ����� >>");
		double d = sc.nextDouble();
		
		System.out.printf("�Է��� �Ҽ��� %.5f�Դϴ�.\n",d);
		
		// ���ڿ��� �ƴ� ���� �Է¹��� ��ĳ�ʿ��� '\n' �� �����ְ� �ȴ�
		sc.nextLine(); // ��ĳ�ʿ� �����ִ� '\n' ����
		
		// ���ڿ��� �Է¹��� ���� next() �Ǵ� nextLine()�� ����Ѵ�
		//  next()�� ��� ������ �������� �Է¹ް� 
		//  nextLine()�� '\n'�� �������� �Է� �޴´�
		System.out.print("�̹����� ���ڿ��� �Է��� ������ >>");
		String str = sc.nextLine();
		
		System.out.println("��� : "+str);
		
	}
}
