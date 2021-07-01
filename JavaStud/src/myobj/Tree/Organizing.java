package myobj.Tree;

import java.util.TreeSet;

public class Organizing {
	public static void main(String[] args) {
		TreeSet<Receipt> receipt = new TreeSet<>();
		for(int i=0;i<100;++i) {
			receipt.add(new Receipt());
		}
		System.out.println(receipt);
		
		
		Receipt start = new Receipt();
		Receipt end = new Receipt();
		
		start.price = 50000;
		end.price = 80000;
		System.out.print("5만원이상 8만원 이하 주문고객의 수 > ");
		System.out.println(receipt.subSet(start, end).size());
	}
}
