package myobj.school;

public abstract class C07_School extends Student_ {
	/*
	 	1. 각 반의 정원은 30명이다.
	 	2-1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다
	 	2-2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
	 	2-3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다
	 	3. 모든 학생의 점수와 이름을 랜덤으로 생성한다.
	 	   학번은 중복없이 순차적으로 생성되어야 한다.(또는 중복없이 랜덤도 가능)
	 	4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야한다.
	*/
	public static void main(String[] args) {
	
		Student_[] school = new Student_[30];
		
		for(int i =0;i<school.length;++i) {
		school[i] = new ProgrammingStudent();
		school[i].printGradeCard();
		}	
	}
}

	
	/*public static void main(String[] args) {
		Programming s1 = new Programming();
		s1.programClassScore();
		Network n1 = new Network();
		n1.networkClassScore();
		MachineLearning m1 = new MachineLearning();
		m1.MachineLearningClassScore();
	}
	
	
}
abstract class School{
	int class_student;
	int studentNum;
	String className;
	String[] subject;
	int score;
	int sumScore;
	
	School(String className){
		this.studentNum=0;
		this.className= className;
		this.subject= new String[]{"국어","영어"};
		this.class_student=30;
		this.score=0;
		int sumScore=0;
	}
}

class Programming extends School{

	Programming() {
		super("프로그래밍 반");
		this.subject=new String[] {"국어", "영어","수학","프로그래밍 언어","알고리즘","자료구조"};
	}
	 void programClassScore() {
		 for(int i=0;i<class_student;++i) {
			 System.out.print("이름 : ");
			 for (int n=0;n<5;++n) {
			 System.out.print((char)(Math.random()*26+'a'));
			 }
			 studentNum=(int)(Math.random()*91+1);
			 System.out.println(" 학번 : "+studentNum);
			 for(int j=0;j<subject.length;++j) {
				 score=(int)(Math.random()*101+1);
				 System.out.println(subject[j]+"점수 : "+score);
			 sumScore+=score;
			 }
			 sumScore=sumScore/subject.length;
			 System.out.printf("[평균점수 : %d점]\n",sumScore);
			 System.out.println();
		 }
	 }
}
class Network extends School{
	Network(){
		super("네트워크 반");
		this.subject=new String[] {"국어", "영어","리눅스","네트워크","CCNA"};
		}
	void networkClassScore() {
		 for(int i=0;i<class_student;++i) {
			 System.out.print("이름 : ");
			 for (int n=0;n<5;++n) {
			 System.out.print((char)(Math.random()*26+'a'));
			 }
			 studentNum=(int)(Math.random()*91+1);
			 System.out.println(" 학번 : "+studentNum);
			 for(int j=0;j<subject.length;++j) {
				 score=(int)(Math.random()*101+1);
				 System.out.println(subject[j]+"점수 : "+score);
			 sumScore+=score;
			 }
			 sumScore=sumScore/subject.length;
			 System.out.printf("[평균점수 : %d점]\n",sumScore);
			 System.out.println();
		 }
	 }
}
class MachineLearning extends School{
	MachineLearning(){
		super("머신러닝 반");
		this.subject=new String[] {"국어", "영어","수학","통계학","프로그래밍언어"};
	}
	void MachineLearningClassScore() {
		 for(int i=0;i<class_student;++i) {
			 System.out.print("이름 : ");
			 for (int n=0;n<5;++n) {
			 System.out.print((char)(Math.random()*26+'a'));
			 }
			 studentNum=(int)(Math.random()*91+1);
			 System.out.println(" 학번 : "+studentNum);
			 for(int j=0;j<subject.length;++j) {
				 score=(int)(Math.random()*101+1);
				 System.out.println(subject[j]+"점수 : "+score);
			 sumScore+=score;
			 }
			 sumScore=sumScore/subject.length;
			 System.out.printf("[평균점수 : %d점]\n",sumScore);
			 System.out.println();
		 }
	 }
}*/
	