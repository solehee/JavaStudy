import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Constructor {
	
	/*
	 	#Ŭ������ ������ (Constructor)
	 	
	 	- Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
	 	- �޼������� ���� Ÿ���� �������� �ʴ´�
	 	- �ν��Ͻ��� ������ �� new�� �Բ� ���ȴ�
	 	- �ν��Ͻ� ������ ���� ���� ȣ��Ǳ� ������ �ַ� �ν��Ͻ� �ʱ�ȭ�� ���ȴ�
	 	- �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� ������ �⺻ �����ڰ� �����Ѵ�.
	 	  (�ƹ��ϵ� ���� ����)
	 	- ���� ������ �����ڰ� �����ϴ� Ŭ������ �⺻ �����ڸ� �ڵ����� �������� �ʴ´�.
	 	  (�⺻ �����ڸ� ����ϰ� �ʹٸ� �⺻ �����ڸ� �߰��� �����ؾ� �Ѵ�)
	 	
	*/
		public static void main(String[] args) {
		Window w1 = new Window();
		Apple a1= new Apple();
		Orange o1=new Orange();
		Peach p1 = new Peach("��ȫ��");
		
		Peach Peach01 = new Peach("����ȫ��");
		Peach Peach02 = new Peach("��������");
		Peach peach03 = new Peach();
		
		
		String str = String.format("%d:%d:%d", 10, 20, 30);
		System.out.println(str);
		
		System.out.println(o1.sweet);
		System.out.println(o1.address);
		System.out.println(Arrays.toString(o1.color));
		
		System.out.println("�ν��Ͻ� ������ �迭ó�� �ʱ�ȭ�� �̸� �Ǿ��ִ�");
		System.out.println(a1.color);
		System.out.println(a1.calorie);
		System.out.println(w1.open);
		System.out.println(w1.lock);
		}
}
class Peach{
	String color;
	int size;
	// this : �� �ν��Ͻ����� �ڱ� �ڽ��� ����Ų��
	// �����ڿ� (�ν��Ͻ� ����) �ν��Ͻ� ���� �� �ݵ�� ���� �� �־��ֱ�  
	Peach(String color){
		this.color = color;
		this.size=10;
	}
	
	Peach(int size){
		this.size=size;
		this.color="default color";
	}
	
	// ������ �����ε�
	// ���� �������� ����� �� �ִ� ���� Ÿ���� �ٸ��ų�, ���� ������ �ٸ��� ��밡��
	Peach() {
		this.color= "�⺻��";
		this.size=10;
		
	}
}

class Orange{
	
	int [] color;
	double sweet;
	String address;
	
	Orange(){
		color = new int[] {255,255,0};
		sweet = 10.0;
		address = "���ֵ�";
	}
}