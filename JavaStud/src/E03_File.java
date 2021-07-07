import java.io.File;

public class E03_File {
	/*
	 	# java.io.File
	 	- ���� �ý��ۿ� ����Ǿ� �ִ� ������ ������ ���� �� �ִ� Ŭ����
	 	- File �ν��Ͻ��� ����ִ� ������ �������� �ش� ������ �����ϰų�
	 	  ���ο� ���� �Ǵ� ���丮�� ������ �� �ִ�
	*/
	public static void main(String[] args) {
		File f1 = new File("note/Git ��� ����.txt");
		File f2 = new File("note/Git ��� ����");
		
		System.out.println("f1�� �����մϱ�? "+f1.exists());
		System.out.println("f1�� �����մϱ�? "+f2.exists());
		
		System.out.println("�б� ������ �ִ� �����ΰ���? "+f1.canRead());
		System.out.println("���� ������ �ִ� �����ΰ���? "+f1.canWrite());
		System.out.println("���� ������ �ִ� �����ΰ���? "+f1.canExecute());
	}
}
