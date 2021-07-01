package quiz;

import java.util.Scanner;

public class B09_GCD {
/*
 	# 최대 공약수
 	두 숫자를 입력받고 두 숫자의 최대 공약수를 구해보세요
 	- 두 숫자의 공약수 중 가장 큰 공약수
 	
 	20 [1, 2, 4, 5, 10, 20]
 	50 [1, 2, 5, 10, 25, 50]
 	의 경우 10이 최대 공약수
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		System.out.print("숫자 두 개 입력 > ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max=Math.max(num, num2);
		int min=Math.min(num, num2);
		//int max=num>num2? num : num2;
		//int min=num<num2? num:num2;
		
		int gcd=1;
		for (int i = 1; 1<=min; ++i) {
			if (min%i == 0 && max%i==0) {
				gcd=i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수는 %d입니다.", num,num2,gcd);
		/* if (num>num2) {
		
			while(num2 !=0) {
				x=num%num2;
				num=num2;
				num2=x;
			}
			System.out.printf("최대 공약수는 %d 입니다",num);
		}
		else {
			while(num !=0) {
				x=num2%num;
				num2=num;
				num=x;
			}
			System.out.printf("최대 공약수는 %d 입니다", num2);
		}*/
		
	}
}
