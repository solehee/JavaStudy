package myobj.school;

public class NetworkStudent extends Student_{
	// ������, ��Ʈ��ũ, CCNA 
		int linux;
		int nw;
		int ccna;
		
		public NetworkStudent() {
			super();
			linux=generateRandomScore();
			nw=generateRandomScore();
			ccna=generateRandomScore();
		}
		int getSum() {
			return (kor+eng+linux+nw+ccna);
		}
		double getAverage() {
			return getSum()/5.0;
		}
		
		public void printGradeCard() {
			System.out.println("������������������������������������������������������������������������������������������");
			System.out.printf(" �̸� : %s �� ���� : %d �� ��� : %.2f ��\n",name,getSum(),getAverage());
			System.out.println(" ����\t����\t����\tPL\tAL\tDS  ��");
			System.out.println("��-------------------------------------------��");
			System.out.printf(" %d\t%d\t%d\t%d\t%d\t%d  ��\n",kor,eng,linux,nw,ccna);
			System.out.println("������������������������������������������������������������������������������������������");
		}
}
