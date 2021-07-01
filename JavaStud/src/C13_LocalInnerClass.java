
public class C13_LocalInnerClass {
	/*
	 	# 지역 내부 클래스
	 	
	 	- 클래스는 사실 메서드 내부에서도 정의할 수 있다
	 	- 메서드가 끝나면 해당 클래스도 수명이 다한다
	*/
	public static void main(String[] args) {
		
		// 메서드 내부에도 클래스를 사용할 수 있음
		class Apple{
			
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			
			@Override
			public String toString() {
				return "price : "+price+"원\ncolor값: "+color;
			}
		}
		
		Apple a = new Apple(1000,1);
		System.out.println(a);
		
		// 다음과 같은 상황에 o.check()를 실행할 수 없는 이유를 설명하고,
		// 업캐스팅 된 상태에서는 본래 클래스가 갖고있던 기능을 잠시 잊어버린다.
		
		// check()를 실행하려면 어떻게 해야하는지 200자 이내로 서술하시오
		// 오브제 클래스가 아니라 상속을 받게 만들어서 진행
		
		Fruitt fruit = execBanana();
		fruit.check();
		System.out.println("바나나는 개당 " + fruit.check()+"원입니다.");
		//o.check();
	}
	
	public static Fruitt execBanana() {
		class Banana extends Fruitt{
			int bana_count;
			int price;
			
			public Banana(int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}
		return new Banana(11, 3000);
	}
}

abstract class Fruitt{
	abstract double check();
}