
package quiz;

import java.util.Scanner;

public class B07_Prime {
	/*
	 사용자로부터 숫자(양수)를 입력받으면
	 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	 (음수를 입력하면 다시 제대로 입력하게 하기)
	 ※ 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자
	 
	     2, 3, 5, 7, 11, 13...
	*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int number = sc.nextInt();
		
		for (;number<2;) {
			System.out.println("잘못된값 다시 입력");
		    System.out.print("> ");
		    number = sc.nextInt();
			}
			
				for (int i= 2; i <= number; ++i){
					int count=0;
					boolean prime = true;
					for(int j=2;j<=Math.sqrt(i);++j) {
					if(i%j==0) {
					prime = false;	
							
				}
				}
					if(prime) {							
						System.out.println(i); 		
					}
				}
	}
}


