package myinterface;

public class bankAccount {
	public static void main(String[] args) {
		result(new Hanabank());		
	}
	
	public static void result(Account account) {		
	for(int i=0;i<10;++i) {
		System.out.println("------�Ա��Ͽ����ϴ�-----");
		System.out.printf("���� �ܾ��� "+account.balance()+"�� �Դϴ�");
		System.out.println("��������"+account.commission()+"���� �Դϴ�");
		System.out.println("�������"+account.interest()+"�� �Դϴ�");
		System.out.println("���� ���� �ѵ� �ݾ� : "+account.limit_money()+"�� �Դϴ�");
	}
	System.out.println();
	}
}
