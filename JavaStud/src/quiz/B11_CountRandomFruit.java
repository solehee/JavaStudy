package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {
/*
  	사용자로부터 숫자를 입력받으면 해당 개수 만큼의 랜덤 과일을 선택한다
  	(랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
  	
  	그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력
*/
	public static void main(String[] args) {
		System.out.print("숫자 입력> ");
		int num = new Scanner(System.in).nextInt();
		
		
		String[] fruits = {"apple", "banana","kiwi","orange","grape","peach"};
		
		int [] fruit_count=new int[fruits.length];
		
		for(int i=0;i<num;++i){
			int random_number=(int)(Math.random()*fruits.length);
			System.out.println(fruits[random_number]);
			fruit_count[random_number]++;
		}
		System.out.println("###### 과일 #####");
		for (int i = 0;i<fruits.length;++i) {
			System.out.printf("%s는 %d번 등장\n", fruits[i],fruit_count[i]);
		}
		
		
		
		
		
		
		
		/*int count=0;
		String[] fruit = new String[6];
		fruit[0] = "apple";
		fruit[1] = "banana";
		fruit[3] = "kiwi";
		fruit[4] = "orange";
		fruit[5] = "grape";
		fruit[6] = "peach";
		int [] fruit_count=new int [fruits.length];
		//랜덤값 만큼 배열 주소 반복되게 하기
		for (int i = 0 ; i<=num;++i) {
		int random_count  = (int)(Math.random()*fruit.lenght);
		// 사용자가 입력한 값만큼 반복 시키는중
		// 랜덤값과 과일 연결+i값 연결
		System.out.println(fruits[randon_count]);
		fruit[random_count]++;
			
		}
		for (int = 0 ; i<fruits.length;++i){
		System.out.printf("%d만큼 %d이 %d번 선택\n",fruit[i],friut_count);
		}*/
	}
}
