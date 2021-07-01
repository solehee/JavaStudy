package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class D07_PhoneBook {
	
	String randomNum;
	
	public static class Info implements Comparable<Info>{
	 // 내용은 양심껏
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
	//그룹명/ 전화번호/이름
	
	public D07_PhoneBook(){
		//phonebook = new HashMap<>();
		phonebook.put(group(), numList());
		//System.out.println(phonebook.get(group()));
		//System.out.println(number());
		/*for(Entry<String, HashMap<String,Info>>entry:phonebook.entrySet()) {
			for(Entry<String, Info>entryin : entry.getValue().entrySet()) {
				System.out.printf("그룹 : %s\n전화번호 : %s\n이름 : %s\n나이 : %d\n내선번호 : %d\n", 
						entry.getKey(),entryin.getKey(),entryin.getValue().name, 
						entryin.getValue().age, entryin.getValue().company_number);
			}
		}*/
	
	}

	public String group(){
		List<String> group = new ArrayList<>();
		group.add("학원");
		group.add("가족");
		group.add("친구");
		group.add("동호회");
		for(String groups : group) {
			System.out.println(groups);
		}
		return "그룹명"+group;
		 
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
			
		return "전화번호 : "+number;
	}
	
	public Info info(){
		Info info = new Info();
		String names = null;
		
		info.name.add("철수");
		info.name.add("영희");
		info.name.add("영자");
		info.name.add("김박");
		for(int i=0;i<info.name.size();++i) {
			names= info.name.get(i);
		}
		
		info.age= (int) (Math.random()*80+10); 
		info.company_number = (int)(Math.random()*100);
		
		System.out.println("이름 : "+names+" / 나이: "+info.age+" / 내선번호 :"+info.company_number);
		return info;
		
	}
	
	public void add(String group,Info info, String num) {
		phonebook.get(group).put(num, info);
	}
	public void seachName(String name) {
		for(Entry<String, HashMap<String,Info>>entry:phonebook.entrySet()) {
			for(Entry<String, Info>entryin : entry.getValue().entrySet()) {
				if(entryin.getValue().name.contains(name)) {
					System.out.printf("그룹 : %s\n전화번호 : %s\n이름 : %s\n나이 : %d\n내선번호 : %d\n", 
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
	 	# HashMap을 이용해 전화번호부를 구현해보세요
	 	
	 	1. phonebook에는 그룹/전화번호/정보을 저장할 수 있다
	 	2. 그룹명을 키값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다 
	 	3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다
	 	
	 	# 구현해야 할 메서드
	 	
	 	1. 새로운 그룹을 추가하는 메서드
	 	2. 그룹에 새로운 전화번호를 등록하는 메서드
	 	3. 등록된 모든 번호를 선택한 항목(Info 필드) 기준으로 오름/내림차순으로 보여주는 메서드
	 	4. 이름을 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	 	5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	*/
}
