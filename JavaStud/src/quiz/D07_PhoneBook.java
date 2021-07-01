package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class D07_PhoneBook {
	
	String randomNum;
	
	public static class Info implements Comparable<Info>{
	 // ������ ��ɲ�
		List<String> name = new ArrayList<>();
		public int age ;
		public int company_number;
		@Override
		public int compareTo(Info o) {
			return (this.age - o.age)!=0?
					this.age - o.age: this.company_number - o.company_number;
		}
		public Info comparator() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	static HashMap<String, HashMap<String, Info>> phonebook;
	//�׷��/ ��ȭ��ȣ/�̸�
	
	public D07_PhoneBook(){
		//phonebook = new HashMap<>();
		phonebook.put(group(), numList());
		//System.out.println(phonebook.get(group()));
		//System.out.println(number());
		/*for(Entry<String, HashMap<String,Info>>entry:phonebook.entrySet()) {
			for(Entry<String, Info>entryin : entry.getValue().entrySet()) {
				System.out.printf("�׷� : %s\n��ȭ��ȣ : %s\n�̸� : %s\n���� : %d\n������ȣ : %d\n", 
						entry.getKey(),entryin.getKey(),entryin.getValue().name, 
						entryin.getValue().age, entryin.getValue().company_number);
			}
		}*/
	
	}

	public String group(){
		List<String> group = new ArrayList<>();
		group.add("�п�");
		group.add("����");
		group.add("ģ��");
		group.add("��ȣȸ");
		for(String groups : group) {
			System.out.println(groups);
		}
		return "�׷��"+group;
		 
	}
	public HashMap<String, Info> numList() {
		HashMap<String, Info> numbers = phonebook.get(group());
		numbers.put(number(), info());
		return numbers;		
	}
	
	public String number() {
		List<String> number = new ArrayList<>();
		number.add("010-1234-1234");
		number.add("010-1234-1224");
		number.add("010-1234-1454");
		number.add("010-1234-1784");
			
		return "��ȭ��ȣ : "+number;
	}
	
	public Info info(){
		Info info = new Info();
		String names = null;
		
		info.name.add("ö��");
		info.name.add("����");
		info.name.add("����");
		info.name.add("���");
		for(int i=0;i<info.name.size();++i) {
			names= info.name.get(i);
		}
		
		info.age= (int) (Math.random()*80+10); 
		info.company_number = (int)(Math.random()*100);
		
		System.out.println("�̸� : "+names+" / ����: "+info.age+" / ������ȣ :"+info.company_number);
		return info;
		
	}
	
	public void add(String group,Info info, String num) {
		phonebook.get(group).put(num, info);
	}
	public void seachName(String name) {
		for(Entry<String, HashMap<String,Info>>entry:phonebook.entrySet()) {
			for(Entry<String, Info>entryin : entry.getValue().entrySet()) {
				if(entryin.getValue().name.contains(name)) {
					System.out.printf("�׷� : %s\n��ȭ��ȣ : %s\n�̸� : %s\n���� : %d\n������ȣ : %d\n", 
								entry.getKey(),entryin.getKey(),entryin.getValue().name, 
								entryin.getValue().age, entryin.getValue().company_number);
					}
				}
			}
		}
	

	
	public static void main(String[] args) {
		new D07_PhoneBook();
		
		
	}
	
	/*
	 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	 	
	 	1. phonebook���� �׷�/��ȭ��ȣ/������ ������ �� �ִ�
	 	2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ� 
	 	3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�
	 	
	 	# �����ؾ� �� �޼���
	 	
	 	1. ���ο� �׷��� �߰��ϴ� �޼���
	 	2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	 	3. ��ϵ� ��� ��ȣ�� ������ �׸�(Info �ʵ�) �������� ����/������������ �����ִ� �޼���
	 	4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	 	5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	*/
}
