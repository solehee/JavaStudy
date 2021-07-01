import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.StudentArray.Student;


public class D06_TreeSet {
	/*
	 	# TreeSet
	 	
	 	- ������ �ִ� Set(������ ���� ���� Hash�� Ư¡)
	 	- �ߺ��� ������� �ʴ´� (Set�� Ư¡) 
	 	- �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	 	- �̸� ���� �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
	 	- �ش� Ʈ���� �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
	*/
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(13);
		numbers.add(50);
		
		System.out.println(numbers);
		
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				/*
				 	�ڸ��� �ٲٰ� �ʹٸ� ��� ����
				 	�ڸ��� �ٲٱ� ������ ���� ����
				 	�� ���� ���� ���̸� 0 ����
				*/
				return o2-o1;
			}	
		}) ;
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first? "+numbers.first());
		System.out.println("last? "+numbers.last());
		System.out.println("pollFirst? "+numbers.pollFirst());
		System.out.println("pollLast? "+numbers.pollLast());
		System.out.println(numbers);
		System.out.println("subSet(30, 70)"+numbers.subSet(30, 70));
		
		// �� ������ �ٸ� ���� ����ϰ� ������ �����
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list,numbers2.comparator());
		
		System.out.println("list : "+list);
		
		System.out.println("contains 41? "+numbers2.contains(41));
		System.out.println("contaions 42? "+list.contains(42));
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(41);
		// �Ʒ��� �ڵ尡 true�� �������� null�� �ٲ㺸����
		System.out.println(list.containsAll(list2));
		System.out.println(list.containsAll(numbers2.subSet(43, 41)));
		System.out.println(list.containsAll(desc));
		System.out.println(list.addAll(tail));
		
		// �л� �ν��Ͻ��� 100�� �����, TreeSet�� ��� ���� ������ ������ ��
		// ��� ������ 50������ 70�� ������ �л��� ��� ������� ������� 
		TreeSet<Student> stu_set = new TreeSet<>();
		for(int i =0;i<100;++i) {
			//stu_set.add(new Student());			
		}
		System.out.println(stu_set);
		System.out.println("�л��� ��"+stu_set.size()+"�� �Դϴ�.");
		
		//Student from = new Student();
	//	Student to = new Student();
		
		//from.avg = 50.0;
	//	to.avg = 70.0;
		
	//	System.out.println(stu_set.subSet(from,to).size());
	}
}
