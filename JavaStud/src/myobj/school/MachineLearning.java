package myobj.school;

public class MachineLearning extends Student_ {
	// 수학, 통계학, 프로그래밍언어 
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
				System.out.println("┌───────────────────────────────────────────┐");
				System.out.printf(" 이름 : %s │ 총점 : %d │ 평균 : %.2f │\n",name,getSum(),getAverage());
				System.out.println(" 국어\t영어\t수학\tST\tPL  │");
				System.out.println("│-------------------------------------------│");
				System.out.printf(" %d\t%d\t%d\t%d\t%d\t%d  │\n",kor,eng,math,statistics,pl);
				System.out.println("└───────────────────────────────────────────┘");
			}
}
