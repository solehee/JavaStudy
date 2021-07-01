package myobj.StudentArray;

import java.util.ArrayList;

public class Students {
	static String name;

	public int ramdon() {
		return (int)(Math.random()*101);
	}	

	protected int kor;
	protected int eng;
	protected int math;
	
	public Students() {		
	kor = ramdon();
	eng = ramdon();
	math = ramdon();
	}
	
	
	public String getName() {
		ArrayList<String> fistName = new ArrayList<>();
		ArrayList<String> lastName = new ArrayList<>();
		
		fistName.add("梯");
		fistName.add("檜");
		fistName.add("夢");
		
		lastName.add("繹熱");
		lastName.add("艙��");
		lastName.add("鳴撩");
		lastName.add("縣雖");
		
		int fistRandom = (int)(Math.random()*fistName.size());
		int lastRandom = (int)(Math.random()*lastName.size());
		name = fistName.get(fistRandom)+lastName.get(lastRandom);
		
		return name ;	
	}
	
	public double getAverage() {
		return (kor+eng+math)/3.0;
	}
	
	
	public void studentList() {
		System.out.println("肌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式臣");
		System.out.printf("弛檜葷: %s / ゎ敕 : %.2f       弛\n",getName(),getAverage());
		System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
		System.out.printf("弛措橫 : %d / 艙橫 : %d / 熱з : %d弛\n",kor,eng,math);
		System.out.println("肌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式臣");
		
	}


	public void random() {
		// TODO Auto-generated method stub
		
	}
	
}
