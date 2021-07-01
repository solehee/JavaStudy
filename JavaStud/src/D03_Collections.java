import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D03_Collections {
	/*
	 	# Collections 클래스
	 	- 컬랙션을 편리하게 다룰 수 있는 다양한 기능들이 모여있는 클래스
	 
	*/
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("햄버거");
		foods.add("돈까스");
		foods.add("돈부리");
		foods.add("청국장");
		foods.add("카라아게");
		foods.add("짜장면");
		
		//최대값, 최소값
		System.out.println("max food: "+Collections.max(foods));
		System.out.println("min food: "+Collections.min(foods));
		
		// 정렬
		Collections.sort(foods);
		System.out.println(foods);
		
		// 사실 Arrays 에도 sort가 있다
		int []arr = {1, 7, 3, 5, 13, 1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 뒤섞기A
		Collections.shuffle(foods);
		System.out.println(foods);
		
		// 컬랙션에 한번에 여려개 추가하기
		Collections.addAll(foods, "감자튀김", "치즈스틱", "치킨너겟", "오징어튀김", "새우튀김");
		System.out.println(foods);
		
		foods.add("치킨너겟");
		foods.add("치킨너겟");
		foods.add("치킨너겟");
		
		// 해당 값이 몇 개 들어있는지를 쉽게 검사할 수 있다 
		System.out.println(Collections.frequency(foods, "치킨너겟"));
		
		// 컬랙션을 거꾸로 바꾼다
		Collections.reverse(foods);
		System.out.println(foods);
		
		// 컬랙션 내부 두 값의 위치를 교환한다
		Collections.swap(foods, 0, 8);
		System.out.println(foods);
		
		// 오른쪽으로 5칸 이동
		Collections.rotate(foods, 5);
		System.out.println(foods);
		
		// 왼쪽으로 10칸 이동
		Collections.rotate(foods, -10);
		System.out.println(foods);
	}
}
