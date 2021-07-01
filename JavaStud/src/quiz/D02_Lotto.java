package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
//import java.util.Scanner;
import java.util.Set;
//import myobj.Lotto.Number;

public class D02_Lotto {
	/*
	 	1. 1부터 45사이의 중복없는 랜덤 숫자 6개 또는 7개를 생성하는 메서드를 작성해보세요
	 	
	 	2. 프로그램이 시작되면 당첨번호를 하나 지정하고 (숫자 7개)
	 	   당첨번호와 일치하는 6개의 숫자가 나올 때 까지 당첨될때까지 번호를 계속 뽑아보세요
	 	
	 	3. 1등 또는 2등에 당첨될때까지 돈을 얼마나 썼는지 계산해보세요 (숫자 6개 뽑는 때마다 천원)
	*/
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 4;
	
	private int bonus = 0;
	
	public Set<Integer> generagte(int len){
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size()!=len) {
			int ranNum = (int)(Math.random()*LOTTO_SIZE+1);
			//System.out.println("set에 "+ranNum+"이 더해집니다.");
			lotto.add(ranNum);
			
			if(len == 7 && lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}
		return lotto;
	}
	
	public void test() {
		Set<Integer> win = generagte(7);

		System.out.println("당첨번호는 "+win + "입니다. 그 중 보너스 번호는 "+bonus+"입니다.");
		List<Integer> checkList = new ArrayList<>(7);

		long spent = 0;
		long count =0;
		
		while(true) {
			Set<Integer> blackcow = generagte(6);
			count++;
			
			checkList.addAll(win);
			checkList.removeAll(blackcow);
			
			if(checkList.size() == 1) {
				spent = count*1000;
				if(checkList.get(0) == bonus) {
					System.out.println("1등 당첨입니다."+count+" 번 도전하셨으며, 여태까지 쓰신 돈은 "+spent+"원 입니다.");
				}else {
					System.out.println("2등 당첨입니다."+count+" 번 도전하셨으며, 여태까지 쓰신 돈은 "+spent+"원 입니다.");
				}
				break;
			}
			checkList.clear();		
		}
	}
	
	public static void main(String[] args) {
		D02_Lotto quiz = new D02_Lotto();
		quiz.test();
		
		}
	
	/*public static void main(String[] args) {
		List<Integer> result = new ArrayList<Integer>();
		Number num = new Number();
		Scanner sc = new Scanner(System.in);
		boolean happylife = false;
		int money = 0;
		
		 Set<Integer> user = new HashSet<>(); // 사용자 입력값 
		 Set<Integer> lotto_num = new HashSet<>(); // 랜덤 함수로 뽑은 당첨번호
		
		 System.out.println("[1 ~ 45] 사이의");
		 System.out.println("번호 6개를 입력해주세요 > ");
		user.add(user_num); // 사용자의 번호를 HashSet에 저장

		 while(result.size() != 7) {
		 for(int i=0;i<6;++i) {
			int user_num = sc.nextInt();
			lotto_num.add(num.number()); // 당첨번호 하나씩 뽑기
		 	}
		 money+=1000; // 돈 추가
		 result.addAll(D02_Lotto.intersection(user,lotto_num)); 
		 // 사용자가 뽑은 번호와 당첨번호 교집합을 저장하는 ArrayList 
		 if (result.size()==6) { 
			 System.out.println("1등입니다.");
			 System.out.println(money+"원 사용했습니다.");
			 break;
		 }else if(result.size()==5) { 
			 lotto_num.add(num.bonusNum()); // 보너스번호 뽑음(Hash라 중복은 걸러짐)
			 result.addAll(D02_Lotto.intersection(user,lotto_num)); 
			 happylife = result.size()==6;
		 }else if(happylife == true) {
			 System.out.println("2등입니다.");
			 System.out.println(money+"원 사용했습니다.");
			 break;
		 	}
		 }
	}
	
	public static HashSet<Integer> intersection(Collection<Integer> user, Collection<Integer> number) {
        HashSet<Integer> lotto_num = new HashSet<>();
        
        lotto_num.addAll(user);
        lotto_num.retainAll(number);
        
        return lotto_num;
		}*/
}
