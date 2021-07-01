import java.util.ArrayList;

public class D01_ArrayList {
	/*
	 	# Java Collections
	 	- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	 	- Collection �������̽��� ������ Ŭ������ List, Set ���� �ִ�
	 	
	 	# java.util.ArrayList
	 	- �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	 	- �迭ó�� �����͸� ���������� �����Ѵ�
	 	- ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�
	*/
	public static void main(String[] args) {
		/*
		 	# Ÿ���� �����ϸ� ArrayList �����ϱ�
		 	- Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���
		 	- �ش� Ŭ���� ������ ���� �������� ���� Ÿ���� �����ϴ� �����̴�
		 	- ���׸����� �⺻�� Ÿ���� ����� �� ����
		*/
		
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character>chars = new ArrayList<>();
		// �⺻�� int�� ����Ÿ�� Integer
		
		chars.add('A');
		chars.add('B');
		chars.add('��');
		chars.add('�f');
		
		// add(item) : ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		
		// add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		numbers.add(0, 10);
		numbers.add(0, 20);
		numbers.add(0, 99);
		numbers.add(0, 40);
		numbers.add(0, 0);
		numbers.add(0, 60);
		
		System.out.println(numbers);
		System.out.println(fruits);
		
		// get(index) : ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ��ȯ�Ѵ�
		System.out.println(fruits.get(3));
		System.out.println(fruits.get(0));
		
		// size() : �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
		System.out.println("���� ����ִ� ���� ���� : "+fruits.size());
		
		//remove(index) : �ش� ��° �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ�Ѵ�
		System.out.println(fruits.remove(0));
		
		// remove(item) : �ش� ���� �����Ѵ�. ���� ���� ���θ� ��ȯ�Ѵ�.
		System.out.println(fruits.remove("kiwi"));
		System.out.println(fruits.remove("banana"));
		
		System.out.println(fruits);
	}
}
