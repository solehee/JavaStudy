package myobj.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Receipt implements Comparable<Receipt> {
	 
	public int orderNum;
	public int price;
	public int shopNum;
	
	private static int MAX_PRICE = 100000; 
	private static Random ran = new Random();
	
	public Receipt() {
		shopNum = ran.nextInt(101+1);
		orderNum = ran.nextInt(101+1);
		price = ran.nextInt(MAX_PRICE+1000);
	}
	
	@Override
	public String toString() {
		return String.format("[%d번 가게] 주문번호 : %d | 가격 : %,d원\n", 
				shopNum, orderNum, price);
	}
	
	@Override
	public int compareTo(Receipt o) {
		return (this.price - o.price)!=0?
				this.price - o.price: orderNum - o.orderNum;
	}

}
