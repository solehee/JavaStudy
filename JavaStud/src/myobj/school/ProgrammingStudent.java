package myobj.school;

public class ProgrammingStudent extends Student_{
// ����, ���α׷��� ���, �˰���, �ڷᱸ�� ����
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();
		math=generateRandomScore();
		pl=generateRandomScore();
		al=generateRandomScore();
		ds=generateRandomScore();
	}
	int getSum() {
		return (kor+eng+math+pl+al+ds);
	}
	double getAverage() {
		return getSum()/6.0;
	}
	
	public void printGradeCard() {
		System.out.println("������������������������������������������������������������������������������������������");
		System.out.printf("��  �̸� : %s �� ���� : %d �� ��� : %.2f     ��\n",name,getSum(),getAverage());
		System.out.println("�� ����\t����\t����\tPL\tAL\tDS  ��");
		System.out.println("��-------------------------------------------��");
		System.out.printf("�� %d\t%d\t%d\t%d\t%d\t%d  ��\n",kor,eng,math,pl,al,ds);
		System.out.println("������������������������������������������������������������������������������������������");
	}
}
