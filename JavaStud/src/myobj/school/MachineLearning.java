package myobj.school;

public class MachineLearning extends Student_ {
	// ����, �����, ���α׷��־�� 
			int math;
			int statistics;
			int pl;
			
			public MachineLearning() {
				super();
				math=generateRandomScore();
				statistics=generateRandomScore();
				pl=generateRandomScore();
			}
			int getSum() {
				return (kor+eng+math+statistics+pl);
			}
			double getAverage() {
				return getSum()/5.0;
			}
			
			public void printGradeCard() {
				System.out.println("������������������������������������������������������������������������������������������");
				System.out.printf(" �̸� : %s �� ���� : %d �� ��� : %.2f ��\n",name,getSum(),getAverage());
				System.out.println(" ����\t����\t����\tST\tPL  ��");
				System.out.println("��-------------------------------------------��");
				System.out.printf(" %d\t%d\t%d\t%d\t%d\t%d  ��\n",kor,eng,math,statistics,pl);
				System.out.println("������������������������������������������������������������������������������������������");
			}
}
