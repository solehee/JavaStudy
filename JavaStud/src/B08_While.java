
public class B08_While {
/*
 		# While
 		- for ���� ������ �ణ �ٸ� �ݺ���
 		- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
 		- ()���� ������ ���� ���� {}���� ������ �ݺ��Ѵ�
 		- �������� ��ġ�� ���� ���α׷� ������ �޶��� �� �����Ƿ� �����ؾ� �Ѵ�
 */
	public static void main(String[] args) {
		
		// while ���� �������� ��ġ�� ���� ����� �޶��� �� �ִ�
		int i = 0;
		
		// 1 ~ 10 : 10��
		// 0 ~ 9 : 10��
		// 1 ~ 9 : 9�� while (++i) �� ��� �����������
		while (i++ <10) {
			System.out.println(i);
			
		}
		
		// while �������� break �� continue�� ����� �� �ִ�
		i = 0;
		
		while (true) {
			System.out.println(++i);
			
			if (i==140) {
				break;
			}
		}
	}
}
