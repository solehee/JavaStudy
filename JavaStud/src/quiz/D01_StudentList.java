package quiz;

import java.util.ArrayList;

import myobj.StudentArray.Student;

public class D01_StudentList {
	/*
	  	# 학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	  	
	  	1. 각 학생의 점수는 랜덤으로 설정
	  	
	  	2. 과목은 국/영/수
	  	
	  	3. 30명의 평균 점수를 출력
	  	
	  	4. 30명 중 가장 평균 점수가 높은 학생의 성적을 출력
	*/
	
	public static void main(String[] args) {
		ArrayList<Student> student_list = new ArrayList<>();
		
		for(int i=0;i<30;++i) {
			//student_list.add(new Student());
		}
		
		for(Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("가장 높은 점수 : " +Student.best_avg);
		System.out.println("가장 높은 점수인 학생의 학번 : "+Student.best_avg_snum);
	}
	
	
	
	
	
	
	/*static Students student = new Students();
	static double count;
	
	public static void main(String[] args) {
		int maxRanks=0;
		
		System.out.println("===========학생 명단=============");
		for(int i=0; i<30; i++) {
			System.out.println("  "+(i+1)+"번 학생 ");
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
		System.out.println("가장높은평균 점수를 가진사람 "+maxRanks
		+"번 학생 : "+rankArray().get(maxRanks)+"점");
	
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
