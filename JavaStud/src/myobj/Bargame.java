package myobj;

public class Bargame {
// 술 금액 정하고 
// 술 150병 팔면 장사 접음	
// 메뉴 당 50병씩 제한
	
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
			System.out.println("주문이 밀려있습니다!!");
			return;
		}
		if(count<50) {
			orderList[order_index++] = new Count("Beer",count);
			sales_beer=price*count;
			System.out.printf("맥주 %d병 팔음: %d원\n",count,sales_beer);
		return;
		}
		else {
			System.out.printf("주문하신 %d개 보다 %d개 재고가 부족합니다\n",count,count-50);
		}
	}
	void createSoju() {
		int count=(int)(Math.random()*200+1);
		int price=4000;
		int salse_soju=0;
		
		if(checkMaxOrder()) {
			System.out.println("주문이 밀려있습니다!!");
			return;
		}
		if(count<50) {
			orderList[order_index++] = new Count("Soju",count);
			salse_soju=price*count;
			System.out.printf("소주 %d병 팔음: %d원\n",count,salse_soju);			
		}
		else {
			System.out.printf("주문하신 %d개 보다 %d개 재고가 부족합니다\n",count,count-50);
		}
	}
	void createSomaek() {
		int count=(int)(Math.random()*200+1);
		int price=8000;
		int sale_somaek=0;
		if(checkMaxOrder()||count>50) {
			System.out.println("주문이 밀려있습니다!!");
			return;
		}
		if(count<50) {
			orderList[order_index++] = new Count("Somaek",count);
			sale_somaek=price*count;
			System.out.printf("소맥 %d병 팔음: %d원\n",count,sale_somaek);			
		return;
		}
		else {
			System.out.printf("주문하신 %d개 보다 %d개 재고가 부족합니다\n",count,count-50);
		}
		
	}
	
}
