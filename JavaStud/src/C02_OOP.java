
public class C02_OOP {
	/*
 		# ��ü���� ���α׷��� (OOP: Object Oriented Programming
 		
 		- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���϶�� ���α׷��� �����
 		- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ�
 		  ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���.
 		- ��ü(Object) : ���� �����ϴ� ��� �� (�繰, ���� ...���)
 		
 		ex : ���
 			- ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ���
 			- ����� �޼��� (������ ��ȭ��Ű�� �͵�)
 				�Դ´� (ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ� ����)
 				���� ���Ѵ�
 				��������� �پ��� 
 				������ (ũ�⸸ŭ�� �������� ������)
 				����� �����Ѵ� (��������� ������ �����Ѵ�)
 				
			�� Ŭ������ ���� �ִ� �Լ����� �޼����� �θ��� (JAVA���� �޼���ۿ� ����)
			
		# Ŭ���� (Class)
		
		- ��ü�� ���α׷��� ���� ǥ���� ��
		- Ŭ������ �ش� ��ü�� ���赵�� (������ ���������� ��ü�� ����)
		- ���赵��� ���� ��ü ��ü�� '�ν��Ͻ�' ��� �θ���
		- Ŭ������ ������ ���� Ÿ���̴�
		
		
	*/
	
	//  main�� �ݵ�� public class ���ο� �����ؾ� �Ѵ�.
	// (�����̸��� �Ȱ��� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�)
	public static void main(String[] args) {
		
		// new �� ���� �ν��Ͻ� ����
		Apple a1= new Apple();
		Apple a2= new Apple();
		Apple a3= new Apple();
		
		a1.size=15;
		a1.color="������";
		
		a2.size=13;
		a2.color="�����";
		
		a3.size=25;
		a3.calorie = 100;
		
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("�Ա� �� a3�� ũ��: "+a3.size);
		System.out.println("�Ա� �� a3�� Į�θ�: "+a3.calorie);
		
		a3.eat();
		
		System.out.println("�Ա� �� a3�� ũ��: "+a3.size);
		System.out.println("�Ա� �� a3�� Į�θ�: "+a3.calorie);
		System.out.println();
		
		
		Dog sol=new Dog();
		Dog happy=new Dog();
		
		sol.age=4;
		sol.breed="����";
		sol.clothes_size=95;
		sol.weight=11.93;
		sol.walk=2;
		
		System.out.printf("���� ���� : %d\n",sol.age);
		System.out.printf("weight : %.2fkg\n", sol.weight);
		System.out.printf("clothes size : %d\n", sol.clothes_size);
		System.out.printf("���� ��å�� : %d\n",sol.walk);
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
		System.out.println("������ ���� ���ڿ��� ���: "+status);
		
		//String flavor = "����";
		String[] flavor= {"����", "�ٴҶ�","����","�ٴҶ�"};
		//String Color = "��Ʈ";
		String[] color= {"��Ʈ��","�����","�����","�ʷϻ�"};
		int price = 1500;
		int calorie = 800;
		String product = "���";
		String type = "��";
		
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
    �������� : ������ ��ü�� �����Ͽ� Ŭ���� �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
    �� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���ϱ���
 */

class Dog{
	double weight;
	int age;
	String breed;
	int clothes_size;
	int walk;
	
	void year() {
		age++;
		System.out.printf("sol�� ���� ���� : %d\n",age);
	}
	void size_up() {
		weight++;
		clothes_size+=5;
		System.out.printf("weight : %.2fkg\n",weight);
		System.out.printf("clothes size : %d\n",clothes_size);
	}
	void daly_exercise() {
		walk++;
		System.out.printf("���� ��å�� : %d\n",walk);
		}
	}

class Apple{
	
	/*
		# �ν��Ͻ� ����
		
		- Ŭ���� ���ο� ������ ����
		- �ν��Ͻ� ���� ������ ������ ������ �ִ� ������
		- aka. �ʵ�, �Ӽ�, ��� ����, ���, ����...
	
	*/
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
	 	# �ν��Ͻ� �޼���
	 	- �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
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
		System.out.printf("�� â���� %s. [%s]\n", 
				open? "�����ֽ��ϴ�." : "����ֽ��ϴ�",
				lock? "����ֽ��ϴ�." : "��� ���� �����Դϴ�.");
	}
	
	String getStatus() {
		// String.format() : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�
	return String.format("�� â���� %s. [%s]\n", 
			open? "�����ֽ��ϴ�." : "����ֽ��ϴ�",
			lock? "����ֽ��ϴ�." : "��� ���� �����Դϴ�.");
	}
}