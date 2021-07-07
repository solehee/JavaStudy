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
		File f3 = new File("files");
		File f4 = new File(f3,"game.sav");// parent, child
		File f5 = new File("image");
		
		System.out.println("f1�� �����մϱ�? "+f1.exists());
		System.out.println("f1�� �����մϱ�? "+f2.exists());
		
		System.out.println("�б� ������ �ִ� �����ΰ���? "+f1.canRead());
		System.out.println("���� ������ �ִ� �����ΰ���? "+f1.canWrite());
		System.out.println("���� ������ �ִ� �����ΰ���? "+f1.canExecute());
		
		System.out.println("f1�� ����ִ� ��ΰ� ���� ����ΰ���? "+f1.isAbsolute());
		System.out.println("f1�� ���� ��� : "+f1.getAbsolutePath());
		System.out.println("f1�� ���丮�ΰ���? "+f1.isDirectory());
		
		System.out.println(f1);
		System.out.println(f3.isDirectory());
		System.out.println(f4);
		System.out.println(f4.getAbsolutePath());
		
		if(!f5.exists()) {
			f5.mkdir(); // �ش� ��η� ���ο� �뷺�丮(����) ����
			System.out.println("���� ������.");
		}else {
			System.out.println("�̹� �����ؼ� �������� ����.");
		}
	}
}
