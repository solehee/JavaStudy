package myobj;

public class Bargame {
// �� �ݾ� ���ϰ� 
// �� 150�� �ȸ� ��� ����	
// �޴� �� 50���� ����
	
	final int MAX_ORDER=150;
	
	Count[] orderList;
	int order_index;

	Bargame(){
		orderList = new Count[MAX_ORDER];
	}
	boolean checkMaxOrder() {
		return order_index == MAX_ORDER;
	}

	void createBeer() {
		int price=5000;
		int sales_beer=0;
		int count=(int)(Math.random()*200+1);

		if(checkMaxOrder()) {
			System.out.println("�ֹ��� �з��ֽ��ϴ�!!");
			return;
		}
		if(count<50) {
			orderList[order_index++] = new Count("Beer",count);
			sales_beer=price*count;
			System.out.printf("���� %d�� ����: %d��\n",count,sales_beer);
		return;
		}
		else {
			System.out.printf("�ֹ��Ͻ� %d�� ���� %d�� ��� �����մϴ�\n",count,count-50);
		}
	}
	void createSoju() {
		int count=(int)(Math.random()*200+1);
		int price=4000;
		int salse_soju=0;
		
		if(checkMaxOrder()) {
			System.out.println("�ֹ��� �з��ֽ��ϴ�!!");
			return;
		}
		if(count<50) {
			orderList[order_index++] = new Count("Soju",count);
			salse_soju=price*count;
			System.out.printf("���� %d�� ����: %d��\n",count,salse_soju);			
		}
		else {
			System.out.printf("�ֹ��Ͻ� %d�� ���� %d�� ��� �����մϴ�\n",count,count-50);
		}
	}
	void createSomaek() {
		int count=(int)(Math.random()*200+1);
		int price=8000;
		int sale_somaek=0;
		if(checkMaxOrder()||count>50) {
			System.out.println("�ֹ��� �з��ֽ��ϴ�!!");
			return;
		}
		if(count<50) {
			orderList[order_index++] = new Count("Somaek",count);
			sale_somaek=price*count;
			System.out.printf("�Ҹ� %d�� ����: %d��\n",count,sale_somaek);			
		return;
		}
		else {
			System.out.printf("�ֹ��Ͻ� %d�� ���� %d�� ��� �����մϴ�\n",count,count-50);
		}
		
	}
	
}
