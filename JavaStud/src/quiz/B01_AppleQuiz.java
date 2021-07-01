package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {

	/* 
	  	사과를 10개 씩 담을 수 있는 바구니가 있다
	  	
	  	 사용자가 구매하고 싶은 사과의 개수를 입력하면
	  	 사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요
	 
	*/
	//브래이크포인트, 디버그 창 단축키 다시 확인
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int apple;
		int basket_size = 10;
		int basket;
	/* double basket_size = 20;
		double basket;
		
		System.out.print("사과몇개 > ");
		apple = sc.nextInt();
		basket = apple / basket_size;
		// Math.ceil(a) : a를  소수 첫째 자리에서 올린다
		// Math.floor(a) : a를 소수 첫째 자리에서 내린다
		System.out.println("필요한 바구니의 개수는 "+(int)Math.ceil(basket));
		System.out.printf("필요한 바구니의 개수는 %d개 입니다. ", (int)Math.ceil(basket));
	*/
		System.out.print("구매하고 싶은 사과의 개수를 입력하시오 > ");
		apple = sc.nextInt();

		// 10,20,30 등 바구니 크기로 딱 맞아 떨어지는 경우
		if (apple % basket_size == 0)
		{
			basket = apple / basket_size;
		}
		else 
		{
			basket= apple/basket_size+1;
		}
		if(apple <0)
		{
		System.out.println("올바른 사과 개수가 아닙니다.");
		}
		else
		{
			System.out.printf("필요한 바구니의 개수는 %d개 입니다", basket);
		}
			
		
		System.out.printf("필요한 바구니의 개수는 %d개 입니다.",basket);
		
	}
}
