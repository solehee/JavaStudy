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
		
		fistName.add("��");
		fistName.add("��");
		fistName.add("��");
		
		lastName.add("ö��");
		lastName.add("����");
		lastName.add("�Ｚ");
		lastName.add("����");
		
		int fistRandom = (int)(Math.random()*fistName.size());
		int lastRandom = (int)(Math.random()*lastName.size());
		name = fistName.get(fistRandom)+lastName.get(lastRandom);
		
		return name ;	
	}
	
	public double getAverage() {
		return (kor+eng+math)/3.0;
	}
	
	
	public void studentList() {
		System.out.println("�٦�������������������������������������������������������������");
		System.out.printf("���̸�: %s / ��� : %.2f       ��\n",getName(),getAverage());
		System.out.println("����������������������������������������������������������������");
		System.out.printf("������ : %d / ���� : %d / ���� : %d��\n",kor,eng,math);
		System.out.println("�٦�������������������������������������������������������������");
		
	}


	public void random() {
		// TODO Auto-generated method stub
		
	}
	
}
