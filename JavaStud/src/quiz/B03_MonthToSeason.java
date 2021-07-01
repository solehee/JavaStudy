package quiz;
import java.util.Scanner;

public class B03_MonthToSeason {
 /*
   사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
   (switch-case 문을 사용할 것)
    
 */
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int month;
		String season;
		
		System.out.print("몇 월? > ");
		month = sc.nextInt();
		
		switch (month) {
		case 12: case 1: case 2:
			season = "겨울";
			//System.out.printf("입력한 달은 %d월 겨울 입니다.\n",month);
			break;
		case 3: case 4: case 5:
			season= "봄";
			//System.out.printf("입력한 달은 %d월 봄 입니다.\n",month);
			break;
		case 6: case 7: case 8:
			season="여름";
			//System.out.printf("입력한 달은 %d월 여름 입니다.",month);
			break;
		case 9: case 10: case 11:
			season="가을";
			//System.out.printf("입력한 달은 %d월 가을 입니다.",month);
			break;
		default:
			season="없음";
			//System.out.println("올바르지 않은 값입니다");
			break;
		}
		if(month < 1 || month > 12) {
			System.out.println("잘못된 계절입니다.");
		}
		else {
			System.out.printf("%d월은 %s입니다.\n",month,season);		
		}
	}
}
