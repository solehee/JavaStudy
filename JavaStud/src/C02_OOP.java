
public class C02_OOP {
	/*
 		# 객체지향 프로그래밍 (OOP: Object Oriented Programming
 		
 		- 세상에 존재하는 모든 것들을 변수와 함수로 표현하라는 프로그래밍 방법론
 		- 변수와 함수를 무분별하게 사용하기 보다는
 		  현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다.
 		- 객체(Object) : 세상에 존재하는 모든 것 (사물, 개념 ...등등)
 		
 		ex : 사과
 			- 사과의 변수 : 크기, 당도, 색깔, 칼로리, 유통기한, 모양
 			- 사과의 메서드 (변수를 변화시키는 것들)
 				먹는다 (크기가 줄어들면서 칼로리만큼 먹은 사람의 칼로리 증가)
 				색이 변한다
 				유통기한이 줄어든다 
 				던진다 (크기만큼의 데미지를 입힌다)
 				냉장고에 보관한다 (유통기한이 느리게 감소한다)
 				
			※ 클래스에 딸려 있는 함수들을 메서드라고 부른다 (JAVA에는 메서드밖에 없다)
			
		# 클래스 (Class)
		
		- 객체를 프로그래밍 언어로 표현한 것
		- 클래스는 해당 객체의 설계도다 (정의한 시점에서는 실체가 없다)
		- 설계도대로 찍어내는 실체 객체를 '인스턴스' 라고 부른다
		- 클래스는 참조형 변수 타입이다
		
		
	*/
	
	//  main은 반드시 public class 내부에 존재해야 한다.
	// (파일이름과 똑같은 이름의 클래스에 존재해야 찾을 수 있다)
	public static void main(String[] args) {
		
		// new 를 통해 인스턴스 생성
		Apple a1= new Apple();
		Apple a2= new Apple();
		Apple a3= new Apple();
		
		a1.size=15;
		a1.color="빨간색";
		
		a2.size=13;
		a2.color="보라색";
		
		a3.size=25;
		a3.calorie = 100;
		
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("먹기 전 a3의 크기: "+a3.size);
		System.out.println("먹기 전 a3의 칼로리: "+a3.calorie);
		
		a3.eat();
		
		System.out.println("먹기 전 a3의 크기: "+a3.size);
		System.out.println("먹기 전 a3의 칼로리: "+a3.calorie);
		System.out.println();
		
		
		Dog sol=new Dog();
		Dog happy=new Dog();
		
		sol.age=4;
		sol.breed="진도";
		sol.clothes_size=95;
		sol.weight=11.93;
		sol.walk=2;
		
		System.out.printf("현재 나이 : %d\n",sol.age);
		System.out.printf("weight : %.2fkg\n", sol.weight);
		System.out.printf("clothes size : %d\n", sol.clothes_size);
		System.out.printf("일일 산책량 : %d\n",sol.walk);
		System.out.println("----------------------");
		
		sol.year();
		sol.size_up();
		sol.daly_exercise();
		
		Window window1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		w3.status();
		
		w2.open();
		w2.status();
		
		window1.open();
		window1.close();
		window1.lock();
		
		window1.status();
		String status = window1.getStatus();
		System.out.println("가져온 상태 문자열로 출력: "+status);
		
		//String flavor = "초코";
		String[] flavor= {"초코", "바닐라","딸기","바닐라"};
		//String Color = "민트";
		String[] color= {"민트색","노란색","딸기색","초록색"};
		int price = 1500;
		int calorie = 800;
		String product = "농심";
		String type = "콘";
		
		IceCream gugucom = new IceCream();
		System.out.println(gugucom.color);
		
		IceCream[] icebox=new IceCream[10];
		icebox[0]= new IceCream();
		System.out.println(icebox[0].flavor);
		
		doSomething(1, "2",'A', 4.0f, 5.0);
	}
	public static void doSomething(int a, String b, char c, float d, double e) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}
	public static void doSomething(Box box) {
		System.err.println(box.a);
		System.err.println(box.b);
		System.err.println(box.c);
		System.err.println(box.d);
		System.err.println(box.e);
	}
}
class IceCream{
	String flavor;
	String color;
	int price;
	int calorie;
	String product;
	String type;
}
class Box{
	int a;
	String b;
	char c;
	float d;
	double e;
}

/*
    연습문제 : 현샐의 객체를 참고하여 클래스 하나 생성한 후 인스턴스를 생성하고 값을 채운다음 출력해보세요
    ※ 인스턴스 변수는 3개 이상, 인스턴스 메서드 2개 이상, 과일금지
 */

class Dog{
	double weight;
	int age;
	String breed;
	int clothes_size;
	int walk;
	
	void year() {
		age++;
		System.out.printf("sol의 현재 나이 : %d\n",age);
	}
	void size_up() {
		weight++;
		clothes_size+=5;
		System.out.printf("weight : %.2fkg\n",weight);
		System.out.printf("clothes size : %d\n",clothes_size);
	}
	void daly_exercise() {
		walk++;
		System.out.printf("일일 산책량 : %d\n",walk);
		}
	}

class Apple{
	
	/*
		# 인스턴스 변수
		
		- 클래스 내부에 선언한 변수
		- 인스턴스 마다 각자의 영역을 가지고 있는 변수들
		- aka. 필드, 속성, 멤버 변수, 멤버, 상태...
	
	*/
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
	 	# 인스턴스 메서드
	 	- 인스턴스 변수를 통해 해당 인스턴스의 상태를 변화시키는 메서드
	*/
	
	void eat() {
		size--;
		calorie-=10;
	}	
}

class Window{
	boolean open;
	boolean lock;
	double width;
	double heigth;
	
	void open() {
		open = true;
	}
	void close() {
		open=false;
	}
	void lock() {
		lock = true;
	}
	void unlock() {
		lock=false;
	}
	void status() {
		System.out.printf("이 창문은 %s. [%s]\n", 
				open? "열려있습니다." : "잠겨있습니다",
				lock? "잠겨있습니다." : "잠금 해제 상태입니다.");
	}
	
	String getStatus() {
		// String.format() : 서식을 이용해 원하는 문자열을 생성한다
	return String.format("이 창문은 %s. [%s]\n", 
			open? "열려있습니다." : "잠겨있습니다",
			lock? "잠겨있습니다." : "잠금 해제 상태입니다.");
	}
}