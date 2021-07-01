package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz <T> { //<T> { 아직 미정인 타입을 특정타입으로 만들고 싶을때 쓴다
    static class Fruit {}
    
    static class Apple extends Fruit {}
    static class Banana extends Fruit {}        
    static class Carrot {}
    
    public static void main(String[] args) {
            D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();        
            
            List<String> A = new ArrayList<>();
            Set<String> B = new HashSet<>();
            
            A.add("Americano");
            A.add("Americano");
            A.add("Cold Brew");
            A.add("Latte");
            
            B.add("Americano");
            B.add("Coke");
            B.add("Sprite");
            
            System.out.println(jiphap.union(A, B));
            System.out.println(jiphap.intersection(A, B));
            System.out.println(jiphap.diff(B, A));
            
            D02_JiphapQuiz<Fruit> jiphap2 = new D02_JiphapQuiz<>();
            
            List<Apple> apple_list = new ArrayList<>();
            Set<Banana> apple_set = new HashSet<>();
            
            jiphap2.union(apple_list, apple_set);
    }
    
    /*
             1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
             
               [1, 2, 3, 4] 합집합 [3, 4, 5]  => [1, 2, 3, 4, 5]
             
             2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
             
               [1, 2, 3, 4] 교집합 [3, 4, 5]  => [3, 4]
             
             3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
             
               [1, 2, 3, 4] - [3, 4, 5] => [1, 2]
             
               [3, 4, 5] - [1, 2, 3, 4] => [5] 
             
             를 만들고 테스트 해보세요
    */
    public HashSet<T> union(Collection<? extends T> A, Collection<? extends T> B) {
            HashSet<T> union = new HashSet<>();
            
            union.addAll(A);
            union.addAll(B);
            
            return union;
    }
    
    public HashSet<T> intersection(Collection<? extends T> A, Collection<? extends T> B) {
            HashSet<T> inter = new HashSet<>();
            
            inter.addAll(A);
            inter.retainAll(B);
            
            return inter;
    }
    
    public HashSet<T> diff(Collection<? extends T> A, Collection<? extends T> B) {
            HashSet<T> diff = new HashSet<>();
            
            diff.addAll(A);
            diff.removeAll(B);
            
            return diff;
    }
    
}
	
	/*
	public  HashSet<Integer> union(Collection<Integer> A, Collection<Integer> B){
		HashSet<Integer> union = new HashSet<>();
		
		union.addAll(A);
		union.addAll(B);
		return null;
	}
	
	public static HashSet<Integer> intersection(Collection<Integer> A, Collection<Integer> B){
		HashSet<Integer> inter = new HashSet<>();
		
		inter.addAll(A);
		inter.retainAll(B);
		return inter;
	}
	
	public static HashSet<Integer> diff(Collection<Integer> A, Collection<Integer> B){
		HashSet<Integer> diff = new HashSet<>();
		
		diff.addAll(A);
		diff.remove(B);
		return diff;
	}*/

	/*	public static void union(int numberList, int setList) {			
			numberList().addAll(setList());
			System.out.println("1번 문제 : "+numberList());
		}
		
		public static void intersection(int numberList, int setList) {			
			setList().retainAll(numberList());
			System.out.println("2번 문제 : "+setList());	
		}
		
		public static void difference(int numberList, int setList) {
			HashSet<Integer> check = new HashSet<>(numberList());
			check.removeAll(setList());
			System.out.println("3번 문제 : "+check);			
		}
		
		
		static ArrayList<Integer> numberList() {
			ArrayList<Integer> number = new ArrayList<>();
				
			number.add(1);
			number.add(2);
			number.add(3);
			number.add(4);
			
			return number;
		}
		
		static HashSet<Integer> setList() {
			HashSet<Integer> num = new HashSet<>();
				
			num.add(4);
			num.add(5);
			num.add(1);
				
			return num;
		}
}
*/