
public class B01_If {

	/*
		# if��
		- ()�ȿ� ���� ture �϶� {}���� ������ �����Ѵ�
		- ()�ȿ� ���� false �϶� {}���� ������ �����Ѵ� 
		- {}�ȿ��� ������ ������ �� �� ���̶�� {}�� ������ �� �ִ� (�Ϻη� ���� �ʴ� ��찡 ����)
		
		# else if ��
		- ���� �ִ� if ���� ������� �ʾҴٸ� �ؿ��� if��ó�� �����Ѵ�
		- else if�� �ܵ����� ���� �� ����
		- else if�� ������ ����� �� �ִ�
		
		# else ��
		- ���� �ִ� ��� if ���� else if ���� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
		- if �� �ٷ� ������ ����� ���� �ִ�
	*/
	public static void main(String[]args) {
		
		char ch = '-';
				
		
		if (ch >='��' && ch <= '�R') {
			System.out.println("ch�� ����ִ� ���� �ѱ��Դϴ�!");	
			System.out.println("if�� ��!");
		} else if (ch >='a' && ch <='z') {
			System.out.println("Ch�� ��� �ִ� ���� ���ĺ� �ҹ����Դϴ�!");
		} else if (ch >='A' && ch <='Z') {
				System.out.println("Ch�� ��� �ִ� ���� ���ĺ� �빮���Դϴ�!");
		} else { 
			System.out.println("ch�� ��� �ִ� ���ڴ� ���ĺ��� �ƴϰ� �ѱ۵� �ƴմϴ�!");
		}
		System.out.println("���α׷� ��");
	}
}
