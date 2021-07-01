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
	 	1. 1���� 45������ �ߺ����� ���� ���� 6�� �Ǵ� 7���� �����ϴ� �޼��带 �ۼ��غ�����
	 	
	 	2. ���α׷��� ���۵Ǹ� ��÷��ȣ�� �ϳ� �����ϰ� (���� 7��)
	 	   ��÷��ȣ�� ��ġ�ϴ� 6���� ���ڰ� ���� �� ���� ��÷�ɶ����� ��ȣ�� ��� �̾ƺ�����
	 	
	 	3. 1�� �Ǵ� 2� ��÷�ɶ����� ���� �󸶳� ����� ����غ����� (���� 6�� �̴� ������ õ��)
	*/
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 4;
	
	private int bonus = 0;
	
	public Set<Integer> generagte(int len){
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size()!=len) {
			int ranNum = (int)(Math.random()*LOTTO_SIZE+1);
			//System.out.println("set�� "+ranNum+"�� �������ϴ�.");
			lotto.add(ranNum);
			
			if(len == 7 && lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}
		return lotto;
	}
	
	public void test() {
		Set<Integer> win = generagte(7);

		System.out.println("��÷��ȣ�� "+win + "�Դϴ�. �� �� ���ʽ� ��ȣ�� "+bonus+"�Դϴ�.");
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
					System.out.println("1�� ��÷�Դϴ�."+count+" �� �����ϼ�����, ���±��� ���� ���� "+spent+"�� �Դϴ�.");
				}else {
					System.out.println("2�� ��÷�Դϴ�."+count+" �� �����ϼ�����, ���±��� ���� ���� "+spent+"�� �Դϴ�.");
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
		
		 Set<Integer> user = new HashSet<>(); // ����� �Է°� 
		 Set<Integer> lotto_num = new HashSet<>(); // ���� �Լ��� ���� ��÷��ȣ
		
		 System.out.println("[1 ~ 45] ������");
		 System.out.println("��ȣ 6���� �Է����ּ��� > ");
		user.add(user_num); // ������� ��ȣ�� HashSet�� ����

		 while(result.size() != 7) {
		 for(int i=0;i<6;++i) {
			int user_num = sc.nextInt();
			lotto_num.add(num.number()); // ��÷��ȣ �ϳ��� �̱�
		 	}
		 money+=1000; // �� �߰�
		 result.addAll(D02_Lotto.intersection(user,lotto_num)); 
		 // ����ڰ� ���� ��ȣ�� ��÷��ȣ �������� �����ϴ� ArrayList 
		 if (result.size()==6) { 
			 System.out.println("1���Դϴ�.");
			 System.out.println(money+"�� ����߽��ϴ�.");
			 break;
		 }else if(result.size()==5) { 
			 lotto_num.add(num.bonusNum()); // ���ʽ���ȣ ����(Hash�� �ߺ��� �ɷ���)
			 result.addAll(D02_Lotto.intersection(user,lotto_num)); 
			 happylife = result.size()==6;
		 }else if(happylife == true) {
			 System.out.println("2���Դϴ�.");
			 System.out.println(money+"�� ����߽��ϴ�.");
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
