package myobj.school;

public abstract class C07_School extends Student_ {
	/*
	 	1. �� ���� ������ 30���̴�.
	 	2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
	 	2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
	 	2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	 	3. ��� �л��� ������ �̸��� �������� �����Ѵ�.
	 	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�.(�Ǵ� �ߺ����� ������ ����)
	 	4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־���Ѵ�.
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
		this.subject= new String[]{"����","����"};
		this.class_student=30;
		this.score=0;
		int sumScore=0;
	}
}

class Programming extends School{

	Programming() {
		super("���α׷��� ��");
		this.subject=new String[] {"����", "����","����","���α׷��� ���","�˰���","�ڷᱸ��"};
	}
	 void programClassScore() {
		 for(int i=0;i<class_student;++i) {
			 System.out.print("�̸� : ");
			 for (int n=0;n<5;++n) {
			 System.out.print((char)(Math.random()*26+'a'));
			 }
			 studentNum=(int)(Math.random()*91+1);
			 System.out.println(" �й� : "+studentNum);
			 for(int j=0;j<subject.length;++j) {
				 score=(int)(Math.random()*101+1);
				 System.out.println(subject[j]+"���� : "+score);
			 sumScore+=score;
			 }
			 sumScore=sumScore/subject.length;
			 System.out.printf("[������� : %d��]\n",sumScore);
			 System.out.println();
		 }
	 }
}
class Network extends School{
	Network(){
		super("��Ʈ��ũ ��");
		this.subject=new String[] {"����", "����","������","��Ʈ��ũ","CCNA"};
		}
	void networkClassScore() {
		 for(int i=0;i<class_student;++i) {
			 System.out.print("�̸� : ");
			 for (int n=0;n<5;++n) {
			 System.out.print((char)(Math.random()*26+'a'));
			 }
			 studentNum=(int)(Math.random()*91+1);
			 System.out.println(" �й� : "+studentNum);
			 for(int j=0;j<subject.length;++j) {
				 score=(int)(Math.random()*101+1);
				 System.out.println(subject[j]+"���� : "+score);
			 sumScore+=score;
			 }
			 sumScore=sumScore/subject.length;
			 System.out.printf("[������� : %d��]\n",sumScore);
			 System.out.println();
		 }
	 }
}
class MachineLearning extends School{
	MachineLearning(){
		super("�ӽŷ��� ��");
		this.subject=new String[] {"����", "����","����","�����","���α׷��־��"};
	}
	void MachineLearningClassScore() {
		 for(int i=0;i<class_student;++i) {
			 System.out.print("�̸� : ");
			 for (int n=0;n<5;++n) {
			 System.out.print((char)(Math.random()*26+'a'));
			 }
			 studentNum=(int)(Math.random()*91+1);
			 System.out.println(" �й� : "+studentNum);
			 for(int j=0;j<subject.length;++j) {
				 score=(int)(Math.random()*101+1);
				 System.out.println(subject[j]+"���� : "+score);
			 sumScore+=score;
			 }
			 sumScore=sumScore/subject.length;
			 System.out.printf("[������� : %d��]\n",sumScore);
			 System.out.println();
		 }
	 }
}*/
	