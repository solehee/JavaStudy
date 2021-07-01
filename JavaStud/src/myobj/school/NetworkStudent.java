package myobj.school;

public class NetworkStudent extends Student_{
	// 리눅스, 네트워크, CCNA 
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
			System.out.println("┌───────────────────────────────────────────┐");
			System.out.printf(" 이름 : %s │ 총점 : %d │ 평균 : %.2f │\n",name,getSum(),getAverage());
			System.out.println(" 국어\t영어\t수학\tPL\tAL\tDS  │");
			System.out.println("│-------------------------------------------│");
			System.out.printf(" %d\t%d\t%d\t%d\t%d\t%d  │\n",kor,eng,linux,nw,ccna);
			System.out.println("└───────────────────────────────────────────┘");
		}
}
