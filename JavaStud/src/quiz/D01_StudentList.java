package quiz;

import java.util.ArrayList;

import myobj.StudentArray.Student;

public class D01_StudentList {
	/*
	  	# �л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	  	
	  	1. �� �л��� ������ �������� ����
	  	
	  	2. ������ ��/��/��
	  	
	  	3. 30���� ��� ������ ���
	  	
	  	4. 30�� �� ���� ��� ������ ���� �л��� ������ ���
	*/
	
	public static void main(String[] args) {
		ArrayList<Student> student_list = new ArrayList<>();
		
		for(int i=0;i<30;++i) {
			//student_list.add(new Student());
		}
		
		for(Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("���� ���� ���� : " +Student.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : "+Student.best_avg_snum);
	}
	
	
	
	
	
	
	/*static Students student = new Students();
	static double count;
	
	public static void main(String[] args) {
		int maxRanks=0;
		
		System.out.println("===========�л� ���=============");
		for(int i=0; i<30; i++) {
			System.out.println("  "+(i+1)+"�� �л� ");
			student.random();
			student.studentList();
			if(i<29) {
				if(rankArray().get(i)<rankArray().get(i+1)) {
					maxRanks++;					
				}else if(rankArray().get(i)>rankArray().get(i+1)) {
				}			
			}
		}
		System.out.println("--------------------------------");
		System.out.println("���������� ������ ������� "+maxRanks
		+"�� �л� : "+rankArray().get(maxRanks)+"��");
	
	}
		static ArrayList<Integer> rankArray() {
		ArrayList <Integer> rank = new ArrayList<>();
		for (int i=0 ; i<30; i++) {			
		count=student.getAverage();
		rank.add((int) Math.ceil(count));
		}
		return rank;
	}*/
	
}
